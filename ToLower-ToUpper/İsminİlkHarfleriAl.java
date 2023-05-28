package horonaga;
//  VERİLEN İSMİN İSİM VE SOYADI BAŞLARINDAKİ HARFLER İSTENİYOR
public class İsminİlkHarfleriAl {
    public static void main(String[] args) {
        String isim = "     MuhaMmeT ALi Sarı        ";

        // En önce imla hatalarının düzeltilmesi gerekiyor

        char metniDuzenle1 = isim.trim().toUpperCase().charAt(0);
        // .trim() ile metnin en son ve en baştaki boşluklar silindi.
        // .toUpperCase() ile harfler büyük hafe dönüştürüldü.
        // .charAt(0) ile sıfırıncı karakter alındı.
        System.out.println(metniDuzenle1);

        char metniDuzenle2 = isim.trim().toUpperCase().split(" ")[1].charAt(0);
        // Bu sefer yukarıdaki işlemleri aynen yaptık ama ikinci ismin baş harfi lazım olduğu için, lazım olan harf öncesi metni boşluktan parçaladık.
        // split(" ") ile boşluk olan yerden parçala dedik.
        // artık ilk kelimenin değeri 0, ikinci kelimenin değeri ise 1'dir. Biz [1] ile 1. kelimenin sıfırıncı karakterini 'charAt(0)' aldık.
        System.out.println(metniDuzenle2);

        char metniDuzenle3 = isim.trim().toUpperCase().split(" ")[2].charAt(0);
        // Şimdi de split(" ")[2] ile ikinci (3. sıradaki) kelime parçasının ilk harfini 'charAt(0)' aldık.
        System.out.println(metniDuzenle3);

        System.out.println("" + metniDuzenle1 + metniDuzenle2 + metniDuzenle3);
    }
}
