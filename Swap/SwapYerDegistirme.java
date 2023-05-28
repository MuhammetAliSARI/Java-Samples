package horonaga.Metodhs;

public class SwapYerDegistirme {
    public static void main(String[] args) {
        // SWAP: Yer değiştirme
        int a = 12;
        int b = 5;
        int temp = 0; // Bu kısım, geçici bir aktarma kabı görevi görecek

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // Aşağıda, swap işleminden sonra a = 5 olacak b = 12 olacak

        temp = a; // önce temp'in içine a'yı koyduk
        a = b;
        b = temp;
        System.out.println("a : " + a);
        System.out.println("b : " + b);


// BURAYA KADAR OLANI BİRİNCİ YÖNTEMDİ       ŞİMDİ İKİNCİ YÖNTEM:
        // az önce değerler yer değiştirmişti
        // şimdi yine yer değiştirecek

        int c = a;
        int d = b;

        a = d;
        b = c;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
