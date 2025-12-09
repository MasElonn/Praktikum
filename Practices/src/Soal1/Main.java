package Soal1;

interface Garansi{
    int hitungMasaGaransi(int tahunPembelian);
}

class Produk{
    protected String nama;
    protected double harga;
    protected int stok;

    public void tampilInfo(){
        System.out.println("Produk belum di input");
    }
}

class Smartphone extends Produk implements Garansi{
    double ukuranLayar;
    int kapasitasBaterai;
    int garansi;

    public Smartphone(String nama,double harga,int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public void setlayar(double layar){
        this.ukuranLayar=layar;
    }
    public void setbaterai(int batrerai){
        this.kapasitasBaterai=batrerai;
    }
    public void setgaransi(int garansi) {
        this.garansi = garansi;
    }

    @Override
    public int hitungMasaGaransi(int tahunPembelian) {
        if(tahunPembelian > 2023){
            return 2;
        } else{
            return 1;
        }
    }
    @Override
    public void tampilInfo() {
        System.out.println("Nama Smartphone: "+nama);
        System.out.printf("Harga Smartphone: %.1fRp\n",harga);
        System.out.println("Stock Smartphone: "+stok);
        System.out.printf("Ukuran Layar: %.2f^\n",ukuranLayar);
        System.out.println("Kapasitas Baterai: "+kapasitasBaterai);
        System.out.printf("Masa Garansi: %d Tahun\n",hitungMasaGaransi(garansi));
        }
}
    
class Laptop extends Produk implements Garansi{
    String jenisProcessor;
    int ramSize;
    int garansi;

    public Laptop(String nama,double harga,int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public void setRam(int ram){
        this.ramSize=ram;
    }
    public void setProcessor(String processor){
        this.jenisProcessor=processor;
    }
    public void setgaransi(int garansi) {
        this.garansi = garansi;
    }

    @Override
    public int hitungMasaGaransi(int tahunPembelian) {
        if(tahunPembelian > 2023){
            return 2;
        } else{
            return 1;
        }
    }


    @Override
    public void tampilInfo() {
        System.out.println("Nama Laptop: "+nama);
        System.out.printf("Harga Laptop: %.1fRp\n",harga);
        System.out.println("Stock Laptop: "+stok);
        System.out.println("jenis Processor: "+jenisProcessor);
        System.out.printf("Kapasitas Ram: %dGB\n",ramSize);
        System.out.printf("Masa Garansi: %d Tahun\n",hitungMasaGaransi(garansi));
    }
}



public class Main {
    public static void main(String[] args) {
        
        Smartphone sp = new Smartphone("ROG Phone",500000,2);
        sp.setbaterai(20000);
        sp.setlayar(23.5);
        sp.setgaransi(2000);
        
        Laptop lp = new Laptop("ROG Strix",2000000,3);
        lp.setRam(24);
        lp.setProcessor("Amd Threadripper 47800");
        lp.setgaransi(2029);
        
        Produk[] produk = {
            sp,
            lp
        };
        
        for(Produk p : produk){
            p.tampilInfo();
            System.out.println("");
        }

    }
}
