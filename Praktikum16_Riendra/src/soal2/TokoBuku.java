package soal2;

/**
 *
 * @author abi
 */
public class TokoBuku {
    public static void main(String[] args) {
        Buku a = new Buku();
        Buku b = new Buku();
        
        a.setJudul("Sampai Jadi Hitam");
        a.setPenulis("Mike Tyson bin suep");
        a.setHarga(1250000);
        a.tampilInfo();
        
        b.setJudul("Kisah Tanah Jawa");
        b.setPenulis("Bambang");
        b.setHarga(1150000);
        b.tampilInfo();
    }
    
}
