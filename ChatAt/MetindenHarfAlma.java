package horonaga;

public class MetindenHarfAlma {
    public static void main(String[] args) {
        String s = "Java is Easy";

        // Stringteki baştan ikinci ve sondan ikinci harfi alıp yayn yana ekrana yazdır
        // Tek karakter alacağımız zaman CharAt) kullanılır

        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);

        System.out.println(secondChar + secondLastChar); // Sonucu 212 verir. Char değerlerini topladığı için...
        // Doğrusu:

        // Birinci yol:
        System.out.print(secondChar);
        System.out.println(secondLastChar); // Sonuç : as     Doğru
        // toplama işleminden kurtulmak için bu yolu kullandık.

        // İkinci yol:
        System.out.println("" + secondChar + secondLastChar);
        // Koyduğumuz "" ifadesi, işlemin metin olarak algılanmaya başlamasını sağlamıştır. Diğerlerini de metin olarak görür.
    }
}
