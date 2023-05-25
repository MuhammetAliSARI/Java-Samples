package horonaga.Metodhs.Array;
// GİRİLEN ARRAY DEĞERLERİ İÇİNDEKİ EN BÜYÜK İLE EN KÜÇÜĞÜNÜN TOPLANI EKRANA YAZDIR
import java.util.Arrays;

public class Array_Ile_Sort_Kullanimi {

    public static void main(String[] args) {


        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        Arrays.sort(ages);  // Array değerlerini küçükten büyüğe sıralar.
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0] + ages[ages.length - 1]);
    }
}
