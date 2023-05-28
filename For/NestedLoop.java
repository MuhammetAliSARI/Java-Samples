package horonaga;
// SATIR VE SÜTÜN MİKTARINCA ALT ALTA VE YANYANA KARAKTER
import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır tekrarını yazın : ");
        byte satir = input.nextByte();
        System.out.print("Sütun tekrarını yazın : ");
        byte sutun = input.nextByte();
        System.out.print("Tekrarı yazpılacak hargi girin : ");
        String harf = input.next();

        for ( int i = 1 ; i<=satir ; i++){

            for(int k=1; k<= sutun; k++){
                System.out.print(harf + " ");
            }
            System.out.println();
        }
    }
}
