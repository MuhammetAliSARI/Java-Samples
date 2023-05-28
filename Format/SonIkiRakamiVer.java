package horonaga;

import java.util.Scanner;

public class SonIkiRakamiVer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("99'dan büyük bir sayı giriniz : ");
        int sayi = input.nextInt();

        System.out.println(String.format("%02d", sayi % 100));
    }
}
