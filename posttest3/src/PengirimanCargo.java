public class PengirimanCargo extends Pengiriman {
    private double volume;  

    public PengirimanCargo(String resi, String namaBarang, float beratBarang, int biayaPengiriman, double volume) {
        super(resi, namaBarang, beratBarang, biayaPengiriman);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String getTipe() {
        return "Pengiriman Cargo";
    }
}
