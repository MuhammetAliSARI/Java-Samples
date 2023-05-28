package horonaga;

public class BasitBirMethod {
    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        String s = "My Java";

        getCharFromString(s, a, b);
    }
    public static void getCharFromString(String s, int a, int b) {
        int idx = a/b;
        char ch = s.charAt(idx);
        System.out.println(ch);
    }
}
