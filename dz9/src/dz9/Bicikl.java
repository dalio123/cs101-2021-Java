package dz9;


public class Bicikl {

    
    String model;
    double cena;
    int max;
    boolean iznajmljen;

    public Bicikl(String model, double cena, int max, boolean iznajmljen) {
        this.model = model;
        this.cena = cena;
        this.max = max;
        this.iznajmljen = iznajmljen;
    }

    @Override
    public String toString() {
        return "Bicikl{" + "model=" + model + ", cena=" + cena + ", max=" + max + ", iznajmljen=" + iznajmljen + '}';
    }
    
}
