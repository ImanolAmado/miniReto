public class EnfermedadVisual extends Enfermedad{


    private int agudezaVisual;
    private double miopia;
    private double hipermetropia;
    private double astimagtismo;
    private double cataratas;

    public EnfermedadVisual(String nombreEnfermedad, String nombreCientifico,
    int agudezaVisual, double miopia, double hipermetropia, double astimagtismo,
    double cataratas){
        super(nombreEnfermedad, nombreCientifico);
        this.agudezaVisual=agudezaVisual;
        this.miopia=miopia;
        this.hipermetropia=hipermetropia;
        this.astimagtismo=astimagtismo;
        this.cataratas=cataratas;
    }

    public int getAgudezaVisual() {
        return agudezaVisual;
    }

    public void setAgudezaVisual(int agudezaVisual) {
        this.agudezaVisual = agudezaVisual;
    }

    public double getMiopia() {
        return miopia;
    }

    public void setMiopia(double miopia) {
        this.miopia = miopia;
    }

    public double getHipermetropia() {
        return hipermetropia;
    }

    public void setHipermetropia(double hipermetropia) {
        this.hipermetropia = hipermetropia;
    }

    public double getAstimagtismo() {
        return astimagtismo;
    }

    public void setAstimagtismo(double astimagtismo) {
        this.astimagtismo = astimagtismo;
    }

    public double getCataratas() {
        return cataratas;
    }

    public void setCataratas(double cataratas) {
        this.cataratas = cataratas;
    }
    

}