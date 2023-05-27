package horonaga.Metodhs.Varargs;/*
                SAYI TAHMIN OYUNU
    Oyuncudan 1-10 arasi bir sayi isteyiniz
    Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
    Yoksa verdigi sayiyi listenize ekleyiniz.
    Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
    [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
    [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
    [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Varargs_SayiTahminOyunu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Oyunuzumuza hoş geldiniz.");
        System.out.println("Oyunu sonlandırmak için Q'ya basınız.");

        // Arrays.asList ile List oluşturulabilir ama listlerdeki eleman sayısını değiştiren hiç bir metod bu List için kullanılamaz.
        // Dolayısıyla bu sorunun çözümünde ihtiyaç duyulan Listi "Arrays.asList()" kullanarak oluşturmak gerek.
        // List<Integer> numsList = Arrays.asList(5,8,2,9);

        List<String> numsList = new ArrayList<>();
        numsList.add("5");
        numsList.add("8");
        numsList.add("2");
        numsList.add("9");

        int counter = 0;
        String num = "";

        do{
            System.out.print("Lütfen 1 ile 10 arasında bir tam sayı giriniz : ");
            num = input.next();

            if(num.equalsIgnoreCase("Q")){
                break;
            }
            else if(numsList.contains(num)){
                numsList.set(numsList.indexOf(num),"Bingo");
                counter++;
            }else{
                numsList.add(num);
            }
        }while(counter!=numsList.size());
        if(!num.equalsIgnoreCase("Q")){
            System.out.println("Kazandınız!");
        }else{
            System.out.println("Oyundan isteyerek ayrıldınız. Yine bekleriz.");
        }
        System.out.println("Son Rapor : " + numsList);
    }
}

