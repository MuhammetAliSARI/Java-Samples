package horonaga.Metodhs.Replace;

public class Replace_All {
    public static void main(String[] args) {
        String metin = "Bu metinin içeriği ile oynayacağız.";
        int sonuc = metin.                                                 // landa yöntemi kullanarak alt alta sıralıyoruz
                replaceAll("[0-9]","").                    // 0-9 arası rakamlalrın yerine hiçlik koydu
                replaceAll(" ","").                        // boşlukların yerine hiçlik koydu.
                replaceAll("\\p{Punct}","").               // noktalama işaretlerinin yerine hiçlik koydu
                length();                                                  // metnin uzunluğunu ekrana yazdı

        // bu son 4 satırı tek satır olarak yanyana yazabilirdik ama sığmadığı için Landa yöntemi kullanarak alt alta dizdik.
        System.out.println(sonuc);
    }
}
