import java.util.Scanner;

public class Parkir25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int jenis, durasi;
        int total = 0;

        do { 
            System.out.println("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Selesai): ");
            jenis = sc.nextInt();

            if (jenis == 0) break;

            System.out.println("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            int biaya = 0;
            if (durasi > 5) {
                biaya = 12500;
            } else if (jenis == 1) {
                biaya = durasi * 3000;
            } else if (jenis == 2) {
                biaya = durasi * 2000;
            }

            System.out.println("Total biaya parkir: Rp " + biaya + "\n");
            total += biaya;
        } while (true);

        System.out.println("Total pemasukan parkir hari ini: Rp " + total);
    }
}
