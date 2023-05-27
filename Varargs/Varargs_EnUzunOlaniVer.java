package horonaga.Metodhs.Varargs;

public class Varargs_EnUzunOlaniVer {
    public static void main(String[] args) {
        //Kac tane String verilirse verilsin iclerinden en uzun olani veren kodu yaziniz
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Okan";
        String str4 = "Adnan";
        String str5 = "Sahsanem";

        uzunIsim(str1, str2, str3, str4, str5);
    }//main
    private static void uzunIsim(String... str) {
        String enUzunStr = "";
        for (String w : str) {
            if (w.length() > enUzunStr.length()) {
                enUzunStr = w;
            }
        }
        System.out.println("enUzunStr = " + enUzunStr);//Sahsanem
    }
}
