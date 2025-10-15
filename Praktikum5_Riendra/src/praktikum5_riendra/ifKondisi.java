package praktikum5_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class ifKondisi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int suhu;
        
        System.out.print("Masukkan Suhu: ");
        suhu = sc.nextInt();
        
        if(suhu<16) {
            System.out.println("Silahkan pakai Jaket");
        }
    }
}