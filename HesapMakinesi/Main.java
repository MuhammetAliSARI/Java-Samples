package horonaga.HesapMakinesi;

public class Main {
    public static void main(String[] args) {
        HesapMakinesi dortIslem = new HesapMakinesi();
        int sonuc = dortIslem.Topla(3, 4);       // dortIslem. yazıldığında topla,çıkar, çarp,böl tercihleri gözükür.
        System.out.println(sonuc);

    }
}
