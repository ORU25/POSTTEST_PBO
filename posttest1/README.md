# LAPORAN POSTTEST 1

Proyek ini adalah system aplikasi manajeman pengiriman kargo menggunakan bahasa Java dengan konsep Object Orientation Programming (OOP)

## Identitas

Nama: Muhammad Haykal Makhmud
<br>
NIM: 2409106005

## Deskripsi Program

Program ini merupakan sistem manajemen pengiriman kargo yang dibuat menggunakan bahasa pemrograman Java dengan menerapkan konsep Object-Oriented Programming (OOP). Program ini dirancang untuk mengelola data pengiriman barang dengan operasi Create, Read, Update, dan Delete (CRUD).

**Fitur Utama:**

- Menggunakan class `Pengiriman` untuk menyimpan data setiap pengiriman
- Menyimpan semua data pengiriman dalam `ArrayList`
- Setiap pengiriman memiliki data: nomor resi, nama barang, berat barang (kg), dan biaya pengiriman (Rp)
- Nomor resi dibuat secara otomatis dengan format "RESI-X" (X adalah nomor urut)
- Dapat mencari dan mengubah data berdasarkan nomor resi

## Alur Program

### 1. Menu Utama

Pada menu utama, pengguna akan disajikan 5 pilihan menu:

- Pilihan 1: Tambah Data Pengiriman
- Pilihan 2: Lihat Semua Data Pengiriman
- Pilihan 3: Update Data Pengiriman
- Pilihan 4: Hapus Data Pengiriman
- Pilihan 5: Keluar dari Program

![Menu Pilihan](assets/menu.png)

### 2. Tambah Data Pengiriman (Create)

Jika memilih pilihan 1, pengguna dapat menambahkan data pengiriman baru dengan memasukkan nama barang, berat barang dan biaya pengiriman

![Tambah Data](assets/create.png)

### 3. Lihat Semua Data Pengiriman (Read)

Jika memilih pilihan 2, sistem akan menampilkan seluruh data pengiriman yang telah disimpan. Pengguna dapat melihat daftar lengkap semua pengiriman yang sudah ditambahkan

![Lihat Data](assets/read.png)

### 4. Update Data Pengiriman (Update)

Jika memilih pilihan 3, pengguna dapat memilih data pengiriman yang ingin diubah dengan memasukkan no resi yang ingin diubah. Setelah resi ditemukan, pengguna dapat mengubah informasi pengiriman yang sudah ada dengan data yang baru

![Update Data](assets/update.png)

![Update Data - Read](assets/updateRead.png)

### 5. Hapus Data Pengiriman (Delete)

Jika memilih pilihan 4, pengguna dapat memilih data pengiriman yang ingin dihapus dari sistem dengan memasukkan no resi yang ingin dihapus

![Hapus Data](assets/delete.png)

Setelah data dihapus, pengguna bisa kembali menampilkan data yang tersisa untuk konfirmasi bahwa data telah berhasil dihapus dengan kembali ke pilihan 2.

![Hapus Data - Read](assets/deleteRead.png)

### 6. Keluar dari Program

Jika memilih pilihan 5, program akan berhenti dan keluar dari aplikasi manajemen pengiriman kargo.
