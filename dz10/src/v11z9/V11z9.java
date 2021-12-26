
package v11z9;

import java.util.ArrayList;
import java.util.List;


public class V11z9 {

    public static void main(String[] args) {
        List<Racunar> racunari = new ArrayList<Racunar>();
       LaptopRacunar l1= new LaptopRacunar("Baterija", "cpu", "memorija", "grafika", "napajanje", "maticna");
       DesktopRacunar d1= new DesktopRacunar("kuciste", "cppu", "memorija", "grafika", "napajanje", "maticna");
        int i=0;
        racunari.add (l1);
        racunari.add (d1);
        ////////////////////////////////////////////////////
       for(Racunar a: racunari){
          i++;
           }                        //ukupan broj racunara
        System.out.println(i);
       //////////////////////////////////////////////////////
       int c=0;
              for(Racunar a: racunari){
                 if(a.getCpu() == "cpu") {
                      c++;
                  } else {
                  } 
              }
       //////////////////////////////////////////////////////
        System.out.println(c);
       // System.out.println(l1);
       // System.out.println(d1);

    }
    
    
}
