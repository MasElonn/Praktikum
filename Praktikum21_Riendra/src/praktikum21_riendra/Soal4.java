package praktikum21_riendra;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[5];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int n : nilai) {
            total += n;
            if (n > tertinggi) {
                tertinggi = n;
            }
            if (n < terendah) {
                terendah = n;
            }
        }

        System.out.println("Rata-rata: " + (double) total / nilai.length);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
