package horonaga.Proje_Ve_Odevler.Method_Object;

public class Icerik {
    private String Mevsim;
    private String kursAdi;
    private int notOrtalamasi;
    private int ogrenciNumarasi;
    public Icerik() {
    }
    public Icerik(String mevsim, String kursAdi, int notOrtalamasi, int ogrenciNumarasi) {
        Mevsim = mevsim;
        this.kursAdi = kursAdi;
        this.notOrtalamasi = notOrtalamasi;
        this.ogrenciNumarasi = ogrenciNumarasi;
    }
    public String getMevsim() {
        return Mevsim;
    }
    public void setMevsim(String mevsim) {
        Mevsim = mevsim;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void setKursAdi(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public int getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(int notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    public int getOgrenciNumarasi() {
        return ogrenciNumarasi;
    }

    public void setOgrenciNumarasi(int ogrenciNumarasi) {
        this.ogrenciNumarasi = ogrenciNumarasi;
    }
    @Override
    public String toString() {
        return "Kurs: Mevsim=" + Mevsim + ", kursAdi=" + kursAdi + ", notOrtalamasi=" + notOrtalamasi
                + ", ogrenciNumarasi=" + ogrenciNumarasi;
    }
}
