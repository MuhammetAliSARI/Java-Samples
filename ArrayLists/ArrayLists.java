package horonaga.Metodhs.ArraysLists;

import java.util.ArrayList;

public class ArrayLists {

    /*
     1) ArrayList(List)'ler coklu data depolamak icin kullanilir.
     2) ArrayList(List)'ler non-primitive data type'inda ki coklu datalari depolamak icin kullanilir.
        List'ler "non-primitive" data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder.
     3) ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
        List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flexible" degildirler.
     4) Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi?
          1) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
          2) Array'ler cok hizli calisir.
          3) Array'ler memory'de cok az yer kaplar.
    */

    public static void main(String[] args) {

        //List nasil olusturulur ?
        ArrayList<Integer> ages = new ArrayList<>();            // ArrayList oluşturma kalıbı
        System.out.println(ages);                               // Ekranda [] görünecktir. Çünkü henüz boştur.

        ages.add(12);                                           // Bu sefer ages içine 12 şeklinde bir değer verdik.
        System.out.println(ages);                               // Ekranda [12] gözükür

        // ÖNEMLİ NOT: ADD METODU, ELEMANLRI, GİRİLEN SIRAYA GÖRE List'e EKLER. Aşağıdaki gibi:

        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(888);
        System.out.println(ages);                               // Girilen sıraya göre çıktı verdi : [12, 9, 12, 10, 888]

        // ŞİMDİ DE BU OLUŞAN LİSTENİN ARASINA BİR ŞEYLER KATALIM:
        ages.add(1,656);                            // Index 1'e 656 koy demektir.
        ages.add(3,777);                            // Index 3'e 777 koy demektir. Bu işlemi yaparken mevcut elemanı sola kaydırır.
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]    // Sonuç : [12, 656, 9, 777, 12, 10, 888]



        //List' coklu eleman nasil eklenir? veya List'e baska bir List nasil eklenir?
        //Bir List'e coklu eleman eklemek icin o elemanlari once bir List'in icine koymalisiniz.
        ArrayList<Integer>newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);           // addAll Çoklu eleman koymak için kullanılır. Yukarıdaki üçlü listeyi listenin sonuna ekleyecek
        System.out.println(ages);       // [12, 656, 9, 777, 12, 10, 888, 8, 9, 10]
        ages.addAll(2,newAges);   // Bu metod, istenilen indexe koyar. Index 2.'ye new listeyi koydu.
        System.out.println(ages);       // [12, 656, 8, 9, 10, 9, 777, 12, 10, 888, 8, 9, 10]

        boolean sonuc = ages.contains(10);         // Rakamlar içinde 10 var mı yok mu kontrol ettirildi.
        System.out.println(sonuc);                 // sonuç true

        ages.clear();;
        System.out.println(ages);       // Sonuç [] olur. Bütün veriler silinmiştir.
    }
}
