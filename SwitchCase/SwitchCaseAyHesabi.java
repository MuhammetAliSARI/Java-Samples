package horonaga.Metodhs.SwitchCase;

import java.util.Scanner;

public class SwitchCaseAyHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıç ayının kaçıncı ay olduğunu giriniz : ");
        int ayNumarasi = input.nextInt();

        switch(ayNumarasi){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Geçerli ay numarası veriniz : ");
        }
    }
}

// "break" nereye yazıldıysa istenilen verinin ekrana yansıması orada biter.
// Switch'te long, bbolean, float, double kullanılmaz
