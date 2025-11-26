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
        System.out.println("4. Roti Bakar - Rp10.000");
        System.out.println("5. Mie Goreng - Rp18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");

    }

    public static int hitungTotalHarga25(int pilihanMenu, int banyakPesanan){

        int[] hargaMenu = {0, 15000, 20000, 22000, 10000, 18000};
        return hargaMenu[pilihanMenu] * banyakPesanan;
    }

    public static int hitungDiskon(int totAkhir, String kodePromo) {

        double diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = 0.5 * totAkhir;
            System.out.println("\nKode promo valid! Anda mendapat diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")){
            diskon = 0.3 * totAkhir;
            System.out.println("\node promo valid! Anda mendapat diskon 30%");
        } else {
            System.out.println("\nKode promo tidak valid! Tidak ada diskon.");
        }

        return (int)diskon;
    }

    public static String namaMenu(int nomor) {
        switch (nomor) {
            case 1 : return "Kopi Hitam";
            case 2 : return "Cappuccino";
            case 3 : return "Latte";
            case 4 : return "Roti Bakar";
            case 5 : return "Mie Goreng";
            default: return "Menu tidak dikenali";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu("Andi", true, "DISKON30");

        System.out.println("\nBerapa jenis menu yang ingin di pesan?");
        int jenis = sc.nextInt();

        int[] menuDipilih = new int [jenis];
        int[] jumlahPesanan = new int [jenis];

        int totAkhir = 0;

        for (int i = 0; i < jenis; i++){

            System.out.println("\nPesanan ke-" + (i+1));

            int pilihan;
            do {
                System.out.println("Masukkan nomor menu: ");
                pilihan = sc.nextInt();
                if (pilihan < 1 || pilihan > 5) {
                    System.out.println("Nomor menu tidak valid! Silahkan ulangi.");
                }
            } while (pilihan < 1 || pilihan >5);
            menuDipilih[i] = pilihan;

            int jumlah;
            do { 
                System.out.println("Masukkan jumlah pesanan: ");
                jumlah = sc.nextInt();
                if (jumlah < 1){
                    System.out.println("Jumlah pesanan minimal 1!");
                }
            } while (jumlah < 1);
            jumlahPesanan[i] = jumlah;

            int totMenu1 = hitungTotalHarga25(menuDipilih[i], jumlahPesanan[i]);
            System.out.println("Subtotal pesanan ke-" + (i+1) + ": Rp" + totMenu1);

            totAkhir +=totMenu1;
        }

        System.out.println("Masukkan kode promo: ");
        String kode = sc.next();

        int totDiskon = hitungDiskon(totAkhir, kode);
        int totBayar = totAkhir - totDiskon;

        System.out.println("\n===== MENU YANG DI PESAN =====");
        for (int i = 0; i < jenis; i++){
            int totMenu1 = hitungTotalHarga25(menuDipilih[i], jumlahPesanan[i]);
            System.out.println((i+1) + ". " + namaMenu(menuDipilih[i]) + 
                                " x" + jumlahPesanan[i] +
                                " = Rp" + totMenu1);
        }

        System.out.println("\n===== RINGKASAN PEMBELIAN =====");
        System.out.println("Total hargga sebelum diskon: Rp" + totAkhir);
        System.out.println("Total diskon               : Rp" + totDiskon);
        System.out.println("Total yang harus di bayar  : Rp" + totBayar);
    }
}
