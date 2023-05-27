package horonaga.Metodhs.Input;

import java.util.Scanner;

public class Input_En_Basit {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);     // Bu bir kalıptır.

        System.out.print("Adını gir : ");
        String ad = input.nextLine();

        System.out.println("Adınız : " + ad);
    }
}
