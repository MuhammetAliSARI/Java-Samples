package horonaga.Metodhs.MultidimensionalArrays;

import java.util.Arrays;

// İÇ İÇE ARRAYLAR
public class Arrays_Ic_Ice {
    public static void main(String[] args) {

        // [ [3,12] [81,45] [123,0] ] 'in karşılığı aşağıdaki kodlarla yazılsın.

        int a[][] = new int [3][2];     // Bu şu demek; 3 Array içinde 2 elemalı bir Array. Yukarıdakinin sadece biçim olarak karşılığıdır.

        // Bir çıktı alalım:
        System.out.println(Arrays.toString(a));     // Çıktı olarak :  [[I@19dfb72a, [I@17c68925, [I@7e0ea639]] verecektir.
                                                    // Yani, bu , doğru bir çıktı yöntemi değil.
        System.out.println(Arrays.deepToString(a)); // toString yerine deepToString  kullandık. Sonuç :  [[0, 0], [0, 0], [0, 0]]

        // Şimdi bu [3][2]'lik Array'ın [0][]'ına 5 değerini atayacağız.
        a[0][0]=5;      // Bu işlemin sonucu [[5, 0], [0, 0], [0, 0]] olacaktır.
        a[1][1]=45;     // Bu işlemin sonucu [[0, 0], [0, 45], [0, 0]] olacaktır.
        a[2][0]=123;    // Bu işlemin sonucu [[0, 0], [0, 0], [0, 123]] olacaktır. vs vs ...
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        System.out.println(Arrays.deepToString(a));
        // Ve ta en baştan belirlediğimiz sonuç :  [[5, 12], [81, 45], [123, 0]]

        // Şimdi de Array'ın istenilen elemanını bulalım:
        System.out.println(Arrays.toString(a[2]));                  // Sonuç :  [123, 0]
        System.out.println(a[1][0]);                                // Sonuç : 81
    }
}

//Note: Array'lere non-primitive data konulamaz.
//      Array'lere primitive data veya reference konulur.
//      Ama siz bir array'i yazdirmak istediginizde Java adres'ler yardimi ile non-primitive data'ya ulasir
//      ve o non-primitive data'yi sanki array'in icindeymis gibi gosterir.
