package horonaga.Metodhs.If_Else_IfELse;

import java.util.Scanner;

public class ElseIf_AyAdlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ay ismini giriniz : ");
        String ayAdi = input.next();

        if (ayAdi.equalsIgnoreCase("January")){System.out.println(ayAdi + " 1.aydır");}
        else if (ayAdi.equalsIgnoreCase("February")){System.out.println(ayAdi + " 2.aydır");}
        else if (ayAdi.equalsIgnoreCase("March")){System.out.println(ayAdi + " 3.aydır");}
        else if (ayAdi.equalsIgnoreCase("April")){System.out.println(ayAdi + " 4.aydır");}
        else if (ayAdi.equalsIgnoreCase("May")){System.out.println(ayAdi + " 5.aydır");}
        else if (ayAdi.equalsIgnoreCase("June")){System.out.println(ayAdi + " 6.aydır");}
        else if (ayAdi.equalsIgnoreCase("July")){System.out.println(ayAdi + " 7.aydır");}
        else if (ayAdi.equalsIgnoreCase("August")){System.out.println(ayAdi + " 8.aydır");}
        else if (ayAdi.equalsIgnoreCase("September")){System.out.println(ayAdi + " 9.aydır");}
        else if (ayAdi.equalsIgnoreCase("Oktober")){System.out.println(ayAdi + " 10.aydır");}
        else if (ayAdi.equalsIgnoreCase("November")){System.out.println(ayAdi + " 11.aydır");}
        else if (ayAdi.equalsIgnoreCase("December")){System.out.println(ayAdi + " 12.aydır");}
        else System.out.println("Hatalı giriş. Lütfen geçerli bir ay ismi giriniz.");
    }
}

// Burada equalsIgnoreCase metodunu kullandık. Bu, küçük büyük harf uyumsuzlığunu dikkate almaz.
// Yani, "April" yerine aPrIl yazılsa sorun olmaz demektir.
