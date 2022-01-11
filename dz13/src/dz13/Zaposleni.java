/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz13;

/**
 *
 * @author david
 */
public class Zaposleni {
    String ime;
    String prezime;
    String jbmg;

    public Zaposleni(String ime, String prezime, String jbmg) {
        this.ime = ime;
        this.prezime = prezime;
        this.jbmg = jbmg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJbmg() {
        return jbmg;
    }

    public void setJbmg(String jbmg) {
        this.jbmg = jbmg;
    }

    @Override
    public String toString() {
        return "Zaposleni{" + "ime=" + ime + ", prezime=" + prezime + ", jbmg=" + jbmg + '}';
    }

    
}
