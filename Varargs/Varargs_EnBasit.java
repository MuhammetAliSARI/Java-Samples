package horonaga.Metodhs.Varargs;
//Istediginiz sayida sayiyi toplamak icin bir method olusturunuz
public class Varargs_EnBasit {
    public static void main(String[] args) {
        add(4, 5, 6, 7, 8, 9);
    }
    public static void add(int ... a){      // Varargs Nasıl oluşturulur:
                                            // Data tipini yazıyoruz. Mesela             int
                                            // Sonra üç tane nokta                       ...
                                            // Sonra da bir isim veriyoruz. Mesela       a
        int sum = 0;

        for(int w : a){
            sum = sum + w;
        }

        System.out.println(sum);

    }
}

/*
    -   Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar.
    -   Method'un parantezleri icine yazilanlara "parametre" denir.     sayilar(inta, intb){  gibi...
    -   Method'u cagirirken kullanilan sayilara da "argument" denir.    add(4, 5, 6, 7, 8, 9); gibi...
    -   Varagslar dipsiz kuyu gibidir.
    -   Bir metodda 1'den fazla varargs parametre kullanılamaz.
    -   "Varargs", Varargas disindaki parametrelerle kullanilabilir ama "Varargs" her zaman "son parametre" olmalidir.
    -   Varargs her zaman son parametre olmalıdır.
 */
