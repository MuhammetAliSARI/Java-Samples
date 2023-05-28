package horonaga;

import java.util.Scanner;

public class SayiBulmaca {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sayi = 1976;

        int i = 1;
       do{
           System.out.print("4 Hneli Sayıyı tahmin edin : ");
           int tahmin = input.nextInt();

           if (tahmin==sayi){System.out.println("Bravo, bildiniz");break;}
           if (i==3){ System.out.println("Kaybettiniz");break;
           }else{
               System.out.println((3-i) + ". Hakkınız kaldı");
               int yakin = sayi-tahmin;
               System.out.println(Math.abs(yakin)+ " farkla yaklaştınız");
           }
           System.out.println();
           i++;
       }while(i<=3);
    }
}
