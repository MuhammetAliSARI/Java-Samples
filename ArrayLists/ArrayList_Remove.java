package horonaga.Metodhs.ArraysLists;
// ARRAY LİST İLE 2 FARKLI REMOVE KULLANIMI
import java.util.ArrayList;

public class ArrayList_Remove {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Trbzon");
        sehirler.add("Rize");
        sehirler.add("Giresun");
        sehirler.add("Ordu");

        String silinen1 = sehirler.remove(1);      // 1. indexteki değeri siler. Sildiği değeri silinen1 adlı bir değişkene aktardı
        System.out.println("Silinen değer : " + silinen1);                    // silinen1 diye bir değer oluşturup adını ekrana verdik
        System.out.println("Kalanlar değerler :  " + sehirler);               // [Trbzon, Giresun, Ordu] çıktısını verdi. Rize kayıp.

        boolean silinen2 = sehirler.remove("Ordu");                     // "Ordu" adlı index değerini siler
        System.out.println(silinen2);                   // true ya da false değer verir
        System.out.println(sehirler);                   // [Trbzon, Giresun] sonucunu ekrana verir


    }
}

// NOT: diyelimki aynı isimden bir kaç tane var. Remove yapıldığında hepsini değil, ilk index değerindekini siler
