package horonaga.Metodhs.Array;

public class Array_ile_Say {
    public static void main(String[] args) {
        int veri[] = {3,2,3,4,4,5};
        int say = 0;
        for(int i=0; i<veri.length; i++){
            if (veri[i]==3){
                say++;

            }
        }System.out.println(say);
    }
}
