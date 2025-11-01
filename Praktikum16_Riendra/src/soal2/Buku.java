package soal2;

/**
 *
 * @author abi
 */
public class Buku {
    private String judul,penulis;
    private int harga;
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJudul(){
        return this.judul;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public String getPenulis(){
        return this.penulis;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getHarga(){
        return this.harga;
    }
    public void tampilInfo(){
        System.out.println("===================================");
        System.out.println("Judul Buku: " +judul);
        System.out.println("Penulis Buku: "+penulis);
        System.out.println("Harga Buku: "+harga);
        System.out.println("===================================");
        
    }
}
