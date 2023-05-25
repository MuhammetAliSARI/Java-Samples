package horonaga.Metodhs.ArraysLists;
// i'de verdiğimiz adet üzerinden array listemizi kendimiz oluşturalım
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KullaniciArrayaEkleyecek {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Lutfen sayi giriniz : ");
            arrList.add(input.nextInt());
        }
        System.out.println("arrList = " +arrList);//


    }
}
