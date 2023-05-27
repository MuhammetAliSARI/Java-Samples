package horonaga.Metodhs.While;
// VERİLEN SAYININ, RAKAMLARI TOPLAMINI EKRANDA GÖSTER
import java.util.Scanner;

public class SayininRakamariToplami_While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı girin : ");
        int sayi = input.nextInt();
        int sum = 0;
        while(sayi>0){
            sum = sum + sayi%10;
            sayi/=10;
        }
        System.out.println(sum);
    }
}
