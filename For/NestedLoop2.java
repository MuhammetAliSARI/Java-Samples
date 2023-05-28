package horonaga;

import java.util.Scanner;

public class NestedLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır tekrarını yazın : ");
        byte satir = input.nextByte();

        for ( int i = 1 ; i<=satir ; i++){

            for(int k=1; k<= i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
