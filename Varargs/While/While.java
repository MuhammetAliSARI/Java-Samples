package horonaga.Metodhs.While;

public class While {
    public static void main(String[] args) {
        int i = 1;
        while(i<5){
            System.out.println("Süslü parantez içi : " + i);
            i++;
        }System.out.println("Süslü parantez dışı : " + i); // While'nin dışına yazıldığı için sonucu tek satırda ve +1 verir
    }
}
