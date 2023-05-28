package horonaga;
// SAYI 3 BASAMAKLI İSE EKRANA WOOW YAZ
public class SayiUcBasamakliIse {
    public static void main(String[] args) {
        int sayi = -123;
        // SAYI 3 BASAMAKLI İSE EKRANA WOWW YAZ
        sayi = Math.abs(sayi);       // -123 sayısının mutlak değerini aldık. Yoksa sayı 3 basamaklı olduğu halde hata verecekti
        if(sayi>99 && sayi<1000){
            System.out.println("Woow..!");
        }
    }
}
