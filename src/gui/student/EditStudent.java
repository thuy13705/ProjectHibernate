package gui.student;

import dao.StudentDao;
import dao.TeacherDao;
import gui.CourseSystemFrame;
import pojo.Student;
import pojo.Teacher;
import pojo.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditStudent extends javax.swing.JDialog {

    private Users user;
    public EditStudent(java.awt.Frame parent, boolean modal,Users users) {
        super(parent, modal);
        user=users;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        editLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        editLabel.setBackground(new java.awt.Color(117, 86, 253));
        editLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        editLabel.setForeground(new java.awt.Color(117, 86, 253));
        editLabel.setText("Edit Account");

        nameLabel.setText("Name");

        genderLabel.setText("Gender");

        nameTxt.setColumns(30);

        genderTxt.setColumns(30);

        confirmBtn.setText("Confirm");

        cancelBtn.setText("Cancel");
        Student student= StudentDao.getStudent(user.getUsername());

        nameTxt.setColumns(30);
        nameTxt.setText(student.getNameStudent());
        genderTxt.setColumns(30);
        String gender="";
        if (student.getGender()==1){
            gender="Nữ";
        }
        else{
            gender="Nam";
        }
        genderTxt.setText(gender);
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmBtnActionPerformed(actionEvent);
            }
        });
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cancelBtnActionPerformed(actionEvent);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(genderLabel)
                                                        .addComponent(nameLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addComponent(editLabel))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(confirmBtn)
                                                .addGap(63, 63, 63)
                                                .addComponent(cancelBtn)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(editLabel)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(genderLabel)
                                        .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(confirmBtn)
                                        .addComponent(cancelBtn))
                                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void cancelBtnActionPerformed(ActionEvent actionEvent) {
        setVisible(false);
    }

    private void confirmBtnActionPerformed(ActionEvent actionEvent) {
        String name=nameTxt.getText();
        String gender=genderTxt.getText();
        Student student= StudentDao.getStudent(user.getUsername());
        student.setNameStudent(name);
        if (gender.equals("Nữ")){
            student.setGender(1);
        }
        else if (gender.equals("Nam")){
                student.setGender(0);
            }
        else{
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Gender incorrect.");
            }

        StudentDao.updateStudent(student);
        JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit success.");
        setVisible(false);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel editLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    // End of variables declaration
}

