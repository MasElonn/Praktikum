package praktikum21_riendra;
import java.util.Scanner;

public class Soal25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan suhu (derajat Celcius): ");
        double suhu = input.nextDouble();
        
        if (suhu < 16) {
            System.out.println("Kondisi cuaca: Dingin");
        } else if (suhu >= 16 && suhu < 29) {
            System.out.println("Kondisi cuaca: Hangat");
        } else {
            System.out.println("Kondisi cuaca: Panas");
        
        }
    }
}
