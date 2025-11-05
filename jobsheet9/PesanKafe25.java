
import java.util.Scanner;

public class PesanKafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jumlah pesanan : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nama  = new String[n];
        int[] harga = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            
            System.out.print("Nama pesanan ke-" + (i+1) + ": ");
            nama[i] = sc.nextLine();
            
            System.out.print("Harga: ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            total += harga[i];
        }

        System.out.println("\nDaftar Pesanan : ");
        for (int i = 0; i < n; i++) {
            System.out.println(nama[i] + " - Rp" + harga[i]);

        }

        System.out.println("\nTotal biaya : Rp" + total);
    }
}
