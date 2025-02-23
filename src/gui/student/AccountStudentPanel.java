package gui.student;

import dao.StudentDao;
import gui.ChangePassword;
import gui.CourseSystemFrame;
import gui.student.EditStudent;
import pojo.ClassSubject;
import pojo.Student;
import pojo.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountStudentPanel extends javax.swing.JPanel {

    private Users user;
    public AccountStudentPanel(Users users) {
        this.user=users;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        managementPanel = new javax.swing.JPanel();
        managementLabel = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        changePWBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        idText = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        classText = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        genderText = new javax.swing.JLabel();

        managementPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        managementLabel.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        managementLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managementLabel.setText("My Account");

        javax.swing.GroupLayout managementPanelLayout = new javax.swing.GroupLayout(managementPanel);
        managementPanel.setLayout(managementPanelLayout);
        managementPanelLayout.setHorizontalGroup(
                managementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(managementPanelLayout.createSequentialGroup()
                                .addGap(394, 394, 394)
                                .addComponent(managementLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        managementPanelLayout.setVerticalGroup(
                managementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(managementPanelLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(managementLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        idLabel.setText("ID:");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameLabel.setText("Name:");

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emailLabel.setText("Email:");

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usernameLabel.setText("Username:");

        changePWBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        changePWBtn.setText("Change Password");
        changePWBtn.setPreferredSize(new java.awt.Dimension(200, 35));
        changePWBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent avt) {
                changePWBtnActionPerformed(avt);
            }
        });

        editBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                editBtnActionPerformed(actionEvent);
            }
        });



        idText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        idText.setText("");

        nameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameText.setText("");

        usernameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usernameText.setText("");

        emailText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emailText.setText("");

        classLabel.setText("Class:");

        classText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        classText.setText("");

        genderLabel.setText("Gender");
        genderLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        genderText.setText("");
        showStudent();
        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(236, 236, 236)
                                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(classLabel)
                                                        .addComponent(genderLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(classText)
                                                        .addComponent(idText)
                                                        .addComponent(nameText)
                                                        .addComponent(usernameText)
                                                        .addComponent(emailText)
                                                        .addComponent(genderText)))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(220, 220, 220)
                                                .addComponent(changePWBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(71, 71, 71)
                                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(339, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idLabel)
                                        .addComponent(idText))
                                .addGap(29, 29, 29)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameText))
                                .addGap(29, 29, 29)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLabel)
                                        .addComponent(usernameText))
                                .addGap(26, 26, 26)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailLabel)
                                        .addComponent(emailText))
                                .addGap(26, 26, 26)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(classLabel)
                                        .addComponent(classText))
                                .addGap(30, 30, 30)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(genderLabel)
                                        .addComponent(genderText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(changePWBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editBtn))
                                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(managementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(managementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 965, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 621, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>

    private void showStudent() {
        Student student= StudentDao.getStudent(user.getUsername());

        idText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        idText.setText(student.getIdStudent());

        nameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameText.setText(student.getNameStudent());

        usernameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usernameText.setText(student.getUsername());

        emailText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emailText.setText(student.getEmail());

        classLabel.setText("Class:");
        classLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        ClassSubject classSubject= student.getIdClass();
        classText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        if (classSubject!=null)
            classText.setText(classSubject.getNameClass());
        String gender="";
        if (student.getGender()==1){
            gender="Nữ";
        }
        else{
            gender="Nam";
        }
        genderText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        genderText.setText(gender);
    }

    private void editBtnActionPerformed(ActionEvent actionEvent) {
        JDialog dialog=new EditStudent(new CourseSystemFrame(),true,user);
        dialog.setVisible(true);
        showStudent();

    }

    private void changePWBtnActionPerformed(ActionEvent evt) {
        JDialog dialog=new ChangePassword(new CourseSystemFrame(),true,user);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton changePWBtn;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel classText;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailText;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel genderText;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel managementLabel;
    private javax.swing.JPanel managementPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameText;
    // End of variables declaration
}


