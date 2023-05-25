package horonaga.Metodhs.ArraysLists;
// retainAll --> VERİLEN LİSTEDE, İSTENİLENLER YOKSA ONLARI OLARI SİL
import java.util.ArrayList;
import java.util.List;


public class ArrayList_retainAll {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        List<String> elektronikAletler = new ArrayList<>();
        elektronikAletler.add("TV");
        elektronikAletler.add("Radio");
        elektronikAletler.add("Refrigerator");
        elektronikAletler.add("Mobile Phone");
        elektronikAletler.add("Notebook");

        List<String> evAletleri = new ArrayList<>();
        evAletleri.add("Carpet");
        evAletleri.add("Fork");
        evAletleri.add("Radio");
        evAletleri.add("Chair");
        evAletleri.add("TV");

        elektronikAletler.retainAll(evAletleri);         // bu işlem elektronikaletler ile evaletleri listelerindeki ortakları bulur, diğerlerini siler.


        System.out.println(elektronikAletler);           // elektronikAletler ile evAletleri listesi arasındaki ortak elemanları verir
        System.out.println(evAletleri);

    }
}
