package basic_form;

import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author abi
 */
public class FrameDemo extends JFrame {

    public FrameDemo() {
        setTitle("Frame Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        initComponents();
    }

    private void initComponents() {
        JLabel lblPesan = new JLabel();
        String Pesan = "Hak cipta Dilindungi UU";
        lblPesan.setText(Pesan);
        JLabel nama = new JLabel("Riendra ABIMANYU");
        JLabel kelas = new JLabel("XRPLA");
        JLabel sekolah = new JLabel("SMKS PGRI 3 MALANG");

        JButton btnKeluar = new JButton("Keluar");
        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(gl.createParallelGroup()
                .addComponent(lblPesan)
                .addComponent(nama)
                .addComponent(kelas)
                .addComponent(sekolah)
                .addComponent(btnKeluar)
                
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(lblPesan)
                .addComponent(nama)
                .addComponent(kelas)
                .addComponent(sekolah)
                .addComponent(btnKeluar)
        );
        
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new FrameDemo().setVisible(true);
        });

    }

}
