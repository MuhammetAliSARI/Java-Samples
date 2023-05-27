package horonaga.Metodhs.Replace;
// w ile "her gördüğün harf yerine" komutu veriyoruz
public class ReplaceAll__w {
    public static void main(String[] args) {
        String cumle = "Çekoslovakyalılaştıramadıklarımızdan mısınız?";
        System.out.println(cumle.replaceAll("\\w", "*")); // w ile Bütün harfleri aldık, yerine yıldız koyduk.
        System.out.println(cumle.replaceAll("a", "█"));   // String içindeki tüm a harfleri █ yaptık.
    }
}
