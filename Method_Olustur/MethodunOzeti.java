package horonaga;
// MTHOD OLUŞTURMANIN ÖZETİ
public class MethodunOzeti {
    public static void skorhesapla (String name, int skor){                 // 1. Method: String hem de int girişi yapılabiliyor.
        System.out.println(name + " isimli oyuncunun puanı: " + skor);
    }
    public static void skorhesapla (int skor){
        System.out.println("İsimsiz oyuncunun puanı: " + skor);             // 2. Method: sadece int girişi yapılabiliyor.
    }
    public static void skorhesapla (String name){
        System.out.println(name + " isimsiz oyuncunun puanı: 0");           // 3. Method: sadece String girişi yapılabiliyor.
    }

    public static void main(String[] args) {
        skorhesapla("Ali",3000);
        skorhesapla(1000);
        skorhesapla("Mustafa");
    }
}
