package horonaga.Metodhs.ArraysLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_SubList {
        public static void main(String[] args) {
            List<String> names = new ArrayList();
            names.add("Ajda");
            names.add("Cüneyt");
            names.add("Mahsun");
            names.add("Müslüm");
            names.add("Orhan");

            System.out.println(names.subList(1,4));
            // BURADA KASTEDİLEN 1'DEN 4'E KADARDIR. YANİ 4 DAHİL DEĞİLDİR.
    }
}
