package PraktikumDaspro.jobsheet6;

import java.util.Scanner;

public class CM1_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //=== INPUT DATA MAHASISWA ===
        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Masukkan Nama = "); //masukkan nama mahasiswa
        String Nama = sc.nextLine();
        System.out.print("Masukkan NIM = "); //masukkan nim mahasiswa
        String NIM = sc.nextLine();

        //=== INPUT NILAI MATA KULIAH 1 ===
        System.out.println("\n--- Mata Kuliah 1 ---");
        System.out.print("Nilai UTS Algoritma dan Pemrograman: "); //masukkan nilai uts Algoritma dan Pemrograman
        double utsAlgo = sc.nextDouble();
        System.out.print("Nilai UAS Algoritma dan Pemrograman: "); //masukkan nilai uas Algoritma dan Pemrograman
        double uasAlgo = sc.nextDouble();
        System.out.print("Nilai Tugas Algoritma dan Pemrograman: "); //masukkan nilai tugas Algoritma dan Pemrograman
        double tugasAlgo = sc.nextDouble();

        //menghitung nilai akhir Algoritma dan Pemrograman
        double nilaiAkhirAlgo = (utsAlgo * 0.3) + (uasAlgo * 0.4) + (tugasAlgo * 0.3);

        //menentukan status kelulusan mata kuliah 1
        String statusAlgo;
        if (nilaiAkhirAlgo >= 60) { 
            statusAlgo = "LULUS";
        } else {
            statusAlgo = "TIDAK LULUS";
        }

        //memanggil fungsi untuk mengonversi nilai angka menjadi huruf
        String hurufAlgo = konversiNilai(nilaiAkhirAlgo);

        //=== INPUT NILAI MATA KULIAH 2 ===
        System.out.println("\n--- Mata Kuliah 2 ---");
        System.out.print("Nilai UTS Struktur Data: "); //masukkan nilai uts Struktur Data
        double utsSD = sc.nextDouble();
        System.out.print("Nilai UAS Struktur Data: "); //masukkan nilai uas Struktur Data
        double uasSD = sc.nextDouble();
        System.out.print("Nilai Tugas Struktur Data: "); //masukkan nilai tugas Struktur Data
        double tugasSD = sc.nextDouble();

        //menghitung nilai akhir Struktur Data
        double nilaiAkhirSD = (utsSD * 0.3) + (uasSD * 0.4) + (tugasSD * 0.3);

        //menentukan status kelulusan mata kuliah 2
        String statusSD;
        if (nilaiAkhirSD >= 60) { 
            statusSD = "LULUS";
        } else {
            statusSD = "TIDAK LULUS";
        }

        //memanggil fungsi untuk mengonversi nilai angka menjadi huruf
        String hurufSD = konversiNilai(nilaiAkhirSD);

        //menghitung rata-rata nilai akhir kedua mata kuliah
        double rataRata = (nilaiAkhirAlgo + nilaiAkhirSD) / 2;

        //menentukan status kelulusan semester dengan nested if
        String statusSemester;
        if (statusAlgo.equals("LULUS") && statusSD.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Ada mata kuliah tidak lulus)";
        }

        //=== OUTPUT HASIL KELULUSAN ===
        System.out.println("\n=== HASIL KELULUSAN ===");
        System.out.println("Nama: " + Nama); //menampilkan nama mahasiswa
        System.out.println("NIM: " + NIM); //menampilkan NIM mahasiswa
        System.out.printf("Algoritma dan Pemrograman: %.2f (%s) - %s%n", nilaiAkhirAlgo, hurufAlgo, statusAlgo); //output nilai, huruf, dan status matkul 1
        System.out.printf("Struktur Data: %.2f (%s) - %s%n", nilaiAkhirSD, hurufSD, statusSD); //output nilai, huruf, dan status matkul 2
        System.out.printf("Rata-rata Nilai Akhir: %.2f%n", rataRata); //menampilkan rata-rata nilai akhir
        System.out.println("Status Semester: " + statusSemester); //menampilkan status akhir semester
    }

    //=== FUNGSI UNTUK MENGONVERSI NILAI ANGKA KE HURUF ===
    public static String konversiNilai(double nilai) {
        //mengonversi nilai menjadi huruf A–E sesuai rentang nilai
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 65) {
            return "C";
        } else if (nilai >= 55) {
            return "D";
        } else {
            return "E";
        }
    }
}
