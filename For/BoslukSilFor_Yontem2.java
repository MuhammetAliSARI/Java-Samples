package horonaga;
// GİRİLEN METNİN İÇİNDEKİ a VE BOŞLUKLARI SİLİP KALAN HARFLERİ ALT ALTA YAZDIR.
import java.util.Scanner;

public class BoslukSilFor_Yontem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin girin : ");
        String metin = input.nextLine().toLowerCase();

        for (int i = 0 ; i<metin.length(); i++){
            if(metin.charAt(i)=='a' || metin.charAt(i)==' ') {  // Mantık: metnin i'nci karakteri a veya boşluk ise
                continue;                                       // es geç yani görme

            }
            System.out.println(metin.charAt(i));
        }
    }
}
