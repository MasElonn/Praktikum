package Kendaraan;

/**
 *
 * @author abi
 */
public class Kapal extends Kendaraan{
    private String nama;
    private String jenis;
     public Kapal(String nama){
        super("Kapal");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    public Kapal(String nama, String jenis){
        super("");
        this.nama =  nama;
        this.jenis = jenis;
    }
    @Override
    public void informasi(){
        System.out.println("====================================");
        System.out.println("nama Kapal adalah "+nama);
        System.out.println("jenis Kapal adalah "+jenis);
        System.out.println("====================================");
    }
    
}
