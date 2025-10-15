package praktikum5_riendra;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        int angka;
        
         System.out.print("Masukkan Angka: ");
         angka = sc.nextInt();
         
         switch(angka) {
             case 1 :
                  System.out.println("januari");
                  break;
             case 2 :
                  System.out.println("February");
                  break;
             case 3 :
                  System.out.println("Maret");
                  break;
             case 4 :
                  System.out.println("April");
                  break; 
             case 5 :
                  System.out.println("Mei");
                  break; 
             case 6 :
                  System.out.println("Juli");
                  break;                                         
             case 7 :
                  System.out.println("Juni");
                  break;
             case 8 :
                  System.out.println("Agustus");
                  break;  
             case 9 :
                  System.out.println("September");
                  break;  
             case 10 :
                  System.out.println("Oktober");
                  break;  
             case 11 :
                  System.out.println("November");
                  break;  
              case 12 :
                  System.out.println("Desember");
                  break;
             default :
                 System.out.println("Bulan Hanya ada 12");
         }
    }
}
