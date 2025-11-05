
import java.util.Scanner;

public class kelolaNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan banyaknya nilai: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke- " + (i+1) + " : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];
        }

        System.out.println("\nDaftar Nilai Mahasiswa: ");
        for (int i = 0; i < n; i++) {
            System.out.println(nilai[i]);
        }

        double rata2 = (double) total / n;
        System.out.println("\nRata-rata nilai : " + rata2);
        System.out.println("Nilai tertinggi : " + max);
        System.out.println("Nilai terendah : " + min);
    }
}
