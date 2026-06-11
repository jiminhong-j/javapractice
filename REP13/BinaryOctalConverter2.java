import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BinaryOctalConverter2 extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextField resultField;
    private JLabel messageLabel;

    private JButton toBinaryButton;
    private JButton toOctalButton;
    private JButton clearButton;

    public BinaryOctalConverter2() {
        setTitle("Binary/Octal convertor");
        setSize(700, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField("Enter value here", 40);

        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setBorder(null);   

        messageLabel = new JLabel("");

        toBinaryButton = new JButton("Convert to binary");
        toOctalButton = new JButton("Convert to octal");
        clearButton = new JButton("Clear");

        toBinaryButton.addActionListener(this);
        toOctalButton.addActionListener(this);
        clearButton.addActionListener(this);

        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.add(inputField, BorderLayout.NORTH);
        leftPanel.add(resultField, BorderLayout.CENTER);
        leftPanel.add(messageLabel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 0, 45));
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

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == toBinaryButton){
            String octal = inputField.getText();

            if(isOctal(octal)){
                resultField.setText(octalToBinary(octal));
                messageLabel.setText("Value converted to binary.");
            } else {
                resultField.setText("Bad Format");
                messageLabel.setText("");
            }

        } else if (e.getSource() == toOctalButton){
            String binary = inputField.getText();

            if(isBinary(binary)){
                resultField.setText(binaryToOctal(binary));
                messageLabel.setText("Value converted to octal.");
            } else {
                resultField.setText("Bad Format");
                messageLabel.setText("");
            }
        } else if(e.getSource() == clearButton){
            inputField.setText("");
            resultField.setText("");
            messageLabel.setText("");
        }
    }

    private boolean isOctal(String value){
        if(value.length() == 0){
            return false;
        }

        for(int i = 0; i < value.length(); i++){
            char c = value.charAt(i);
            if(c < '0' || c > '7'){
                return false;
            }
        }
        
        return true;
    }

    private boolean isBinary(String value){
        if(value.length() == 0){
            return false;
        }
        for (int i = 0; i < value.length(); i++){
            char c = value.charAt(i);

            if(c != '0' && c != '1'){
                return false;
            }
        }
        
        return true;
    }

    private String octalToBinary(String octal){
        String binary = "";

        for(int i = 0; i < octal.length(); i++){
            char c = octal.charAt(i);

            if (c == '0') binary += "000";
            else if(c == '1') binary += "001";
            else if(c == '2') binary += "010";
            else if(c == '3') binary += "011";
            else if(c == '4') binary += "100";
            else if(c == '5') binary += "101";
            else if(c == '6') binary += "110";
            else if(c == '7') binary += "111";
        }

        return binary;
    }

    private String binaryToOctal(String binary){
        while(binary.length() % 3 != 0){
            binary = "0" + binary;
        }

        String octal = "";

        for(int i = 0; i < binary.length(); i += 3){
            String group = binary.substring(i, i+3);

            if(group.equals("000")) octal += "0";
            else if(group.equals("001")) octal += "1";
            else if(group.equals("010")) octal += "2";
            else if(group.equals("011")) octal += "3";
            else if(group.equals("100")) octal += "4";
            else if(group.equals("101")) octal += "5";
            else if(group.equals("110")) octal += "6";
            else if(group.equals("111")) octal += "7";
        }

        return octal;
    }

    public static void main(String[] args) {
        new BinaryOctalConverter2();
    }
}