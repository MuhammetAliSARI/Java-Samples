package horonaga.Metodhs.ArraysLists;
// MAAŞA ZAM
import java.util.ArrayList;
import java.util.List;
// girilen maaş değerine %20 zam ver
public class ArrayLists_MaaşaZam {
    public static void main(String[] args) {
        List<Double> maas = new ArrayList<>();
        maas.add(19500.25);
        maas.add(8500.75);
        maas.add(32500.50);

        // 1.YOL
        int idx = 0;

        for(Double w : maas){
            maas.set(idx,w*1.20);
            idx++;
        }
        System.out.println(maas);

        // 2.YOL
        for (int k = 0; k<maas.size(); k++){
            maas.set(k, maas.get(k)*1.20);



        }
        System.out.println(maas); // Bir daha %20 zam. Bu sefer farklı yöntem kullanarak zam yaptık.




    }
}
