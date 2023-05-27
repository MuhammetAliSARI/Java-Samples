package horonaga.Metodhs.If_Else_IfELse;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Haftanın kaçıncı günü : ");
        byte haftaninGunu = input.nextByte();

        if (haftaninGunu==1){System.out.println("Pazartesi");}
        else if (haftaninGunu==2){System.out.println("Salı");}
        else if (haftaninGunu==3){System.out.println("Çarşamba");}
        else if (haftaninGunu==4){System.out.println("Perşembe");}
        else if (haftaninGunu==5){System.out.println("Cuma");}
        else if (haftaninGunu==6){System.out.println("Cumartesi");}
        else if (haftaninGunu==7){System.out.println("Pazar");}
        else {System.out.println("Hatalı giriş! 1 ile 7 arasında bir rakam girin.");}
    }
}
