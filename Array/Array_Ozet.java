package horonaga.Metodhs.Array;

import java.util.Arrays;

// İSTENİLEN ARRAY DEĞERİNİ (1) YAZDIR
public class Array_Ozet {
    public static void main(String[] args) {
        // BİRİNCİ YÖNTEM
        int veri[] = new int[4];
        veri[0]=11; veri[1]=13; veri[2]=12; veri[3]=14;
        System.out.println(veri[0]);

        // İKİNCİ YÖNTEM
        int veyi[]={11,12,13,14};
        System.out.println(veri[1]);                     // Array'ın 1. indexini yazdır.
        System.out.println(veyi[veyi.length-3]);         // Array değerinin uzunluğu=4  Bundan 3 çıkaracağız=1 Sonra 1.index değerini ekrana yazdırır.
        System.out.println(Arrays.toString(veyi));       // Array değerlerini yazdır.

        // FOR İÇİNDE...
        for (int i=0; i<4; i++){
            System.out.println("For içinde... " + veyi[i]+ " ");            // i--> 0,1,2,3 indexlerini görecek. Bunları alt alta yazacak
        }

        Arrays.sort(veyi);                               // veyi Arrays'ının içindekileri küçükten büğüye sırala
        System.out.println("Sort ile... " + veri[veyi.length-1]);   // Uzunluğu 4 idi. 1 çıkardık. Kaldı 3. veri arraysının 3. indexini yaz.

    }
}
