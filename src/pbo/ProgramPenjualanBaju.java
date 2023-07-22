package pbo;

import java.util.Scanner;

public class ProgramPenjualanBaju {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahBarang;

        // Input jumlah barang yang akan dijual
        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = input.nextInt();
        input.nextLine();

        Baju[] daftarBarang = new Baju[jumlahBarang];

        // Input data barang dan ukuran
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\nData Barang ke-" + (i + 1));
            System.out.print("Kode Barang: ");
            String kodeBarang = input.nextLine();
            System.out.print("Nama Barang: ");
            String namaBarang = input.nextLine();
            System.out.print("Harga: Rp ");
            int harga = input.nextInt();
            input.nextLine();
            System.out.print("Ukuran: ");
            String ukuran = input.nextLine();

            daftarBarang[i] = new Baju(kodeBarang, namaBarang, harga, ukuran);
        }

        // Tampilkan informasi barang yang telah diinput
        System.out.println("\nDaftar Barang yang dijual:");
        for (int i = 0; i < jumlahBarang; i++) {
            daftarBarang[i].showInfo();
            System.out.println();
        }

        // Hitung total harga
        int totalHarga = 0;
        for (int i = 0; i < jumlahBarang; i++) {
            totalHarga += daftarBarang[i].getHarga();
        }
        System.out.println("Total Harga: Rp " + totalHarga);

        // Error handling jika ada input yang tidak valid
        try {
            // Input pembayaran dari pelanggan
            System.out.print("\nMasukkan jumlah uang yang dibayarkan: Rp ");
            int pembayaran = input.nextInt();

            // Hitung kembalian
            int kembalian = pembayaran - totalHarga;
            if (kembalian >= 0) {
                System.out.println("Kembalian: Rp " + kembalian);
            } else {
                System.out.println("Uang tidak cukup!");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Masukkan angka yang benar.");
        }
    }
}