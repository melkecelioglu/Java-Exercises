/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createswing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author melikekecelioglu
 */
public class CreateSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame form=new JFrame("Merhaba");
        
        JTextField t1=new JTextField("Merhaba Dünya");
        JTextField t2=new JTextField("Merhaba Ay");
        JButton b=new JButton("Merhaba Buton");
        form.add(t2);
        form.add(b);
        b.setVisible(true);
        form.add(t1);
        form.setVisible(true);
        form.setSize(200, 200);
        form.setLayout(new FlowLayout());
        form.pack();
        
    }
    
}
