package horonaga;

import java.util.Scanner;

// YAZILIMCININ KURALLARINA GÖRE ŞİFRE OLUŞTURMA
public class Password {
    public static void main(String[] args) {
        // Bize Göre Kurallar:
        // 1- En az 8 karakter olsun
        // 2- Boşluk olmasın
        // 3- En az 1 tane büyük harf olsun
        // 4- En az 1 tane küçük harf olsun
        // 5- En az 1 tane sembol olsun
        // 6- En az En az 1 tane rakam olsun

        Scanner input = new Scanner(System.in); // Bu kısım dışarıdan data çağıran kısımdır.
        System.out.println("Lütfen şifrenizi giriniz: ");
        String pwd = input.nextLine();

        // 1.KURALI İŞLİYORUZ
        boolean kural1 = pwd.length() > 7;   // Bu satır bir karşılaştırma işlemidir. En az 8 karakter olacak.
        System.out.println(kural1);

        // 2.KURALI İŞLİYORUZ
        boolean kural2 = !pwd.contains(" ");
        System.out.println(kural2);

        // 3.KURALI İŞLİYORUZ. Önce büyük harfleri sileceğiz. Sonra da kalan karakter sayısını bulacağız
        // Kalan karakter sayısı sıfır ise büyük harf yok demek, sıfırdan büyük ise büyük harf var demektir.
        boolean kural3 = pwd.replaceAll("[^A-Z]", "").length()>0; // BURAYI ANLARSAN SÜPERSİN********
        // Yukarıdaki satırdaki         pwd.replaceAll("[^A-Z]", ""         kısmı, büyük harf olmayanları sildi
        // Yukarıdaki        .length()>0      kalan küçük karakter adedini , 0'dan büyük mü şeklinde sorguluyor.
        System.out.println(kural3);

        // 4.KURALI İŞLİYORUZ. Yukarıdakine benzer bir mantıkla işliyoruz
        boolean kural4 = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(kural4);

        // 5.KURALI İŞLİYORUZ. Yukarıdakine benzer bir mantıkla işliyoruz.
        boolean kural5 = pwd.replaceAll("[^z-zA-Z0-9]", "").length()>0;
        System.out.println(kural5);

        //6. KURALI İŞLİYORUZ. Yukarıdakine benzer bir mantıkla işliyoruz.
        boolean kural6 = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println(kural6);

        boolean sonuc = kural1 && kural2 && kural3 && kural4 && kural5 && kural6 == true;
        System.out.println("Şifreniz : " + sonuc);

        // Artık dilersek, şifre sonuç satırı hariç, önceki System... satırları silinebilir.
    }
}
