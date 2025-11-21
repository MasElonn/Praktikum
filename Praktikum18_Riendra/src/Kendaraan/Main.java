package Kendaraan;

/**
 *
 * @author abi
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan p;
        Pesawat psw = new Pesawat("Boeing 737","Pesawat Komersil");
        Mobil mbl1 = new Mobil("Mitsubhsi Pajero","SUV");
        Mobil mbl2 = new Mobil("Honda City","Sedan");
        Mobil mbl3 = new Mobil("VW Combi");
        Kapal kpl = new Kapal("Queen Mary 2","Kapal Pesiar");
        
        p=psw;
        p.informasi();
        p=mbl1;
        p.informasi();
        p=mbl2;
        p.informasi();
        p=mbl3;
        p.informasi();
        p=kpl;
        p.informasi();
        
        
    }
    
}
