
package praktikum2_riendra;
import java.util.Scanner;

public class Tugas1_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama, jurusan, alasan, pekerjaan;
        
        System.out.println("==============================================");
        System.out.print("Masukkan Nama Anda: ");
        nama = sc.nextLine();
        
        System.out.print("Masukkan Jurusan Anda: ");
        jurusan = sc.nextLine();
        
        System.out.print("Alasan Anda memilih Jurusan tersebut: ");
        alasan = sc.nextLine();
        
        System.out.print("Masukkan Pekerjaan Impian Anda: ");
        pekerjaan = sc.nextLine();
        System.out.println("==============================================");
        
        System.out.println("\n==============================================");
        System.out.println("Nama Anda adalah: " + nama);
        System.out.println("Jurusan Anda adalah: " + jurusan);
        System.out.println("Alasan Anda meilih Jurusan tersebut adalah: " + alasan);
        System.out.println("Pekerjaan Impian Anda adalah: " + pekerjaan);
        System.out.println("==============================================");

    }
}
