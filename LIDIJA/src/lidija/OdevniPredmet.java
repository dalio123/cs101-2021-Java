package lidija;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class OdevniPredmet {
    enum stanje{
        obuceno,
        skinuto,
    }

stanje stanje;

    public OdevniPredmet(stanje stanje) {
        this.stanje = stanje;
    }

    public stanje getStanje() {
        return stanje;
    }

    public void setStanje(stanje stanje) {
        this.stanje = stanje;
    }

    @Override
    public String toString() {
        return "OdevniPredmet{" + "stanje=" + stanje + '}';
    }
    
}
