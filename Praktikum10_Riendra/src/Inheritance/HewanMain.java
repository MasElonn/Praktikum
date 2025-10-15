package Inheritance;

/**
 *
 * @author abi
 */
public class HewanMain {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        System.out.println("====  Hewan 1  ====");
        kucing.eat();
        kucing.sleep();
        kucing.meow();
        
        Kucing kucing2 = new Kucing();
        System.out.println("====  Hewan 2  ====");
        kucing2.eat();
        kucing2.sleep();
        kucing2.meow();
        
        Burung burung = new Burung();
        System.out.println("====  Hewan 2  ====");
        burung.eat();
        burung.sleep();
        burung.fly();
        
    }
    
}
