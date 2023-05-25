package horonaga.Metodhs.ArraysLists;
// LİSTEDEN, İNDEXİ İSTENEN ELEMANI EKRANA VER.
import java.util.ArrayList;

public class ArrayList_ListtenElemanAl {
    public static void main(String[] args) {
        ArrayList<Character> initials = new ArrayList<>();

        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        char u = initials.get(2);
        System.out.println(u);
    }
}
