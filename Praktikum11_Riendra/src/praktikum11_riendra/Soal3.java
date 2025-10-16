package praktikum11_riendra;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Soal3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jumSis,nilai,i;

        System.out.print("Masukkan jumlah siswa: ");
        jumSis = sc.nextInt();
        
        if (jumSis > 1) {
        
            for (i = 1; i <= jumSis; i++) {
            
                System.out.printf("Nilai siswa ke-%d: ",i );
                nilai = sc.nextInt();
            
                if(nilai >= 0 && nilai <= 100) {
                    if(nilai >= 90 && nilai <= 100) {
                        System.out.println("Nilai A");
                    } else if (nilai >= 80 && nilai <= 89) {
                        System.out.println("Nilai B");
                    } else if(nilai >= 70 && nilai <= 79) {
                        System.out.println("Nilai C");
                    } else if(nilai >= 60 && nilai <= 69) {
                        System.out.println("Nilai D");
                    } else {
                        System.out.println("Nilai E");
                    }
            
                } else {
                    System.out.println("Nilai Invalid, Nilai Minimal 0 ");
                }
            }
        } else {
            System.out.println("Jumlah Siswa Harus Lebih dari 0");
        }
    }
}