
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class NewClass {
    public static double saberi (double a, double b){
        return a+b;
    }
        public static double oduzmi (double a, double b){
        return a-b;
    }
        public static double pomnozi (double a, double b){
        return a*b;
    }
        public static double podeli (double a, double b){
        return a / b;
    }
                public static double ostatak (double a, double b){
        return a % b;
    }
        
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("unesite prvi broj");
        double a = sc.nextDouble();
        System.out.println("unesite drugi broj");
        double b = sc.nextDouble();
        System.out.println("izaberite operaciju");
        int da = sc.nextInt();
        switch(da){
            case 1: System.out.println(saberi(a,b));
            case 2: System.out.println(oduzmi(a,b));
            case 3: System.out.println(pomnozi(a,b));
            case 4: System.out.println(podeli(a,b));
            case 5: System.out.println(ostatak(a,b));
        
    }
        }
    }

