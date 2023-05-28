package horonaga.Metodhs;
// VAR MI YOK MU KONTROL ET
import java.util.ArrayList;

public class Contains {
    public static void main(String[] args) {
        ArrayList<Integer> rakam = new ArrayList<>();   // Bir liste tanımlaması yapıldı.
        rakam.add(8);
        rakam.add(9);
        rakam.add(10);
        // Liste içeriğine ait elemenlar tanımlansı
        boolean sonuc = rakam.contains(10);         // Sonuç olara; rakamlar içinde 10 var mı yok mu kontrol ettirildi.
        System.out.println(sonuc);                  // sonuç true
    }
}
