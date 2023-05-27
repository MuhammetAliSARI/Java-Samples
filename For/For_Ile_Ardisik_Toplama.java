package horonaga.Metodhs.For;

import java.util.Scanner;

public class For_Ile_Ardisik_Toplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı aralığı için ilk sayıyı girin : ");
        int sayi1 = input.nextInt();
        System.out.print("Sayı aralığı için ikinci sayıyı girin : ");
        int sayi2 = input.nextInt();

        // VERİLEN SAYI ARALIĞINDAKİ RAKAMLARI ÇARP
        int topla = 0;  // Bir başlangıç değeri vermemiz gerekiyor.
        for( int i = sayi1 ; i < (sayi2+1); i++) {
            topla = topla + i;
        }
        System.out.println(topla);

        // VERİLEN SAYI ARALIĞINDAKİ RAKAMLARI ÇARP
        long carp = 1;      // bu sefer 1 verdik. Çünkü eğer 0 verseydik sonuç herşeye rağmen 0 olurdu.
        for( long i = sayi1 ; i < (sayi2+1); i++) {
            carp = carp * i;
        }
        System.out.println(carp);
    }
}
