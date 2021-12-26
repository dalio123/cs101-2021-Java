package n10z2;


import java.util.ArrayList;
import java.util.List;

public class Bolnica {

    public String ime;
    List<Zaposleni> zaposleni = new ArrayList<Zaposleni>();   
    public Bolnica() {

    }
    public Bolnica(String ime) {
        this.ime = ime;
    }

    public void dodajzaposlenog(Zaposleni zaposlen) {
        zaposleni.add(zaposlen);
    }

    public void obrisizaposlenog(Zaposleni zaposlen) {
        zaposleni.remove(zaposlen);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public List<Zaposleni> getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(List<Zaposleni> zaposleni) {
        this.zaposleni = zaposleni;
    }

    @Override
    public String toString() {
        return "Bolnica{" + "ime=" + ime + ", zaposleni=" + zaposleni + '}';
    }





    

}
