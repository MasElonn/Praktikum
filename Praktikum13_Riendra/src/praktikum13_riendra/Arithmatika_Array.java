package praktikum13_riendra;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Arithmatika_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMHS = new int[10];
        double total = 0;
        double rata;
        
        for(int i =0; i < nilaiMHS.length; i++){
            System.out.printf("Masukkan nilai Mahasiswa ke-%d: ",i+1);
            nilaiMHS[i] =sc.nextInt();
        }
        for(int i=0;i<nilaiMHS.length; i++){
            total += nilaiMHS[i];
        }
        rata = total/nilaiMHS.length;
        System.out.println(rata - 0.5);
    }
    
}
