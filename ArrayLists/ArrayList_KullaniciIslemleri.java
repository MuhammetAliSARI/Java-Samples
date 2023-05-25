package horonaga.Metodhs.ArraysLists;
//KULLANICI İŞLEMLERİ
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_KullaniciIslemleri {

    public static void main(String[] args) {

        /*
            Rastgele kullanici adi olusturan JAVA kodu yaziniz.
               1. Kullanicidan ismini isteyelim
               2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
               3. Kullanici adinin alinabilir olup olmadigina bakalim.
               4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
               5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */
        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("OKAN23");
        databaseIsim.add("OKAN44");
        databaseIsim.add("OKAN51");
        databaseIsim.add("OKAN22");
        databaseIsim.add("OKAN");


        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen kullanici adinizi giriniz : ");
        String userName = input.nextLine().toUpperCase().trim(); // String ayrıca toUpperCase() ile büyük harfe çevrildi
                                                                 // trim() ile de boşluklar silindi. Olur ki boşluk girilirse...
        //1.Yol: Random tamsayi bulmak icin
        //int random = (int)(Math.random()*100);

        //2.Yol:
        int random = new Random().nextInt(100);

        while(databaseIsim.contains(userName + random)){
            random = (int)(Math.random()*100);      // Math.random() metodu 0 ile 1 arasında bir sayı verir. 100 ile çarpınca da
        }

        if(databaseIsim.contains(userName)){        // databaseIsim içinde kullanıcının verdiği username varsa...

            System.out.println("Bu username database'de var, tekrar kullanilamaz");
            databaseIsim.add(userName + random);    //
        }else{      // eğer yoksa...
            System.out.println("Bu username kullanilabilir");
            databaseIsim.add(userName);
        }
        System.out.println(databaseIsim);
    }
}
