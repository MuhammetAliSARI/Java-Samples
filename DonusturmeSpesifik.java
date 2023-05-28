package horonaga;

public class DonusturmeSpesifik {
    public static void main(String[] args) {
        short veri = 260;
        System.out.println(veri);
        byte veriByte = (byte)veri;
        System.out.println(veriByte);
    }
}

// short veri tipi -32768 ile +32767 aralığıdır.
// byte ise -128 ile +127 aralığıdır.
// Peki, 327.768 sayısı -128 ile +127 aralığındaki bir rakama nasıl dönüşecek? Yani sonuç neden 4 oldu?
// Şöyle: Byte aralığında (-128 ile +127) 256 adet rakam vardır. Java verilen rakamı bu 256'ya böler (mod işlemi % yapar). Kalanı sonuç olarak verir.
