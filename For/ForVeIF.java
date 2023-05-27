package horonaga.Metodhs.For;
// 21'den 180'e kadar hem 4 hem de 6'ya bölünebilen tüm tam sayıları ekrana yazdır.
public class ForVeIF {
    public static void main(String[] args) {
        for (int i=21;i<181;i++){
            if (i%4==0 && i%6==0) {
                System.out.print(i + " ");
            }
        }
    }
}
