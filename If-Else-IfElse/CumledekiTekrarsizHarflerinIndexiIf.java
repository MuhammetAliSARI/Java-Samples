package horonaga;

// CÜMLE İÇİNDE TEKRARSIZ OLAN HARFLER EKRANA YAZDIRILACAK

public class CumledekiTekrarsizHarflerinIndexiIf {
    public static void main(String[] args) {

        String metin = "Ankara";

        char karakter1 = metin.charAt(0);    // karakter=metnin ilk harf değeri
        if(metin.indexOf(karakter1)==metin.lastIndexOf(karakter1)){
            System.out.println("Tekrarsız karakter 0: " + karakter1);
        }

        char karakter2 = metin.charAt(1);    // karakter=metnin ikinci harf değeri
        if(metin.indexOf(karakter2)==metin.lastIndexOf(karakter2)){
            System.out.println("Tekrarsız karakter 1: " + karakter2);
        }

        char karakter3 = metin.charAt(2);    // karakter=metnin üçüncü harf değeri
        if(metin.indexOf(karakter3)==metin.lastIndexOf(karakter3)){
            System.out.println("Tekrarsız karakter 2: " + karakter3);
        }

        char karakter4 = metin.charAt(3);    // karakter=metnin dördüncü harf değeri
        if(metin.indexOf(karakter4)==metin.lastIndexOf(karakter4)){
            System.out.println("Tekrarsız karakter 3: " + karakter4);
        }

        char karakter5 = metin.charAt(4);    // karakter=metnin beşinci harf değeri
        if(metin.indexOf(karakter5)==metin.lastIndexOf(karakter5)){
            System.out.println("Tekrarsız karakter 4: " + karakter5);
        }

        char karakter6 = metin.charAt(5);    // karakter=metnin altıncı harf değeri
        if(metin.indexOf(karakter6)==metin.lastIndexOf(karakter6)){
            System.out.println("Tekrarsız karakter 5: " + karakter6);
        }

        // A ile a aynı şey değildir. Ankara sözcüğünde tekrarlı olan tek harf a'dır.
    }
}
