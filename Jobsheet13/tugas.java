import java.util.Scanner;

public class tugas {
    static int totalRekursif(int [] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return arr[n-1] + totalRekursif(arr, n - 1);
        }
    }

    static int totalIteratif(int[] arr, int n) {
        int total = 0;
        for (int i = 0; i < n; i++){
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Masukkan jumlah angka yang ingin di hitung: ");
        N = sc.nextInt();
        int[] angka = new int[N];

        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i-1] = sc.nextInt();
        }

        int hasil = totalRekursif(angka, N);
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + hasil);

    }
}
