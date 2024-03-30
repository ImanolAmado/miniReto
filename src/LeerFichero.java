import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {  
      
    
    public void fichero(boolean asistencia){        
                
        Asistente asistente = new Asistente();
        String linea;               
    
        if(asistencia){           
            asistente.habla("Permíteme que te asista con la lectura del fichero de libros");

                try {
                    // Ponemos a "Dormir" el programa durante los ms que queremos
                    Thread.sleep(5 * 1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
        } else System.out.println("\nEl contenido del fichero es el siguiente:\n");

        try{

        BufferedReader leer = new BufferedReader(new FileReader("libros.txt"));

        while((linea=leer.readLine())!=null){
                      
           if(asistencia) {
            asistente.habla(linea);
            try {
                //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(7500);
             } catch (Exception e) {
                System.out.println(e);
             }

           } else  System.out.println(linea);               
           
        }
        leer.close();
        } catch (IOException io){
            System.out.println("Error de lectura");
        }                  
    }       
}