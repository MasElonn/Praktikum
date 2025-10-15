package PBO;

/**
 *
 * @author abi
 */
public class HewanDemo {
    public static void main(String[] args) {
        Hewan hwn1 = new Hewan();
        Hewan hwn2 = new Hewan();
        Hewan hwn3 = new Hewan();
        
        hwn1.setNama("Marlin");
        hwn1.setJumlahKaki(0);
        hwn1.setHabitat("Laut");
        hwn1.tampilData();
        
        hwn2.setNama("Monyet");
        hwn2.setJumlahKaki(2);
        hwn2.setHabitat("Darat");
        hwn2.tampilData();
        
        hwn3.setNama("Elang");
        hwn3.setJumlahKaki(2);
        hwn3.setHabitat("Udara");
        hwn3.tampilData();
    }
    
}
