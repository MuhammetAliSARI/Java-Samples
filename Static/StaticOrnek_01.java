package horonaga.Metodhs.Static;

import horonaga.Deneme;

public class StaticOrnek_01 {
    static int count = 0;
    public void increment(){
        count++;
    }

    public static void main(String[] args) {
        StaticOrnek_01 obj1 = new Deneme();
        StaticOrnek_01 obj2 = new Deneme();

        obj1.increment();
        obj2.increment();

        System.out.println("Obj1 : count is = " + obj1.count);
        System.out.println("Obj2 : count is = " + obj2.count);
    }
}
