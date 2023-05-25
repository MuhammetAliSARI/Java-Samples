package horonaga.Metodhs.Array;

import java.util.Arrays;

public class Arrays_SesliHarfleriBul {

    public static void main(String[] args) {

        //Example 2: Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
        //           a - e - i - o - u - A - E - I - O - U
        String s = "Java brings you money";

        //1.Yol: use replaceAll()
        int vowels = s.replaceAll("[^aeiouAEIOU]", "").length(); // aeiouAEIOU haricindekilerin yerine hiçlik koy. Sonra metnin uzunluğunu bul.
        System.out.println(vowels);


        //2.Yol: use Array - Loop
        String letters[] = s.split("");    // Cümle, hiç birşeylerden kesilecek. Hani her harfin arası kesilecek.
        System.out.println(Arrays.toString(letters));// [J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]

        int counter = 0;

        for(String w : letters){
            switch(w.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
