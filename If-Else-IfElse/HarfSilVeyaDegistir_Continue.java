package horonaga;
// GİRİLEN METNİN İÇİNDEKİ BOŞLUK VE a HARFLERİNİ SİL
import java.util.Scanner;

public class HarfSilVeyaDegistir_Continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String str =  input.nextLine();

        String buyukHarf = str.toLowerCase(); // HARFLERİN TEK TİP OLMASI İÇİN HARFLER KÜÇÜLTÜLÜYOR.

        for (int i = 0; i<str.length(); i++){
            if (buyukHarf.charAt(i)=='a' || buyukHarf.charAt(i)==' '){
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}
