package horonaga;

import java.util.Arrays;

public class For_Each_EnBasit_Ornek {
    public static void main(String[] args) {
        String adi[] = new String[5];

        adi[2] = "Ajda";
        adi[0] = "Cuneyt";
        adi[1] = "Kemal";
        adi[3] = "Ezel";
        adi[4] = "Besir";

        int sum = 0;
        for(String w : adi){
            sum = sum + w.length(); // w’nin işlevi; adi[]’dir. Ve 0’dan 5’e kadar dön,
                                    // dönerken de köşeli parantezin içine 0’dan başlayarak ve her dönüşte artırararak
                                    // 4’e kadar değer ata demektir.
        }
        System.out.println(sum);
    }
}
