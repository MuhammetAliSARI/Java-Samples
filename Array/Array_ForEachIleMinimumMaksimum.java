package horonaga.Metodhs.Array;
// 5 ELEMANLI BİR ARRAY'DA TÜM ELEMANLARIN KARAKTER SAYILARININ TOPLAMINI FOR-EACH YÖNTEMİ İLE EKRANA VER
public class Array_ForEachIleMinimumMaksimum {
    public static void main(String[] args) {
        int yas[] = new int[6];
        yas[0] = 20;
        yas[1] = 23;
        yas[2] = 19;
        yas[3] = 44;
        yas[4] = 15;
        yas[5] = 32;

        int enKucuk = yas[0];
        int enBuyuk = yas[0];

        for(int w : yas){
            enKucuk = Math.min(enKucuk, w);  // min metodu ile
            enBuyuk = Math.max(enBuyuk, w);  // max metodu ile
        }
        System.out.println(enKucuk + enBuyuk);
    }
}

// MI METOD SHORT METODUNA GÖRE DAHA AVATAJLIDIR. DAHA HIZLIDIR.
