package praktikum21_riendra;

class Buku{
   String[] judul = {"Si merah","Java 101","Linux from Scratch"};
   String[] penulis = {"Kevin","Bu venny","Linux Torvalds"};
   int[] harga = {200000,300000,400000};
   
   public void tampilData(){
        int index =-1;
        int tertinggi = harga[0];
        
       for (int i=0;i<judul.length;i++){
           System.out.println("\nJudul Buku: "+judul[i]);
           System.out.println("Penulis Buku: "+penulis[i]);
           System.out.println("harga Buku: "+harga[i]);
           tertinggi=Math.max(tertinggi,harga[i]); 
           if(tertinggi==harga[i]) index++;
           
       }
       System.out.println("\n=====  Harga Tertinggi  =====");
       System.out.println("Judul Buku: "+judul[index]);
       System.out.println("Penulis Buku: "+penulis[index]);
       System.out.println("harga Buku: "+tertinggi);
   }
   
    
}

public class Soal10 {
    public static void main(String[] args) {
        Buku b = new Buku();
        b.tampilData();
    }
    
}