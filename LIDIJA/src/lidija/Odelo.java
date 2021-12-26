/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidija;

import java.util.Random;

/**
 *
 * @author david
 */
public class Odelo extends OdevniPredmet{
    
        public int racunajCenu() {
                Random rand = new Random();
    return rand.nextInt(10000 - 5000) + 5000 ;  
    }
            enum vrsta{
        svecano,
        sportsko,
        casual,
    }
   static vrsta vrsta;

    public Odelo(vrsta vrsta, stanje stanje) {
        super(stanje);
        this.vrsta = vrsta;
    }

    public vrsta getVrsta() {
        return vrsta;
    }

    public void setVrsta(vrsta vrsta) {
        this.vrsta = vrsta;
    }

    @Override
    public String toString() {
        return super.toString() + "vrsta=" + vrsta + this.racunajCenu()+ '}';
    }
    
}
