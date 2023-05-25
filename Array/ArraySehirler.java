package horonaga.Metodhs.Array;

public class ArraySehirler {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstabul";
        sehirler[0][1] = "Edirne";
        sehirler[0][2] = "Bursa";
        sehirler[1][0] = "Trabzon";
        sehirler[1][1] = "Rize";
        sehirler[1][2] = "Samsun";
        sehirler[2][0] = "Ankara";
        sehirler[2][1] = "Konya";
        sehirler[2][2] = "Nevşehir";

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------------" + (i+1) + ". BÖLGE---------------");
            for (int j = 0; j<= 2; j++){
                System.out.println((j+1)+ ". " + sehirler[i][j]);
            }
        }
    }
}
