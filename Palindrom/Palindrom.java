package horonaga.Metodhs;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin girinizi : ");
        String metin = input.nextLine();
        String ters = "";
        for (int i=metin.length()-1 ; i>=0 ; i--) {
            ters = ters + metin.charAt(i);
        }

        if(metin.equals(ters)){
            System.out.println("Bu metin, bir palindromdur.");
        } else {
            System.out.println("Bu metin, bir palindrom değildir.");
        }
    }
}
