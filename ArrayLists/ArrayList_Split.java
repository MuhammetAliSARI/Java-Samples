package horonaga.Metodhs.ArraysLists;

import java.util.Arrays;

public class ArrayList_Split {
    /*
   INTERWIEW SORUSU
        Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
        Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
        tersine çevirmek için kod yazınız.
        Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
                */

    public static void main(String[] args) {

        String str= "       Kemal Can Kuzu         ";
        String arr[] =str.split(" ");                 // Cümleyi boşluklardan parçala. Böylelikle 3 indexli bir array elde ederiz.
        System.out.println(Arrays.toString(arr));

        String tersstr= "";                                 // Biraz sonra kullanacağımız hiçlik atanmış bir stringe ihtiyaç var

        for (int i = arr.length - 1; i >= 0;  i--) {        // son kelime length-1 ile bulunur. Ve şimdi geriye doğru mantık üretiyoruz.
            tersstr+=arr[i]+" ";                            // i önce 2. sonra 1. sonra 0. indexi tersstr içine 1 boşluk koyarak yazar

        }

        System.out.print(" trim basta ise yaradi mi :");
        System.out.print(tersstr);
        System.out.println(" trim sonda ise yaradimi :");

        System.out.print(" trim basta ise yaradi mi :");
        System.out.print(tersstr.trim());
        System.out.println(" trim sonda ise yaradi mi :");
    }//main
}
