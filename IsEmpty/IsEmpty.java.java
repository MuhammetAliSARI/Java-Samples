package horonaga.Metodhs;
// VERİNİN KARAKTER İÇERİP İÇERMEDİĞİNİ SORGULAR
import java.util.Scanner;

public class IsEmpty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin girin : ");
        String metin = input.nextLine();
        String sonuc = metin.isEmpty() ? "Bu veri boş" : "Bu veri dolu";
        System.out.println(sonuc);
    }
}
