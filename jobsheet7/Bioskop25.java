
import java.util.Scanner;

public class Bioskop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaTiket = 50000;
        int jumlahTiket;
        double total = 0;

        while (true) {
            System.out.println("Masukkan jumlah tiket yang dibeli (0 untuk berhenti): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
        
            if (jumlahTiket < 0) {
            System.out.println("Jumlah tiket tidak valid! Masukkan ulang.");
            continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            totalHarga -= totalHarga * diskon;

            System.out.println("Total harga: Rp " + totalHarga);
            total += totalHarga;
        }
        System.out.println("Total harga: Rp " + total);
        
    }
}

