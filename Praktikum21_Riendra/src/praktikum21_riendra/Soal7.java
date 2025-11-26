package praktikum21_riendra;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Nama: " + nama);
            System.out.println("Nilai: " + nilai);

            if (nilai >= 60) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }

            char grade;
            if (nilai >= 80) {
                grade = 'A';
            } else if (nilai >= 70) {
                grade = 'B';
            } else if (nilai >= 60) {
                grade = 'C';
            } else if (nilai >= 50) {
                grade = 'D';
            } else {
                grade = 'E';
            }
            System.out.println("Grade: " + grade);
        }
    }
}
