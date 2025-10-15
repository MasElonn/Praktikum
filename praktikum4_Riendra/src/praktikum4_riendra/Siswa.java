package praktikum4_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class Siswa {
    // Desklarasi variabel Siswa
    public int nis;
    public String nama;
    public String alamat;
    public String kelas;
    public String jurusan;   
    
    //Deklaasi Function tampilSiswa
    public void tampilSiswa() {
        System.out.println("======= BIODATA SISWA =======");
        System.out.println("Nis Siswa: " + nis);
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Alamat Siswa: " + alamat);
        System.out.println("Kelas Siswa: " + kelas);
        System.out.println("Jurusan Siswa: " + jurusan);
        System.out.println("=============================");
    }
    public static void main(String[] args){ // Deklarasi Function main
        Scanner sc = new Scanner(System.in); // Deklarasi Scanner
        Siswa s = new Siswa();
        
        // Mengambil Input User
       System.out.println("=============================");
       
        System.out.print("Masukkan Nama Anda: ");
        s.nama = sc.nextLine();
        
        System.out.print("Masukkan Alamat Anda: ");
        s.alamat = sc.nextLine();
        
        System.out.print("Masukkan Kelas Anda: ");
        s.kelas = sc.nextLine();
        
        System.out.print("Masukkan Jurusan Anda: ");
        s.jurusan = sc.nextLine();
        
        System.out.print("Masukkan NIS Anda: ");
        s.nis = sc.nextInt();
        System.out.println("=============================\n");
        s.tampilSiswa();
        
    }
}
