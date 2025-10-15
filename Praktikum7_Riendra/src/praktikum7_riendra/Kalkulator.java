package praktikum7_riendra;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Kalkulator {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
         double bil1, bil2, hasil;
         char op;
        
         System.out.print("Masukkan Bilangan Pertama: ");
         bil1 = sc.nextDouble();
         System.out.print("Masukkan Operator (+, -, *, /) : ");
         op = sc.next().charAt(0);
         System.out.print("Masukkan bilangan Kedua: ");
         bil2 = sc.nextDouble();
         
         switch(op) {
             case '+' :
                 hasil = bil1 + bil2;
                 System.out.println("Hasil " + bil1 + " "+op +" "+ bil2 + " = " + hasil);
                 break;
             case '-' :
                 hasil = bil1 - bil2;
                 System.out.println("Hasil " + bil1 + " "+op +" "+ bil2 + " = " + hasil);
                 break;
             case '*' :
                 hasil = bil1 * bil2;
                 System.out.println("Hasil " + bil1 + " "+op +" "+ bil2 + " = " + hasil);     
                 break;
             case '/' :
                 hasil = bil1 / bil2;
                 System.out.println("Hasil " + bil1 + " "+op +" "+ bil2 + " = " + hasil);    
                 break;
             default :
                 System.out.println("Operator harus (+, -, *, /)");
                 
         }
    }
    
}
