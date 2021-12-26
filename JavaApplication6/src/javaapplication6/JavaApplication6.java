/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;



/**
 *
 * @author david
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       for(int i =1 ;i<36;i++){
     /* System.out.println("document.getElementById(\"myID" + i +"\").addEventListener(\"mouseover\", function() {");
        System.out.println("    document.getElementById(\"myID" + i + "\").style.backgroundColor = \"green\";");
        System.out.println("});");
        
        System.out.println("document.getElementById(\"myID" + i +"\").addEventListener(\"mouseout\", function() {");
        System.out.println("    document.getElementById(\"myID" + i + "\").style.backgroundColor = \"red\";");
        System.out.println("});");
        */
     
           System.out.println("#myID"+i+" {");
           System.out.println("background-color: red;");
           System.out.println("}");
        }
    }
}
