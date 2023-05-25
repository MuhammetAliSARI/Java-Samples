package horonaga.Metodhs.ArraysLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayList_Basit_Stream {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(21);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(9);
        nums.add(15);
//---------------------------------------------------------------

        for(Integer w : nums){
            System.out.print(w + " ");
        }
        System.out.println();                                       // 1 satır boşluk aşağı inmesi için
        // Aşağıdaki satır, bu for kalıbı ile aynı seonucu daha pratik bir şekilde verecek.

        nums.stream().forEach(t -> System.out.print(t + " "));      // stream, verileri peşpeşe yazar. forEach ise her biri için anlamına gelir.
//---------------------------------------------------------------

        System.out.println();                                       // 1 satır boşluk aşağı inmesi için

         for(Integer k : nums){
             if(k%2==0){
                 System.out.print(k + " ");                         // Sadece çift rakamlar için
             }
         }
        System.out.println();                                       // 1 satır boşluk aşağı inmesi için
        // Aşağıdaki satır, bu for kalıbı ile aynı seonucu daha pratik bir şekilde verecek.

        nums.stream().filter(t ->t%2==0).forEach(t-> System.out.print(t+" "));
        System.out.println();                                       // 1 satır boşluk aşağı inmesi için
//---------------------------------------------------------------
        nums.stream().distinct().forEach(t-> System.out.print(t+" "));  // distinct() ile veriler tekrarsız bir şekilde görüntülendi.
        System.out.println();                                           // 1 satır boşluk aşağı inmesi için
        System.out.println(nums.stream().reduce(0, (t, u)->t+u)); // resuce ile tek değere azalttı
        System.out.println();                                           // 1 satır boşluk aşağı inmesi için
        System.out.println(nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get());

    }
}
// NOT: Bir satıra 80 karakterden fazla yazılmaz.
