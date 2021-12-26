
package dz9;

public class Dz9 {
/*
    Korišćenjem PowerDesigner-a nacrtati model za sledeći opis sistema i napisati implementaciju u javi: 
    Firma se bavi iznajmljivanjem bicikala. Firma ima naziv, adresu, bicikle koje poseduje, kao i podatke o iznajmljivanju.
    Svaki bicikl ima naziv modela, cenu iznajmljivanja po satu, maksimalan broj sati na koji može da se iznajmi, 
    podatak da li je trenutno iznajmljen ili ne.
    Iznajmljivanje se definiše korisnikom, biciklom i vremenom na koji se iznajmljuje. 
    *Korisnik ima ime, prezime i JMBG

    */
    public static void main(String[] args) {
        Firma f1= new Firma("naziv", "adresa");
        Bicikl b1 = new Bicikl("Graziella", 500, 5, false);
        Korisnik k1 = new Korisnik("Zuca", "Mali", "0305125425754");
        Iznajmljivanje i1 = new Iznajmljivanje(3);        
        i1.dodajBicikl(b1);
        i1.dodajKorisnika(k1);
        f1.dodajBicikl(b1);
        f1.dodajIznajm(i1);
        
        System.out.println(f1);
    }
    
}
