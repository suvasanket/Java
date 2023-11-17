import javax.swing.JFrame;
import javax.swing.JLabel;

public class jlabel {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("hello world");
        // label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.add(label);
    }
}
