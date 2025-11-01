package kendaraanbergerak;

abstract class Kendaraan {
    protected double kecepatan;
    protected String bahanBakar;
    
    public Kendaraan(double kecepatan, String bahanBakar) {
        this.kecepatan = kecepatan;
        this.bahanBakar = bahanBakar;
    }
    
    public abstract void bergerak();
    
    public void infoKendaraan() {
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Bahan Bakar: " + bahanBakar);
    }
    
    public double getKecepatan() {
        return kecepatan;
    }
    
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public String getBahanBakar() {
        return bahanBakar;
    }
    
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
}



