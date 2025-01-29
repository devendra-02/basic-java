
package advancejava;

import javax.swing.*;

public class prg_1 { 
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Swing Example Created By Devendra");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Using null layout for manual component positioning

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 100, 30);  // (x, y, width, height)
        frame.add(button);

        // Create a text field
        JTextField textField = new JTextField();
        textField.setBounds(50, 100, 150, 30);  // (x, y, width, height)
        frame.add(textField);

        // Create a radio button
        JRadioButton radioButton = new JRadioButton("Option 1");
        radioButton.setBounds(50, 150, 100, 30);  // (x, y, width, height)
        frame.add(radioButton);

        // Set the frame visibility
        frame.setVisible(true);
    }
}

