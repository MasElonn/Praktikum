package praktikum11_riendra;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int i;
        int[] bil = new int[5];
        
        for(i=0; i < 5;i++){
            System.out.print("Masukkan Bilangan ke-"+i+": ");
            bil[i] = sc.nextInt();
        }
        for (i=0;i < 5;i++){
            System.out.printf("Isi Bilangan ke %d adalah: %d\n",i,bil[i]);
        }
        
    }
    
}
