package horonaga.Metodhs.Array;

import java.util.Arrays;
import java.util.Comparator;

        // ARRAY ELEMANLERINI KÜÇÜKTEN BÜYÜĞE SIRALA
public class ArrayKucuktenBuyugeSirala {
    public static void main(String[] args) {
        String arr[] = {"Ali","Veli,","Mehmet","Ahmet"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.comparingInt(String::length)); // Sıralama length'e göre yapılacak demek.
        System.out.println(Arrays.toString(arr));

        // ARRAY ELEMANLERINI KÜÇÜKTEN BÜYÜĞE SIRALA
        String brr[] = {"Ayşe","Zeynep","Fatma","Hatice"};
        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());   // reversed ile işlem tersine çevirildi.
        System.out.println(Arrays.toString(brr));

        // AYNI KARAKTER SAYISINDA OLANLARI ALFABETİK SIRAYA KOY
        String crr[] = { "Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cüneyt", "Cem"};
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));
    }
}
