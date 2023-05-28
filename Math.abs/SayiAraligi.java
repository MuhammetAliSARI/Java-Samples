package horonaga;
// SAYI 3 BASAMAKLI MI?
import java.util.Scanner;

public class SayiAraligi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Sayıyı gir : ");
        Double sayi = input.nextDouble();
        sayi = Math.abs(sayi);
        Object sonuc = (sayi<1000 && sayi>99) || (sayi>-1000 && sayi<-99) ? sayi + " Üç bacamaklıdır." : sayi + " 3 basamaklı değildir.";
        System.out.println(sonuc);
    }
}
