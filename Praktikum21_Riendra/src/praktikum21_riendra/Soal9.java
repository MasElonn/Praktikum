package praktikum21_riendra;

interface Payable{
    public void makePayment(double amount);
    public void printRecipt();
}

class CashPayment implements Payable{
    private double amount, tBayar;
    
    public void setTBayar(double tBayar){
        this.tBayar=tBayar;
    }

    @Override
    public void makePayment(double amount) {
        this.amount=amount;
    }

    @Override
    public void printRecipt() {
        System.out.println("=======  Pembayaran Cash  =======");
        System.out.println("Total Pembayaran    : "+tBayar);
        System.out.println("Uang Yang diterima : "+amount);
        System.out.println("Uang Kembalian       : "+(amount-tBayar));
    }
    
}

class DigitalPayment implements Payable{
    private double amount;
    private String nama;
    
    public void setNama(String nama){
        this.nama=nama;
    }

    @Override
    public void makePayment(double amount) {
        this.amount=amount;
    }

    @Override
    public void printRecipt() {
        System.out.println("\n=======  Pembayaran Digital  =======");
        System.out.println("Aplikasi Pembayaran    :"+nama);
        System.out.println("Uang yang Dibayarkan : "+amount);
       
    }
    
}

public class Soal9 {
    public static void main(String[] args) {
        CashPayment c = new CashPayment();
        c.setTBayar(5000);
        c.makePayment(10000);
        c.printRecipt();
        
        DigitalPayment d = new DigitalPayment();
        d.setNama("GoPay");
        d.makePayment(500000);
        d.printRecipt();
    }
    
}