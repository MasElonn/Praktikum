package AbstractClass;

/**
 *
 * @author abi
 */
public abstract class Hewan {
    private int umur;
    
    protected Hewan(){
        this.umur = 0;
    }
    
    public void tambahUmur(){
        this.umur += 1;
    }

    public abstract void bergerak();
    
}
