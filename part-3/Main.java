import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Theme color selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(800, 100));
        panel1.setBackground(Color.GRAY);
        frame.add(panel1, BorderLayout.NORTH);
        JPanel panel2 = new JPanel();
        frame.add(panel2, BorderLayout.CENTER);
        JButton button1 = new JButton("Red");
        JButton button2 = new JButton("Green");
        JButton button3 = new JButton("Blue");
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        frame.setVisible(true);

        button1.addActionListener(e-> {
            panel2.setBackground(Color.RED);
        });
        button2.addActionListener(e-> {
            panel2.setBackground(Color.GREEN);
        });
        button3.addActionListener(e-> {
            panel2.setBackground(Color.BLUE);
        });

    }
}
