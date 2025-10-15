package praktikum7_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Deklarasi Library Scanner
        
        int nilai; // Deklarasi Variabel nilai
        
        System.out.print("Masukkan Nilai 0 - 100 : ");
        nilai = sc.nextInt();
        
        if(nilai >= 0 && nilai <= 100) {
            if(nilai >= 90 && nilai <= 100) {
                System.out.println("Nilai A, EXCELENT");
            } else if (nilai >= 80 && nilai <= 89) {
                System.out.println("Nilai B, Tingkatkan Prestasi");
            } else if(nilai >= 60 && nilai <= 79) {
                System.out.println("Nilai C, Belajar Lagi");
            } else if(nilai >= 50 && nilai <= 59) {
                System.out.println("Nilai D, Nice Try");
            } else {
                System.out.println("Nilai E, 🤦🤦");
            }
            
        } else {
            System.out.println("Nilai Invalid, Masukkan 0 - 100");
        }
    }
}


         if(nilai_akhir >= 0 && nilai_akhir <= 100) {
            if(nilai_akhir >= 90 && nilai_akhir<= 100) {
                System.out.println("Nilai A, EXCELENT");
            } else if (nilai_akhir >= 80 && nilai_akhir <= 89) {
                System.out.println("Nilai B, Tingkatkan Prestasi");
            } else if(nilai_akhir >= 60 && nilai_akhir <= 79) {
                System.out.println("Nilai C, Belajar Lagi");
            } else if(nilai_akhir >= 50 && nilai_akhir <= 59) {
                System.out.println("Nilai D, Nice Try");
            } else {
                System.out.println("Nilai E, 🤦🤦");
            }
            
            } else {
            System.out.println("Nilai Invalid, Masukkan 0 - 100");
         }