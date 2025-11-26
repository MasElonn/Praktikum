package praktikum21_riendra;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[5];
        int total = 0,tertinggi = 0,terendah = 100;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
            
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("Rata-rata: " + (double) total / nilai.length);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
