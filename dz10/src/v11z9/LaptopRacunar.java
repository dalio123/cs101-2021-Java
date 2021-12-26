
package v11z9;

import java.util.Random;


public class LaptopRacunar extends Racunar{
    String Baterija;

    
    @Override
    public int getCena() {
                Random rand = new Random();
    return rand.nextInt(5000 - 700) + 700 ;  
    }

    public LaptopRacunar(String Baterija, String cpu, String memorija, String grafika, String napajanje, String maticna) {
        super(cpu, memorija, grafika, napajanje, maticna);
        this.Baterija = Baterija;
        
    }

    public String getBaterija() {
        return Baterija;
    }

    public void setBaterija(String Baterija) {
        this.Baterija = Baterija;
    }

  
    @Override
    public String toString() {
        return super.toString() + "Baterija=" + Baterija + ", cena=" + this.getCena() + '}';
    }


}