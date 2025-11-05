
import java.util.Scanner;

public class arrayRataNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();

        int[] nilaiMhs = new int[jml];

        int totalLulus = 0, totalTidak = 0;
        int countLulus = 0, countTidak = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else  {
                totalTidak += nilaiMhs[i];
                countTidak++;
            }
        }

        if (countLulus > 0) {
            double rataLulus = (double) totalLulus / countLulus;
            System.out.println("Rata-rata nilai lulus = " + rataLulus);
        }

        if (countTidak > 0) {
            double rataTidak = (double) totalTidak / countTidak;
            System.out.println("Rata-rata nilai tidak lulus = " +rataTidak);
        }
    }
}
