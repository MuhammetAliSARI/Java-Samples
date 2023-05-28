package horonaga;

// METNİN İLK DÖRT HARFİ SUBSTRING İLE EKRANA VERİLECEK

public class MetninBirKisminiAl {
    public static void main(String[] args) {
        String s = "Muhammet Ali Sarı";

        String sub1 = s.substring(0,8); // İlk karakter 0 ve dördüncü karakter 4 arası...
        System.out.println(sub1);

        // METNİN İÇİNDE BELLİ BİR YEDEN BAŞLAYIP BELİLLİ BİR YERE KADAR EKRANA VER
        String sub2 = s.substring(9,12);
        System.out.println(sub2);

        // METNİN BELLİ BİR YERİNDEN BAŞLANIP SONUNA KADAR ALMAK İÇİN
        String sub3 = s.substring(13);
        System.out.println(sub3);
    }
}
