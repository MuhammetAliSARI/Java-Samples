package horonaga;

public class SayiyiBuyukKucugeDonustur {
    public static void main(String[] args) {
        double veri = 234.659;
        System.out.println(veri);
        short veriInt = (short)veri;
        System.out.println(veriInt);

    }
}

// Bu işlem, veri'nin önüne parantez içinde dönüştüreceğimiz tipi (bu örnekte short) ayrıca yazıyoruz.
// Bunu koymadıkça hata verecektir. Burada yazılımcı risk almış olur.
// Bir daraltma işlemi (ExplicitNarroving) olmuştur.
// Burada double değeri short olurken, küsurat silinmiştir.
