import java.util.Scanner;

public class surveikepuasan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[10][6];

        System.out.println("=== Input Data Survei Kepuasan Pelanggan ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nResponden ke-" + (i+1));
            for (int j = 0; j < 6; j++){
                int inputNilai;
                do {
                    System.out.print("Masukkan nilai pertanyaan ke-" + (j+1) + "(1-5): ");
                    inputNilai = sc.nextInt();

                    if (inputNilai < 1 || inputNilai > 5) {
                        System.out.println("Nilai tidak valid! Masukkan nilai antara 1 sampai 5!");
                    }
                } while (inputNilai < 1 || inputNilai > 5);

                nilai[i][j] = inputNilai;
            }
        }

        double[] rataResonden = new double[10];
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j  < 6; j++) {
                total += nilai[i][j];
            }
            rataResonden[i] = (double) total / 6;
        }

        double[] rataPertanyaan = new double[6];
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += nilai[i][j];
            }
            rataPertanyaan[j] = (double) total / 10;
        }

        int totAll = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totAll += nilai[i][j];
            }
        }

        double rataAll = (double) totAll / (10*6);

        System.out.println("\n=== HASIL SURVEI ===");
        System.out.println("Rata-rata per responden:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i+1) + ": " + rataResonden[i]);
        }

        System.out.println("\nRata-rata per pertanyaan:");
        for (int j = 0; j < 6; j++) {
            System.out.println("Pertanyaan " + (j+1) + ": " + rataPertanyaan[j]);
        }

        System.out.printf("\nRata-rata keseluruhan: %.2f\n", rataAll);

        sc.close();
    }
}
