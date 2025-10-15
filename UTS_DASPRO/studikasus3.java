package UTS_DASPRO;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class studikasus3 {
    public static int hitungBonus (double kinerja, double lama, double gaji, String sertifikasi) {
        if (kinerja < 70) { //melakukan pengecekan untuk syarat pertaama apakah memenuhi nilai untuk mendapatkan bonus
            return 0; //kembali ke 0 karena syarat tidak terpenuhi
        }
            double p;

        if (kinerja >= 90) { //melakukan pengecekan syarat kedua untk menentukan tabel persentase yang digunakan
            if (lama < 2) p = 0.02;
            else if (lama < 5) p = 0.04;
            else p = 0.07;
        } else { //melakukan pengecekan dan menjalankan operasi ketika tidak sesuai dengan syarat sebelumnya
            if (lama < 2) p = 0.01;
            else if (lama < 5) p = 0.03;
            else p = 0.05;
        }
        double bonus = p * gaji; //menghitung bonus sebagaii persentase gaji pokok

        if ("ya".equalsIgnoreCase(sertifikasi.trim())) bonus += 500000; //melakukan pengecekan untuk melihat syarat selanjutnya dan menambahkan bonus yang ada ketika memenuhi syarat
        return (int) Math.round(bonus);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //membuat scanner untuk menerima input user

        System.out.println("Nilai Kerja (1-100): ");
        double kinerja = sc.nextDouble();

        System.out.println("Lama bekerja (tahun): ");
        double lama = sc.nextDouble();

        System.out.println("Gaji Pokok (Rp): ");
        double gaji = sc.nextDouble();

        sc.nextLine();
        System.out.println("Sertifikasi (ya/tidak): ");
        String sertifikasi = sc.nextLine();

        int total = hitungBonus(kinerja, lama, gaji, sertifikasi); // menghitung bonus berdassarkan input user

        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID")); //format output untuk memisahkan ribuan
        System.out.println("Total Bonus: Rp" + nf.format(total)); ///menampilkan hasil bonus
        
        sc.close();
    }
}
