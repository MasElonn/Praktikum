package commform;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author abi
 */
public class SplashScreen extends JWindow {
    BorderLayout borderlayout1 = new BorderLayout();
    JLabel imageLabel = new JLabel();
    JPanel southPanel = new JPanel();
    FlowLayout southPanelFlowLayout = new FlowLayout();
    JProgressBar progressBar = new JProgressBar();
    ImageIcon imageIcon;
    
    public SplashScreen(ImageIcon imageIcon){
        this.imageIcon = imageIcon;
        try{
            initComponents();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void initComponents() throws Exception {
        imageLabel.setIcon(imageIcon);
        this.getContentPane().setLayout(borderlayout1);
        southPanel.setLayout(southPanelFlowLayout);
        southPanel.setBackground(Color.black);
        this.getContentPane().add(imageLabel, BorderLayout.CENTER);
        this.getContentPane().add(southPanel, BorderLayout.SOUTH);
        southPanel.add(progressBar,null);
        this.pack();
        
    }
    
    public void setProgressMax(int maxProgress){
        progressBar.setMaximum(maxProgress);
    }
    public void setProgress(String message, int progress){
        final int theProgress = progress;
        final String theMessage = message;
        EventQueue.invokeLater(() -> {
            progressBar.setValue(theProgress);
            setMessage(theMessage);
        });
        
    }
    public void setScreenVisible(boolean b){
        final boolean boo = b;
        EventQueue.invokeLater(() ->{
            setVisible(boo);
        });
    }
    public void setMessage(String message) {
        if(message != null){
            progressBar.setStringPainted(true);
        } else{
              progressBar.setStringPainted(false);
        }
        progressBar.setString(message);
               
    }
    
}
