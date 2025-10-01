import java.util.Scanner;

public class Tugas3_Sistemperpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistem Perpustakaan ===");
        System.out.print("Apakah Anda punya kartu mahasiswa? (true/false): ");
        boolean kartuMahasiswa = sc.nextBoolean();

        System.out.print("Apakah Anda sudah registrasi online? (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();

        if (kartuMahasiswa || registrasiOnline) {
            System.out.println("Boleh Masuk");
        } else {
            System.out.println("Ditolak Masuk");
        }

        sc.close();
    }
}
