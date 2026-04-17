package commform;

import javax.swing.*;

/**
 *
 * @author abi
 */

public class SplashScreenDemo {
    SplashScreen screen;
    
    public SplashScreenDemo(){
        splashScreenInit();
        
        for(int i=0; i<=100;i++){
            try{
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
            screen.setProgress(i+"%",i);
        }
        splashScreenDestruct();
        System.exit(0);
        
    }

    private void splashScreenDestruct() {
      screen.setScreenVisible(false);
    }
    
    public  void splashScreenInit() {
       ImageIcon myImage = new ImageIcon("src/assets/GudangKu-icon.png");
       screen = new SplashScreen(myImage);
       screen.setLocationRelativeTo(null);
       screen.setProgressMax(100);
       screen.setVisible(true);
    }
    
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        }catch(Exception e){
            e.printStackTrace();
        }
        new SplashScreenDemo();
      
    }

}
