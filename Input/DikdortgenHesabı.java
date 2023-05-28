package horonaga;

import java.util.Scanner;

public class  DikdortgenHesabı {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);

        System.out.print("1. Kenarı girin : ");
        int kenara = input.nextInt();

        System.out.print("2. Kenarı girin : ");
        int kenarb = input.nextInt();

        System.out.println("Dörtgenin Alanı : " + kenara * kenarb);
        System.out.println("Dörtgenin çevresi : " + ((kenara + kenarb) * 2));
    }
}
