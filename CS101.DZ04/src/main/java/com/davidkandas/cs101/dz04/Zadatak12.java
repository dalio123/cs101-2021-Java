//______ _   __
//|  _  \ | / /  ™
//| | | | |/ / 
//| | | |    \ 
//| |/ /| |\  \
//|___/ \_| \_/ 
             
    
package com.davidkandas.cs101.dz04;

import java.util.Scanner;

public class Zadatak12 {
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Upisite vase ime");
    String a = sc.next();
    char  b = a.charAt(0);
    System.out.println("Upisite vase prezime");
    String c = sc.next();
    char  d = c.charAt(0);
    String e = a.substring(1);
    String f = c.substring(1);
       
    
    if ((b+d)%2==0)
System.out.println(a + " " + c);
    else
        System.out.println(c.charAt(0) + e +" " +a.charAt(0) + f);
    }
  }