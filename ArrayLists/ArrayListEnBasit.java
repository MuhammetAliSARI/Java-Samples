package horonaga.Metodhs.ArraysLists;

import java.util.ArrayList;

public class ArrayListEnBasit {
    public static void main(String[] args) {
        ArrayList<Integer> rakam = new ArrayList<>();   // Bir liste tanımlaması yapıldı.
        rakam.add(8);
        rakam.add(9);
        rakam.add(10);

        boolean sonuc = rakam.contains(10);         // Sonuç olara; rakamlar içinde 10 var mı yok mu kontrol ettirildi.
        System.out.println(sonuc);

    }
}
