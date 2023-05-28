package horonaga;

import java.util.Scanner;

public class SifreUcKereHataliGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hataSay = 0;

        do{
            if(hataSay==4){
                System.out.println("Hesabınız bloke olmuştur");
                break;
            }
            System.out.println("Kullanıcı adınızı girin : ");
            String kullanici = input.next();

            System.out.println("Şifrenizi girin : ");
            String sifre = input.next();

            if (kullanici.equals("horonaga") && sifre.equals("1976")){
                System.out.println("Hesabına hoşgeldin");
                break;
            }
            hataSay++;

        }while(true);
    }
}
