
import java.util.Scanner;

public class BioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[][] penonton = new String[4][2];
        int menu;

        do { 
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1){
                System.out.print("Masukkan nama penonton: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan nomor baris (0-3): ");
                int baris = sc.nextInt();
                System.out.println("Masukkan nomor kolom (0-1): ");
                int kolom = sc.nextInt();
                sc.nextLine();
                penonton[baris][kolom] = nama;
            } else if (menu == 2){
                System.out.println("Daftar Penonton: ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        } while (menu != 3);

        
        sc.close();
    }
}
