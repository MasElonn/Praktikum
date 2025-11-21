package Polimorphism_Overloading;

/**
 *
 * @author abi
 */
public class Kotak {
    private int panjang,lebar;
    
    //constructor 1
    Kotak(){
        
    }
    //construcktor 2
    Kotak(int p,int l){
        panjang=p;
        lebar=l;
    }
    //deklarasi method anggota kelas
    public void assignKotak(int p,int l){
        panjang=p;
        lebar=l;
    }
    public long Luas(){
        return panjang*lebar;
    }
    public long Keliling(){
        return 2*(panjang+lebar);
    }
}
