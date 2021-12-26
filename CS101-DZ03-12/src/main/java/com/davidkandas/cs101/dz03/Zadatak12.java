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
public class Zadatak12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    System.out.println("ukucajte prvi broj:"); 
    int a = keyboard.nextInt();
    System.out.println("ukucajte drugi broj:"); 
    int b = keyboard.nextInt();
    System.out.println("ukucajte treci broj:"); 
    int c = keyboard.nextInt();
    
    if (a*a + b*b == c*c )
    System.out.println( "Uneti brojevi zadovoljavaju Pitagorinu teoremu: " + a + "^2 + "+ b + "^2 = "+ c + "^2" );
    else if (a*a + c*c == b*b )
    System.out.println( "Uneti brojevi zadovoljavaju Pitagorinu teoremu: " + a + "^2 + "+ c + "^2 = "+ b + "^2" );
    else if (b*b + c*c == a*a )
    System.out.println( "Uneti brojevi zadovoljavaju Pitagorinu teoremu: " + b + "^2 + "+ c + "^2 = "+ a + "^2" );
    else
    System.out.println( "Vasi brojevi nezadovoljavaju Pitagorinu teoremu" );
    }
}