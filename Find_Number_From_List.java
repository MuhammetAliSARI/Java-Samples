// Find Number from List
// İstenilen sayıyı, verilen liste içinde ara
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sayilar = new int[]{1,2,5,7,9,7,0};
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        int sorgula = 0;

        for (int bul : sayilar){
            if(bul == sayi){
                sorgula = sorgula + 1;

            }
        }
        if (sorgula > 0){
            System.out.println(sayi + " rakamı "+ sorgula + " adet mevcut" );
        }else{
            System.out.println(sayi + " rakamı mevcut değil");
        }


    }
