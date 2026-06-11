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
        setSize(700, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField("Enter value here", 40);

        resultLabel = new JLabel("");

        toBinaryButton = new JButton("Convert to binary");
        toOctalButton = new JButton("Convert to octal");
        clearButton = new JButton("Clear");

        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.add(inputField, BorderLayout.NORTH);
        leftPanel.add(resultLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 0, 35));
        buttonPanel.add(toBinaryButton);
        buttonPanel.add(toOctalButton);
        buttonPanel.add(clearButton);

        JPanel rightPanel = new JPanel(new FlowLayout());
        rightPanel.add(buttonPanel);

        add(leftPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);

        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new BinaryOctalConverter1();
    }
}