
package dz.pkg11;

public class Valjak implements Dz11.Izracunljiv {

    double r;
    double h;

    public Valjak(double r, double h) {
        this.r = r;
        this.h = h;
    }
    
    @Override
    public double racunajPovrsinu() {
       double m = 2*r*Math.PI*h;
       double b = (r*r)*Math.PI;
       double pov = m+b+b;
       return pov;
    }

    @Override
    public double racunajObim() {
      double zap = (r*r)*Math.PI*h;
      return zap; //  Valjak nema obim, napravio sam racunanje zapremine.
   }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Valjak{" + "r=" + r + ", h=" + h + '}';
    }

    

    
}
