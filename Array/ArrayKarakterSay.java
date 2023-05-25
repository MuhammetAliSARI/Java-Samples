package horonaga.Metodhs.Array;
// 5 ELEMANLI BİR ARRAY'DA TÜM ELEMANLARIN KARAKTER SAYILARININ TOPLAMINI EKRANA VER


public class ArrayKarakterSay {
    public static void main(String[] args) {
        String sehirler[] = new String [5];
        sehirler [0] = "Trabzon";
        sehirler [1] = "Rize";
        sehirler [2] = "Giresun";
        sehirler [3] = "Samsun";
        sehirler [4] = "Ordu";

        int toplamKarakterSayyisi = 0;

        for(int i=0 ; i<sehirler.length; i++){
            toplamKarakterSayyisi = toplamKarakterSayyisi + sehirler[i].length();
        }
        System.out.println(toplamKarakterSayyisi);

    }
}
