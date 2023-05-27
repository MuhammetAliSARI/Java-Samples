package horonaga.Metodhs.MultidimensionalArrays;

public class ArraylariCarp {
    public static void main(String[] args) {

        //Example 1: Bir integer multi-dimensional array olusturunuz
        //           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz
        int a[][] = { {2, 5}, {4, 7, 11} };

        int carpim = 1;

        for(int[] w : a){

            for(int k : w){
                carpim = carpim*k;
            }

        }
        System.out.println(carpim);//3080
    }
}
