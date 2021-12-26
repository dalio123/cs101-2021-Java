
package lidija;

import lidija.OdevniPredmet.stanje;

/**
Zadatak 1
Napraviti klasu OdevniPredmet, potom napraviti klase Odelo i Majica koje nasleđuju klasu OdevniPredmet. 
Svaki odevni predmet ima stanje koje može biti “obučeno” ili “skinuto”. 
Svako odelo ima vrstu,
a svaka majica ima svoju veličinu.
Napraviti metodu racunajCenu() tako da je cena odela slučajan broj od 5.000 do 10.000,
a cena majice slučajan broj od 500 do 3000.
 */
public class LIDIJA {

    public static void main(String[] args) {
     
Majca m1 = new Majca(Majca.velicina.l, stanje.skinuto);
        System.out.println(m1);
Majca m2 = new Majca(Majca.velicina.xl, stanje.skinuto);
        System.out.println(m2);        
    }
    
}
