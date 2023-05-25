package horonaga.HaftanınGunleri;

public enum HaftaninGunleri {
    Pazartesi("1","Pt","Pazartesi"),

    Sali("1","Sl","Salı"),

    Carsamba("2","Ça","Çarşamba"),

    Persembe("3","Pe","Perşembe"),

    Cuma("4","Cu","uma"),

    Cumartesi("6","Ct","Cumartesi"),

    Pazar("7","Pa","Pazar");

    private final String gunSayisi;
    private final String kisaltma;
    private final String gunAdi;

    HaftaninGunleri(String gunSayisi, String kisaltma, String gunAdi) {
        this.gunSayisi = gunSayisi;
        this.kisaltma = kisaltma;
        this.gunAdi = gunAdi;
    }

    public String getGunSayisi() { return gunSayisi;}

    public String getKisaltma() {
        return kisaltma;
    }

    public String getGunAdi() {
        return gunAdi;
    }
}
