package horonaga.Metodhs.Array;

public class ArrayEnBuyuguBul {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double max = myList[0];
        for (double number : myList) {
            if (max < number){
                max = number;
            }
        }
        System.out.println("En Büyük : " + max);   // Tüm array değerlerinin toplamını verir
    }
}
