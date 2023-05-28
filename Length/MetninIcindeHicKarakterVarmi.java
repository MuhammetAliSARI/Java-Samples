package horonaga;
 // Bir Stringin hiç karakter içerip içermediğini kontrol edeceğiz
public class MetninIcindeHicKarakterVarmi {
    public static void main(String[] args) {

        String metin = "";

        // BUNU leng METODU İLE TEST EDEBİLİRİZ.

        // 1. YOL:
        boolean metinBosmu1 = metin.length()==0;      // metin stringinin uzunluğu sıfır mı şeklinde kontrol etti
        System.out.println("Stringin doluluk durumu 1.Yöntem : " + metinBosmu1);

        // 2. YOL
        boolean metinBosmu2 = metin.isBlank();
        System.out.println("Stringin doluluk durumu 2.Yöntem : " + metinBosmu2);
        // ***** Java bu işe özel zaten bu bir metod (isBlank) oluşturmuşken, başka bir yönteme başvurulmaz.
        // Yani doğru yöntem bu yöntem.

        //ŞİMDİ DE BİR STRİNGİN BOŞLUK HARİÇ HİÇ BİR KARAKTER İÇERİP İÇERMEDİĞİNİ KONTROL EDEN KODU YAZ
        String yazi = "         ";

        // 1.YOL:
        boolean yaziBosBosalt1 = yazi.replace(" ", "").length()==0;
        System.out.println("Sadece boşluk mu var : " + yaziBosBosalt1);

        // 2.YOL:
        boolean yaziBosBosalt2 = yazi.replace(" ", "").isEmpty();
        System.out.println("Sadece boşluk mu var : " + yaziBosBosalt2);

        // 3.YOL
        boolean yaziBosBosalt3 = yazi.isBlank();
        System.out.println("Sadece boşluk mu var : " + yaziBosBosalt3);
    }
}
