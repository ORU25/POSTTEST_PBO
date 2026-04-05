import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void showMenu(){
        System.out.println("\nSistem Pengiriman Kargo");
        System.out.println("1. Tambah Pengiriman");
        System.out.println("2. Tampilkan Daftar Pengiriman");
        System.out.println("3. Update Pengiriman ");
        System.out.println("4. Hapus Pengiriman ");
        System.out.println("5. Keluar");
        System.out.print("Pilih (1-5): ");
    }

    public static void showTipePengiriman(){
        System.out.println("\nPilih Tipe Pengiriman");
        System.out.println("1. Pengiriman Regular");
        System.out.println("2. Pengiriman Cargo");
        System.out.print("Pilih (1-2): ");
    }

    public static void main(String[] args) {
        ArrayList<Pengiriman> pengirimanList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int pilihan = 0;
        String resi;
        boolean found = false;

        while(pilihan != 5){
            showMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    showTipePengiriman();
                    int tipe = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Masukkan Nama Barang: ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Masukkan Berat Barang (kg): ");
                    float beratBarang = scanner.nextFloat();
                    System.out.print("Masukkan Biaya Pengiriman: ");
                    int biayaPengiriman = scanner.nextInt();
                    scanner.nextLine();
                    
                    String noResi = "RESI-" + (pengirimanList.size() + 1);
                    
                    if (tipe == 1) {
                        System.out.print("Estimasi hari pengiriman: ");
                        int hari = scanner.nextInt();
                        pengirimanList.add(new PengirimanRegular(noResi, namaBarang, beratBarang, biayaPengiriman, hari));
                        System.out.println("Pengiriman Regular berhasil ditambahkan");
                    } else if (tipe == 2) {
                        System.out.print("Masukkan Volume Cargo (m3): ");
                        double volume = scanner.nextDouble();
                        scanner.nextLine();
                        pengirimanList.add(new PengirimanCargo(noResi, namaBarang, beratBarang, biayaPengiriman, volume));
                        System.out.println("Pengiriman Cargo berhasil ditambahkan");
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }
                    break;
                    
                case 2:
                    if (pengirimanList.isEmpty()) {
                        System.out.println("\nTidak ada data pengiriman.");
                    } else {
                        System.out.println("\nData pengiriman");
                        System.out.println("========================================");
                        for (Pengiriman pengiriman : pengirimanList) {
                            System.out.println("No. Resi    : " + pengiriman.getResi());
                            System.out.println("Tipe        : " + pengiriman.getTipe());
                            System.out.println("Nama Barang : " + pengiriman.getNamaBarang());
                            System.out.println("Berat       : " + pengiriman.getBeratBarang() + " kg");
                            System.out.println("Biaya       : Rp. " + pengiriman.getBiayaPengiriman());
                            
                            if (pengiriman instanceof PengirimanRegular) {
                                PengirimanRegular regular = (PengirimanRegular) pengiriman;
                                System.out.println("Estimasi    : " + regular.getHariPengiriman() + " hari");
                            } else if (pengiriman instanceof PengirimanCargo) {
                                PengirimanCargo cargo = (PengirimanCargo) pengiriman;
                                System.out.println("Volume      : " + cargo.getVolume() + " m3");
                            }
                            System.out.println("=========================================");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan No. Resi yang ingin diubah: ");
                    resi = scanner.nextLine();
                    found = false;
                    for (Pengiriman pengiriman : pengirimanList) {
                        if (pengiriman.getResi().equals(resi)) {
                            System.out.println("Data Pengiriman yang akan diubah: " + pengiriman.getResi());
                            System.out.print("Masukkan Nama Barang: ");
                            pengiriman.setNamaBarang(scanner.nextLine());
                            System.out.print("Masukkan Berat Barang: ");
                            pengiriman.setBeratBarang(scanner.nextFloat());
                            System.out.print("Masukkan Biaya Pengiriman: ");
                            pengiriman.setBiayaPengiriman(scanner.nextInt());
                            scanner.nextLine();
                            
                            if (pengiriman instanceof PengirimanRegular) {
                                PengirimanRegular regular = (PengirimanRegular) pengiriman;
                                System.out.print("Estimasi hari pengiriman baru: ");
                                regular.setHariPengiriman(scanner.nextInt());
                            } else if (pengiriman instanceof PengirimanCargo) {
                                PengirimanCargo cargo = (PengirimanCargo) pengiriman;
                                System.out.print("Volume Cargo baru (m3): ");
                                cargo.setVolume(scanner.nextDouble());
                            }
                            System.out.println("Data Pengiriman berhasil diubah!");
                            found = true;
                            break;
                        }
                    }
                    
                    if (!found) {
                        System.out.println("No. Resi tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan No. Resi yang ingin dihapus: ");
                    resi = scanner.nextLine();
                    found = false;
                    for (Pengiriman pengiriman : pengirimanList) {
                        if (pengiriman.getResi().equals(resi)) {
                            pengirimanList.remove(pengiriman);
                            System.out.println("Pengiriman dengan No. Resi " + resi + " telah dihapus.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No. Resi tidak ditemukan.");
                    }
                    break;
                    
                case 5:
                    System.out.println("Program keluar. Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}