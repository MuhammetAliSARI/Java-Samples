package horonaga.Metodhs.Array;

import java.util.Arrays;

public class Array_Eksik_Index {
    public static void main(String[] args) {
        char veri[] = new char[4];
        veri[0] = 'A';
        veri[2] = 'E';
        veri[3] = 'M';
        System.out.println(Arrays.toString(veri));
    }
}

// 1. index değeri girilmedi ama index değeri boşluğu null olarak atar.
