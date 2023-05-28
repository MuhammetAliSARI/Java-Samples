package horonaga;
//CÜMLEDEKİ HER HARFİN SONUNA BELİRLENEN KARAKTERİ KOY
import java.util.Scanner;

public class HerHarfSonuYildiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String metin = input.nextLine();
        System.out.print("Hangi karakteri koyacaksınız : ");
        String karakter = input.nextLine();

        int i = 0;
        while(i<metin.length()){
            System.out.print(metin.charAt(i)+karakter);
            i++;
        }
    }
}
