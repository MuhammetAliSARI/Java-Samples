package horonaga;
// BİR STRİNGDEKİ a,n,i KARAKTERLERİNİN İLK GÖRÜNÜMLERİNİN İNDEX DEĞERLERİNİN TOPLAMINI EKRANA YAZ

public class CümledekiHarflerinIndexDegerleriToplami {
    public static void main(String[] args) {
        String slogan = "Dünya fani, ölüm ani";

        int indexa = slogan.indexOf('a');
        System.out.println("Cümle içerisindeki ilk a harfihin index değeri : " + indexa);

        int indexn = slogan.indexOf('n');
        System.out.println("Cümle içerisindeki ilk b harfihin index değeri : " + indexn);
        // Cümle içinde e harfi olmadığı için -1 olumsuz değerini verecektir.

        int indexi = slogan.indexOf('i');
        System.out.println("Cümle içerisindeki ilk i harfihin index değeri : " + indexi);

        System.out.println("Bu 3 harfin index değerleri toplamı : " + (indexa + indexn + indexi));


        // Şimdi ise bu harflerin en son geçtiği yerlerdeki index değerleri toplamı
        // Bu mantık için özel bir method vardır: lastIndexOf

        int indexSona = slogan.lastIndexOf('a');
        System.out.println("Cümle içerisindeki a harfihin son geçtiği yerdeki index değeri : " + indexSona);

        int indexSonn = slogan.lastIndexOf('n');
        System.out.println("Cümle içerisindeki n harfihin son geçtiği yerdeki index değeri : " + indexSonn);

        int indexSoni = slogan.lastIndexOf('i');
        System.out.println("Cümle içerisindeki i harfihin son geçtiği yerdeki index değeri : " + indexSoni);

        System.out.println("Bu 3 harfin index değerleri toplamı : " + (indexSona + indexSonn + indexSoni));
    }
}
