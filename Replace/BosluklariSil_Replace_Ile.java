package horonaga.Metodhs.Replace;

import java.util.Scanner;

public class BosluklariSil_Replace_Ile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen herhangi bir cümle yazınız : ");
        String metin = input.nextLine();

        System.out.print("Hangi harf değişsin? ");
        String harfsec = input.nextLine();
        String sonuc = metin.replace(harfsec,"");
        System.out.println(sonuc);
    }
}
