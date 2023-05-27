package horonaga.Metodhs.If_Else_IfELse;
// Sıfıra kalansız bölümlerinin toplamı kendini veren sayılara 'Mükemmel Sayı' denir.
import java.util.Scanner;

public class IfElse_SuperSayiBul {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Birt sayı giriniz : ");
        int sayi = input.nextInt();

        int topla = 0;
        for (int i = 1 ; i<sayi ; i++){
            if (sayi % i == 0) {
                topla = topla + i;
            }
        }
        if (sayi==topla){
            System.out.println(sayi + " bir süper sayıdır");

        }else{
            System.out.println(sayi + " bir süper sayı değildir.");
        }
    }
}
