package horonaga.Metodhs;

import java.util.Scanner;

public class Ternary_Yontem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir çift sayı giriniz : ");
        long x = input.nextLong();
        String sonuc = (x%2 == 0) ? x + " bir çift sayıdır." : x + " bir tek sayıdır.";
        System.out.println(sonuc);
    }
}
