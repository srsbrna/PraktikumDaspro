package Jobsheet12;

import java.util.Scanner;

public class kafe25 {
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!!");
    
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp15.000");
        System.out.println("2. Cappuccino - Rp20.000");
        System.out.println("3. Latte - Rp22.000");
        System.out.println("5. Roti Bakar - Rp10.000");
        System.out.println("6. Mie Goreng - Rp18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");

        System.out.println("\n=== Kode Promo ===");

        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Kode promo valid!, anda mendapatkan diskon 50%.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Kode promo valid!, anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo tidak valid!");
        }
        System.out.println("============================\n");
    }

    public static int hitungTotalHarga25(int pilihanMenu, int banyakPesanan){

        int[] hargaMenu = {0, 15000, 20000, 22000, 10000, 18000};

        if (pilihanMenu < 1 || pilihanMenu > 5) {
            System.out.println("Pilihan menu tidak valid!");
            return 0;
        }

        int total = hargaMenu[pilihanMenu] * banyakPesanan;
        return total;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu("Andi", true, "DISKON30");

        System.out.println("Masukkan nomor menu yang dipilih: ");
        int pilihan = sc.nextInt();

        System.out.println("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();

        int totalBayar = hitungTotalHarga25(pilihan, jumlah);

        System.out.println("\nTotal yang harus dibayar: Rp" + totalBayar);
    }
}
