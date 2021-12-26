//______ _   __
//|  _  \ | / /  ™
//| | | | |/ / 
//| | | |    \ 
//| |/ /| |\  \
//|___/ \_| \_/ 
             
    
package com.davidkandas.cs101.dz04;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        System.out.println("Unesite zeljeni string:");
        Scanner sc = new Scanner(System.in);
        String hehe = sc.nextLine();
        int brojac = 0;
        int c= hehe.length();
        while (hehe.charAt(1) == 'z') {
                hehe = hehe.substring(1);
}


            
   System.out.println("Slova b ima ovoliko posle slova z:"+ hehe.length());
   
    }}

  //  Napisati metodu koja broji koliko se puta slovo “b” nalazi posle slova “z” u datom Stringu i taj broj vraća. Prikazati rad metode preko Main-a.
/*
while 1 slovo nije z brisi
if 1 slovo 
*/