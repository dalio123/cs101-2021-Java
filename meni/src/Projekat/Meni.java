package Projekat;

import java.util.Scanner;

public class Meni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Izaberite opciju:");
            System.out.println("1: Keygen");
            System.out.println("2. Provera");
            System.out.println("3: Zatvori program");
            int a = sc.nextInt();
            switch(a){
                case 1:
                System.out.println(Auth.getAuth());
                break;
                case 2:
                System.out.println(Auth.getSoftware());
                break;
                case 3:
                break;
                default:
                System.out.println("Pogresan unos!!! Molimo pokusajte ponovo");
            
         }//swich
    
    }//psv main
}//clasa