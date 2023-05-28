package horonaga;
// MAYMUN VE MUZ
import java.util.Scanner;

public class Maymun_ve_Muz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Adada kaç muz var: ");
        int muzAdedi = input.nextInt();
        System.out.print("Yaşaması için günde kaç muz yemesi gerekiyor : ");
        int gunlukMuz = input.nextInt();

        int gun = muzAdedi/4;
        System.out.println(gunlukMuz + " muz yiyerek " + gun + " gun hayatta kalabilir.");
        System.out.println(muzAdedi%gunlukMuz + " muz da artar.");

        System.out.print("Adada kaç gün kaldı : ");
        int adadaKaldi = input.nextInt();
        if(adadaKaldi>gun){
            System.out.println("Maymun öldü. Eğer " + ((adadaKaldi*4)-muzAdedi) + " muz daha olsaydı, maymun ölmezdi.");
        }else{
            System.out.println("Maymun yaşıyor. " + (muzAdedi-(gunlukMuz*adadaKaldi)) + " adet muzu da yanında götürebilir.");
        }
    }
}
