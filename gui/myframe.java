package gui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class myframe {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("icons8-java-50.png");
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.red, 3);
        label.setText("Traveller");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setFont(new FontUIResource("MV Boli", FontUIResource.PLAIN, 20));
        label.setForeground(new ColorUIResource(0x0FF000));
        label.setBounds(0, 0, 10, 10);
        label.setBorder(border);

        // frame
        JFrame frame = new JFrame("test");
        frame.setVisible(true);
        frame.setSize(430, 430);
        frame.setBackground(new Color(0x123455));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();

    }
}
