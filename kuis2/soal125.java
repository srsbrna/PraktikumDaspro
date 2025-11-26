
import java.util.Scanner;

//Sarah Sabrina K (25/254106070085)

public class soal125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: "); //input jumlah mahasiswa
        int n = sc.nextInt();

        int[] nilai = new int[n];

        System.out.println("\n== Input Nilai Mahasiswa =="); //input nilai mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": "); //menampilkan mahasiswa
            nilai[i] = sc.nextInt();
        }

        int total = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < n; i++) { //menghitung nilai mahasiswa untuk menentukan lulus tidaknya 
            total += nilai[i];
            if (nilai[i] >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        double rataRata = total / (double) n;
        //menampilkan output
        System.out.println("\n== HASIL ==");
        System.out.println("Nilai yang diinput:");
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilai[i]);
        }

        System.out.printf("\nRata-rata nilai: %.2f\n", rataRata);
        System.out.println("Jumlah lulus      : " + lulus);
        System.out.println("Jumlah tidak lulus: " + tidakLulus);

        sc.close();
    }
}
