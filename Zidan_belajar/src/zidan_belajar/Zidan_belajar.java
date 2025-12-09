package zidan_belajar;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class Zidan_belajar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DEKLARASI VARIABEL
        int a1,a2;
        char pilih;
        double hasil;
        
        System.out.println("~*~*~*~*~*~*~*~*~* KALKULATOR SEDERHANA DARI ZIDAN ~*~*~*~*~*~*~*~*~*~");
        System.out.println("\n 1. PERTAMBAHAN (+) \n 2. PENGURANGAN (-)\n 3. PERKALIAN   (*)\n 4. PEMBAGIAN   (/)");
        System.out.print("PILIH ANTARA NO 1 - 4 : ");
       pilih = sc.next().charAt(0);
        
        System.out.print("MASUKAN ANGKA PERTAMA : ");
        a1 = sc.nextInt();
        System.out.print("MASUKAN ANGKA KEDUA   :");
        a2 = sc.nextInt();
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        
        switch(pilih){
            case'1':
                hasil = a1+a2;
                System.out.println("\n HASIL : " + hasil);
                break;
                
              case'2':
                  hasil = a1-a2;
                  System.out.println("\n HASIL : " + hasil);
                  break;
                  
              case'3':
                  hasil = a1*a2;
                  System.out.println("\n HASIL : " + hasil);
                  break;
                  
               case'4':
                    if(a1 == 0 && a2 == 0){
                        System.out.println("ANGKA TERSEBUT TIDAK BISA DI BAGI 0 ");
                    }else{
                        hasil = a1/a2;
                        System.out.println("HASIL : " + hasil);
                        
                    }
                    break;
               default:
                   System.out.println("~*~*~*~*~*~*~*~*~*~*~*~~*~*~*~*~*~*~*~*~*~*~*~");
                   System.out.println("HASIL INVALID MASUKAN LAGI !!!");
                   
               }
                  
                
            
            
        
    }
        
        
        
        
    }

