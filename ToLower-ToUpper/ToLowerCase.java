package horonaga.Metodhs;
// GİRİLEN METNİN TÜM HARFLERİNİ BÜYÜK HARFE ÇEVİRİR
import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir çift sayı giriniz : ");
        String metin = input.nextLine();
        System.out.println(metin.toLowerCase());
    }
}
