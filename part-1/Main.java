import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Click Counter");
        JLabel label = new JLabel("Clicks: 0");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        JButton button = new JButton("Click Me");
        frame.add(button, BorderLayout.SOUTH);
        frame.add(label, BorderLayout.CENTER);
        frame.setVisible(true);
        final int[] count = {0};
        button.addActionListener( e-> {
            count[0]++;
            label.setText("clicks: " + count[0]);
        });
    }
}
