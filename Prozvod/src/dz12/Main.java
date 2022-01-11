/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dz12;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author david
 */
public class Main {
ArrayList<Prozvod> prozvodi = new ArrayList<Prozvod>();

    public static void main(String[] args) {
ArrayList<Prozvod> prozvodi = new ArrayList<Prozvod>();
ArrayList cene = new ArrayList();


Prozvod p1 = new Prozvod("banane", "1", 120);
Prozvod p2 = new Prozvod("jabuke", "2", 60);
Prozvod p3 = new Prozvod("pecurke", "3", 210);
Prozvod p4 = new Prozvod("mrkve", "4", 55);
Prozvod p5 = new Prozvod("voda", "5", 30);
Prozvod p6 = new Prozvod("sok", "6", 90);
Prozvod p7 = new Prozvod("Milan", "7", 1120);
Prozvod p8 = new Prozvod("pilece meso", "8", 920);
Prozvod p9 = new Prozvod("hleb", "9", 49);

prozvodi.add(p1);
prozvodi.add(p2);
prozvodi.add(p3);
prozvodi.add(p4);
prozvodi.add(p5);
prozvodi.add(p6);
prozvodi.add(p7);
prozvodi.add(p8);
prozvodi.add(p9);

for(Prozvod i: prozvodi){
    cene.add(i.getCena());
    }

     Comparable min = Collections.min(cene);
     double minimalac = (double) min;
     
    for(Prozvod i: prozvodi){
    if(i.getCena() == minimalac){
        System.out.println("Najjeftiniji proizvod je: " + i);
     }
    }
}
}
