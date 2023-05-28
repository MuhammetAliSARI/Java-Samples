package horonaga;
// BUL VE DEĞİŞTİR... replace()


// [a-zA-Z0-9] demek; tüm küçük büyük harfler ve rakamlar demek olur.
// Tüm noktalama işaretleri için     \\p{Punct}     ifadesi kullanılır.
// Tüm sesli harfler(eng) için [aeiou] ifadesi kullanılır.

public class MetniBulVeDegistir {
    public static void main(String[] args) {
        String s = "Her Nefis Ölümü Tadıcıdır";

        // Metin içerisisinde istenilen ifadeyi bul ve değiştir.
        String bulDegis = s.replace("Nefis","İnsan");
        System.out.println(bulDegis);

        //Metniniçerisindeki boşlukları üçer artır
        String bulDegis2 = s.replace(" ", "       ");
        System.out.println(bulDegis2);
        // Metindeki her boşluğu, 4 boşluğa çevirdi

        // Metindeki istenilen harfler silinecek
        String bulSil = s.replace(" ","");
        System.out.println(bulSil);
        // YANİ DEMEK Kİ replace() METODUNU KULLANARAK SİLME İŞLEMİ DE YAPAÇBİLİİYORMUŞUZ

        //METİNDEKİ TÜM KARAKTERLERİ DEĞİŞTİRME İŞLEMİ ----- replace() -----
        String t = "Bir berber bir berbere";
        String t1 = t.replaceAll("[a-z]", "*"); // [A-Z] veya [0-9] de kullanılabilirdi.
        System.out.println(t1);
        // Metindeki a ile z arasındaki tüm küçük harfler "*" oldu.

        // tüm küçük harfleri belirttiğimiz karakterle değişelim
        String k = "Bakalım nasıl bitireceğiz";
        String k1 = k.replaceAll("[aeiou]", "#");
        System.out.println(k1);

        // Küçük harfler dışındaki tüm karakterleri çevirelim
        String kh = "Bu bir örnektir";
        String kh1 = kh.replaceAll("[^a-z]", "-");
        System.out.println(kh1);

        // Boşluk haricinde tüm karakterler 0 olsun
        String r = "Yoruldum artık daaaaa!";
        String r1 = r.replaceAll("[^ ]", "O");
        System.out.println(r1);

        // Sesli harfler  haricinde tüm karakterler + olsun
        String y = "Ben kimim, burası neresi!";
        String y1 = y.replaceAll("[^aeiouAEIOU ]", "O");
        System.out.println(y1);
    }
}
