package horonaga.Metodhs;
// GİRİLEN METNİN UZUNLUĞUNU VERİR.
import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String metin = input.nextLine();
        System.out.println(metin.length());
    }
}
