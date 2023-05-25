package horonaga.Metodhs.ArraysLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_HarfleriDegis {

    static int x = 1000;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        int i=0;
        do {
            System.out.println("Enter " + (i+1) +  ". product name");
            products.add(scan.nextLine());
            i++;
        }while(i<3);

        System.out.println(products);

        List<String> productId = new ArrayList<>();
        for(String w : products) {
            productId.add("" + w.charAt(0) + w.charAt(1) + x);
            x++;
        }

        System.out.println(productId);

        scan.close();
    }
}
