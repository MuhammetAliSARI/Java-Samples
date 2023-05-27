package horonaga.Metodhs.MultidimensionalArrays;

public class Mulitidimension_dsjvhdskjvkjvh {
    public static void main(String[] args) {
        int[][] veri = {{1,2},{3,4,5}};
        System.out.println(m(veri));                // buradaki veri ifadesi, metodun tamamının alınacağını ifade eder
    }
    public static int m(int[][]m){
        int sonuc =3;
        for (int i = 0; i<m.length;i++){
            for (int j = 0; j<m[i].length;j++){
                sonuc += m[i][j];
            }
        }
        return sonuc;
    }
}
