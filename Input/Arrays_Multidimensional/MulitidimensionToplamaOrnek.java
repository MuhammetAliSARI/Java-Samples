package horonaga.Metodhs.MultidimensionalArrays;
// istenilen Array indexinin içini toplama işlemi
public class MulitidimensionToplamaOrnek {
    public static void main(String[] args) {
        int[][] deger = {{2,1},{1,7,1}};    // köşeli parantez [][] sayısının 2 tane oluşu iç içe 2 boyutlu olduğunu gösterir
        System.out.println(m(deger[1]));    // [1] değeri m metodu ile seçildi. Buradaki 1, 1.index değeridir. Yani: {1,7,1}
        }                                   // Sıfırıncı indexle hiç işimiz olmayacak.
        public static int m(int[]m){
        int sonuc = 0;
        for (int i = 0; i<m.length; i++){   // m metodunun uzunluğu kadar dönecek bir for döngüsü
            sonuc += m[i];
        }
        return sonuc;
    }
}
