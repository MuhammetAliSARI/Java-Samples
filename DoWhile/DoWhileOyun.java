package horonaga.Metodhs.DoWhile;

import java.util.Scanner;

public class DoWhileOyun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;

        do{
            System.out.println("Bir sayı giriniz : ");
            num = input.nextInt();

            if(num>=100){
                System.out.println("Kazandınız");
            }

        }while(num>=100);
        System.out.println("Kaybettiniz");
    }
}
