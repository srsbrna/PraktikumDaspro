import java.util.Scanner;

public class searchNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen: ");
        int n = sc.nextInt();

        int[] arrNilai = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa nilai mahasiswa ke- " + (i+1) + ": ");
            arrNilai[i] = sc.nextInt(); 
        }

        System.out.println("Masukkan nilai yang dicari: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arrNilai[i] == key) {
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke- " + (i+1));
                found = true;
                break;
            }
        }
    }
}
