package horonaga.Metodhs.ArraysLists;
// STRİNG LİST'TEKİ ELEMANLARIN TOPLAM KARAKTER SAYISI
import java.util.ArrayList;


public class ArrayLists_ElemanSayilariToplami_Get_Size {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Trbzon");
        sehirler.add("Rize");
        sehirler.add("Giresun");
        sehirler.add("Ordu");

        // 1. YOL:

        int sum = 0;

        for(String w : sehirler){
          sum = sum +  w.length();

        }
        System.out.println(sum);            // Toplam 21 karakterlik sonucu verir.


        // 2.YOL:
        int toplam = 0;
        for (int i=0; i< sehirler.size(); i++){
            toplam = toplam + sehirler.get(i).length();
        }
        System.out.println(toplam);

    }
}
