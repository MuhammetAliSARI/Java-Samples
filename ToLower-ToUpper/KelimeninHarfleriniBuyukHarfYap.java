package horonaga;

public class KelimeninHarfleriniBuyukHarfYap {
    public static void main(String[] args) {
        String s = "Java is Easy";
        // Kelimenin harflerini büyütmek için toUpperCas() metodunu kullanacağız.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);
        // BÜTÜN HARFLERİ BÜYÜK HARFE DÖNÜŞTÜ

        String sLower = s.toLowerCase();
        System.out.println(sLower);
        // BÜTÜN HARFLERİ KÜÇÜK HARFE DÖNÜŞTÜ

        char firstChar = s.charAt(0); //String s değerindeki kelimenin sıfırıncı karakteri al.
        System.out.println(firstChar);
        // KELİMENİN İLK HARFİ EKRANA YAZILDI
    }
}
