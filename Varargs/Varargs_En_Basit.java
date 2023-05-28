package horonaga;

import java.util.ArrayList;
import java.util.List;

public class Varargs_En_Basit {
    public static void main(String[] args) {
        add(4,5,6,7,8,9);

    }
    public static void add(int...a){
        int sum = 0;

        for(int w : a){
            sum = sum + w;
        }
        System.out.println(sum);
    }
}
