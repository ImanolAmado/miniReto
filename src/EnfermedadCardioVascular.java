public class EnfermedadCardioVascular extends Enfermedad{

    private boolean hipertension;
    private int presionArterialAlta;
    private int presionArterialBaja;
    private int pulsoEnReposo;

    public EnfermedadCardioVascular(String nombreEnfermedad, String nombreCientifico,
    boolean hipertension, int presionArterialAlta, int presionArterialBaja, int pulsoEnReposo){

        super(nombreEnfermedad, nombreCientifico);
        this.hipertension=hipertension;
        this.presionArterialAlta=presionArterialAlta;
        this.presionArterialBaja=presionArterialBaja;
        this.pulsoEnReposo=pulsoEnReposo;
    }

    public boolean isHipertension() {
        return hipertension;
    }

    public void setHipertension(boolean hipertension) {
        this.hipertension = hipertension;
    }

    public int getPresionArterialAlta() {
        return presionArterialAlta;
    }

    public void setPresionArterialAlta(int presionArterialAlta) {
        this.presionArterialAlta = presionArterialAlta;
    }

    public int getPresionArterialBaja() {
        return presionArterialBaja;
    }

    public void setPresionArterialBaja(int presionArterialBaja) {
        this.presionArterialBaja = presionArterialBaja;
    }

    public int getPulsoEnReposo() {
        return pulsoEnReposo;
    }

    public void setPulsoEnReposo(int pulsoEnReposo) {
        this.pulsoEnReposo = pulsoEnReposo;
    }

    

}