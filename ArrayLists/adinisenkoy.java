package horonaga.Metodhs.ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class adinisenkoy {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();

        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females=new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");
        //names.containsAll(females) "names"listindeki tum elemanlarin var olup olmadigini kontrol eder
        //Tamami varsa size "true verir,herhangi biri  yoksa size false verir.
        boolean r=  names.containsAll(females);
        System.out.println(r);//false verir.Emel yok liste
        //names.sublist(1,4)"names listindeki indexi 1,2,3 olan elemanlari bir listin icinde size verir.
        //Ikinci index olan 4 dahil olmaz.
        List<String> sublist=names.subList(1,3);
        System.out.println(sublist);//[Cuneyt,Mahsun]

        names.retainAll(females);
        System.out.println(names);
        System.out.println(females);

        // Example 1: Elektronik aletler ve ev aletleri listleriniz var.
        // Elektronik ev aletlerini listeleyiniz.
        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        // homeGoods.retainAll(electronics) homeGoods ile electronics list'lerinin ortak elemanlarini homeGoods listi icinde verir.
        // Baska bir deyisle(In the other words)homeGoods listedinki ortak olmayan elemanlari siler
        homeGoods.retainAll(electronics);

        System.out.println(homeGoods);// [Radio, TV]
        // IsEmpty Liste hic eleman yoksa size "true" verir,bir veya daha fazla eleman varsa size false verir.
        //" IsEmpty() esasindan names.size()==0" demektir
        names.isEmpty();
        System.out.println(names.hashCode());//Hasging code=
    }

}
