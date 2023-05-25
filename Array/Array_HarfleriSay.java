package horonaga.Metodhs.Array;
// STRİNG'TE VAR OLAN HER BİR KARAKTERİN SAYISINI EKRANA YAZ
import java.util.Arrays;
import java.util.Scanner;

public class Array_HarfleriSay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin = input.nextLine();

        String harfler[] = metin.split("");           // Her harfi parçalaması için "" işimizi görür

        System.out.println(Arrays.toString(harfler));       // parcala metosundaki stringin Arraylarını yazdır

        // Şimdi harfleri sayacağız

        Arrays.sort(harfler);                    // harfler array'ını sıralıyoruz.

        int say = 0;                             // bir atama operatörü oluşturduk
        for (int i = 1; i<harfler.length; i++){
            if(harfler[i-1].equals(harfler[i])){
                say++;                           // Aynı olanlar için 1 artır
            }else{
                System.out.println(harfler[i-1]+" karakterinin sayısı " + (say+1) + " kez tekrarlanmıştır ");
                say = 0;                         // başka harfe geçtiği için sıfırlanmalı
            }
            if (i==harfler.length-1)             // defalarca kodu yazdırmaması için sona geldiğinde yazdırması için if kullanıyoruz
            System.out.println(harfler[i] + " karakterinin sayısı " + (say+1)+ " kez tekrarlanmıştır");
        }
    }
}
