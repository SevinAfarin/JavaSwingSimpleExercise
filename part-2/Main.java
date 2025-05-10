import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);


        JLabel label = new JLabel("Enter your name and press greet");
        label.setBounds(100, 100, 200, 50);
        frame.add(label);

        JLabel label2 = new JLabel("Name :");
        label2.setBounds(50, 50, 100, 50);
        frame.add(label2);

        JTextField textField = new JTextField();
        textField.setBounds(100, 50, 100, 50);
        textField.setOpaque(true);
        frame.add(textField);

        JButton button = new JButton("Greet");
        button.setBounds(200, 50, 80, 40);
        frame.add(button);
        frame.setVisible(true);
        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Hello "+name);
        });


    }
}
