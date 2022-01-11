/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projekat;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Kontrola {


    public static int getKorntola() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upisite Vas key:");
            String key = sc.next();
    int sum=0;
    for(int i=0; i<key.length(); i++)
    {
      int asciiVrednost = key.charAt(i);
      sum = sum+ asciiVrednost;
    }//For
        return sum;
    }//getKontrola
    
    
}//clasa
