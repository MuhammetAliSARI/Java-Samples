package horonaga.Metodhs.SwitchCase;
import java.util.Scanner;
public class Ulke_Plaka_Sorgula_Switch_Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ülke plaka kodu giriniz : ");
        String ulkeKodu = input.nextLine();

        switch (ulkeKodu.toLowerCase()){    // ".toLowerCase()" ekleyerek tüm girdileri, ister büyük ister küçük girilsin büyük harfe çevrilmesini sağladık.
            case "tr":
                System.out.println("Türkiye");
                break;
            case "de":
                System.out.println("Almanya");
                break;
            case "fr":
                System.out.println("Fransa");
                break;
            case "us":
                System.out.println("Amerika");
                break;
            case "es":
                System.out.println("İspanya");
                break;
            case "in":
                System.out.println("Hindistan");
                break;

            default:
                System.out.println("Lütfen tanımlı bir ülke kodu giriniz.");
        }
    }
}
