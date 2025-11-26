
import java.util.Scanner;

//Sarah Sabrina K (25/254106070085)

public class soal225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nama = {"Pensil", "Pulpen", "Buku", "Penghapus", "Penggaris"}; //memasukkan nama barang
        int[] harga = {2000, 3000, 5000, 1500, 2500}; //memasukkan harga barang

        System.out.println("=== Daftar Barang Toko ==="); //menampilkan daftar barang
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " - Rp " + harga[i]);
        }

        System.out.print("\nMasukkan nama barang yang dicari: "); //meminta user menginput barang yang dicari
        String cari = sc.nextLine(); 

        int index = -1; //mencari barang dalam daftar
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(cari)) {
                index = i;
                break;
            }
        }

        // Hasil
        if (index != -1) { //menampilkan barang yang dicari
            System.out.println("Barang ditemukan!");
            System.out.println("Nama : " + nama[index]);
            System.out.println("Harga: Rp " + harga[index]);
        } else {
            System.out.println("Barang tidak tersedia di toko.");
        }

        sc.close();
    }
}
