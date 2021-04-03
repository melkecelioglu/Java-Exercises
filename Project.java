package ImageSlideShow;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author melikekecelioglu
 */
public class Project extends JFrame {

    JLabel pic;
    Timer tm;
    int x = 0;
    String[] list = {"/Users/melikekecelioglu/Downloads/2547772_61391ad8e89d7ee90c7ca69fd49df154_640x640.jpg",//0
                     "/Users/melikekecelioglu/Desktop/Ekran Resmi 2021-03-29 11.26.09.png",//1
                     "/Users/melikekecelioglu/Downloads/sticker_07.png"//2
    };

    public Project() {

        super("Java SlideShow");
        setResizable(true);
        pic = new JLabel();
        pic.setBounds(40, 30, 700, 300);
        SetImageSize(2);                                                //0-1-2
        tm = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if (x >= list.length) {
                    x = 0;
                }
            }
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(800, 400);
        getContentPane().setBackground(Color.decode("#cc0099"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void SetImageSize(int i) {
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

    public static void main(String[] args) {
        new Project();

    }
}
