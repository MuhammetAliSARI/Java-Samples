package horonaga.Metodhs.ArraysLists;

public class ArrayList_IcIce2 {
    public static void main(String[] args) {
        int [][] x = {{-9,0},{0,0,49}};
        System.out.println(m(x));
    }
    public static int m(int[][] m){
        int result = m[1].length;                    // m[1] demek {0,0,49} anlamına geliyor. Bu da result = 3 demek oluyor.
        for (int i = 0; i<m.length; i++){            // i ilk değer olarak 0 ise ve m de 2 ise 0<2 olur.
            for (int j = 0; j<m[i].length; j++) {    // Bu sefer j için m'nin i değerince (0) karşılaştırma var m'nin 0 index uzunluğu 2'dir. Yani : 0<2. Aşağıya geç.
                result += m[i][j];                   // Elimizde result += m[0][0] oluştu. Bu da -9'dur. Fakat result'a en başta 3 değeri atanmıştı. Bu arada j de 1 arttı.
                                                     // Result -9 +3 = -6
                                                     // Sonra j<m[i] komutu, j'nin 1 değeri için döner: 1<2 ---> Cevap olumludur ve alt satıra geçer.
                                                     // İçeriye girer ve result += [0][1] oluşur. Bu da 0'dır.
                                                     // result en son -6 idi. Buna 0'ı da ekledik.
                                                     // Bir sonraki döngüde j 2 olur ve karşılaştırma sağlanamadığı için loopun dışına çıkar.

                                                     // Bir üst for döngüsüne çıkar. i buraya (++ sayesinde) 1 artırılmış olarak çıkar.
                                                     // m[1] baştan bellidir = 3 Ve i<m sağlanana kadar i için 0,1,2 değerleri dönecektir.
                                                     // Her dönüşte de bir alt for döngüsünde i'nin yeni değeri j ile sonuç verecektir.
            }
        }
        return result;

    }
}
