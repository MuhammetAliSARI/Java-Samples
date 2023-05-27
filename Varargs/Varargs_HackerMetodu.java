package horonaga.Metodhs.Varargs;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Varargs_HackerMetodu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz : ");
        String cumle = input.nextLine().toLowerCase();

        String arr[] = new String[cumle.length()];

        for (int i = 0 ; i<cumle.length() ; i++){
            arr[i] = cumle.substring(i,i+1);
            System.out.print(arr[i]);

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));   // Cümlenin harfleri bu satırla array elemanlarına dönüşmüş oldu.
                                                    // [m, u, h, a, m, m, e, t,  , a, l, i,  , s, a, r, ı]

        for (int i = 0 ; i<cumle.length(); i++){
            if (arr[i].contains("s")){              // s harfi içeriyorsa bunu 5 yap
                arr[i] = "5";
            }
            if (arr[i].contains("a")){              // a harfi içeriyorsa bunu 4 yap
                arr[i] = "4";
            }
            if (arr[i].contains("e")){              // e harfi içeriyorsa bunu 3 yap
                arr[i] = "3";
            }
            if (arr[i].contains("t")){              // t harfi içeriyorsa bunu 1 yap
                arr[i] = "1";
            }
            if (arr[i].contains("o")){              // o harfi içeriyorsa bunu 0 yap
                arr[i] = "0";
            }

        }System.out.println(Arrays.toString(arr));  // [m, u, h, 4, m, m, 3, 1,  , 4, l, i,  , 5, 4, r, ı]
    }
}
