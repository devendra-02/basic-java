import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StudentRegistrationForm extends JFrame implements ActionListener {
    JLabel labelName, labelFather, labelMother, labelGender, labelDOB, labelMobile, labelEmail, labelAddress, labelCourse, labelBranch, labelAdmissionDate;
    JTextField textName, textFather, textMother, textMobile, textEmail;
    JTextArea textAddress;
    JScrollPane addressScrollPane;
    JComboBox<String> comboCourse, comboBranch;
    JRadioButton male, female;
    JButton submit, reset, exit;
    JCheckBox terms;
    ButtonGroup genderGroup;
    
    JLabel displayName, displayFather, displayMother, displayGender, displayDOB, displayMobile, displayEmail, displayAddress, displayCourse, displayBranch, displayAdmissionDate;
    JPanel formPanel, formPanel2;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form by 22EARAD031");
        setSize(1000, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel titleLabel = new JLabel("Student Registration Form By Dev Kumar Prajapat");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        titleLabel.setBounds(300, 25, 500, 30);
        titleLabel.setForeground(Color.BLUE);
        add(titleLabel);

        formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setBounds(50, 70, 450, 650);
        formPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Student Registration Form"));
        add(formPanel);

        formPanel2 = new JPanel();
        formPanel2.setLayout(null);
        formPanel2.setBounds(500, 70, 450, 650);
        formPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Student Database"));
        add(formPanel2);

        labelName = new JLabel("Student Name:");
        labelFather = new JLabel("Father's Name:");
        labelMother = new JLabel("Mother's Name:");
        labelGender = new JLabel("Gender:");
        labelDOB = new JLabel("Date of Birth:");
        labelMobile = new JLabel("Mobile Number:");
        labelEmail = new JLabel("E-Mail ID:");
        labelAddress = new JLabel("Address:");
        labelCourse = new JLabel("Course:");
        labelBranch = new JLabel("Branch:");
        labelAdmissionDate = new JLabel("Date of Admission:");

        textName = new JTextField();
        textFather = new JTextField();
        textMother = new JTextField();
        textMobile = new JTextField();
        textEmail = new JTextField();
        textAddress = new JTextArea();
        textAddress.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        addressScrollPane = new JScrollPane(textAddress); // Adding scroll functionality to the JTextArea

        String[] courses = {"B.Tech", "B.Sc", "B.Com", "BA"};
        comboCourse = new JComboBox<>(courses);

        String[] branches = {"AI&DS", "Computer Science", "Mechanical", "Civil", "Electrical"};
        comboBranch = new JComboBox<>(branches);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        submit = new JButton("Submit");
        reset = new JButton("Reset");
        exit = new JButton("Exit");
        terms = new JCheckBox("Please Accept Terms & Conditions");

       
        labelName.setBounds(50, 50, 120, 30);
        textName.setBounds(180, 50, 200, 30);
        labelFather.setBounds(50, 90, 120, 30);
        textFather.setBounds(180, 90, 200, 30);
        labelMother.setBounds(50, 130, 120, 30);
        textMother.setBounds(180, 130, 200, 30);
        labelGender.setBounds(50, 170, 120, 30);
        male.setBounds(180, 170, 80, 30);
        female.setBounds(260, 170, 100, 30);
        labelDOB.setBounds(50, 210, 120, 30);
       
        labelMobile.setBounds(50, 250, 120, 30);
        textMobile.setBounds(180, 250, 200, 30);
        labelEmail.setBounds(50, 290, 120, 30);
        textEmail.setBounds(180, 290, 200, 30);
        labelAddress.setBounds(50, 330, 120, 30);
        addressScrollPane.setBounds(180, 330, 200, 60); // Set scroll panel bounds for address
        labelCourse.setBounds(50, 400, 120, 30);
        comboCourse.setBounds(180, 400, 200, 30);
        labelBranch.setBounds(50, 440, 120, 30);
        comboBranch.setBounds(180, 440, 200, 30);
        labelAdmissionDate.setBounds(50, 480, 120, 30);
        
        terms.setBounds(180, 520, 220, 30);
        submit.setBounds(50, 560, 80, 30);
        reset.setBounds(140, 560, 80, 30);
        exit.setBounds(230, 560, 80, 30);

        formPanel.add(labelName);
        formPanel.add(textName);
        formPanel.add(labelFather);
        formPanel.add(textFather);
        formPanel.add(labelMother);
        formPanel.add(textMother);
        formPanel.add(labelGender);
        formPanel.add(male);
        formPanel.add(female);
        formPanel.add(labelDOB);
       
        formPanel.add(labelMobile);
        formPanel.add(textMobile);
        formPanel.add(labelEmail);
        formPanel.add(textEmail);
        formPanel.add(labelAddress);
        formPanel.add(addressScrollPane);
        formPanel.add(labelCourse);
        formPanel.add(comboCourse);
        formPanel.add(labelBranch);
        formPanel.add(comboBranch);
        formPanel.add(labelAdmissionDate);
       
        formPanel.add(terms);
        formPanel.add(submit);
        formPanel.add(reset);
        formPanel.add(exit);

        displayName = new JLabel();
        displayFather = new JLabel();
        displayMother = new JLabel();
        displayGender = new JLabel();
        displayDOB = new JLabel();
        displayMobile = new JLabel();
        displayEmail = new JLabel();
        displayAddress = new JLabel();
        displayCourse = new JLabel();
        displayBranch = new JLabel();
        displayAdmissionDate = new JLabel();

        displayName.setBounds(50, 50, 300, 30);
        displayFather.setBounds(50, 90, 300, 30);
        displayMother.setBounds(50, 130, 300, 30);
        displayGender.setBounds(50, 170, 300, 30);
        displayDOB.setBounds(50, 210, 300, 30);
        displayMobile.setBounds(50, 250, 300, 30);
        displayEmail.setBounds(50, 290, 300, 30);
        displayAddress.setBounds(50, 330, 300, 30);
        displayCourse.setBounds(50, 400, 300, 30);
        displayBranch.setBounds(50, 440, 300, 30);
        displayAdmissionDate.setBounds(50, 480, 300, 30);

        formPanel2.add(displayName);
        formPanel2.add(displayFather);
        formPanel2.add(displayMother);
        formPanel2.add(displayGender);
        formPanel2.add(displayDOB);
        formPanel2.add(displayMobile);
        formPanel2.add(displayEmail);
        formPanel2.add(displayAddress);
        formPanel2.add(displayCourse);
        formPanel2.add(displayBranch);
        formPanel2.add(displayAdmissionDate);

        submit.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);
        setVisible(true);
}}