package horonaga.Metodhs.For;

import java.util.Scanner;

public class SayininRakamlariToplmai_For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı girin : ");
        int sayi = input.nextInt();

        int toplam = 0;

        for(int m = sayi ; m>0 ; m/=10){
            toplam = toplam + m%10;
        }
        System.out.println(toplam);
    }
}
