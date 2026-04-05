// Parent Class (Superclass)
public class Pengiriman {
    protected String resi;
    protected String namaBarang;
    protected float beratBarang;
    protected int biayaPengiriman;

    public Pengiriman(String resi, String namaBarang, float beratBarang, int biayaPengiriman) {
        this.resi = resi;
        this.namaBarang = namaBarang;
        this.beratBarang = beratBarang;
        this.biayaPengiriman = biayaPengiriman;
    }

    public String getResi() {
        return resi;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public float getBeratBarang() {
        return beratBarang;
    }

    public int getBiayaPengiriman() {
        return biayaPengiriman;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setBeratBarang(float beratBarang) {
        this.beratBarang = beratBarang;
    }

    public void setBiayaPengiriman(int biayaPengiriman) {
        this.biayaPengiriman = biayaPengiriman;
    }


    public String getTipe() {
        return "Pengiriman";
    }
}