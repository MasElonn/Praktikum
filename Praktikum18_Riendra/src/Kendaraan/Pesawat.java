package Kendaraan;

/**
 *
 * @author abi
 */
public class Pesawat extends Kendaraan {
    private String nama;
    private String jenis;
    public Pesawat (String nama){
        super("pesawat");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    public Pesawat(String nama, String jenis){
        super("pesawat");
        this.nama =  nama;
        this.jenis = jenis;
    }
    @Override
    public void informasi(){
        System.out.println("====================================");
        System.out.println("nama pesawat adalah "+nama);
        System.out.println("jenis pesawat adalah "+jenis);
        System.out.println("====================================");
    }
    
}
