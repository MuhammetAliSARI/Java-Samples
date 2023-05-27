package horonaga.Metodhs.Input;

import java.util.Scanner;

public class Input_Basit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // bir kullnıcı söz konusu olduğu için bu satır şart.

        System.out.print("Adınızı giriniz : ");
        String ad = input.nextLine();             // istenilen bilgi metin olduğu için String kullandık
                                                  // İsmin birden fazla kelimeli olma ihtimali için nextLine kullandık

        System.out.print("Doğum yılınızı giriniz : ");
        int yas = input.nextInt();                // istenilen bilgi metin olduğu için int kullandık

        System.out.println(ad + " " + yas + " yılında doğdu");
    }
}

// Eğer bir kullanıcıdan bahsediliyorsa o zaman input ile işimiz olacak anlamındadır.
//
