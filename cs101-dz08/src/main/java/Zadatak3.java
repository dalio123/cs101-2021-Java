/*Zadatak 3 
Jednu trafiku definiše njeno ime, adresa, proizvodi. Svaka kupovina ima proizvode koji su kupljeni kao i ukupnu cenu te kupovine.  Svaki proizvod ima svoje ime i cenu. 
Napisati odgovarajuće klase i testirati kreiranjem više kupovina sa proizvoljnim brojem proizvoda u svakoj od njih. Izračunati i prikazati  trenutno stanje u kasi nakon svih  kupovina. 
Napomena: Svaka od klasa treba da ima getere i setere za sve atribute, kao i odgovarajuće konstruktore.*/

public class Zadatak3 {
    public static void main(String[] args) throws Exception {
        Trafika trafika = new Trafika(Brzina.brz,Model.Amd,2.8,"Ryzen 5 3600x");
        System.out.println(trafika.toString());
    }
}
