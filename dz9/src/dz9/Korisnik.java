/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz9;

/**
 *
 * @author david
 */
public class Korisnik {
    String ime;
    String prezime;
    String JMBG;

    public Korisnik(String ime, String prezime, String JMBG) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
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

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    @Override
    public String toString() {
        return "Korisnik{" + "ime=" + ime + ", prezime=" + prezime + ", JMBG=" + JMBG + '}';
    }
    
}
