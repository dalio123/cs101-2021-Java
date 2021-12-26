
package v11z9;

import java.util.Random;

// Klasa DesktopRacunar od atributa treba da ima visinu, širinu i dužinu računara. 
public class DesktopRacunar extends Racunar {
    String kuciste;
      int a;
    @Override
    public int getCena() {
                Random rand = new Random();
    a = rand.nextInt(5000 - 300) + 700;  
    return a;
    }

    public DesktopRacunar(String kuciste, String cpu, String memorija, String grafika, String napajanje, String maticna) {
        super(cpu, memorija, grafika, napajanje, maticna);
        this.kuciste = kuciste;
    }

    public String getKuciste() {
        return kuciste;
    }

    public void setKuciste(String kuciste) {
        this.kuciste = kuciste;
       
    }
    
        public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {

        return super.toString() + "kuciste=" + kuciste + " cena=" + this.getCena() + '}';
    }
    
}



    

