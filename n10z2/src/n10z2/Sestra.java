
package n10z2;


public class Sestra extends Zaposleni{
    
        enum Smena{
        prva,
        druga,
        treca,
    }     
    Smena smena;

    public Sestra(String ime, String prezime, String adresa, String telefon, String godiste, String drodjena, Smena smena) {
        super(ime, prezime, adresa, telefon, godiste, drodjena);
        this.smena = smena;
    }

    @Override
    public String toString() {
        return super.toString() + " smena=" + smena ;
    }

    
    
    
    }


  
    
