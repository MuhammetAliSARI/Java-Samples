package horonaga.Metodhs.MultidimensionalArrays;

import java.util.Arrays;

public class Array_Icerik_Degistir {
    public static void main(String[] args) {

        int arr[][] = {{3, 2, 1}, {1, 2, 3}};

        for (int i = 1; i < 2; i++) {                             

            for (int k = 1; k < arr[0].length; k++) {
                if (arr[i][k] % 2 == 1) {
                    arr[i][k] = arr[i][k] + 1;
                }
                if (arr[i][k] % 2 == 0) {
                    arr[i][k] = arr[i][k] * 2;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
