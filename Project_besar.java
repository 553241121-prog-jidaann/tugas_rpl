/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_besar;

import java.util.Scanner;

public class Project_besar {

    // Fungsi untuk format angka ke format Rp dengan titik sebagai pemisah ribuan
    public static String formatRupiah(int angka) {
        String angkaStr = Integer.toString(angka);
        StringBuilder sb = new StringBuilder();
        int len = angkaStr.length();
        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            sb.insert(0, angkaStr.charAt(i));
            count++;
            if (count == 3 && i != 0) {
                sb.insert(0, '.');
                count = 0;
            }
        }
        return "Rp. " + sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalHarga = 0;
        int totalPorsi = 0;
        StringBuilder daftarPesanan = new StringBuilder();

        while (true) {
            System.out.println("\n--- Daftar Paket Makanan ---");
            System.out.println("1. Paket Ayam - Rp. 15.000");
            System.out.println("2. Paket Ikan - Rp. 20.000");
            System.out.println("3. Paket Daging - Rp. 30.000 (diskon Rp. 5.000)");
            System.out.println("4. Paket Sayur - Rp. 10.000");
            System.out.println("0. Selesai dan Tampilkan Tagihan");

            System.out.print("Masukkan pilihan paket (0-4): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                break;
            }

            String namaPaket = "";
            int hargaSatuan = 0;

            switch (pilihan) {
                case 1:
                    namaPaket = "Paket Ayam";
                    hargaSatuan = 15000;
                    break;
                case 2:
                    namaPaket = "Paket Ikan";
                    hargaSatuan = 20000;
                    break;
                case 3:
                    namaPaket = "Paket Daging";
                    hargaSatuan = 30000 - 5000; // diskon langsung diterapkan
                    break;
                case 4:
                    namaPaket = "Paket Sayur";
                    hargaSatuan = 10000;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    continue;
            }

            int porsi;
            do {
                System.out.print("Masukkan jumlah porsi untuk " + namaPaket + ": ");
                porsi = scanner.nextInt();
                if (porsi <= 0) {
                    System.out.println("Jumlah porsi harus lebih dari 0.");
                }
            } while (porsi <= 0);

            int subtotal = hargaSatuan * porsi;
            totalHarga += subtotal;
            totalPorsi += porsi;

            daftarPesanan.append(namaPaket)
                         .append(" x")
                         .append(porsi)
                         .append(" = ")
                         .append(formatRupiah(subtotal))
                         .append("\n");

            System.out.println("Pesanan ditambahkan: " + namaPaket + " sebanyak " + porsi + " porsi.");
            System.out.println("Subtotal: " + formatRupiah(subtotal));
        }

        System.out.println("\n=== Ringkasan Pesanan ===");
        System.out.print(daftarPesanan.toString());
        System.out.println("Jumlah total porsi: " + totalPorsi);
        System.out.println("Total harga yang harus dibayar: " + formatRupiah(totalHarga));

        scanner.close();
    }
}

