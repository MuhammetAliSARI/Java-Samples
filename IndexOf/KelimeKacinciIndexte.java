package horonaga;
// Aranılan kelimenin kaçıncı indexte olduğu
public class KelimeKacinciIndexte {
    public static void main(String[] args) {

        String kacinci = "Sakla samanı, gelir zamanı";

        int indexBul = kacinci.indexOf("gelir");
        System.out.println("Aradığınız kelime dizininin index değeri : " + indexBul);
    }
}
