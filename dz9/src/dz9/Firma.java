package dz9;

import java.util.ArrayList;
import java.util.List;

// Firma ima naziv, adresu, bicikle koje poseduje, kao i podatke o iznajmljivanju.
public class Firma {
    List<Bicikl> bicikli = new ArrayList<Bicikl>();
    List<Iznajmljivanje> iznajm = new ArrayList<Iznajmljivanje>();

    
    
    String naziv;
    String adresa;

    public Firma(String naziv, String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
    }


    
    public void dodajBicikl(Bicikl bicikl) {
        bicikli.add(bicikl);
    }

    public void obrisiBicikl(Bicikl bicikl) {
        bicikli.remove(bicikl); 
    }
    
        public void dodajIznajm(Iznajmljivanje iznajmlj) {
        iznajm.add(iznajmlj);
    }
    
            public void obrisiIznajm(Iznajmljivanje iznajmlj) {
        iznajm.remove(iznajmlj);
    }

    @Override
    public String toString() {
        return "Firma{" + "bicikli=" + bicikli + ", iznajm=" + iznajm + ", naziv=" + naziv + ", adresa=" + adresa + '}';
    }
            

}
