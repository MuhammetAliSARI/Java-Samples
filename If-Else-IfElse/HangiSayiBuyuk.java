package horonaga;

import java.util.Scanner;

// IF YERİNE ? KULLANIMI

public class HangiSayiBuyuk {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("1. sayıyı gir : ");
        int birinci = input.nextInt();
        System.out.print("2. sayıyı gir : ");
        int ikinci = input.nextInt();
        if(birinci>ikinci){
            System.out.println("Birinci girdiğiniz " + birinci + " rakamı büyüktür");}
        if(ikinci>birinci){
            System.out.println("İkinci girdiğiniz " + ikinci + " rakamı büyüktür");}
        else if(birinci==ikinci){
            System.out.println("Rakamlar eşittir");}

        // BURAYA KADAR OLAN KISMI BİRİNCİ KLASİK YÖNTEM İDİ
        // ŞİMDİ İKİNCİ YÖNTEM

        int result = birinci>ikinci ? birinci : ikinci;    // :'nın solundaki true, sağındaki ise false değeridir.
        System.out.println("Girdiğiniz " +  result + " rakamı büyüktür");
        //        ?          işareti "ise" anlamındadır.
    }

}
