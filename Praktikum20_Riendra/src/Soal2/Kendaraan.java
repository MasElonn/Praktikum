package Soal2;

/**
 *
 * @author abi
 */
public class Kendaraan {
    private String noPolisi,merk;
    private int tahun;

    public void setNopol(String noPolisi){
        this.noPolisi=noPolisi;
    }
    public String getNopol(){
        return noPolisi;
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public String getMerk(){
        return merk;
    }
    public void setTahun(int tahun){
        this.tahun=tahun;
    }
    public int getTahun(){
        return tahun;
    }
    public void tampilData(){
        System.out.println("===== Data Kendaraan =====");
        System.out.println("No Polisi : "+noPolisi);
        System.out.println("Merk      : "+merk);
        System.out.println("Tahun     : "+tahun);
    }
}
