package Tugas;
import java.util.Scanner;

/**
 *
 * @author abi
 */
public class Tugas_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,N,jumBil,count;
        double ratBil;
        
        
        System.out.println("Menghitung Jumlah Bilangan Genap dari N Bilangan");
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("Masukkan Range Bilangan: ");
        N = sc.nextInt();
        
        jumBil = 0;
        count = 0;
        
        if(N > 1){// menggecek apakah Range lebih dari 0 jika tidak langsung  ke else
            
        for (i=1;i <= N; i++) { //looping sesuai Range yang di input
            if (i % 2 == 0){ // mengecek apakah ada Bilangan Genap dalam range
                count++; // menghitung jumlah Bilangan Genap yang ada
            }
        }
        System.out.printf("Banyaknya Bilangan Genap dari 1 sampai %d adalah: %d\n",N, count);
        
        count = 0; // mereset jumlah Bilangan Genap yang ada
        for (i=1;i <= N; i++) {
            
            if (i % 2 == 0){
                count++;
                System.out.printf("Bilangan Ke-%d Adalah %d\n",count,i);
         jumBil += i ; // menambahkan semua Bilangan Genap yang ada
            }
        }

        System.out.printf("Jumlah Bilangan Genap dari 1 sampai %d Adalah %d\n",N,jumBil); // menampilkanj jumlah Bilangan yang sudh di tambah
        ratBil = jumBil / count; // Rumus rata-rata
        System.out.printf("Rata-rata Bilangan Genap dari 1 sampai %d adalah %.00f\n",N,ratBil); //menampilkan rata-rata dari Jumlah bilangann
        
         } else {
            System.out.println("Masukkan Bilangan Di Atas 1");
        }
    }
}