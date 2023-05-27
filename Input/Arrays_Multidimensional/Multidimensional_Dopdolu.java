package horonaga.Metodhs.MultidimensionalArrays;
// BUNU ANLARSAN Multidimensional MESELESİ HALLOLMUŞ DEMEKTİR.
public class Multidimensional_Dopdolu {
    public static void main(String[] args) {
        int[][] x = {{2,1},{5,7,6}};
        System.out.println(m(x));                   // x arrayının tamamını ( {{2,1},{5,7,6}} )kullanıyor.
    }
    public static int m(int[][]m){
            int result = m[0][1];                   // [0][1] demek; sıfırıncı indeksin 1. indexsi demektir.
            for (int i = 0;i<m.length;i++){         // m'nin uzunluğu 2'dir. Karıştırma!
                for (int j = 0; j<m[i].length;j++){
                    if (result<m[i][j]){
                        result = m[i][j];
                    }

                }
            }
        return result;
    }
}


