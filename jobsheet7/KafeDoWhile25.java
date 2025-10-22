
import java.util.Scanner;



public class KafeDoWhile25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do { 
            System.out.println("Masukkan nama pelanggan (atau ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. Program selesai.");
                break;
            }
            
            System.out.println("Jumlah kopi yang dibeli: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah teh yang dibeli: ");
            teh = sc.nextInt();
            System.out.println("Jumlah roti yang dibeli: ");
            roti = sc.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga pembelian oleh: " + namaPelanggan + ": Rp " + totalHarga);

            sc.nextLine();
            System.out.println();
        } while (true);
    }
}
