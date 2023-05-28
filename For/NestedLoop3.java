package horonaga;

import java.util.Scanner;

public class NestedLoop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır tekrarını yazın : ");
        byte satir = input.nextByte();


        for ( int i = 1 ; i<=satir ; i++){

            for(int k=satir; k>= i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
