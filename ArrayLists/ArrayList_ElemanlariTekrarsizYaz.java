package horonaga.Metodhs.ArraysLists;
// VERİLEN LİSTTEKİ ELEMANLRI TEKRARSIZ OLARAK YAZDIER
import java.util.ArrayList;
import java.util.List;

public class ArrayList_ElemanlariTekrarsizYaz {
    public static void main(String[] args) {
        List<Integer> listem = new ArrayList<>();
        listem.add(2);
        listem.add(3);
        listem.add(2);
        listem.add(2);
        listem.add(3);
        listem.add(5);

        List<Integer> yeniListem = new ArrayList<>();

        for (Integer w : listem){           // Listedekileri döngü boyunca teker teker w'nin içine koyar


            if(!yeniListem.contains(w)){    // yeniListem'in içinde w var mı diye kontrol eder. Yok mu diye sorguluyor
                yeniListem.add(w);          // Yoksa,YeniListem adında yeni bir listeye değerler aktarıyor

            }
        }
        System.out.println(yeniListem);





    }
}
