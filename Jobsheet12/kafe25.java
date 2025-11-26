package Jobsheet12;

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

    public static void main(String[] args) {
        menu("Andi", true, "DISKON30");
    }
}
