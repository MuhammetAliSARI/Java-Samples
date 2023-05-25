package horonaga.Metodhs.Array;

import java.util.Arrays;

public class Array_BuyukSayiyiBul {
    public static void main(String[] args) {
        int ages[] = new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=99;
        ages[3]=80;
        ages[4]=15;
        ages[5]=32;
        int buyuk = ages[0];

        for (int i= 0; i<ages.length; i++){
            if ( buyuk<ages[i]){
                buyuk = ages[i];
            }
        }
        System.out.println(buyuk);
    }
}
