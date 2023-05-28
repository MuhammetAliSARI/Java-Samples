package horonaga;

public class BirIslem {
    public static void main(String[] args) {
        int sonuc = islem(3,5,4);             // İşlemi memorye aktaracak bir taşıyıcı lazımdı.
        System.out.println(sonuc);                // Bunu, işlemin başına int sonuc = ekleyerek gerçekleştirdik.
    }                                             // Son olarak sonuc'u RUN yapıyoruz.
    public static int islem (int a, int b, int c){
        return (a*b)+c;
    }
}
