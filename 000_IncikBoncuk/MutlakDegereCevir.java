package horonaga;
// VERİLEN SAYIYI MUTLAK DEĞERE ÇEVİR
import java.util.Scanner;

public class MutlakDegereCevir {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Sayı giriniz : ");
        double sayi = input.nextDouble();

        double sonuc = sayi<0 ? -1*sayi : sayi;
        System.out.println(sonuc);
    }
}
