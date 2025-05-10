import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("User Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridBagLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setBackground(Color.GRAY);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel label1 = new JLabel("Name:");
        panel.add(label1, gbc);
        gbc.gridx = 1;
        final JTextField textField1 = new JTextField(20);
        panel.add(textField1, gbc);

        gbc.gridx =0;
        gbc.gridy = 1;
        JLabel label2 = new JLabel("Email:");
        panel.add(label2, gbc);
        gbc.gridx = 1;
        final JTextField textField2 = new JTextField(20);
        panel.add(textField2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel label3 = new JLabel("Password:");
        panel.add(label3, gbc);

        gbc.gridx = 1;
        JPasswordField textField3 = new JPasswordField(20);
        panel.add(textField3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel label4 = new JLabel("Gender:");
        panel.add(label4, gbc);
        JRadioButton radioButton1 = new JRadioButton("Male");
        JRadioButton radioButton2 = new JRadioButton("Female");
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0)); // Adds horizontal spacing
        radioPanel.add(radioButton1);
        radioPanel.add(radioButton2);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(radioPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel label5 = new JLabel("Interests:");
        panel.add(label5, gbc);

        JCheckBox checkBox1 = new JCheckBox("Java");
        JCheckBox checkBox2 = new JCheckBox("Python");
        JCheckBox checkBox3 = new JCheckBox("C++");

        JPanel checkPanel = new JPanel();
        checkPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));

        checkPanel.add(checkBox1);
        checkPanel.add(checkBox2);
        checkPanel.add(checkBox3);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(checkPanel, gbc);

        JButton button1 = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(button1, gbc);
        frame.add(panel);
        frame.setVisible(true);


        button1.addActionListener(e->{

            String gender = "";
            if(radioButton1.isSelected()){
                gender = "Male";
            }
            else if (radioButton2.isSelected()){
                gender = "Female";
            }
            String interests = "";
            if(checkBox1.isSelected()){
                interests = "Java";
            }
            else if (checkBox2.isSelected()){
                interests = "Python";
            }
            else if (checkBox3.isSelected()){
                interests = "C++";
            }


            String fullInformation = "Name : " + textField1.getText() + "\nEmail : " + textField2.getText() +
                    "\n Gender: " + gender +  "\n Interests : " + interests;


            JOptionPane.showMessageDialog(frame, fullInformation, "Registration Details", JOptionPane.INFORMATION_MESSAGE);

        });
    }
}
