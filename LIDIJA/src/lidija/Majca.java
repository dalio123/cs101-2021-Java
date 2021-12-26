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
public class Majca extends OdevniPredmet {
    
    public int racunajCenu() {
                Random rand = new Random();
    return rand.nextInt(3000 - 500) + 500 ;  
    }
enum velicina{
    s,
    m,
    l,
    xl,
    xxl,
}
static velicina velicina;

    public Majca(velicina velicina, stanje stanje) {
        super(stanje);
        this.velicina = velicina;
    }

    public velicina getVelicina() {
        return velicina;
    }

    public void setVelicina(velicina velicina) {
        this.velicina = velicina;
    }

    @Override
    public String toString() {
        return super.toString() + "velicina=" + velicina + this.racunajCenu() + '}';
    }



}
