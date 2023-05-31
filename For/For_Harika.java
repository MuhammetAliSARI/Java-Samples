package horonaga.Metodhs.For;

public class For_Harika {
    public static void main(String[] args) {
        String metin1 = "Merhaba Dünya";
            for ( int i=0 ;i<metin1.length() ; i++) { if (metin1.charAt(i) != 'a')
            {System.out.print(metin1.charAt(i));}}          // VERİLEN BİR STRİGNG'DE İLK "a" HARFİNDEN ÖNCEKİ TÜM KARAKTERLERİ YAZDIR.

        String metin2 = "Bize her yer Trabzon";
            for ( int e = metin2.length()-1; e>=0; e--){ if(metin2.charAt(e)=='a') { break;}
            { System.out.print(metin2.charAt(e));}}         // VERİLEN BİR STRİNG'DE SON 'a' HARFİNDEN SONRAKİ TÜM KARAKTERLERİ EKRANA YAZDIR.
    }
}
