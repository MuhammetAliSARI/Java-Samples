public class Proje001_Market_Programi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double zam = 1.25;

        String fiyatlistesi = "Ürün Kodu Ürün Adı            Fiyat : ";

        System.out.println(fiyatlistesi);

        double toplamFiyat = 0;

        double liste01 = 0;
        double liste02 = 0;
        double liste03 = 0;
        double liste04 = 0;
        double liste05 = 0;
        double liste06 = 0;
        double liste07 = 0;
        double liste08 = 0;
        double liste09 = 0;
        double liste10 = 0;

        double kilo01 = 0;
        double kilo02 = 0;
        double kilo03 = 0;
        double kilo04 = 0;
        double kilo05 = 0;
        double kilo06 = 0;
        double kilo07 = 0;
        double kilo08 = 0;
        double kilo09 = 0;
        double kilo10 = 0;

        String kod01 = "01";
        String urun01 = "Domates      ";
        double fiyat01 = zam * 2.10;   // ÜRÜN 01
        System.out.println(kod01 + "        " + urun01 + " :     " + fiyat01 + " TL");
        String kod02 = "02";
        String urun02 = "Patates      ";
        double fiyat02 = zam * 3.20;   // ÜRÜN 02
        System.out.println(kod02 + "        " + urun02 + " :     " + fiyat02 + " TL");
        String kod03 = "03";
        String urun03 = "Biber        ";
        double fiyat03 = zam * 1.50;   // ÜRÜN 03
        System.out.println(kod03 + "        " + urun03 + " :     " + fiyat03 + " TL");
        String kod04 = "04";
        String urun04 = "Soğan        ";
        double fiyat04 = zam * 2.30;   // ÜRÜN 04
        System.out.println(kod04 + "        " + urun04 + " :     " + fiyat04 + " TL");
        String kod05 = "05";
        String urun05 = "Havuç        ";
        double fiyat05 = zam * 3.10;   // ÜRÜN 05
        System.out.println(kod05 + "        " + urun05 + " :     " + fiyat05 + " TL");
        String kod06 = "06";
        String urun06 = "Muz          ";
        double fiyat06 = zam * 1.90;   // ÜRÜN 06
        System.out.println(kod06 + "        " + urun06 + " :     " + fiyat06 + " TL");
        String kod07 = "07";
        String urun07 = "Çilek        ";
        double fiyat07 = zam * 6.10;   // ÜRÜN 07
        System.out.println(kod07 + "        " + urun07 + " :     " + fiyat07 + " TL");
        String kod08 = "08";
        String urun08 = "Kavun        ";
        double fiyat08 = zam * 4.30;   // ÜRÜN 08
        System.out.println(kod08 + "        " + urun08 + " :     " + fiyat08 + " TL");
        String kod09 = "09";
        String urun09 = "Üzüm         ";
        double fiyat09 = zam * 2.70;   // ÜRÜN 09
        System.out.println(kod09 + "        " + urun09 + " :     " + fiyat09 + " TL");
        String kod10 = "10";
        String urun10 = "Limon        ";
        double fiyat10 = zam * 0.50;   // ÜRÜN 10
        System.out.println(kod10 + "        " + urun10 + " :     " + fiyat10 + " TL");

        System.out.println();
        double fiyatTop = 0;     // Ara fiyat toplamı
        for (int i = 1; i <= 10000; i++) {

            System.out.println("Çıkmak içim Q tuşuna basın");
            System.out.print("Ürünün Kodunu Girin : ");
            String kodgir = input.next();     // Çıkış için girilecek veri ayrıca büyük harfe dönüştürüldü.

            if (kodgir.equals("Q") || kodgir.equals("q")) {
                break;
            }
            if (kodgir.equals("01") || kodgir.equals("02") || kodgir.equals("03") || kodgir.equals("04") || kodgir.equals("05") || kodgir.equals("06") || kodgir.equals("07") || kodgir.equals("08") || kodgir.equals("09") || kodgir.equals("10")) {


            } else {
                System.out.println("\nLütfen geçerli bir kod girin..!");
                continue;
            }

            System.out.print("Kaç kilo alacaksınız : ");
            int kilogir = input.nextInt();

            if (kodgir.equals("01")) {
                double topla1 = fiyat01 * kilogir;
                System.out.println("                               " + urun01 + topla1 + " TL");
                toplamFiyat += topla1;
                fiyatTop += topla1;
                if (fiyatTop != 0) { liste01 += topla1; kilo01 += kilogir;}
            }
            if (kodgir.equals("02")) {
                double topla2 = fiyat02 * kilogir;
                System.out.println("                               " + urun02 + topla2 + " TL");
                toplamFiyat += topla2;
                fiyatTop += topla2;
                if (fiyatTop != 0) { liste02 += topla2; kilo02 += kilogir; }
            }
            if (kodgir.equals("03")) {
                double topla3 = fiyat03 * kilogir;
                System.out.println("                               " + urun03 + topla3 + " TL");
                toplamFiyat += topla3;
                fiyatTop += topla3;
                if (fiyatTop != 0) { liste03 += topla3; kilo03 += kilogir;}
            }
            if (kodgir.equals("04")) {
                double topla4 = fiyat04 * kilogir;
                System.out.println("                               " + urun04 + topla4 + " TL");
                toplamFiyat += topla4;
                fiyatTop += topla4;
                if (fiyatTop != 0) { liste04 += topla4; kilo04 += kilogir;}
            }
            if (kodgir.equals("05")) {
                double topla5 = fiyat08 * kilogir;
                System.out.println("                               " + urun05 + topla5 + " TL");
                toplamFiyat += topla5;
                fiyatTop += topla5;
                if (fiyatTop != 0) { liste05 += topla5; kilo05 += kilogir;}
            }
            if (kodgir.equals("06")) {
                double topla6 = fiyat06 * kilogir;
                System.out.println("                               " + urun06 + topla6 + " TL");
                toplamFiyat += topla6;
                fiyatTop += topla6;
                if (fiyatTop != 0) { liste06 += topla6; kilo06 += kilogir;}
            }
            if (kodgir.equals("07")) {
                double topla7 = fiyat07 * kilogir;
                System.out.println("                               " + urun07 + topla7 + " TL");
                toplamFiyat += topla7;
                fiyatTop += topla7;
                if (fiyatTop != 0) { liste07 += topla7; kilo07 += kilogir;}
            }
            if (kodgir.equals("08")) {
                double topla8 = fiyat08 * kilogir;
                System.out.println("                               " + urun08 + topla8 + " TL");
                toplamFiyat += topla8;
                fiyatTop += topla8;
                if (fiyatTop != 0) { liste08 += topla8; kilo08 += kilogir;}
            }
            if (kodgir.equals("09")) {
                double topla9 = fiyat09 * kilogir;
                System.out.println("                               " + urun09 + topla9 + " TL");
                toplamFiyat += topla9;
                fiyatTop += topla9;
                if (fiyatTop != 0) {liste09 += topla9; kilo09 += kilogir;}
            }
            if (kodgir.equals("10")) {
                double topla10 = fiyat10 * kilogir;
                System.out.println("                               " + urun10 + topla10 + " TL");
                toplamFiyat += topla10;
                fiyatTop += topla10;
                if (fiyatTop != 0) { liste10 += topla10; kilo10 += kilogir;}
            }

            System.out.println("                               Ara Toplam   " + fiyatTop + " TL");

        }

        System.out.println();
        System.out.println("---------------------------------------------------");
        if (liste01 == 0) {}else{ System.out.println(urun01 + " : " + kilo01 + " kg x " + (String.format("%.2f",fiyat01)) + " TL           " + (String.format("%.2f",liste01)) + " TL"); }
        if (liste02 == 0) {}else{ System.out.println(urun02 + " : " + kilo02 + " kg x " + (String.format("%.2f",fiyat02)) + " TL           " + (String.format("%.2f",liste02)) + " TL"); }
        if (liste03 == 0) {}else{ System.out.println(urun03 + " : " + kilo03 + " kg x " + (String.format("%.2f",fiyat03)) + " TL           " + (String.format("%.2f",liste03)) + " TL"); }
        if (liste04 == 0) {}else{ System.out.println(urun04 + " : " + kilo04 + " kg x " + (String.format("%.2f",fiyat04)) + " TL           " + (String.format("%.2f",liste04)) + " TL"); }
        if (liste05 == 0) {}else{ System.out.println(urun05 + " : " + kilo05 + " kg x " + (String.format("%.2f",fiyat05)) + " TL           " + (String.format("%.2f",liste05)) + " TL"); }
        if (liste06 == 0) {}else{ System.out.println(urun06 + " : " + kilo06 + " kg x " + (String.format("%.2f",fiyat06)) + " TL           " + (String.format("%.2f",liste06)) + " TL"); }
        if (liste07 == 0) {}else{ System.out.println(urun07 + " : " + kilo07 + " kg x " + (String.format("%.2f",fiyat07)) + " TL           " + (String.format("%.2f",liste07)) + " TL"); }
        if (liste08 == 0) {}else{ System.out.println(urun08 + " : " + kilo08 + " kg x " + (String.format("%.2f",fiyat08)) + " TL           " + (String.format("%.2f",liste08)) + " TL"); }
        if (liste09 == 0) {}else{ System.out.println(urun09 + " : " + kilo09 + " kg x " + (String.format("%.2f",fiyat09)) + " TL           " + (String.format("%.2f",liste09)) + " TL"); }
        if (liste10 == 0) {}else{ System.out.println(urun10 + " : " + kilo10 + " kg x " + (String.format("%.2f",fiyat10)) + " TL           " + (String.format("%.2f",liste10)) + " TL"); }

        System.out.println("\n                               Tutar    :   " + toplamFiyat + " TL");
    }

}
