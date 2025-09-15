/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarsc;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Belajarsc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int paketmakanan;

Scanner in = new Scanner (System.in);
System.out.print("Pilihan : \n 1. paket ayam Rp.15.000 \n 2. paket ikan Rp.20.000 \n 3. paket daging Rp.30.000 \n 4. paket sayur Rp.10.000 \n\n Masukan pilihan :");
paketmakanan = in.nextInt();
switch (paketmakanan){
case 1:
                System.out.println("Paket Ayam dengan Harga Rp.15.000");
                break;
            case 2:
                System.out.println("Paket Ikan dengan Harga Rp.20.000");
                break;
            case 3:
                System.out.println("Paket Daging dengan Harga Rp.30.000");
                System.out.print("Berapa paket daging yang ingin dibeli? ");
                int jumlah = in.nextInt();
                if (jumlah >= 3) {
                    System.out.println("Anda mendapatkan potongan sebesar Rp.5.000");
                    int total = 30_000 * jumlah - 5_000;
                    System.out.println("Total harga setelah potongan: Rp." + total);
                } else {
                    int total = 30_000 * jumlah - 5_000;
                  
                    System.out.println("Total harga: Rp." + total);
                }
                break;
            case 4:
                System.out.println("Paket Sayur dengan Harga Rp.10.000");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
}
   }
}
