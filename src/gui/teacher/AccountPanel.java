package gui.teacher;

import dao.TeacherDao;
import gui.ChangePassword;
import gui.CourseSystemFrame;
import pojo.Teacher;
import pojo.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AccountPanel extends javax.swing.JPanel {


    private Users user;
    public AccountPanel(Users users) {
        user=users;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

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
        changePWBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePWBtnActionPerformed(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        showTeacher();

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
                contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(236, 236, 236)
                                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(idText)
                                                        .addComponent(nameText)
                                                        .addComponent(usernameText)
                                                        .addComponent(emailText)))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGap(290, 290, 290)
                                                .addComponent(changePWBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64)
                                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(266, Short.MAX_VALUE))
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
                                .addGap(71, 71, 71)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(changePWBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editBtn))
                                .addContainerGap(179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(managementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(managementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>

    private void showTeacher() {
        Teacher teacher=TeacherDao.getTeacher(user.getUsername());
        idText.setText(teacher.getIdTeacher());
        idText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        nameText.setText(teacher.getNameTeacher());
        nameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        usernameText.setText(teacher.getUsername());
        usernameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        emailText.setText(teacher.getEmail());
        emailText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

    }

    private void editBtnActionPerformed(ActionEvent evt) {

            JDialog dialog=new EditTeacher(new CourseSystemFrame(),true,user);
            dialog.setVisible(true);

    }

    private void changePWBtnActionPerformed(ActionEvent evt) {
        JDialog dialog=new ChangePassword(new CourseSystemFrame(),true,user);
        dialog.setVisible(true);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton changePWBtn;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailText;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idText;
    private javax.swing.JLabel managementLabel;
    private javax.swing.JPanel managementPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameText;
    // End of variables declaration
}
