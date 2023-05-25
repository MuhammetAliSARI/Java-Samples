package horonaga.Metodhs.ArraysLists;
//  BİR LİSTENİN  BAŞKA BİR LİSTE İLE AYNI OLUP OLMADIĞINI KONTROL ET
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListsListeKontrol {
    public static void main(String[] args) {
        ArrayList<String> isimler1 = new ArrayList<>();
        isimler1.add("Ali");
        isimler1.add("Veli");
        isimler1.add("Can");

        ArrayList<String> isimler2 = new ArrayList<>();
        isimler2.add("Ali");
        isimler2.add("Can");
        isimler2.add("Veli");

        boolean s = isimler1.equals(isimler2);
        System.out.println(s);           // Bu satır ekrana false sonucunu verir. Çünkü sıralar da aynı olmalıydı.
                                         // Yani index değeri karşılıkları da denk gelmelidir.

        // İşimizi kolaylaştırmak için listeyi sıralamak en iyisi:

        Collections.sort(isimler1);     // Birinci 'isimler1' listesi, küçükten büyüğe sıralandı
        Collections.sort(isimler2);     // İkinci  'isimler1' listesi, küçükten büyüğe sıralandı

        // Şimdi, gerçekten eşitlik sağlandı mı bir kontrol edelim.

        boolean kontrol = isimler2.equals(isimler1);    // Bolean ile eşitlik sogulamayı yapıyoruz
        System.out.println(kontrol);    // Evet sağlandı    true
    }
}
