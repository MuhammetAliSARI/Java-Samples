package horonaga;
// isEmpty, boş mu demektir. Eğer belirtilen değerde hiç eleman yoksa 'true' verir, varsa 'false' verir
// yazi.size[]==0 ile aynı anlama gelir.
public class IsEmpty {
    public static void main(String[] args) {
        String yazi1 = "";
        String yazi2 = " Bu bir cümledir";

        System.out.println(yazi1.isEmpty());
        System.out.println(yazi2.isEmpty());
    }
}
