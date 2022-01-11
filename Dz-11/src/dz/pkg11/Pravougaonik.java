
package dz.pkg11;


public class Pravougaonik implements Dz11.Izracunljiv {
double baza;
double visina;

    public Pravougaonik(int base, int altezza) {
        this.baza = base;
        this.visina = altezza;
    }


    @Override
    public double racunajPovrsinu() {
    double pov = baza * visina;  
    return pov;
    }

    @Override
    public double racunajObim() {
     double
     obim = 3*baza;
     return obim;
    }

    public double getBase() {
        return baza;
    }

    public void setBase(int base) {
        this.baza = base;
    }

    public double getAltezza() {
        return visina;
    }

    public void setAltezza(int visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        return "Pravougaonik{" + "baza=" + baza + ", visina=" + visina + '}';
    }

}
