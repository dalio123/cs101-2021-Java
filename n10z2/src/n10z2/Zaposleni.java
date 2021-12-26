
package n10z2;

class Zaposleni {
   
    
   public String ime;
   public String prezime;
   public String adresa;
   public String telefon;
   public String godiste;
   public String drodjena;

    public Zaposleni(String ime, String prezime, String adresa, String telefon, String godiste, String drodjena) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.telefon = telefon;
        this.godiste = godiste;
        this.drodjena = drodjena;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getGodiste() {
        return godiste;
    }

    public void setGodiste(String godiste) {
        this.godiste = godiste;
    }

    public String getDrodjena() {
        return drodjena;
    }

    public void setDrodjena(String drodjena) {
        this.drodjena = drodjena;
    }

    
    @Override
    public String toString() {
        return "Zaposleni" + " ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa + ", telefon=" + telefon + ", godiste=" + godiste + ", drodjena=" + drodjena ;
    }


}