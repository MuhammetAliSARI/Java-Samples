package horonaga.Metodhs.MultidimensionalArrays;
public class MulitidimensionalarArraySayilariTopla {
    public static void main(String[] args) {

        // Bir tane integer multidimensional array olusturunuz
        // Bu array'deki tum sayilarin toplamini veren kodu yaziniz.
        int a[][] = { {2, 62, 82}, {3, 13} };

        int sum = 0;

        for(int[] w : a){           // Burada Array'ın 2 elemanı var. O zaman 2 defa döner.
            for(int k : w){         // Burada 1. dönüşte 3 elemanı toplar, 2. dönüşte de 2 elemanı toplar.
                sum = sum + k;
            }
        }
        System.out.println(sum);
    }
}

