import java.util.Scanner;

public class ifelseCetakKRS25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("Cetak KRS Semester 1");
            } else if (semester == 2) {
            System.out.println("Cetak KRS Semester 2");
            } else if (semester == 3) {
            System.out.println("Cetak KRS Semester 3");
            } else if (semester == 4) {
            System.out.println("Cetak KRS Semester 4");
            } else if (semester == 4) {
            System.out.println("Cetak KRS Semester 5");
            } else if (semester == 4) {
            System.out.println("Cetak KRS Semester 6");
            } else if (semester == 4) {
            System.out.println("Cetak KRS Semester 7");
            } else if (semester == 4) {
            System.out.println("Cetak KRS Semester 8");       
            } else {
            System.out.println("Semester tidak valid.");
        }
}
