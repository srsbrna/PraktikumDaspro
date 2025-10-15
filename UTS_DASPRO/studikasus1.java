package UTS_DASPRO;

import java.util.Scanner;

public class studikasus1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); //memanggil scanner untuk input user
        double a;
        double b;
        double c;

        System.out.println("=== Menentukan Bilangan Terbesar dari tiga angka === ");
        //memasukkan data user
        System.out.println("Masukkan angka pertama: ");
        a = sc.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        b = sc.nextDouble();
        System.out.println("Masukkan angka ketiga: ");
        c = sc.nextDouble();

        //menentukan angka terbesar dari input user
        double terbesar = a;

        if (b > terbesar) {
            terbesar = b;
        }
        if (c > terbesar) {
            terbesar = c;
        }  

        //menentukan jika ada angka yang sama
        if (a == b && b == c) {
            System.out.println("\nKetiga angka sama besar yaitu " + terbesar);
        } else if ((a == terbesar && b == terbesar) ||
                    (a == terbesar && c == terbesar) ||
                    (b == terbesar && c == terbesar)) {
                        System.out.println("\nAda dua angka terbesar dengan nilai yang sama yaitu " + terbesar);
                    } else {
                        System.out.println("\nAngka terbesar adalah " + terbesar);
                    }
                    sc.close();
        }
}
