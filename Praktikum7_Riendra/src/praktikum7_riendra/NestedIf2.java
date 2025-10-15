package praktikum7_riendra;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class NestedIf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // deklarasi library Scanner

        String kategori; // deklarasi variabel kategori
        int penghasilan, gajiBersih; // deklarasi variabel penghasilan dan gaji bersih
        double pajak; // deklarasi variabel pajak

        System.out.print("Masukkan Kategori Anda (Pekerja/Pebisnis) : ");
        kategori = sc.nextLine();

        System.out.print("Masukkan Penghasilan Anda: ");
        penghasilan = sc.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);

        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 25;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);

        } else {
            System.out.println("Kategori yang anda masukkan salah");
        }
    }
}
