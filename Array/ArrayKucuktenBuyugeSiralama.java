package horonaga.Metodhs.Array;

import java.util.Arrays;

public class ArrayKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int veri[] = {2,11,0,23,7};
        Arrays.sort(veri);                 // Burada veri Arrays'ını "sort" ile küçükten büyüğe sıralar
        for(int i=4; i>=0; i--){           // Burada -- ile sıralama tersinden okutulur
            System.out.print(veri[i] + " ");
        }
    }
}
