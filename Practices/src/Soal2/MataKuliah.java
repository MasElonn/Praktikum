package Soal2;

/**
 *
 * @author abi
 */
public class MataKuliah {
    private String kodeMK,namaMK,namaDosen;
    private int jumlahSKS;
    
    public MataKuliah(String kodeMK, String namaMK, String namaDosen, int jumlahSKS){
        this.kodeMK=kodeMK;
        this.namaMK=namaMK;
        this.namaDosen=namaDosen;
        this.jumlahSKS=jumlahSKS;
    }
    public String getKodeMK(){
        return kodeMK;
    }
    public String getNamaMK(){
        return namaMK;
    }
    public String getNamaDosen(){
        return namaDosen;
        
    }
    public int getSKS(){
        return jumlahSKS;
    }
    
    
}
