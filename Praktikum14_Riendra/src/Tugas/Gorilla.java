package Tugas;

/**
 *
 * @author abi
 */
public class Gorilla extends Binatang implements IKarnivora, IHerbivora {
    private String suara;
    private String warnaBulu;
    
    public void Gorilla(String suara,String warnaBulu){
        this.suara = suara;
        this.warnaBulu = warnaBulu;
        
    }
    
    @Override
    public void displayMakan(){
        System.out.println("Daging + Tumbuhan");
        
    }
    
    public void displayBinatang(){
        System.out.println("Jenis: Karnivora + Herbivora");
        System.out.print("Makanan: " );
        displayMakan();
        System.out.println("nama: " + getNama());
        System.out.println("Jumlah Kaki: " + getKaki());
        System.out.println("Suara: " + suara);
        System.out.println("Warna Bulu: " + warnaBulu);
        
    }
    public void displayData(){
        displayBinatang();
        
    }
}
