import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void showMenu(){
        System.out.println("Sistem Pengiriman Kargo ");
        System.out.println("1. Tambah Pengiriman ");
        System.out.println("2. Tampilkan Daftar Pengiriman ");
        System.out.println("3. Update Pengiriman ");
        System.out.println("4. Hapus Pengiriman ");
        System.out.println("5. Keluar");
        System.out.print("Pilih (1-5): ");
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
                    System.out.print("Masukkan Nama Barang: ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Masukkan Berat Barang (kg): ");
                    float beratBarang = scanner.nextFloat();
                    System.out.print("Masukkan Biaya Pengiriman: ");
                    int biayaPengiriman = scanner.nextInt();
                    String noResi = "RESI-" + (pengirimanList.size() + 1);
                    pengirimanList.add(new Pengiriman(noResi, namaBarang, beratBarang, biayaPengiriman));
                    System.out.println("Pengiriman berhasil ditambahkan!");
                    break;
                case 2:
                    if (pengirimanList.isEmpty()) {
                        System.out.println("Tidak ada data pengiriman.");
                    } else {
                        System.out.println("Data pengiriman:");
                        System.out.println("========================================");
                        for (Pengiriman pengiriman : pengirimanList) {
                            System.out.println("No. Resi    :" + pengiriman.getResi());
                            System.out.println("Nama Barang :" + pengiriman.getNamaBarang());
                            System.out.println("Berat       :" + pengiriman.getBeratBarang());
                            System.out.println("Biaya       :" + pengiriman.getBiayaPengiriman());
                            System.out.println("========================================");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan No. Resi Kargo yang ingin diubah: ");
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

                            System.out.println("Data Pengiriman berhasil diubah!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No. Resi Kargo tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan No. Resi  yang ingin dihapus: ");
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
                    System.out.println("Program keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}