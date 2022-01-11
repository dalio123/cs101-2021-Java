/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dz13;

import java.util.Scanner;

/**
Napisati program za unos podataka o zaposlenima.  Potrebno je kreirati klasu Zaposleni koja od atributa ima ime, 
* prezime i jmbg. Potrebno je kreirati svoje Exception-e koji će se generisati prilikom grešaka kod unosa zaposlenih. 
* Ukoliko korisnik unese prazan tekst za neki podatak treba generisati EmptyFieldException. 
* Zatim ukoliko polje jmbg nema tačno 13 karaktera i ne sadrži isključivo brojeve treba generisati izuzetak JmbgException.
Testirati primenu kreiranih izuzetaka (Exception-a) tako što ćete svaki put kada dođe do izuzetka korisniku  prikazati odgovarajuću poruku.

 */
public class Dz13 {
public static Zaposleni z1 = new Zaposleni("yu", "suf", "0123456789123");
    public static void metoda1() throws EmptyFieldException{
        if (z1.getIme().length() < 1){
         throw new EmptyFieldException();
        }
        
    }
    public static void metoda2() throws JmbgException{
                if (!(z1.getJbmg().length() == 13)){
           // System.out.println("JMBG nema 13 Brojeva");
            throw new JmbgException("JMBG nema 13 Brojeva");
        }
        
        else if (!(z1.getJbmg().matches("[0-9]+"))){
           // System.out.println("Pronadjena slova u Jmbgu");
            throw new JmbgException("Pronadjena slova u Jmbgu");
        } 
        else 
            System.out.println(z1);
            
        System.out.println("Kraj Programa");
    }
    public static void main(String[] args) throws JmbgException, EmptyFieldException {
        
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("upisite ime");
        z1.setIme(sc.nextLine());
        System.out.println("upisite prezime");
        z1.setPrezime(sc.nextLine());
        System.out.println("upisite jmbg");
        z1.setJbmg(sc.nextLine());
        metoda1();
        metoda2();
        }
        catch (JmbgException ex) {
            System.out.println("Javio se izuzetak: " + ex.getClass());
            System.out.println(ex.getMessage());
        } catch (EmptyFieldException ex){
            System.out.println("Polje je prazno!!!" + ex.getClass());
        }
        }
        
        

        
        

    }
    
