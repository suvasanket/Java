package gui;
import javax.swing.JFrame;

public class frame extends JFrame {
  public frame() {
    this.setVisible(true);
    this.setName("frame");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1435, 800);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setName("frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1435, 800);
  }
}
