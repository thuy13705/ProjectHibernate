package gui;

import dao.StudentDao;
import dao.UsersDao;
import pojo.Student;
import pojo.Users;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignIn extends JFrame {
    private JLabel signInLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel msgPassLabel;
    private JLabel msgUserLabel;
    private JTextField usernameTxt;
    private JPasswordField passwordTxt;
    private JButton signInBtn;

    public SignIn(){
        Unit();
    }

    private void Unit() {
        setTitle("SignIn");
        setResizable(false);
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        signInLabel=new JLabel("Sign In",JLabel.CENTER);
        usernameLabel=new JLabel("Username:",JLabel.RIGHT);
        passwordLabel=new JLabel("Password:",JLabel.RIGHT);
        usernameTxt=new JTextField(30);
        passwordTxt=new JPasswordField(30);
        signInBtn=new JButton("Sign In");
        msgPassLabel=new JLabel("Incorrect password!",JLabel.LEFT);
        msgUserLabel=new JLabel("Incorrect username!",JLabel.LEFT);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        signInLabel.setBounds(400,100,200,100);
        signInLabel.setFont(new Font("Arial Black",Font.BOLD,48));
        usernameLabel.setBounds(350,200,100,20);
        passwordLabel.setBounds(350,230,100,20);
        usernameTxt.setBounds(450,200,200,20);
        passwordTxt.setBounds(450,230,200,20);
        signInBtn.setBounds(450,260,100,20);


        this.add(signInBtn);
        this.add(signInLabel);
        this.add(usernameLabel);
        this.add(usernameTxt);
        this.add(usernameLabel);
        this.add(passwordLabel);
        this.add(passwordTxt);
        this.add(msgPassLabel);
        this.add(msgUserLabel);

        signInBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Users sv =
                        UsersDao.getUser(usernameTxt.getText());
                if (sv != null) {
                    String pass=String.copyValueOf(passwordTxt.getPassword());
                    if (pass.equals(sv.getPassUser()))
                        if (sv.getRole()==0)
                        {
                            TeacherForm teacherForm=new TeacherForm();
                            teacherForm.setVisible(true);
                        }
                    else{
                        msgPassLabel.setBounds(450,260,300,20);
                        msgPassLabel.setForeground(new Color(246, 24, 24));
                        signInBtn.setBounds(450,290,100,20);
                    }
                } else {
                    msgUserLabel.setBounds(450,260,300,20);
                    msgUserLabel.setForeground(new Color(246, 24, 24));
                    signInBtn.setBounds(450,290,100,20);
                }
            }
        });
    }
}