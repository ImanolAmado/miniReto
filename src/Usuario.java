public class Usuario{

private int id;
private String nombre;
private String apellidos;
private boolean asistencia;
private Enfermedad[] listaEnfermedades = new Enfermedad[10];


public Usuario(int id, String nombre, String apellidos, boolean asistencia, Enfermedad[] listaEnfermedades){

    this.id=id;
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.asistencia=asistencia;
    this.listaEnfermedades = listaEnfermedades;  
}


public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public String getApellidos() {
    return apellidos;
}


public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}


public Enfermedad[] getListaEnfermedades() {
    return listaEnfermedades;
}


public void setListaEnfermedades(Enfermedad[] listaEnfermedades) {
    this.listaEnfermedades = listaEnfermedades;
}


public boolean getAsistencia(){
    return asistencia;
}


public void setAsistencia(boolean asistencia){
    this.asistencia=asistencia;
}


}