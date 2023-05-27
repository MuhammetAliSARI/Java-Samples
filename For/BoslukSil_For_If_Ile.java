package horonaga.Metodhs.For;

import java.util.Scanner;

public class BoslukSil_For_If_Ile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir cümle girin : ");
        String cumle = input.nextLine();

        for (int i=0; i<cumle.length() ; i++){
            char karakter = cumle.charAt(i);
            if(cumle.charAt(i)!='a'){
                System.out.print(karakter);
            }



        }
    }
}
