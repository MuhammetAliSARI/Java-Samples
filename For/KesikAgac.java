package horonaga;

import java.util.Scanner;

// DİKİNE KESİLMİŞ BİR AĞAÇ RESMİ ÇİZ
public class KesikAgac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ağacın uzunluğunu gir : ");
        int tac = input.nextInt();

        String yaprak = "";

        for(int i = 0 ; i<tac ; i++){
            yaprak += "^";
            System.out.println(yaprak);
        }
        for ( int i = 0 ; i<5 ; i++){
            System.out.println("|||");
        }
    }
}
