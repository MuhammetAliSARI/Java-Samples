package horonaga.Metodhs.Replace;
// D sayesinde, rakam haricindekilere hiçlik atacayacak

public class ReplaceAll_D {
    public static void main(String[] args) {
        String metin = "$45.99";
        metin = metin.replaceAll("\\D","");                 // Rakam haricindekilere hiçlik atacayacak
        System.out.println("metin = " + metin);
    }
}
