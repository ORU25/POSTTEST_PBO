public class Pengiriman {
    private String resi;
    private String namaBarang;
    private float beratBarang;
    private int biayaPengiriman;

    Pengiriman( String resi, String namaBarang, float beratBarang, int biayaPengiriman){
        this.resi = resi;
        this.namaBarang = namaBarang;
        this.beratBarang = beratBarang;
        this.biayaPengiriman = biayaPengiriman;
    }

    String getResi() {
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
}