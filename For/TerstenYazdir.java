package horonaga;
// girilen metni tersinden ekrana yazdır
import java.util.Scanner;

public class TerstenYazdir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("iBr metin girinizi : ");
        String metin = input.nextLine();

        for (int i = metin.length()-1; i>=0 ; i--){
            char harf = metin.charAt(i);

            System.out.print(harf);
        }
    }
}
