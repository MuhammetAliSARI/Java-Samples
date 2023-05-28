package horonaga.Metodhs.EndsWithx;
// GİRDİĞİMİZ METNİN SONUNUN n İLE BİTİP BİTMEDİĞİNİ SORGULA
import java.util.Scanner;

// YAZDIĞIMIZ METNİN SONUNUN n İLE BİTİP BİT
public class EndsWith {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String metin = input.nextLine();
        String sonuc = metin.endsWith("n") ? "Doğru sonuç girdiniz" : "Yanlış sonuç girdiniz";    // endsWith() içinde n sorgulandı.
        System.out.println(sonuc);

    }
}
