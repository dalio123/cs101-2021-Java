/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidkandas.cs101.dz03;

import java.util.Scanner;

public class Zadatak1 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Uneti dan");
        double dan=input.nextDouble();
        System.out.println("Uneti mesec");
        double mesec=input.nextDouble();
        String znak="";
        if((mesec==1 && dan>=23) || (mesec==12 && dan<=21))
            znak = "strelac";
        System.out.println("Rodjeni ste u znaku " +znak);

    }