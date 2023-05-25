package horonaga.Metodhs.ArraysLists;
// BİRBİRİNE EN YAKIN SAYILARI BUL
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_BirbirineYakinSayilariBul {
    public static void main(String[] args) {

        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 9, 11, 35] ==> 12, 11

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(3);
        nums.add(9);
        nums.add(11);

        Collections.sort(nums);                         // Önce bu listeyi küçükten büyüğe sıralıyoruz. [9,11,12,23,35]

        int minDiff = nums.get(1) - nums.get(0);        // indexi 1 olan elemandan indexi 0 olan elemanı çıkar demek
                                                        // İkinci elemenandan birinci elemanı çıkardık : index 1 = 11     index 0 = 9

        for(int i=1; i<nums.size(); i++){
            minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDiff);

        for(int i=1; i<nums.size(); i++){
            if(nums.get(i)-nums.get(i-1) == minDiff) {
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }
    }
}
