/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz12;



/**
 *
 * @author david
 */



public class Prozvod {
    
    String naziv;
    String Sifra;
    double cena;

    public Prozvod(String naziv, String Sifra, double cena) {
        this.naziv = naziv;
        this.Sifra = Sifra;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSifra() {
        return Sifra;
    }

    public void setSifra(String Sifra) {
        this.Sifra = Sifra;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Prozvod{" + "naziv=" + naziv + ", Sifra=" + Sifra + ", cena=" + cena + '}';
    }
    
    
}
