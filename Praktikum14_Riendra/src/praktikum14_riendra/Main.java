package praktikum14_riendra;

/**
 *
 * @author abi
 */
public class Main {
    public static void main(String[] args) {
        Pig pig1 = new Pig();
        Cat cat1 = new Cat();
        
        System.out.println("========= Hewan Pig =========");
        System.out.print("Suara : ");
        pig1.animalSoud();
        System.out.print("Tidur : ");
        pig1.sleep();
        System.out.println("=============================");
        System.out.println("========= Hewan Cat =========");
        System.out.print("Suara : ");
        cat1.animalSoud();
        System.out.print("Tidur : ");
        cat1.sleep();
        System.out.println("==============================");
      
    }
    
}
