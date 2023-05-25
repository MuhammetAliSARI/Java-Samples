package horonaga.Metodhs.Array;
// STRİNG'TE VAR OLAN HER BİR KARAKTERİN SAYISINI EKRANA YAZ
import java.util.Arrays;
import java.util.Scanner;

public class Array_MetniHatflereParcala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin = input.nextLine();

        String parcala[] = metin.split("");                         // Her harfi parçalaması için "" işimizi görür

        System.out.println(Arrays.toString(parcala));                    // parcala metosundaki stringin Arraylarını yazdır



    }
}
