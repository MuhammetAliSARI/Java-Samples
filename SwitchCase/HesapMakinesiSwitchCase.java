package horonaga.Metodhs.SwitchCase;
import java.util.Scanner;

public class HesapMakinesiSwitchCase {

    public static void main(String[] args) {

        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayi giriniz : ");
        double a = input.nextDouble();
        System.out.print("İkinci sayi giriniz : ");
        double b = input.nextDouble();

        System.out.print("Yapilacak islemi giriniz. +, -, *, /, % dan birini seciniz : ");
        char opr = input.next().charAt(0);

        switch(opr){
            case '+':
                System.out.println("Sonuç : " + a + "+" + b + "=" + (a+b));
                break;
            case '-':
                System.out.println("Sonuç : " + a + "-" + b + "=" + (a-b));
                break;
            case '*':
                System.out.println("Sonuç : " + a + "*" + b + "=" + (a*b));
                break;
            case '/':
                System.out.println("Sonuç : " + a + "/" + b + "=" + (a/b));
                break;
            case '%':
                System.out.println("Sonuç : " + a + "%" + b + "=" + (a*b/100));
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir...");


        }

    }
}
