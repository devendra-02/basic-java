package advancejava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginform extends JFrame implements ActionListener {

    private Container container;
    private JLabel headerLabel;  // Added header label
    private JLabel userLabel;
    private JTextField userTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JCheckBox showPasswordCheckBox;
    private JButton loginButton;
    private JButton resetButton;
    private JLabel messageLabel;

    public loginform() {
        setTitle("Login Form by 22EARAD032");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        container = getContentPane();
        container.setLayout(null);

        headerLabel = new JLabel("Login Form by Devendra "); 
        headerLabel.setFont(new Font("Arial", Font.BOLD, 15));
        headerLabel.setBounds(150, 20, 200, 30);
        container.add(headerLabel);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 60, 100, 30);
        container.add(userLabel);

        userTextField = new JTextField();
        userTextField.setBounds(150, 60, 250, 30);
        container.add(userTextField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 110, 100, 30);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 110, 250, 30);
        container.add(passwordField);

        showPasswordCheckBox = new JCheckBox("Show Password");
        showPasswordCheckBox.setBounds(150, 150, 150, 30);
        showPasswordCheckBox.addActionListener(this);
        container.add(showPasswordCheckBox);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 200, 100, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(300, 200, 100, 30);
        resetButton.addActionListener(this);
        container.add(resetButton);

        messageLabel = new JLabel("");
        messageLabel.setBounds(150, 240, 250, 30);
        container.add(messageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userTextField.getText();
            String password = new String(passwordField.getPassword());

            if ("admin".equals(username) && "password".equals(password)) {
                messageLabel.setText("Login successful!");
                messageLabel.setForeground(Color.GREEN);
            } else {
                messageLabel.setText("Invalid credentials.");
                messageLabel.setForeground(Color.RED);
            }
        } else if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
            messageLabel.setText("");
        } else if (e.getSource() == showPasswordCheckBox) {
            if (showPasswordCheckBox.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }

    public static void main(String[] args) {
        new loginform();
    }
}