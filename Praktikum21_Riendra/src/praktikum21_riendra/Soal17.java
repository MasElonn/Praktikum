package praktikum21_riendra;

class Nilai{
    int[] nilai;
    double rata;
    
    public void inputNilai(int[] nilai){
        this.nilai=nilai;
    }
    
    public double hitungRata(){
        
        for(int i=0;i<nilai.length;i++){
            rata += nilai[i];
            
        }
        return rata/nilai.length;
    }
}


public class Soal17 {
    public static void main(String[] args) {
        Nilai n = new Nilai();
        int[]nilai1 = {90,18,19,80};
        
        n.inputNilai(nilai1);
        System.out.println("Nilai rata-rata dari: ");
        for(int nilait:nilai1){
            System.out.print(nilait+" ");
            
        }
        System.out.println("\nAdalah: "+n.hitungRata());
    }
    
}
