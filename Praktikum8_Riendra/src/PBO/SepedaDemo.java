package PBO;

/**
 *
 * @author abi
 */
public class SepedaDemo {

    public static void main(String[] args) {
         Sepeda spd1 = new Sepeda();
         Sepeda spd2 = new Sepeda();
        
         spd1.setMerk("Poligon");
         spd1.gantiGear(3);
         spd1.tambahKecepatan(40);
         spd1.kurangKecepatan(20);
         spd1.cekStatus();
        
         spd2.setMerk("Aselole");
         spd2.gantiGear(7);
         spd2.tambahKecepatan(1000);
         spd2.kurangKecepatan(20);
         spd2.cekStatus();
         
    }
}
