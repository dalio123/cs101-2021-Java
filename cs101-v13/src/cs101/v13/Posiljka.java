/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs101.v13;

/**
Svaka pošiljka ima naziv, težinu, adresu, grad, 
poštanski broj i broj telefona.
 */
public class Posiljka extends Exception {
    String naziv;
    double tezina;
    String adresa;
    String grad;
    String pbroj;
    String brtel;

    public Posiljka(String naziv, double tezina, String adresa, String grad, String pbroj, String brtel) {
        this.naziv = naziv;
        this.tezina = tezina;
        this.adresa = adresa;
        this.grad = grad;
        this.pbroj = pbroj;
        this.brtel = brtel;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) throws GradNijeValidanException {
        this.grad = grad;
                if (grad.length() < 2) {
            throw new GradNijeValidanException("ime grada je prekratko");
        }
    }

    public String getPbroj() {
        return pbroj;
    }

    public void setPbroj(String pbroj) throws PostanskiNijeValidanException {
        this.pbroj = pbroj;
                if (pbroj.length() != 5) {
            throw new PostanskiNijeValidanException("Postanski broj nema dovoljno brojeva"); 
        }
    }

    public String getBrtel() {
        return brtel;
    }

    public void setBrtel(String brtel) {
        this.brtel = brtel;
    }

    @Override
    public String toString() {
        return "Posiljka{" + "naziv=" + naziv + ", tezina=" + tezina + ", adresa=" + adresa + ", grad=" + grad + ", pbroj=" + pbroj + ", brtel=" + brtel + '}';
    }
    
    
}
