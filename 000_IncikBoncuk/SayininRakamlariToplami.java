package horonaga;

import java.util.Scanner;

public class SayininRakamlariToplami {
    // Girilen sayının rakamları toplamı
    // Sum of the Digits of the Number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin : ");
        int sayi = input.nextInt();

        String uzun = Integer.toString(sayi);

        int topla = 0;

        for (int i = 0; i < uzun.length(); i++){
            topla += sayi%10;
            sayi=sayi/10;
        }
        System.out.println(topla);
    }
}
