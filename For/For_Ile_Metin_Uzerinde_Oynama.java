package horonaga.Metodhs.For;

import java.util.Scanner;
// KÜÇÜK HARFLE YAZILAN METNİN İNDEX'İ ÇİFT SAYIO OLAN KARAKTERLERİNİ EKRANA YAZDIR
public class For_Ile_Metin_Uzerinde_Oynama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen metni giriniz : ");
        String metin = input.nextLine();
        for(int i=0; i<metin.length(); i++){
            String ch = metin.substring(i, i+1);
            if(i%2==0){
                System.out.print(ch.toUpperCase());
            }
        }
    }
}
