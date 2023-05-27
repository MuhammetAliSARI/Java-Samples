package horonaga.Metodhs.DoWhile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoWhile_ArdArdaCikti {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        List<String> products = new ArrayList<>();

        int i = 0;

        do{
            System.out.println("Enter " + (i+1) + " product name : ");
            products.add(scan.nextLine());

            i++;

        }while ( i<=4 );
        System.out.print(products);

    }

}
