package dz9;

//   Iznajmljivanje se definiše korisnikom, biciklom i vremenom na koji se iznajmljuje. 

import java.util.ArrayList;
import java.util.List;

public class Iznajmljivanje{
List<Korisnik> korisnici = new ArrayList<Korisnik>();
List<Bicikl> bicikli = new ArrayList<Bicikl>();
public void dodajKorisnika(Korisnik korisnik) {
        korisnici.add(korisnik);
    }
    int vreme;

    public Iznajmljivanje(int vreme) {
        this.vreme = vreme;
    }
    
    public void obrisiKorisnika(Korisnik korisnik) {
        korisnici.remove(korisnik);
    }
    
    public void dodajBicikl(Bicikl bicikl) {
        bicikli.add(bicikl);
    }

    public void obrisiBicikl(Bicikl bicikl) {
        bicikli.remove(bicikl); 
    }

    @Override
    public String toString() {
        return "iznajmlivanje{" + "korisnici=" + korisnici + ", bicikli=" + bicikli + ", vreme=" + vreme + '}';
    }


    
}
