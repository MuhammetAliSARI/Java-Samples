package horonaga.Metodhs.Replace;

import java.util.Scanner;

public class ReplaceCokluOrnek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin girin : ");
        String metin = input.nextLine().toLowerCase().replace(" ","").replace("a","");
        // yukarıdaki satırda önce metin istendi, sonra bu metin büyük harflere dönüştürüldü
        // sonra metnin içindeki  boşluklar yok edildi, en son olarak da a harfleri yok edildi.

        for (int i = 0  ; i<metin.length(); i++ )
        System.out.println(metin.charAt(i));
    }
}
