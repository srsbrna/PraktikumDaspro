
import java.util.Scanner;

public class CoffeeShop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah  cabang = ");
        int jumlahCabang = sc.nextInt();

        int totPelanggan = 0;
        int totItem = 0;

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("Cabang ke - " + i + ":");
            System.out.print(" Masukkan jumlah pelanggan hari ini = ");
            int pelanggan = sc.nextInt();
            int totItemCab = 0;

            for (int p = 1; p <= pelanggan; p++) {
                System.out.println(" Jumlah item yang dipesan pelanggan ke - " + p + " = ");
                int item = sc.nextInt();
                totItemCab += item;
            }

            System.out.println("Ringkasan Cabang " + i + ": Pelanggan = " + pelanggan + ", Total item terjual = " + totItemCab);
            totPelanggan += pelanggan;
            totItem += totItemCab;
        }

        System.out.println("TOTAL KESELURUHAN : Pelanggan = " + totPelanggan + ", Total item terjual = " + totItem);

        sc.close();
    }
}
