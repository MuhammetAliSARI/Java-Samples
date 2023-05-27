package horonaga.Metodhs.If_Else_IfELse;

import java.util.Scanner;

public class If_Else_ElseIf_Ozet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        // If_Else_IfELse hikayemiz burada başlıyor.
        if (sayi<20) {
            System.out.println("Sayı 20'den küçüktür");
        }else if(sayi == 20){
            System.out.println("Sayı 20'ye eşittir.");
        }else{
            System.out.println("Sayı 20'den büyüktür");
        }
    }
}
