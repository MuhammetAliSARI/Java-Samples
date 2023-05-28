package horonaga.Proje_Ve_Odevler.Method_Object;

import day37Lambda.Course;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Uygulama {
    public static void main(String[] args) {

        Icerik kursTurkceGunduz = new Icerik("Yaz", "Türkçe Güngüz", 97, 128);
        Icerik kursTurkceGece = new Icerik("Sonbahar", "Türkçe Gece", 98, 154);
        Icerik kursIngilizceGunduz = new Icerik("İlkbahar", "İngilizce Gündüz", 95, 132);
        Icerik kursIngilizceGece = new Icerik("Kış", "İngilizce Gece", 93, 144);

        List<Icerik> kursListesi = new ArrayList<>();
        kursListesi.add(kursTurkceGunduz);
        kursListesi.add(kursTurkceGece);
        kursListesi.add(kursIngilizceGunduz);
        kursListesi.add(kursIngilizceGece);

       List<Icerik> mylist = kursListesi.
                stream().
                sorted(Comparator.comparing(Icerik::getNotOrtalamasi)).

                collect(Collectors.toList());
        System.out.println(mylist);
    }
}
