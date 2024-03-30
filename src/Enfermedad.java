public class Enfermedad{

    protected String nombreEnfermedad;
    protected String nombreCientifico;
  

    public Enfermedad (String nombreEnfermedad, String nombreCientifico){

        this.nombreEnfermedad=nombreEnfermedad;
        this.nombreCientifico=nombreCientifico;
      
    }


    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }


    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }


    public String getNombreCientifico() {
        return nombreCientifico;
    }


    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }


}