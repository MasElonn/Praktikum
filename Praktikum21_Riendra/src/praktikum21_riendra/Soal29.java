package praktikum21_riendra;

import java.util.Scanner;

public class Soal29 {
    public static int fibonacci(int n) {
        int fib1 = 0, fib2 = 1,fibo;
        for(int i=1;i <= n;i++){ 
            fibo = fib1 + fib2;
            
            fib1 = fib2;
            fib2 = fibo; 
        }
        return fib1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n untuk mendapatkan nilai ke-n dari deret Fibonacci: ");
        int n = sc.nextInt();

        int result = fibonacci(n);
        System.out.println("Nilai ke-" + n + " dari deret Fibonacci adalah: " + result);
    }    
    
}
