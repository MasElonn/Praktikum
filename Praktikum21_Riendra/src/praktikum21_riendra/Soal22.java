package praktikum21_riendra;
import java.util.Scanner;

public class Soal22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,total=0;
        System.out.print("Masukkan Range: ");
        r=sc.nextInt();
        
        int[] nilai = new int[r];
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        
        for(int i=0;i<nilai.length;i++){
            System.out.printf("Masukkan nilai ke-%d: ",i-1);
            nilai[i]=sc.nextInt();
            
            total += nilai[i];
            
            if(i==0) terendah =nilai[i];
            tertinggi=Math.max(tertinggi,nilai[i]); 
            terendah=Math.min(terendah,nilai[i]);
        }
        System.out.println("Nilai Tertinggi Adalah: "+tertinggi);
        System.out.println("Nilai Terendah Adalah: "+terendah);
        System.out.println("Rata-rata Dari Nilai Adalah: "+total/nilai.length);

    }
    
}
