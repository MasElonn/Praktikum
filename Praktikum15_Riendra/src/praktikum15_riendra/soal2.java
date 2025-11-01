package praktikum15_riendra;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        
        System.out.println("========================");
        System.out.print("Masukkan range: ");
        r = sc.nextInt();
        
        System.out.println("========================");
        for(int i = 0; i <= r;i++){
            if(i % 2 == 1){
                System.out.println("Ganjil = "+i);
            }
            
        }
        System.out.println("========================");
        
    }
    
}
