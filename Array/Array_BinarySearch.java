package horonaga.Metodhs.Array;
// Verilen rakamının, Array'ın elemanı olup olmadığını kontrol et.
import java.util.Arrays;


public class Array_BinarySearch {
    public static void main(String[] args) {
        int veri[] = {1,23,12,2,3};
        Arrays.sort(veri);                                         // Array verilerini sıralar.     1 - 2 - 3 - 12 - 23
        System.out.println(Arrays.binarySearch(veri,12));      // Sonucu index değeri olarak verecektir.
        System.out.println(Arrays.binarySearch(veri,5));       // 5 yok. Olsaydı, sıralama şekline göre nerede olabilecekse oraya göre eksi değerli sırasını verir.

    }
}

// Array'da olan elemenlar için index değerini, olmayan elemanlar için ise sıralama değerini verir. '

