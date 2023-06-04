import java.util.Arrays;

public class EnBasitOzetArray {
    public static void main(String[] args) {
        int[] sayilar = new int[]{3,4,5,7,9};

        System.out.println(sayilar.length);                     // sayılar listesinin eleman sayısını verir.
        System.out.println(Arrays.stream(sayilar).min());       // sayılar listesinin en küçük elemanını verir.
        System.out.println(Arrays.stream(sayilar).max());       // sayılar listesinin en büyük elemanını verir.
        System.out.println(Arrays.stream(sayilar).average());   // sayılar listesinin ortalamasını verir.
        System.out.println(Arrays.stream(sayilar).sum());       // sayılar listesinin toplamını verir.
    }
}
