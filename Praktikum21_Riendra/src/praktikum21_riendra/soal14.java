package praktikum21_riendra;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class soal14 {
    public static boolean cekPrima(int n){
        for (int i = 2; i<= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range;
        System.out.println("Cek angka prima mulai dari 2 Sampai N");
        System.out.print("Masukkan N: ");
        range=sc.nextInt();
        for(int i = 2; i < range;i++){
            if(cekPrima(i)){
                System.out.println(i+" ADALAH Angka PRIMA");
            } else{
                System.out.println(i+" Bukan Angka Prima");
            }
        }
        
    }
    
}
