package horonaga.Metodhs.ArraysLists;
// ARRA İÇİNDEN BİR ELEMAN SİLİNECEK
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Remove_ElemanSil {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        /* 1. YOL
        Integer nonPrimitive = 12;
        ages.remove(nonPrimitive);     // remove yazınca ekranda beliren küçük pencerede 2 seçenek çıkıyor. Biz objek olanı seçtik
                                       // Java'da tam sayı yazıldığında, Jmava onu otomatik olarak 'primitive int' kabul eder.
                                       // O yüzden üst satıra Integer nonPrimitive ekledik.
                                       // Bu yüzden remove() metodunun içine yazdığınız tamsayı eleman olarak değil, index olarak kabul edilir.
                                       // Tam sayıyı eleman olarak göstermenin bir kaç yolu vardır.
        System.out.println(ages);      // 12, bu satır ile silindi. (Fakat ilk 12'yi siler)

         */

        /* 2.YOL ------------------------ Tavsiye edilen metod budur.
        ages.remove((Integer)12);
        System.out.println(ages);
        */

        /* 3.YOL
        ages.remove(Integer.valueOf(12));
        System.out.println(ages);
        */

        // 4.YOL
        ages.remove(ages.indexOf(12));  // Eğer array içindeki tüm 12'leri silmek istiyorsak, ages. yazdıktan somra
                                        // ekranda beliren küçük pencerede removeALL (Collection<?>c) seçilmeli
                                        // Dolayısıyla bu satır     nums.removeAll(silinecekler);    şeklinde olmalı
                                        // Fakat bunun bir üst satırına da     silinecekler.add(12); eklenmeli

        System.out.println(ages);


    }
}

// SONUÇ OLARAK BİR LİST'İN İÇİNDEKİ TÜM ELEMANLARI SİLMEK İÇİN removeAll() KULLANILIR
