import java.awt.*;
import javax.swing.*;

public class BinaryOctalConverter1 extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    private JButton toBinaryButton;
    private JButton toOctalButton;
    private JButton clearButton;

    public BinaryOctalConverter1() {
        setTitle("Binary/Octal convertor");
        setSize(600, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField("Enter value here");

        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));

        toBinaryButton = new JButton("Converet to binary");
        toOctalButton = new JButton("Convert to octal");
        clearButton = new JButton("Clear");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
        buttonPanel.add(toBinaryButton);
        buttonPanel.add(toOctalButton);
        buttonPanel.add(clearButton);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultPanel.add(resultLabel, BorderLayout.CENTER);

        add(inputField, BorderLayout.NORTH);
        add(resultPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);

        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new BinaryOctalConverter1();
    }
}