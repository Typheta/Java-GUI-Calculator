import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calc extends JFrame implements ActionListener {
    private JLabel num1Label, num2Label, resultLabel;
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton, clearButton;

    public calc() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create labels
        num1Label = new JLabel("Number 1: ");
        num2Label = new JLabel("Number 2: ");
        resultLabel = new JLabel("Result: ");

        // create text fields
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        // create buttons
        addButton = new JButton("Add");
        addButton.addActionListener(this);
        subtractButton = new JButton("Subtract");
        subtractButton.addActionListener(this);
        multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(this);
        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        

        // create panel and add components
        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(clearButton);



        // add panel to frame
        getContentPane().add(panel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = 0.0;

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        }
        
        else if (e.getSource() == multiplyButton) {
        	result = num1 * num2;
        }
        
        else if (e.getSource() == divideButton) {
        	result = num1/num2;
        }
        
        else if (e.getSource() == clearButton) {
        	num1 = 0;
        	num2 = 0;
        	result = 0;
        	num1Field.setText("");
        	num2Field.setText("");
        	
        }

        resultField.setText(Double.toString(result));
    }

    public static void main(String[] args) {
        new calc();
    }
}
