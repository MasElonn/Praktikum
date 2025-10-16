package praktikum11_riendra;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        int N,i;
        System.out.print("Masukkan batas angka:");
        N = sc.nextInt();
        
        for (i=1; i <= N; i++){
            
            if (i % 2 == 0){
                System.out.println(i +" = Bilangan Genap");
            } else {
                System.out.printf("%d = Bilangan Ganjil\n", i);
            }
            
        }
    }
    
}
