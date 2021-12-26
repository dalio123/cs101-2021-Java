package n10z2;

public class  Lekar extends Zaposleni{
    public String fakultet;

    public Lekar(String fakultet, String ime, String prezime, String adresa, String telefon, String godiste, String drodjena) {
        super(ime, prezime, adresa, telefon, godiste, drodjena);
        this.fakultet = fakultet;
    }
 
    @Override
    public String toString() {
        return super.toString() + " fakultet=" + fakultet;
    }

}