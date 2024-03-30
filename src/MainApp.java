import java.io.IOException;
import java.util.Scanner;

import javax.mail.MessagingException;



public class MainApp {

    private static Scanner teclado = new Scanner(System.in);


    // Método que determina si un usuario necesita asistencia según
    // su agudeza visual. Si Agudeza visual < 15, entonces asistencia = true.

    public static boolean comprobarAgudezaVisual(Enfermedad[] listaEnfermedades) {

        for (int i = 0; i < listaEnfermedades.length; i++) {
            if (listaEnfermedades[i] != null) {
                if (listaEnfermedades[i] instanceof EnfermedadVisual) {
                    EnfermedadVisual ev = (EnfermedadVisual) listaEnfermedades[i];
                    if (ev.getAgudezaVisual() < 15) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    
    public static void main(String[] args) throws IOException, InterruptedException, MessagingException {

        String menu = "\n\n     Menú principal\n----------------------" +
        "\n1. Leer Fichero\n2. Información del tiempo\n3. Leer email\n0. Salir\n\n" +
        "Introduce opción: ";

        Enfermedad[] listaEnfermedades = new Enfermedad[2];
        Asistente asistente = new Asistente();
        Usuario[] listaUsuarios = new Usuario[2];
        boolean asistencia;
        int respuesta=0;

        // Creamos 2 enfermedades y las asignamos a un array.
        // Esas enfermedades van a ser de un único usuario.

        EnfermedadVisual e1 = new EnfermedadVisual("Cornea caída", "Cornius caitus", 5, 40, 30, 20, 10);
        EnfermedadCardioVascular e2 = new EnfermedadCardioVascular("Arritmia", "Arritmia sinusal crónica", false, 115,
                90, 70);

        listaEnfermedades[0] = e1;
        listaEnfermedades[1] = e2;

        // Comprobamos la necesidad de asistencia según agudeza visual.
        asistencia = comprobarAgudezaVisual(listaEnfermedades);

        // Creamos un usuario con las enfermedades creadas más arriba.
        Usuario u1 = new Usuario(1, "Imanol", "García Robledo", asistencia, listaEnfermedades);

        // Creamos un usuario "sano", sin lista de enfermedades.
        // Suponemos directamente que no nexcesita asistencia.

        Usuario u2 = new Usuario(2, "Andrés", "Cortés Carmona", false, null);

        // Los metemos en array de usuarios.

        listaUsuarios[0] = u1;
        listaUsuarios[1] = u2;

        LeerFichero leer = new LeerFichero();
        ConsultarTiempo tiempo = new ConsultarTiempo();
        Email email = new Email();

        System.out.print("\n\nIntroduce ID usuario (1 o 2): ");
        int id = teclado.nextInt();
        teclado.nextLine();
        asistencia=false;

        for (int i = 0; i < listaUsuarios.length; i++) {
            if (listaUsuarios[i] != null) {
                if (listaUsuarios[i].getId() == id && listaUsuarios[i].getAsistencia() == true){                   
                    asistente.habla("modo Asistencia conectado: Buenos días," + listaUsuarios[i].getNombre());
                    asistencia=true;
                    try {
                        // Ponemos a "Dormir" el programa durante los ms que queremos
                        Thread.sleep(5 * 1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
            } 
        }

        do {                      
            
            System.out.print(menu);
            respuesta = teclado.nextInt();
            teclado.nextLine();

            switch (respuesta){

                case 1: leer.fichero(asistencia);
                        break;
                case 2: tiempo.elTiempo(asistencia);
                        break;
                case 3: email.leerEmail(asistencia);
                        break;
                case 0: break;
                default: System.out.println("opción erronea");
                         break;
            }

        } while (respuesta !=0);        

    }

}
