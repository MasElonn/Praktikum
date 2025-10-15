package praktikum5_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class ifElse {
    public static void main(String[] args){ //deklarasi main method
        Scanner sc = new Scanner(System.in);
        
        int suhu; //deklarasi variabel suhu
        
        System.out.print("Masukkan Suhu: ");
        suhu = sc.nextInt();
        
        if(suhu >= 0 && suhu <= 40){
            if(suhu<16 ) {
                System.out.println("Silahkan pakai Jaket");   
            } else {
             System.out.println("Silahkan pakai Topi");
            }
        }
    }
}  

