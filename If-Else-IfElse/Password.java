package horonaga.Metodhs.If_Else_IfELse;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String sifre = "1453";

        Scanner input = new Scanner(System.in);
        System.out.print("Şifrenizi girin : ");
        String kullaniciGirisi = input.next().toLowerCase();        // Ayrıca büyük-küçük harf farkını önemseme

        for (int i = 0; i < kullaniciGirisi.length(); i++) {        // girilen şifrenin harfleri adedince dön
            if (kullaniciGirisi.charAt(i) == sifre.charAt(i)) {     // Her şifre index değerini her kullaniciGirisi index değeri ile eşitleyip sorgula
                System.out.print("Hoşgeldiniz");
                break;
            } else {
                System.out.println("Hatalı şifre..!");
                break;
            }
        }
    }
}
