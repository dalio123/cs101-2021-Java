
import java.util.Scanner;
class obrni{
      public static void main(String[] args){
    int br = 0;
     int naopako = 0;
      for(;br != 0; br /= 10) {
      int rv = br % 10;
      naopako = naopako * 10 + rv;
        }
    } 
}      
public class NewClass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("upisite prvi broj");
    int br = sc.nextInt();

    System.out.println("Reversed Number: " + obrni);
  }
}
