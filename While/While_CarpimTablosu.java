package horonaga.Metodhs.While;
// ÇARPIM TABLOSU OLUŞTUR
import java.util.Scanner;

public class While_CarpimTablosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        int i = 1;
        while(i<=10){
            System.out.println(sayi + " x " + i + " = " + (sayi*i));
            i++;
        }
    }
}
