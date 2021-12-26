/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs101.v13;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/*Kreirati novi paket unutar CS101-V13 koji će se zvati individualna1. Napraviti hijerarhiju
izuzetaka vezanih za unos Pošiljki. Svaka pošiljka ima naziv, težinu, adresu, grad, poštanski
broj i broj telefona. Ukoliko se desi da grad ima manje od 2 karaktera treba da se desi
GradNijeValidanException. Ukoliko poštanski broj nema 5 brojeva treba da se desi
PoštanskiBrojNijeValidanException. Svi Exception-u koji su vezani za pošiljku treba da naslede
PošiljkaException. Testirati rad izuzetaka kroz pokretačku klasu.*/
public class Cs101V13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Posiljka p1 = new Posiljka("Mindjuse", 0.1, "kralja petra 24c", "", "", "0612333573");
        System.out.println("Upisite grad");
        try {
            p1.setGrad(sc.next());
        } catch (GradNijeValidanException ex) {
            Logger.getLogger(Cs101V13.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Upisite postanski broj");
        try {
            p1.setPbroj(sc.next());
        } catch (PostanskiNijeValidanException ex) {
            Logger.getLogger(Cs101V13.class.getName()).log(Level.SEVERE, null, ex);
        }




        System.out.println(p1);
    }

}
