package dz.pkg11;


public class Dz11 {

    
    
    interface Izracunljiv{
        double racunajPovrsinu();
        double racunajObim();
    }

    public static void main(String[] args) {
        Pravougaonik p1 = new Pravougaonik(3, 13);
        System.out.println(p1.racunajPovrsinu());
        System.out.println(p1.racunajObim());
        Valjak v1 = new Valjak(10, 3);
        System.out.println(v1.racunajPovrsinu());
        System.out.println(v1.racunajObim());
    }
    
}
