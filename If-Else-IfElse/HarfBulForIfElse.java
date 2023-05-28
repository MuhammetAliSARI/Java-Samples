package horonaga;
// GİRİLEN METİNDEKİ İLK C HARFİNDEN ÖNCEKİ A HARFİ SAYISINI EKRANA VER
import java.util.Scanner;

public class HarfBulForIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin girin : ");
        String metin = input.nextLine().toLowerCase(); // ayrıca harfler büyük harfe dönüştürüldü.

        int harfsay = 0;

        for (int i = 0 ; i<metin.length(); i++){
            if (metin.charAt(i) == 'a'){
                harfsay++;

            }else if(metin.charAt(i)=='c'){
                break;
            }
        }
        System.out.println("'c'den önceki a'ların sayısı : " + harfsay);
    }
}

