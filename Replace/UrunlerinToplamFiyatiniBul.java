package horonaga;
// ÜRÜNLERİN İLİŞİĞİNDEKİ PARA BİRİMİNİ SİLİP, FİYATI SAYISAL DEĞERE DÖNÜŞTÜR
public class UrunlerinToplamFiyatiniBul {
    public static void main(String[] args) {
        String tv = "$455.45";
        String lattop = "$1000.95";

        // Burada öncelikli amacımız, her ne kadar sayısal gibi duran fiyatları sayısal değere çevirmek
        // Bunun için, tırnak içi ifadelerin içindeki rakam haricindeki l-karakterleri yok etmek.

        String dolarGitTv = tv.replace("$", "");         // $ dolar işareti silindi
        String dolarGitLattop = lattop.replace("$", "");         // $ dolar işareti silindi

        // SIRADA BU RAKAM GİBİ GÖRÜNEN STRİNGLERİ SAYIYA ÇEVİRMEK VAR
        // STRİNGLERİ RAKAMA ÇEVİREN valueOf() METODUNU KULLANACAĞIZ

        // ÜRÜNLERİN, RAKAM HARİCİ KARAKTERLERDEN ARINDIRILMIŞ HALLERİ EKRANA YAZILACAK
        System.out.println("TV Fiyatı : " + dolarGitTv);
        System.out.println("PC Fiyatı : " + dolarGitLattop);

        Double toplam = Double.valueOf(dolarGitTv) + Double.valueOf(dolarGitLattop);   // Fiyatlar küsuratlı olduğu için Double seçildi
        System.out.println("Ürünlerin Toplamı : " + toplam);        // Ürünleri toplama işlemi
    }
}
