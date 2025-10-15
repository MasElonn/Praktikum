package praktikum7_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class Segitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double sisi1, sisi2, alas;
        
        System.out.print("Masukkan Sisi 1 : ");
        sisi1 = sc.nextDouble();
        System.out.print("Masukkan Sisi 2 : ");
        sisi2 = sc.nextDouble();
        System.out.print("Masukkan Alas : ");
        alas = sc.nextDouble();
        
        if(sisi1 == sisi2 && sisi2 == alas) {
                System.out.println("Segitiga Sama Sisi");
        }   else if (sisi1 == sisi2) {
            System.out.println("Segitiga Sama Kaki");
        } else {
            System.out.println("Segitiga Tidak Beraturan");
        }
    }
}
