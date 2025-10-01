import java.util.Scanner;

public class Tugas3_sistemwifikampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("\n=== Sistem WiFi Kampus ===");
        sc.nextLine(); 
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lain): ");
        String jenisPengguna = sc.nextLine().trim();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            int jumlahSKS = sc.nextInt();

            if (jumlahSKS >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }

        sc.close();
    }
}
