
package v11z9;
// cpu, memorija,grafika, napajanje, matična ploča
public abstract class Racunar {
     private String cpu;
    String memorija;
    String grafika;
    String napajanje;
    String maticna;
    abstract public int getCena();

    public Racunar(String cpu, String memorija, String grafika, String napajanje, String maticna) {
        this.cpu = cpu;
        this.memorija = memorija;
        this.grafika = grafika;
        this.napajanje = napajanje;
        this.maticna = maticna;
    }
    


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemorija() {
        return memorija;
    }

    public void setMemorija(String memorija) {
        this.memorija = memorija;
    }

    public String getGrafika() {
        return grafika;
    }

    public void setGrafika(String grafika) {
        this.grafika = grafika;
    }

    public String getNapajanje() {
        return napajanje;
    }

    public void setNapajanje(String napajanje) {
        this.napajanje = napajanje;
    }

    public String getMaticna() {
        return maticna;
    }

    public void setMaticna(String maticna) {
        this.maticna = maticna;
    }

    @Override
    public String toString() {
        return "Racunar{" + "cpu=" + cpu + ", memorija=" + memorija + ", grafika=" + grafika + ", napajanje=" + napajanje + ", maticna=" + maticna + '}';
    }


    
    
    
}


