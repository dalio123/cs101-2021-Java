//______ _   __
//|  _  \ | / /  ™
//| | | | |/ / 
//| | | |    \ 
//| |/ /| |\  \
//|___/ \_| \_/ 
             
             
package com.davidkandas.cs101.dz03;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Zadatak8 {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Uneti cenu  ");
        int cena = sc.nextInt();
        System.out.println(" Uneti opciju  ");    
        int opcija = sc.nextInt();
        double a = cena + (cena/100*20);
                
        if (opcija == 1) {
            System.out.println("cena je " + a);
        }
        else{
            System.out.println("s");
        }
}
}