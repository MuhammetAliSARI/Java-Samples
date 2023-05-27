package horonaga.Metodhs.DoWhile;

public class DoWhile_While {
    public static void main(String[] args) {

        // While en basit hali
        int i=0;
        while (i<3){
            System.out.println("While için   " + i + "");
            i++;                            // i<3 olana kadar yukarıya çık devam et
        }
        
        // Do-While en basit hali
        do{

            System.out.println("Do-While için   " + i + "");
            i++;

        }while (i<3);
    }
}
