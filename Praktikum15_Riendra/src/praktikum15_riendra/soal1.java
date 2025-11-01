package praktikum15_riendra;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.println("Piihlah rumus yang akan ditampilkan");
        System.out.println("1.Persegi\n2.Persegi Panjang\n3.Lingkaran");
        System.out.print("Masukkan: ");
        a = sc.nextInt();
        
        if(a == 1){
            System.out.println("L = S * S");
        } else if (a == 2){
            System.out.println("L = P * L");
        } else if (a == 3){
            System.out.println("L = 3.14 * R * R");
        } else {
            System.out.println("Masukkan 1-3 saja");
        }
        
    }
    
}
