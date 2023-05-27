package horonaga.Metodhs.Replace;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Bir metin giriniz ? ");       // Birinci verinin sorusu
        String metin = input.nextLine();

        System.out.print("Hangi harfi değişeceksiniz ? ");      // İkinci verinin sorusu
        String degisa = input.nextLine();

        System.out.print("Hangi harf ile değişeceksiniz ? ");      // Üçüncü verinin sorusu
        String degisb = input.nextLine();

        System.out.print(metin.replace(degisa,degisb)); // BU SATIRDA REPLACE İLE YERİNE KOYMA İŞLEMİ YAPILDI.
    }
}
