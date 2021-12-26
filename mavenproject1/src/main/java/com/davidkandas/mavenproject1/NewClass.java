/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidkandas.mavenproject1;

/**
 *
 * @author david
 */
public class NewClass {
     public static void main(String[] args) {
         
     int a = 6;

    for (int i = 1; i <= a; ++i) {
      for (int b = 1; b <= i; ++b) {
        System.out.print(b + " ");
      }
      System.out.println();        
  
        }
      System.out.println();
    for (int i = a; i >= 1; --i) {
      for (int b = 1; b <= i; ++b) {
        System.out.print(b + " ");
      }
      System.out.println();
    }
  }
}
