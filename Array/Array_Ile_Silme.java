package horonaga.Metodhs.Array;
// String bir array olusturunuz, 6 tane eleman yerlestiriniz, character sayisi 5 den cok olan elemanlari sil
import java.util.Arrays;

public class Array_Ile_Silme {
    public static void main(String[] args) {
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));

        int counter = 0;

        for(String w : colors){


            if(w.length()<=5){
                counter++;
            }
        }
        //BURAYA KADAR OLAN KISIMDA KARAKTER SAYISI 6'DAN KÜÇÜK KAÇ ELEMAN OLDUĞU BULUNUYOR.

        String newColors[] = new String[counter];   // İçinde 4 tane null oluşan bir Array elde (0123) edildi.


        int idx = 0;

        for(String w : colors){

            if(w.length()<=5){
                newColors[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors));
    }
}
