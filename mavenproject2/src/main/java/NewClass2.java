
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class NewClass2 {

static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Uneti broj  ");
    int n = sc.nextInt();
    System.out.println(fib(n));
    }
}

