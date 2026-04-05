public class PengirimanRegular extends Pengiriman {
    private int hariPengiriman;

    public PengirimanRegular(String resi, String namaBarang, float beratBarang, int biayaPengiriman, int hariPengiriman) {
        super(resi, namaBarang, beratBarang, biayaPengiriman);
        this.hariPengiriman = hariPengiriman;
    }

    public int getHariPengiriman() {
        return hariPengiriman;
    }

    public void setHariPengiriman(int hariPengiriman) {
        this.hariPengiriman = hariPengiriman;
    }

    @Override
    public String getTipe() {
        return "Pengiriman Regular";
    }
}
