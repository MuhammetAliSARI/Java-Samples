package horonaga.Metodhs.For;
// 5 ELEMANLI BİR ARRAY'DA TÜM ELEMANLARIN KARAKTER SAYILARININ TOPLAMINI FOR-EACH YÖNTEMİ İLE EKRANA VER
public class ForEach {
    public static void main(String[] args) {
        String sehirler[] = new String [5];
        sehirler [0] = "Trabzon";
        sehirler [1] = "Rize";
        sehirler [2] = "Giresun";
        sehirler [3] = "Samsun";
        sehirler [4] = "Ordu";

        int toplam = 0;

        for(String w : sehirler){               // For-Each'te w harfi for'daki i gibi geleneksel bir kullanımdır.
           toplam = toplam + w.length();
        }
        System.out.println(toplam);
    }
}
