package PBO;

/**
 *
 * @author abi
 */
public class Sepeda {
    //Deklarasi Variabel
    private String merk;
    private int kecepatan;
    private int gear;
    
    public void setMerk(String newValue) {
        merk = newValue;
    }
    
    public void gantiGear(int newValue) {
        gear = newValue;
    }
    
    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }
    public void kurangKecepatan(int decrement) {
        kecepatan = kecepatan - decrement;
    }
    
    public void cekStatus() {
        System.out.println("Merek: " + merk);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);

    }
    
}
