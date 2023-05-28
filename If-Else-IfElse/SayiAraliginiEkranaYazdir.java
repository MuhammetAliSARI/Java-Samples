package horonaga;
// GİRİLEN İKİ SAYI ARALIĞINDAKİ ÇİFT SAYILARI EKRANA VER
import java.util.Scanner;

public class SayiAraliginiEkranaYazdir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı girin : ");
        int ilkSayi = input.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        int ikinciSayi = input.nextInt();

        if(ilkSayi>ikinciSayi){
            System.out.println("Başlangıç değeri, bitiş değerinden küçük olamaz.");
        }else{

            for (int i = ilkSayi ; i<=ikinciSayi ; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");

                }
            }
        }
    }
}
