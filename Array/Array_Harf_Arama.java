package horonaga.Metodhs.Array;

import java.util.Scanner;

// ELEMAN ARA VE KAÇ TEKRAR OLDUĞUNU GÖSTER
public class Array_Harf_Arama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Arayacağınız rakamı girin : ");
        int num = input.nextInt();

        int a[] = {0,2,3,0,12,0};

        int counter = 0;

        for (int w : a){
            if(w==num){
                counter++;

            }
        }
         if(counter>0){
             System.out.println(num + " array'de " + counter + " defa var.");
         }else{
             System.out.println(num + " array'de yok");
         }

    }
}
