package horonaga.Metodhs.SwitchCase;

import java.util.Scanner;

//Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
public class Switch_Ilk {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gün ismini giriniz (En) : ");
        String dayName = input.nextLine();


        switch(dayName.toLowerCase()){     // BU SATIR SAYSEİNDE GİRİLEN DEĞİŞKENİN TÜM HARFLERİ KÜÇÜK HARFE DÖNÜŞTÜ.

            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:   // BU KISIM, HİÇ BİR ŞARTIN ÇALIŞMADIĞI ZAMAN EKRANDA GÖRÜNMESİ GEREKEN VERİDİR.
                System.out.println("Lutfen gecerli gun ismi giriniz");
        }
    }
}

// break; işlemi o kısımda bitirir. Switch kodunun devamını görmez ve direkt switcin dışına gider.
// hiç biri değilse durumunda işlemi bitirir.
// Java Stich'te aradığını bulunca, en sona gider; defaultun dışına...
// SWITCH STATEMENT'TE long, double, float, boolean KULLANILMAZ.
