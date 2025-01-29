package advancejava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Student General Form 22EARAD032 ");
        frame.setSize(500, 400);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        
        JLabel titleLabel = new JLabel("Student General Form Devendra ");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        titleLabel.setBounds(150, 10, 300, 30);
        frame.add(titleLabel);

        
        JLabel nameLabel = new JLabel("Name of Student:");
        nameLabel.setBounds(50, 60, 120, 30);
        frame.add(nameLabel);
        

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 60, 200, 30);
        frame.add(nameField);

        
        JLabel fatherNameLabel = new JLabel("Father's Name:");
        fatherNameLabel.setBounds(50, 100, 120, 30);
        frame.add(fatherNameLabel);

        JTextField fatherNameField = new JTextField();
        fatherNameField.setBounds(200, 100, 200, 30);
        frame.add(fatherNameField);

        
        JLabel dobLabel = new JLabel("D.O.B:");
        dobLabel.setBounds(50, 140, 120, 30);
        frame.add(dobLabel);

        String[] days = { "Date", "1", "2", "3","4","5","6","7","8","9","10","11","12","13","....","30","31" };
        JComboBox<String> dayBox = new JComboBox<>(days);
        dayBox.setBounds(200, 140, 60, 30);
        frame.add(dayBox);

        String[] months = {"month","Jan", "Feb", "Mar", "April", " May ", "June", "July","August",
        		"September","October","November" ,"Dec" };
        JComboBox<String> monthBox = new JComboBox<>(months);
        monthBox.setBounds(270, 140, 60, 30);
        frame.add(monthBox);

        String[] years = { "Year", "1990", "1991", "1992", "1993", "1994","1995","1996","1997","1998",
        		"1999","2000","2001","2002","2003","2004","2005","2006","...","2024" };
        JComboBox<String> yearBox = new JComboBox<>(years);
        yearBox.setBounds(340, 140, 60, 30);
        frame.add(yearBox);

        
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 180, 120, 30);
        frame.add(genderLabel);

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(200, 180, 80, 30);
        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(280, 180, 80, 30);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        frame.add(maleButton);
        frame.add(femaleButton);

        
        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 220, 120, 30);
        frame.add(courseLabel);

        String[] courses = { "B.Tech", "M.Tech", "B.Sc", "M.Sc" };
        JComboBox<String> courseBox = new JComboBox<>(courses);
        courseBox.setBounds(200, 220, 200, 30);
        frame.add(courseBox);

        
        JLabel branchLabel = new JLabel("Branch:");
        branchLabel.setBounds(50, 260, 120, 30);
        frame.add(branchLabel);

        String[] branches = { "Computer Science", "Mechanical", "Electrical", "Civil","AI&DS" };
        JComboBox<String> branchBox = new JComboBox<>(branches);
        branchBox.setBounds(200, 260, 200, 30);
        frame.add(branchBox);

        
        JLabel collegeLabel = new JLabel("College:");
        collegeLabel.setBounds(50, 300, 120, 30);
        frame.add(collegeLabel);

        String[] colleges = { "Arya College of Engineering & IT, Kukas", "Other College 1", "Other College 2" };
        JComboBox<String> collegeBox = new JComboBox<>(colleges);
        collegeBox.setBounds(200, 300, 200, 30);
        frame.add(collegeBox);

        
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 340, 90, 30);
        frame.add(submitButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(200, 340, 90, 30);
        frame.add(resetButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(300, 340, 90, 30);
        frame.add(exitButton);

        
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                fatherNameField.setText("");
                dayBox.setSelectedIndex(0);
                monthBox.setSelectedIndex(0);
                yearBox.setSelectedIndex(0);
                genderGroup.clearSelection();
                courseBox.setSelectedIndex(0);
                branchBox.setSelectedIndex(0);
                collegeBox.setSelectedIndex(0);
            }
        });

        
        frame.setVisible(true);;
}
}