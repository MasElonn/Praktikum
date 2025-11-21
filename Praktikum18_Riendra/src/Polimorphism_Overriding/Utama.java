package Polimorphism_Overriding;

/**
 *
 * @author abi
 */
public class Utama {
    public static void main(String[] args) {
        Herbivora herb = new Herbivora();
        Kelinci kelinciku = new Kelinci();
        Binatang hewan;
        
        hewan = herb;
        hewan.info();
        hewan = kelinciku;
        hewan.info();
        
       
    }
    
}
