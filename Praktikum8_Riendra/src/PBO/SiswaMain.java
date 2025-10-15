package PBO;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class SiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Siswa s = new Siswa();
        
        
        System.out.println("===================");
        System.out.print("Masukkan Nama Anda: ");
        s.setNama(sc.nextLine());
        System.out.print("Masukkan NIS Anda: ");
        s.setNis(sc.nextLine());
        System.out.print("Masukan Nilai Akhir Anda: ");
        s.setNilaiAkhir(sc.nextDouble()); 
        System.out.println("===================");
        
        s.tampilData();
 
        
    }
    
}
