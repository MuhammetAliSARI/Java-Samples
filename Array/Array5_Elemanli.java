package horonaga.Metodhs.Array;
//5 ELEMANLI BİR ARRAY OLUŞTUR.
import java.util.Arrays;

public class Array5_Elemanli {
    public static void main(String[] args) {
        String dersler[] = new String [5];                     // string içindeki 5 rakamı arrayın eleman sayısını gösterir
        dersler [0] = "Matematik";
        dersler [1] = "Edebiyat";
        dersler [2] = "Fizik";
        dersler [3] = "Coğrafya";
        dersler [4] = "Tarih";

        System.out.println(Arrays.toString(dersler));          // toplu sonuç
        System.out.println(dersler[0].length() + dersler[dersler.length-1].length());
        // sıfırıncı elemanın (matematik) karakter uzunluğu (9) ve + array'in içindeki eleman sayısının 1 eksiği [dersler.length-1] 4 olunca
        // dersler [4]'te "Tarih" var. Bunun uzunluğu da 5
        // 9 + 5 =

    }

}
