package horonaga;
// BAYAN MI ERKEK Mİ
// BAYAN İSE 55 YAŞI GEÇTİYSE EMEKLİ OLABİLİR
// ERKEK İSE 65 YAŞI GEÇTİYSE EMEKLİ OLABİLİR
import java.util.Scanner;

public class EmekliCinsiyetVeYasKontrol2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bayan mı Erkek mi?   B/E : ");
        String cinsiyet = input.nextLine();
        System.out.print("Yaşı girin : ");
        int yas = input.nextInt();

        Object cinsiyetsec = cinsiyet.equals("B") ? (yas>=55 ? "Hanımefendi, emekliliğie hak kazandınız." : "Hanımefendi, henüz emekli olamazsınız.") : (yas>=65 ? "Beyefendi, emekliliğie hak kazandınız." : "Beyefendi, henüz emekli olamazsınız.");
        System.out.println(cinsiyetsec);

    }
}

