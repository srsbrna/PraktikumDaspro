import java.util.Scanner;

public class CM2Magang25 {
    static Scanner sc = new Scanner(System.in);

    static String[][] dataMagang = new String[100][6]; //array untuk menyimpan data
    static int jumlahData = 0; //menyimpan jumlah data yang sudah di masukkan

    public static void main(String[] args) {
        int pilih; //menyimpann pilihan dari user

        do {
            tampilMenu(); //menampilkan menu

            System.out.println("Pilih menu (1-5): ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) { //percabangan berdasarkan menu
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    cariBerdasarProdi();
                    break;
                case 4:
                    hitungJumlahStatus();
                    break;
                case 5:
                    System.out.println("Keluar...");;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5); //perulangan berhenti jika pilih 5
    }

    static void tampilMenu() {//fungsi untuk menampilkan menu
        System.out.println("\n==== Sistem Pendaftaran Magang Mahasiswa ====");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar Magang");
        System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
        System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
        System.out.println("5. Keluar");
    }

     static void tambahData() { //fungsi untuk menambahkan data baru
        System.out.println("\n=== Sistem Pendaftaran Magang Mahasiswa ===");

        System.out.print("Nama Mahasiswa: ");
        dataMagang[jumlahData][0] = sc.nextLine();

        System.out.print("NIM: ");
        dataMagang[jumlahData][1] = sc.nextLine();

        System.out.print("Program Studi: ");
        dataMagang[jumlahData][2] = sc.nextLine();

        System.out.print("Perusahaan Tujuan Magang: ");
        dataMagang[jumlahData][3] = sc.nextLine();

        String semester;
        do {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            semester = sc.nextLine();
        } while (!semester.equals("6") && !semester.equals("7"));
        dataMagang[jumlahData][4] = semester;

        String status;
        do {
            System.out.print("Status magang (Diterima / Menunggu / Ditolak): ");
            status = sc.nextLine();
        } while (!status.equalsIgnoreCase("Diterima")
              && !status.equalsIgnoreCase("Menunggu")
              && !status.equalsIgnoreCase("Ditolak"));

        dataMagang[jumlahData][5] = status; //menyimpan status
        jumlahData++;

        System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " + jumlahData);
    }


    static void tampilData() { //fungsi untuk menampilkan data berdasarkan prodi
        System.out.println("\n== Sistem Pendaftaran Magang Mahasiswa ==");
        System.out.print("Masukkan Program Studi: ");
        String cari = sc.nextLine(); //meminta user untuk memasukkan prodi yang akan di cari

        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-15s | %-10s | %-15s | %-20s | %-8s | %-10s |\n",
        "No", "Nama", "NIM", "Prodi", "Perusahaan", "Semester", "Status");
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        int no = 1;
        for (int i  = 0; i < jumlahData; i++) { //perulangan untuk semua data
            if (dataMagang[i][2].equalsIgnoreCase(cari)) { //filter berdasarkan prodi
            System.out.printf("%-3d %-15s %-12s %-20s %-25s %-9s %-10s\n",
                    no++,
                    dataMagang[i][0],
                    dataMagang[i][1],
                    dataMagang[i][2],
                    dataMagang[i][3],
                    dataMagang[i][4],
                    dataMagang[i][5]);
            }
        }
    }

    static void cariBerdasarProdi() { //fungsi untuk menjalankan pencarian
        tampilData(); //memanggil fungsi
    }

    static void hitungJumlahStatus() { //fungsi untuk menghitung jumlah status
        int diterima = 0, menunggu = 0, ditolak = 0;

        for (int i = 0; i < jumlahData; i++) { //perulangan seluruh data
            if (dataMagang[i][5].equalsIgnoreCase("Diterima")) {
                diterima++;
            } else if (dataMagang[i][5].equalsIgnoreCase("Menunggu")) {
                menunggu++;
            } else if (dataMagang[i][5].equalsIgnoreCase("Ditolak")) {
                ditolak++;
            }
        }
        //menampilkan hasil penghitungan
        System.out.println("\nDiterima : " + diterima);
        System.out.println("Menunggu : " + menunggu);
        System.out.println("Ditolak  : " + ditolak);
        System.out.println("Total    : " + jumlahData);
    }
}