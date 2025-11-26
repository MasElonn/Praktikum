package praktikum21_riendra;
import java.util.Scanner;

public class Soal5 {
    public static double hitungRata(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;
    }

    public static void tampilkanStatus(double rata) {
        if (rata >= 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai=new int[5];
        for(int i = 0;i<nilai.length;i++){
            System.out.printf("Masukkan Nilai ke-%d: ",i+1);
            nilai[i]=sc.nextInt();
        }
        double rata = hitungRata(nilai);
        System.out.println("Rata-rata: " + rata);
        tampilkanStatus(rata);
    }
}
