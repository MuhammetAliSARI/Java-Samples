package horonaga;

import java.util.Scanner;

public class Buyuk_Kucuk_Harf_mi {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Bir harf giriniz");

            char harf = scan.next().charAt(0);


            if (harf >= 'a' && harf <= 'z') {
                System.out.println("Kucuk harf");

            } else if (harf >= 'A' && harf <= 'Z') {

                System.out.println("Buyuk harf");
            } else {

                System.out.println("Sana harf gir dedim!");
            }
            scan.close();
        }
}
