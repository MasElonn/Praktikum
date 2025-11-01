package Tugas;
import java.util.Scanner;
/**
 *
 * @author abi
 */
public class Tugas_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fib1,fib2,fibo,r,i;//deklarasi variabel
        
        fib1 = 0;
        fib2 = 1;
        System.out.println("======  Fibonacci  ======");
        System.out.print("Masukkan Range Bilangan: ");
        r = sc.nextInt(); // mengambil input Range
        System.out.println("======= Deret =======");
        
        if (r > 0) { // menggecek apakah Range lebih dari 0 jika tidak langsung  ke else
            
        for(i=1;i <= r;i++){ //looping sesuai Range yang di input
            fibo = fib1 + fib2;
            
            System.out.print(fib1 + " "); // menampilkan hasil
            
            fib1 = fib2;
            fib2 = fibo;   
        }
        System.out.println("\n======================");
        
         fib1 = 0; // mereset value
         fib2 = 1;
            System.out.println("Sum Of 0 + 0 = 0");
            System.out.println("Sum Of 1 + 0 = 1");
        for(i=1;i <= r;i++){ //looping sesuai Range yang di input

            fibo = fib1 + fib2;
            System.out.printf("Sum Of %d + %d = %d\n",fib1,fib2,fibo);
            fib1 = fib2;
            fib2 = fibo;

        }
        System.out.println("======================");
        
        } else {
            
            System.out.println("Range Minimal harus 1");
            System.out.println("======================");
        }
    }
}
