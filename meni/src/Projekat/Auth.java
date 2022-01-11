package Projekat;

public class Auth {


    public static String getAuth() {
        String slova = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String auth = "";
        int sum=0;
        System.out.println("Izaberite Software:");
        int vrednost = Vrednost.getVrednost();

        while (sum != vrednost){// dok suma nije odredjen broj petlja se izvrsava
         sum=0; //vraca sumu na nula          
         auth="";// vraca string na nula
        while (auth.length() < 16) {
            int index = (int) (Math.random() * 36) + 0;
            auth += (slova.charAt(index));
        }//while
       
        for(int i =0;i<auth.length();i++)// petlja dodeljuje ascii vrednost stringa
{
  int asciiVrednost = auth.charAt(i);
  sum += asciiVrednost; 
}//for
      

}//getAuth
        
        return auth;
    }//getAuth

    public static String getSoftware(){
        String software = "";
        int a = Kontrola.getKorntola();
        switch (a){
            case 995:
                software = "Vas Key je validan za program: MacroHard Doors";
                break;
            case 1095:
                software = "Vas Key je validan za program: Vipher LineTomatoes";
                break;
            case 1071:
                software = "Vas Key je validan za program: Blind Studio Code";
                break;
            case 1164:
                software = "Vas Key je validan za program: WhosDown";
                break;
            case 1102:
                software = "Vas Key je validan za program: AloneQuiet";
                break;
                default:
                System.out.println("Pogresan unos!!! Molimo pokusajte ponovo");
        }//svich
        
        return software;
    }//getSoftware
}//clasa
