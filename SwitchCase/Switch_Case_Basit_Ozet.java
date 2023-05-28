package horonaga;

import java.util.Arrays;
import java.util.Scanner;

public class Switch_Case_Basit_Ozet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir araba markası  giriniz : ");
        String s = input.next();

            switch(s.toLowerCase()){    // girilen metni her durumda küçük harfe çevirir.
                case "ford":
                case "mercedes":
                case "bmw":
                case "renault":
                case "skoda":

                    System.out.println("Girdiğiniz marka araba listemizde var."); // case'ler içinde olması durumunda ekrana yazılır
            }
        System.out.println("Bu araba markası henüz listemizde yok.");   // case seçeneklerinde istenen yoksa, zaten loop bitecek ve bu satır okunacak
    }
}
