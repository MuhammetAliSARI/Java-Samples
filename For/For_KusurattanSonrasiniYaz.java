package horonaga.Metodhs.For;

public class For_KusurattanSonrasiniYaz {
    public static void main(String[] args) {
        double k = 75.4238;
        String str = String.valueOf(k);
        int noktaIdx=str.indexOf(".");
        System.out.println(noktaIdx);

        String abc="";

        for (int j = noktaIdx+1; j <str.length() ; j++) {
            String virgul =  str.substring(j,j+1);
            abc=abc +"*"+ virgul;
        }
        System.out.println(abc); 
    }
}
