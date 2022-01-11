
package Projekat;

import java.util.Scanner;

public class Vrednost {


    public static int getVrednost() {
        int vrednost = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. MacroHard Doors");
        System.out.println("2. Vipher LineTomatoes");
        System.out.println("3. Blind Studio Code");
        System.out.println("4. WhosDown");
        System.out.println("5. AloneQuiet");
        int a=sc.nextInt();
        switch(a){
            case 1:
                vrednost=995;
                break;
            case 2:
                vrednost=1095;
                break;
            case 3:
                vrednost=1071;
                break;
            case 4:
                vrednost=1164;
                break;
            case 5:
                vrednost=1102;
                
        }//svich
        return vrednost;
    }//getVrednost
    
}//clasa
