package Polimorphism_Overloading;

import java.awt.Point;

/**
 *
 * @author abi
 */
public class Utama {
    public static void main(String[] args) {
        SegiEmpat rect = new SegiEmpat();
        System.out.println("Buat segi empat dengan kordinat (25,25) dan (50,50)");
        rect.segiEmpat(25,25, 50,50);
        rect.cetakSegiEmpat();
        System.out.println("");
        
        System.out.println("Buat segi empat dengan point (10,10) dan (20,20)");
        rect.segiEmpat(new Point(10,10), new Point(20,20));
        rect.cetakSegiEmpat();
        System.out.println("");
         
        System.out.println("Buat segi empat dengan point (10,10) dan ukuran (50,50)");
        rect.segiEmpat(new Point(10,10),50,50);
        rect.cetakSegiEmpat();
        
    }
    
}
