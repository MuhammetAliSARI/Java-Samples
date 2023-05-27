package horonaga.Metodhs.Input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TechProEd spor salonuna hosgeldiniz....");
        System.out.print("\nLutfen adinizi soyadinizi giriniz : ");
        String tamIsim = input.nextLine();

        System.out.print("Lutfen yasinizi giriniz : ");
        byte yas = input.nextByte();

        System.out.print("Lutfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        System.out.print("Lutfen boyunuzu giriniz : ");
        double boy = input.nextDouble();

        int aylik_Ucret = 20;
        System.out.println("\nAylik_Ucret = " + aylik_Ucret + " $");

        System.out.print("Lutfen uyelik suresini giriniz : ");
        int aylik = input.nextInt();

        int toplam_tutar = aylik_Ucret * aylik;
        System.out.println("toplam_tutar = " + toplam_tutar + " $");

        System.out.println("tamIsim = " + tamIsim + "\nYasiniz : " + yas + "\nKilo : " + kilo + "\nBoy : " + boy +
                "\n\nSayın " + tamIsim + " \nOdemeniz gereken toplam tutar : " + toplam_tutar + " $");

    }
}
