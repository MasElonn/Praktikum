package praktikum21_riendra;
import java.util.Scanner;

public class Soal28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fib1 = 0, fib2 = 1,fibo,i=0;
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        while(i<n){ 
            fibo = fib1 + fib2;
            
            System.out.println(fib1+" ");
            
            fib1 = fib2;
            fib2 = fibo; 
            i++;
        }
    }    
    
}
