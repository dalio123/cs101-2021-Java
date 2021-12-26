/*
 Zadatak 2: Firma poseduje niz privatnih bolnica. Svaka bolnica ima svoje zaposlene.
Zaposleni mogu biti Lekari, Osoblje kao i Medicinske sestre. Podaci koji se čuvaju o lekaru
su: Fakultet, Ime, Prezime, Adresa, Telefon, Godište, Datum Rođenja. O osoblju čuvamo iste
stvari ali ne čuvamo informacije o fakultetu dok za medicinske sestre još čuvamo i smenu.
(10 minuta) */
package n10z2;

public class N10z2 {


    public static void main(String[] args) {
    Bolnica b1=new Bolnica("Svetog zuce");
    Zaposleni z1= new Zaposleni("Atila", "Atilic", "ulica svetog save 69", "0694206969", "2000", "01/03/2000");
    Lekar l1= new Lekar("Medicinski fakultet Nis", "Ljubica", "Ljubicic", "vojvode stepe 34", "06422222254", "1999", "25/04/1999");
    Sestra s1= new Sestra("David", "Davidovic", "vojvode putnika 13", "026315286", "1974", "01/01/1974", Sestra.Smena.prva);
    b1.dodajzaposlenog(z1);
    b1.dodajzaposlenog(l1);
    b1.dodajzaposlenog(s1);
    
    System.out.println(s1 instanceof Sestra);
    System.out.println(z1.toString());
    System.out.println(l1.toString());
    System.out.println(s1.toString());
    System.out.println();
    System.out.println(b1.toString());
    }
}
