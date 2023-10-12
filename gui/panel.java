package gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel {

  public static void main(String[] args) {
    ImageIcon icon = new ImageIcon("icons8-java-50.png");

    JLabel label1 = new JLabel();
    label1.setIcon(icon);
    label1.setSize(10, 10);

    JPanel bluepanel = new JPanel();
    bluepanel.setBackground(Color.blue);
    bluepanel.setBounds(0, 0, 250, 250);
    bluepanel.add(label1);

    JPanel redpanel = new JPanel();
    redpanel.setBackground(Color.red);
    redpanel.setBounds(250, 0, 250, 250);

    JPanel greenpanel = new JPanel();
    greenpanel.setBackground(Color.green);
    greenpanel.setBounds(0, 250, 500, 250);

    JFrame frame = new JFrame("test");
    frame.setVisible(true);
    frame.setSize(750, 750);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.add(label1);
    frame.add(bluepanel);
    frame.add(redpanel);
    frame.add(greenpanel);
    // frame.pack();
  }
}
