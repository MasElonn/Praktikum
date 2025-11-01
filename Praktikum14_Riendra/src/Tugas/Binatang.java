package Tugas;

/**
 *
 * @author abi
 */
public abstract class Binatang {
    String nama;
    int jmlKaki;
    
    public void Binatang(String nama, int jmlKaki){
       
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKaki(int  jmlKaki){
        this.jmlKaki = jmlKaki;
    }
    public int getKaki(){
        return jmlKaki;
    }
    public void displaybinatang(){
        
        
    }
    
}
