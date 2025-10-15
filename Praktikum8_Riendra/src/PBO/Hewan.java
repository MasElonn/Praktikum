package PBO;

/**
 *
 * @author abi
 */
public class Hewan {
    public String nama;
    public int jumlahKaki;
    public String habitat;
    
    public void setNama(String newValue) {
        nama = newValue;
    }
    
    public void setJumlahKaki(int newValue) {
        jumlahKaki = newValue;
    }
    
    public void setHabitat(String newValue) {
        habitat = newValue;
    }
    
    public void tampilData() {
        System.out.println("==============================");
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jumlah Kaki Hewan : " + jumlahKaki);
        System.out.println("Habitat Hewan : " + habitat);
        System.out.println("==============================");
    }
    
}
