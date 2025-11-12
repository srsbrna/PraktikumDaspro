import java.util.Scanner;

public class siakad25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah siswa: ");
        int siswa = sc.nextInt();
        System.out.println("Masukkan jumlah mata kuliah: ");
        int matkul = sc.nextInt();

        int[][] nilai = new int[siswa][matkul];
        
        for (int i = 0; i < siswa; i++){
            System.out.println("\nInput nilai mahasiswa ke-" + (i+1));
            for (int j = 0; j < matkul; j++){
                System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n==================================");
        System.out.println("Rata-rata Nilai Siswa");

        for (int i = 0; i < siswa; i++){
            int total = 0;
            for (int j = 0; j < matkul; j++) total += nilai[i][j] ;
            System.out.println("Siswa ke-" + (i+1) + ": " + total / matkul);
        }

        System.out.println("\nRata-rata nilai per mata kuliah: ");
        for (int j = 0; j < matkul; j++){
            int total = 0;
            for (int i = 0; i < siswa; i++) total += nilai[i][j];
            System.out.println("Mata kuliah ke-" + (j+1) + ": " + (total / siswa));
        }
        
        sc.close();
    }
}
