package horonaga.Metodhs;
// continue ile istediğimiz karakteri metinden çıkaracağız
import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir cümle girin : ");
        String cumle = input.nextLine();

        for (int i=0; i<cumle.length() ; i++){
            char harf = cumle.charAt(i);
            if(cumle.charAt(i)=='a'){
                continue;                // continue; boşver geç demek
            }
            System.out.print(harf);
        }
    }
}

// continue'nin doğrulanması durumunda bir üstündeki işlem yapılmaz, direkt for satırına gider ve devam eder.
