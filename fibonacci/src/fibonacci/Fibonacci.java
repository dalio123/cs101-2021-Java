/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author david
 */
public class Fibonacci {


    public static void main(String[] args) {
   /*     int i = 1;
               int j =1;
               int k = 0;
        while (true) {            
            
       
        if (0<i){
            System.out.print(i+", " );
            k=j +i;
            j= i ;
                    i = k;
        }
     }*/
   
   int a = 1;
   int i = 1;
   while (i<64){

       a= a+a;
       System.out.println("korak"+ i +" je: "+a);
       i++;
        }
}
}