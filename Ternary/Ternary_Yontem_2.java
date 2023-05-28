package horonaga.Metodhs;

import java.util.Scanner;

public class Ternary_Yontem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir çift sayı giriniz : ");
        long x = input.nextLong();
        System.out.println((x%2 == 0) ? x + " bir çift sayıdır." : x + " bir tek sayıdır.");
    }
}
