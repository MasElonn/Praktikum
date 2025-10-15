package praktikum3_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class Luas_Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // deklarasi variable Scanner
        
        int alas, tinggi;
        float luas;
        
        System.out.print("Masukkan alas: ");
        alas = input.nextInt(); // menyimpan inputan alas
        
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextInt(); // menyimpan inputan tinggi
        
        luas = alas * tinggi / 2;
        
        System.out.print("");
        
        System.out.println("Luas segitiga: " + luas); // menampilkan hasil (Luas Segitiga)
        
        input.close();
       
    }

}
