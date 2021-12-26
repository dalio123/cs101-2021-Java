/*Zadatak 3 
Jednu trafiku definiše njeno ime, adresa, proizvodi. Svaka kupovina ima proizvode koji su kupljeni kao i ukupnu cenu te kupovine.  Svaki proizvod ima svoje ime i cenu. 
Napisati odgovarajuće klase i testirati kreiranjem više kupovina sa proizvoljnim brojem proizvoda u svakoj od njih. Izračunati i prikazati  trenutno stanje u kasi nakon svih  kupovina. 
Napomena: Svaka od klasa treba da ima getere i setere za sve atribute, kao i odgovarajuće konstruktore.*/

enum Proizvod {
    Hleb,
    Mleko,
    Novine,
}

class Trafika {


public String ime;
public String adresa;
public Proizvod proizvod;

    public Trafika(String ime, String adresa, Proizvod proizvod) {
        this.ime = ime;
        this.adresa = adresa;
        this.proizvod = proizvod;
    }



}