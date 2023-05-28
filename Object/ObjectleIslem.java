package horonaga.Metodhs;
// İKİ SAYININ İŞARETLERİ AYNI İSE BU SAYILARI ÇARPAN, DEĞİLSE "ÇARPAMIYORUM" MESAJI VEREN KODU YAZ
import java.util.Scanner;

public class ObjectleIslem {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Birinci sayıyı gir : ");
        Double sayi1 = input.nextDouble();
        System.out.println("İkinci sayıyı gir : ");

        double sayi2 = input.nextDouble();

        java.lang.Object sonuc = (sayi1*sayi2)<0 ? "Farklı işaretli rakamları çarpamıyorum" : "Sonuç : " + sayi1*sayi2;
        System.out.println(sonuc);
    }
}
