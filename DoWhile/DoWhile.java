package horonaga.Metodhs.DoWhile;

public class DoWhile {

    public static void main(String[] args) {

        int k = 10;
        do{
            System.out.println(k); // k değeri(10) 1'den küçük olmadığı halde bu satır ekranda 1 defa görünür.
            k++;
        }while(k<1);

    }

}

// While, 1'den küçük olma şartı sunmasına rağmen, ekrana 10 yazdı. Çünkü:
// Do her şeye rağmen ilk değeri dikkate alır.
