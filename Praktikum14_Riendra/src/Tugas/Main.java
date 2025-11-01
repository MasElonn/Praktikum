package Tugas;

/**
 *
 * @author abi
 */
public class Main {
    public static void main(String[] args) {
        Keledai k = new Keledai();
        Gorilla g = new Gorilla();
        Singa s = new Singa();
        
        System.out.println("===========================================================");
        k.setNama("Keledai");
        k.setKaki(4);
        k.Keledai("Mwhehehehehe", "putih");
        k.displayData();
        
         System.out.println("===========================================================");
        g.setNama("Gulali");
        g.setKaki(4);
        g.Gorilla("Haaum Haumm", "Hitam Manis");
        g.displayData();
        
        System.out.println("===========================================================");
        s.setNama("CingaCing");
        s.setKaki(4);
        s.Singa("RaWrrrrrr", "Coklat");
        s.displayData();
        
        System.out.println("===========================================================");
    }
    
}
