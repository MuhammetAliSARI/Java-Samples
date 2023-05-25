package horonaga.Metodhs.ArraysLists;

public class ArrayList_IcIce {
    public static void main(String[] args) {
        int arr[][] = {{9, 14, 1}, {16, -22, 3}};
        System.out.println(m(arr)); // Mesela burada arr'nin yanında    [1] yazsaydı (arr[1]),  o zaman {16, -22, 3} index alanını kastediyor olurdu.
                                                                    //  [1][0] yazsaydı (arr[1][0]], o zaman 16'i kastediyor olurdu.
                                                                    //  ayrıntıya gimediği için tamamını kastediyor:  {{9, 14, 1}, {16, -22, 3}}
    }
    public static int m(int[][] m) {
        int sonuc = 3;                                   // Bu değer 1 defa okunduktan sonra bir daha bu satıra dönülmez. İşlem for döngüsü içinde hallolacak
        for (int i = 1; i < m.length;  i++) {            // i eğer m metodunun uzunlu(2)ndan küçükse içeriye gir
            for (int k = 0;  k <  m[i].length;k++) {     // m'nin 1. index uzunluğu 3'tür. O zaman k küçük ise 3'ten, içeri gir
                sonuc   +=    m [i] [k] ;                // i, 1 ile başlatılmıştı. Yani sonuc ilkinde = [1][0] Yani 16
                                                         // Bu arada sonuc'un ilk değeri 3 idi. Bunu da unutmamak lazım. 16+3 = 19
                                                         // Şimdi k'yı 1 artırarak devam et
                                                         // k, ++ ile 1 artırılıp 1 yapılmış oldu. m hala daha 3. Dolayısıyla ikinci turda 1<3 sorgulanacak
                                                         // Sorgulama doğru olduğu için    sonuc += m [i] [k]    satırı tekrar çalışacak
                                                         // Yani    sonuc += [1][1]  işlemi yapılacak. Bu da -22'dir.
                                                         // 22, bir önceki sonuc'a ilave dilecek : -22+19 = -3
                                                         // k, ++ ile 1 artırılıp 2 yapılmış oldu. m hala daha 3. Dolayısıyla ikinci turda 2<3 sorgulanacak
                                                         // Sorgulama doğru olduğu için    sonuc += m [i] [k]    satırı tekrar çalışacak
                                                         // Yani    sonuc += [1][2]  işlemi yapılacak. Bu da 3'tür.
                                                         // 3, bir önceki sonuc'a ilave ediecek : 3 + (-3) = 0
                                                         // k, ++ ile 1 artırılıp 3 yapılmış oldu. m hala daha 3. Fakat 3<3 sorgusu sağlanamadığı için loop kırılıyor.
                                                         // Program bizi }'e atar. Bu da devamındaki komutu çalıştırır. Bu satır da bizi bir üst for döngüsüne gönderir.
                                                         // i, 1 ile bir dafa dönerken ++ ile 1 arttı ve 2 oldu.
                                                         // Fakat şimdi 2 değeri < m.length değeri (2) karşısında looptan çıkmak zorunda kalıyor. Çünkü sağlanmıyor.
            }
        }
        return sonuc;
    }
}
