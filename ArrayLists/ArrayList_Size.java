package horonaga.Metodhs.ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Size {
    public static void main(String[] args) {

        List<Character> initials = new ArrayList<>();  // ArrayList oluştururken sağ tarafa (Constructor) ArrayList yazmak zorundayız.
                                                            // Ama sol tarafa ister "ArrayList" isterse de "List" yazılabilir.
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        int elemanSayisi = initials.size();                 // size ile elaman sayısını alırız.
        System.out.println(elemanSayisi);                   // Sonuç 4 verecektir.
    }
}

/* ÖNEMLİ NOT:  Arraylardan bahsederken Length kullanılır
                List'lerden bahsederken size kullanılır.
 */

