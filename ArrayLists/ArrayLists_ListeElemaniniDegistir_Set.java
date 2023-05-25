package horonaga.Metodhs.ArraysLists;
// LİSTE İÇİNDEKİ BİR ELEMANI DEĞİŞTİR
import java.util.ArrayList;

public class ArrayLists_ListeElemaniniDegistir_Set {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Trbzon");
        sehirler.add("Rize");
        sehirler.add("Giresun");
        sehirler.add("Ordu");

        sehirler.set(0,"New York");
        System.out.println(sehirler);
    }

}
