package horonaga;

import java.util.Scanner;

public class UcgenKontrol {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Üçgenin 1.Kenarını giriniz : ");
        double kenar1 = input.nextDouble();
        System.out.print("Üçgenin 2.Kenarını giriniz : ");
        double kenar2 = input.nextDouble();
        System.out.print("Üçgenin 3.Kenarını giriniz : ");
        double kenar3 = input.nextDouble();

        boolean ucuzkenarMi = ((kenar1==kenar2) && (kenar1==kenar3) && (kenar2==kenar3));
        boolean ikizkenarMi = (((kenar1==kenar2) || (kenar2==kenar3) || (kenar1==kenar3)));
        boolean ucgenMi = (((((kenar1+kenar2+kenar3)/2)>kenar1)) && ((((kenar1+kenar2+kenar3)/2)>kenar2)) && ((((kenar1+kenar2+kenar3)/2)>kenar3)));

        if (kenar1<0 || kenar2<0 || kenar3<0){System.out.println("Negatf değer kabul edilemez");}
        else if (kenar1==0 || kenar2==0 || kenar3==0){System.out.println("Sıfır girilemez");}
        else if (ucuzkenarMi){System.out.println("Bu bir üçüzkenar üçgen");}
        else if (ikizkenarMi){System.out.println("Bu bir ikizkenar üçgen");}
        else if (ucgenMi){System.out.println("Bu çeşitkenar üçgendir.");}
            else System.out.println("Bu bir üçgen değildir.");
    }
}
