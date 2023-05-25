package horonaga.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2,3));    // DortIslem Class'ında 2 adet topla vardır. Birincisini seçtik.
        System.out.println(dortIslem.topla(2,3,5));; // DortIslem Class'ında 2 adet topla vardır. İkincisini seçtik.
    }

}
