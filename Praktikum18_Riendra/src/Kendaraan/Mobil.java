package Kendaraan;

/**
 *
 * @author abi
 */
public class Mobil extends Kendaraan{
    private String nama;
    private String jenis;
     public Mobil(String nama){
        super("Mobil");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    public Mobil(String nama, String jenis){
        super("Mobil");
        this.nama =  nama;
        this.jenis = jenis;
    }
    @Override
    public void informasi(){
        System.out.println("====================================");
        System.out.println("nama Mobil adalah "+nama);
        System.out.println("jenis Mobil adalah "+jenis);
        System.out.println("====================================");
    }
    
}
