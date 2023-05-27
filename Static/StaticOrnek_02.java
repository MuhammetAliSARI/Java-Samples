package horonaga.Metodhs.Static;

public class StaticOrnek_02 {
    int x;
    static int y; // Bu satır static olduğu için StaticOrnek_02 class'ının her yerinden görülebilir demektir.
    StaticOrnek_02(int i){
        x+=i;
        y+=i;
    }
    public static void main(String[] args) {
        new StaticOrnek_02 (2);
        StaticOrnek_02 dnm = new StaticOrnek_02 (3);
        System.out.println(dnm.x + "," + dnm.y);
    }
}
