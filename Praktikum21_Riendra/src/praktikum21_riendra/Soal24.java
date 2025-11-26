package praktikum21_riendra;

class Kendaraan{
    public void tampilInfo(){
        System.out.println("Kendaraan Beluum Teridentifikasi");
    }
}
class Mobil extends Kendaraan{
    @Override
    public void tampilInfo(){
        System.out.println("MOBIL Kendaraan Beroda 4");
    }
    
}
class Motor extends Kendaraan{
    @Override
    public void tampilInfo(){
        System.out.println("MOTOR Kendaraan beroda 2");
    }
}

public class Soal24 {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan();
        Mobil m = new Mobil();
        Motor t = new Motor();
        
        k.tampilInfo();
        m.tampilInfo();
        t.tampilInfo();
    }
    
}
