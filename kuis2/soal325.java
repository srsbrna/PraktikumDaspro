
import java.util.Scanner;

//Sarah Sabrina K (25/254106070085)

public class soal325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: "); //memasukkan jumlah mahasiswa
        int n = sc.nextInt();

        int[][] nilai = new int[n][3];
        char[][] grade = new char[n][3];

        System.out.println("\n== Input Nilai Mahasiswa =="); //memasukkan nilai mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa " + (i+1) + ": ");
            for (int j = 0; j < 3; j++){
                System.out.print(" Nilai matkul "+ (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                grade[i][j] = konversiGrade(nilai[i][j]);
            }
        }

        double[] rataMh = new double[n]; //menghitung rata rata mahasiswa
        for (int i = 0; i < n; i++){
            int tot = 0;
            for (int j = 0; j < 3; j++){
                tot += nilai[i][j];
            }
            rataMh[i] = tot / 3.0;
        }

        double[] rataMt = new double[3]; //menghitung rata rata mata kuliah
        for (int j = 0; j < 3; j++) {
            int tot = 0;
            for (int i = 0; i < n; i++){
                tot += nilai[i][j];
            }
            rataMt[j] = tot / (double)n;
        }
        //menampilkan tabel nilai
        System.out.println("\n========== TABEL NILAI ==========");
        System.out.println("Mahasiswa\tMatkul1\tMatkul2\tMatkul3\tRataRata");
        for (int i = 0; i < n; i++){
            System.out.print((i+1) + "\t");
            for (int j = 0; j < 3; j++){
                System.out.print(nilai[i][j] + "(" + grade[i][j] + ")\t");
            }
            System.out.println(rataMh[i]);
        }
        System.out.println("\nRata-rata Matkul:"); //menampilkan rata rata nilai matkul
        for (int j = 0; j < 3; j++){
            System.out.println("Matkul" + (j+1) + ": " + rataMt[j]);
        }

        double max = rataMt[0]; //menghitung nilai maksimal
        int indexMax = 0;
        for (int j = 0; j < 3; j++){
            if (rataMt[j] > max){
                max = rataMt[j];
                indexMax = j;
            }
        }

        System.out.println("\nMata kuliah dengan rata-rata tertinggi : Matkul" + (indexMax + 1));//menampilkan nilai rata rata tertinggi

        sc.close();
    }

    public static  char konversiGrade(int n){ //mengkonerensi nilai menjadi grade huruf
        if (n >= 85) return 'A';
        else if (n >= 70) return 'B';
        else if (n >= 55) return 'C';
        else if (n >= 40) return 'D';
        else return 'E';
    }
}
