import java.util.Scanner;
public class ifCetakKRS25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        pesan = (uktLunas) ? "Pembayaran terverifikasi, silahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
        //if (uktLunas) {
        //    System.out.println("Pembayaran UKT terverifikasi");
        //    System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        //}  else {
        //    System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        //}
    }
}