package horonaga.Metodhs.Static;

public class StaticOrnek_06 {
    int count;
    static int stCount;
    public StaticOrnek_06() {
        count++;
        stCount++;
    }
    public int getCount(){
        return count;
    }
    public static int getStCount(){
        return stCount;
    }
    public static void main(String[] args) {
        StaticOrnek_06 cs1 = new StaticOrnek_06();
        StaticOrnek_06 cs2 = new StaticOrnek_06();
        StaticOrnek_06 cs3 = new StaticOrnek_06();
        StaticOrnek_06 cs4 = new StaticOrnek_06();
        StaticOrnek_06 cs5 = new StaticOrnek_06();
        StaticOrnek_06 cs6 = new StaticOrnek_06();
        System.out.println("count is : " + cs6.getCount());
        System.out.println("stCount is : " + cs6.getStCount());
    }
}
