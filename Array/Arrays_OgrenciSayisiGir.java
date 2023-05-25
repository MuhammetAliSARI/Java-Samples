package horonaga.Metodhs.Array;
// KAÇ ÖĞRENCİ..
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_OgrenciSayisiGir {

    public static void main(String[] args) {

        //Example 1: Kullanici ile beraber bir array olusturunuz
        Scanner input = new Scanner(System.in);

        System.out.print("Kac ogrenci ismi gireceksiniz : ");
        int ogrenciSayisi = input.nextInt();

        System.out.println("Girisi sonlandirmak icin Q tusuna basiniz...");

        String ogrenciAdlari[] = new String[ogrenciSayisi]; // GİRİLEN ÖĞRENCİ İSİMLERİ BU ARRAY'DA TOPLANIR.

        for(int i=1; i<=ogrenciSayisi; i++){
            System.out.print("Lutfen " + i + ". ogrencinin adini giriniz : ");
            String ogrenciAdi = input.next();
            if(ogrenciAdi.equalsIgnoreCase("Q")){
                break;
            }
            ogrenciAdlari[i-1] = ogrenciAdi;
            System.out.println(Arrays.toString(ogrenciAdlari));
        }

    }
}
