
package praktikum2_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class Praktikum2_Riendra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int bilangan;
            byte contohBilanganByte;
            float volume, luas;
            int angka = 1;
            float phi = 3.14f;
            char kelas = 'B';
            String nama;
            
            System.out.print("Masukan Nama: ");
            nama = sc.nextLine();
            
           
            
            System.out.println("=== OUTPUT ===");
            System.out.println("Nilai Angka " + angka);
            System.out.println("Nama Saya Adalah " + nama);
            System.out.println("Kelas Saya Adalah XRP" + kelas);
            System.out.println("=== === === ===");
            System.out.println("");
            
            String pikiran;
            System.out.println("== Program Pembaca Pikiran ==");
            
            System.out.print("Tulis apa yang kamu pikirkan: ");
            pikiran = sc.nextLine();
            
            
            
            System.out.println("Yang kamu pikirkan adalah:" + pikiran);
            
            sc.close();
    }
    
}
