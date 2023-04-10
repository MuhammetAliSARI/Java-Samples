import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe = 0;
        int yas = 0;
        int yolculukTipi = 1;

        System.out.print("Müşteri Adı           : ");
        String ad = input.nextLine();

        System.out.print("Araç Plakası          : ");
        String aracPlaka = input.nextLine();

        System.out.print("Nereye Gidiyor        : ");
        String nereye = input.nextLine().toLowerCase();          // Küçük-büyük harf girişi problemini burada hallettik.

        if (nereye.equals("istanbul")){mesafe = 1250;}           //  Seyahat şirketinin otobüs çıkardığı illerin mesafeleri mesafe değişkenine aktarıldı
        else if (nereye.equals("ankara")){mesafe = 800;}         //  Böylelikle gidilen yerin mesafe bilgisi bilet fiyatını belirleyecek.
        else if (nereye.equals("izmir")){mesafe = 1650;}
        else if (nereye.equals("bursa")){mesafe = 1350;}
        else if (nereye.equals("antalya")){mesafe = 1550;}
        else { System.out.println("Bu güzergahta otobüsümüz yoktur...!"); return;}

        System.out.print("Yaş                   : ");
        yas = input.nextInt();

        System.out.print("Sadece Gidiş için: 1   Gidiş-Dönüş için : 2" + "\nYolculuk tipi         : ");
        yolculukTipi = input.nextInt();

        int yas24Indirim1 = 0;
        int yas12Indirim2 = 0;
        int yas65Indirim3 = 0;
        int gitgel = 0;

        if (mesafe>0 && yas>0 &&(yolculukTipi==1 || yolculukTipi==2)){
            double biletUcreti = mesafe*0.10;
            double yasIndirimOrani = 0;

            if (yas<24){ yasIndirimOrani = 0.1; yas24Indirim1+=1;}
            if (yas<12){ yasIndirimOrani = 0.5; yas12Indirim2+=1;}
            if (yas>65){ yasIndirimOrani = 0.3; yas65Indirim3+=1;}

            biletUcreti -= biletUcreti*yasIndirimOrani;     // Biletin fiyatından, bilet fiyaının yaş indirimiyle çarpımının eksiltilmiş hali

            if (yolculukTipi==2){
                biletUcreti-=biletUcreti*0.2;
                System.out.println("Ücretiniz : " + (String.format("%.2f", biletUcreti*2) + " TL"));
                //
                gitgel+=1;
            }else if (yolculukTipi==1){
                System.out.println("Ücretiniz : " + (String.format("%.2f", biletUcreti) + " TL"));
                            }
        }else {
            System.out.println("\nLütfen geçerli bir bilgi girin..!");
        }

        System.out.println("\nSn. "+ ad);
        System.out.println(aracPlaka.toUpperCase() + " plakalı otobüsümüzle");
        System.out.println(nereye.toUpperCase() + " istikametine yapacağınız seyahatte");
        System.out.println("KEYİFLİ YOLCULUKLAR DİLERİZ.....");

        if (yas12Indirim2>0){System.out.print("\n12 Yaş altı indirimden faydalandınız : %30");
        } else if (yas24Indirim1>0){
            System.out.print("\n24 Yaş altı indirimden faydalandınız : %10");
        } else if (yas65Indirim3>0){
            System.out.print("\n65 Yaş altı indirimden faydalandınız : %30");
        }
        if (gitgel>0){System.out.print("\nGidiş-Dönüş indirim oranınız : %20");}
    }
}
