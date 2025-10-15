package UTS_DASPRO;

import java.util.Scanner;

public class studikasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //memanggil scanner untuk menerima input user
        System.out.println("=== KALKULATOR BMI (Body Mass Index) ===");
        //menginput data tinggi dan berat dari user
        System.out.println("Masukkan berat badan (kg) : ");
        double beratBadan = sc.nextDouble();
        System.out.println("Masukkan tinggi badan (m) : ");
        double tinggiBadan = sc.nextDouble();

        double BMI = beratBadan / (tinggiBadan*tinggiBadan); //menghitung bmi dari data yang diinput user

        //menentukan kategori dan risiko yang akan terjadi
        String kategori; 
        String risiko;

        //melakukan pengecekan syarat-syarat dan mengoutputkan string berdasarkan syarat dan data yang telah ditentukan
            kategori = "Kurang berat badan (underweighth)";
        if (BMI < 18.5) { 
            risiko = "Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.";
        } else if (BMI >= 18.5 && BMI < 25) {
            kategori = "Berat badan normal (Normal weight)";
            risiko = "Risiko kesehatan relatif rendah.";
        } else if (BMI >=25 && BMI < 30) {
            kategori = "Kelebihan berat badan (Overweight)";
            risiko = "Meningkatnya risiko penyakit jantung, diabetes, tekanan darah tinggi.";
        } else {
            kategori = "Obesitas (Obese)";
            risiko = "Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, dan beberapa jenis kanker.";
        }

        //mengoutputkan semua hasil
        System.out.println("\\n=== HASIL PERHITUNGAN BMI ===");
        System.out.printf("Niilai BMI: %.2f%n", BMI);
        System.out.println("Kategori BMI:" + kategori);
        System.out.println("Risiko Kesehatan: " +risiko);
        sc.close();
    }
}
