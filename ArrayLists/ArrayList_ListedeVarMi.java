package horonaga.Metodhs.ArraysLists;
// İSTENEN İSİMLER, VERİLE LİSTEDE VAR MI?
import java.util.ArrayList;
import java.util.List;

public class ArrayList_ListedeVarMi {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Ajda");
        names.add("Cüneyt");
        names.add("Mahsun");
        names.add("Müslüm");
        names.add("Orhan");

        List<String> females = new ArrayList();
        females.add("Ajda");
        females.add("Emel");

        names.containsAll(females);             // Bunun anlamı; nanes listinde females listindeki her şey var mı?
                                                // Yani names içinde Ajda ve Emel var mı diye soruyor.
                                                // Bu arada; containsAll, boolen'de döner. Yani ya true ya da false
        boolean r = names.containsAll(females); // containssAll sebebiyle istenen tüm elemanların oluğ olmadığı sorgulanır
        System.out.println(r);

        System.out.println(names.subList(1,4)); // BURADA KASTEDİLEN 1'DEN 4'E KADARDIR. YANİ 4 DAHİL DEĞİLDİR.





    }
}
