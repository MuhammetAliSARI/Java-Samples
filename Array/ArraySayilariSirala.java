package horonaga.Metodhs.Array;

import java.util.Arrays;

// SIFIRLARI EN SONA KOY
public class ArraySayilariSirala {
    public static void main(String[] args) {

        int a[] = {0,2,3,0,12,0};
        int b[] = new int[a.length];       // Bu satır [0,0,0,0,0,0] sonucuna ulaşır.

        int idx = 0;

        for(int w : a){
                if(w!=0){
                    b[idx] = w;
                    idx++;

                }
        }
        System.out.println(Arrays.toString(b));

    }
}
