package Simulasi_ATM;

public class Soal20_Nasabah implements Soal21_ITransaksi{
    private String nama;
    private double saldo;
    
    public Soal20_Nasabah(String nama,double saldo){
        this.nama=nama;
        this.saldo=saldo;
        
    }
    public double cekSaldo(){
        return saldo;
    }
    public String getNama(){
        return nama;
    }

    @Override
    public void tarikUang(double uang) {
        saldo-=uang;
       
    }

    @Override
    public void setorUang(double uang) {
       saldo+=uang;
        
    }
    
}
