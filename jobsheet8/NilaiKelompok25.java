
import java.util.Scanner;

public class NilaiKelompok25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int JumlahKelompok = 6;
        final int JumlahPenilai = 5;

        double rataNilai;
        int kelompok = 1;
        double bestRata = 1;
        int bestKel = -1;

        while (kelompok <= JumlahKelompok) {
            int totalNilai = 0;
            System.out.println("Masukkan nilai untuk kelompok ke- " + kelompok  + ": ");
            for (int j = 1; j <= JumlahPenilai; j++) {
                System.out.println(" Nilai penilai ke-" + j + " = ");
                int nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = (double) totalNilai / JumlahPenilai;
            System.out.printf("Rata-rata kelompok %d = %.2f%n", kelompok, rataNilai);

            if (rataNilai > bestRata) {
                bestRata = rataNilai;
                bestKel = kelompok;
            }
            kelompok++;
        }

        System.out.println("Kelompok dengan rata-rata tertinggi : Kelompok " + bestKel + " (rata-rata = " + String.format("%.2f", bestRata) + ")");
        
        sc.close();
    }
    
}
