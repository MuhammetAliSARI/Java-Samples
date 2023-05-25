package horonaga.Metodhs.Array;

public class Array_EnBasit {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        for (double number : myList) {
            System.out.println(number);             // Bütün array deperlerini teker teker alt alta yazdırır
            total = total + number;

        }
        System.out.println("Toplam : " + total);   // Tüm array değerlerinin toplamını verir
    }
}
