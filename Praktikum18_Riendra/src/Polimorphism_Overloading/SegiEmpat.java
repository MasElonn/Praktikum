package Polimorphism_Overloading;

import java.awt.Point;



/**
 *
 * @author abi
 */
public class SegiEmpat {
    int x1=0;
    int x2=0;
    int y1=0;
    int y2=0;
    
    public void segiEmpat(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public void segiEmpat(Point topLeft, Point bottomRight){
        x1=topLeft.x;
        y1=topLeft.y;
        x2=bottomRight.x;
        y2=bottomRight.y;
        
    }
     public void segiEmpat(Point topLeft, int w,int h){
        x1=topLeft.x;
        y1=topLeft.y;
        x2=x1+w;
        y2=y1+h;
        
     }
     public void cetakSegiEmpat(){
         System.out.println("Segi Empat <"+x1+","+y1 +","+x2+","+y2+">");
     }
}
