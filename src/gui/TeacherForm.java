package gui;

import javax.swing.*;
import java.awt.*;

public class TeacherForm extends JFrame{
    private JPanel nameSchoolLabel;
    private JPanel categoryLabel;
    private JPanel managementLabel;
    private JLabel nameLabel;

    private JButton accountBtn;
    private JButton teacherBtn;
    private JButton studentBtn;
    private JButton semesterBtn;
    private JButton courseBtn;
    private JButton sessionBtn;
    private JButton classBtn;
    private JButton registrationBtn;
    private JButton subjectBtn;

    public TeacherForm(){
        init();
    }

    private void init() {
        setTitle("Management System");
        setResizable(false);
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        nameSchoolLabel=new JPanel();
        categoryLabel=new JPanel();
        managementLabel=new JPanel();
        nameLabel=new JLabel("Ho Chi Minh University Of Science",JLabel.CENTER);

        accountBtn=new JButton("My Account");
        studentBtn=new JButton("Student Management");
        teacherBtn=new JButton("Teacher Management");
        subjectBtn=new JButton("Subject Management");
        classBtn=new JButton("Class Management");
        semesterBtn=new JButton("Semester Management");
        sessionBtn=new JButton("Session Management");
        courseBtn=new JButton("Course Management");
        registrationBtn=new JButton("Registration Management");

        nameLabel.setFont(new Font("Arial Black",Font.BOLD,32));
        nameLabel.setForeground(new Color(253, 251, 251));
        nameSchoolLabel.setBounds(0,0,1000,50);
        nameSchoolLabel.setBackground(new Color(97, 16, 206));
        nameSchoolLabel.add(nameLabel);

        categoryLabel.setBounds(0,50,200,610);
        categoryLabel.setBackground(new Color(198, 171, 234));
        categoryLabel.setBorder(BorderFactory.createLineBorder(Color.darkGray,2,true));
        categoryLabel.setLayout(new GridLayout(9,1,10,10));
        categoryLabel.add(accountBtn);
        categoryLabel.add(studentBtn);
        categoryLabel.add(teacherBtn);
        categoryLabel.add(subjectBtn);
        categoryLabel.add(sessionBtn);
        categoryLabel.add(semesterBtn);
        categoryLabel.add(courseBtn);
        categoryLabel.add(registrationBtn);
        categoryLabel.add(classBtn);

        managementLabel.setBounds(200,50,800,650);
        managementLabel.setBorder(BorderFactory.createLineBorder(Color.darkGray,2,true));
        JLabel idLabel=new JLabel("ID:");
        JLabel nameLabel=new JLabel("Name:");
        JLabel addressLabel=new JLabel("Address:");
        JLabel mailLabel=new JLabel("Email:");

        JLabel idValueLabel=new JLabel("1");
        JLabel nameValueLabel=new JLabel("1");
        JLabel addressValueLabel=new JLabel("Address:");
        JLabel mailValueLabel=new JLabel("Email:");
        JPanel panelAccount=new JPanel();
        panelAccount.setBackground(new Color(183,242,22));
        panelAccount.setLayout(null);
        panelAccount.add(idLabel);
        panelAccount.add(idValueLabel);
        panelAccount.add(nameLabel);
        panelAccount.add(nameValueLabel);
        panelAccount.add(addressLabel);
        panelAccount.add(addressValueLabel);
        panelAccount.add(mailLabel);
        panelAccount.add(mailValueLabel);
        idLabel.setBounds(100,50,100,20);

        managementLabel.setLayout(null);
        managementLabel.add(panelAccount);
        panelAccount.setBounds(0,50,800,400);

        this.add(nameSchoolLabel);
        this.add(categoryLabel);
        this.add(managementLabel);
    }

}
