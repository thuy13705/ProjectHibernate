package gui;

import pojo.Users;

import javax.swing.*;
import java.awt.*;

public class StudentForm extends javax.swing.JFrame {

    private Users user;
    public StudentForm(Users users) {
        user=users;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        nameSchoolPanel = new javax.swing.JPanel();
        nameSchoolLabel = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        courseRegistrationBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        accountBtn = new javax.swing.JButton();
        signOutLabel = new javax.swing.JLabel();
        managementPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rootPanel.setToolTipText("rootPanel");

        nameSchoolPanel.setBackground(new java.awt.Color(117, 86, 253));
        nameSchoolPanel.setPreferredSize(new java.awt.Dimension(1000, 70));

        nameSchoolLabel.setBackground(new java.awt.Color(51, 186, 240));
        nameSchoolLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nameSchoolLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameSchoolLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameSchoolLabel.setText("Trường đại học khoa học tự nhiên");
        nameSchoolLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nameSchoolPanelLayout = new javax.swing.GroupLayout(nameSchoolPanel);
        nameSchoolPanel.setLayout(nameSchoolPanelLayout);
        nameSchoolPanelLayout.setHorizontalGroup(
                nameSchoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nameSchoolPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameSchoolLabel)
                                .addGap(275, 275, 275))
        );
        nameSchoolPanelLayout.setVerticalGroup(
                nameSchoolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nameSchoolPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(nameSchoolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(173, 240, 249));

        courseRegistrationBtn.setBackground(new java.awt.Color(117, 86, 253));
        courseRegistrationBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        courseRegistrationBtn.setForeground(new java.awt.Color(255, 255, 255));
        courseRegistrationBtn.setText("Course Registration");
        courseRegistrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseRegistrationBtnActionPerformed(evt);
            }
        });

        showBtn.setBackground(new java.awt.Color(117, 86, 253));
        showBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showBtn.setForeground(new java.awt.Color(255, 255, 255));
        showBtn.setText(" Show List Course");

        accountBtn.setBackground(new java.awt.Color(117, 86, 253));
        accountBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accountBtn.setForeground(new java.awt.Color(255, 255, 255));
        accountBtn.setText("My Account");
        accountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBtnActionPerformed(evt);
            }
        });

        signOutLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signOutLabel.setText("Sign Out");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(accountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(courseRegistrationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                                        .addComponent(showBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(signOutLabel)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(accountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(courseRegistrationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                                .addComponent(signOutLabel)
                                .addGap(26, 26, 26))
        );

        managementPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(2, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout managementPanelLayout = new javax.swing.GroupLayout(managementPanel);
        managementPanel.setLayout(managementPanelLayout);
        managementPanelLayout.setHorizontalGroup(
                managementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 912, Short.MAX_VALUE)
        );
        managementPanelLayout.setVerticalGroup(
                managementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
                rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameSchoolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)
                        .addGroup(rootPanelLayout.createSequentialGroup()
                                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(managementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rootPanelLayout.setVerticalGroup(
                rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rootPanelLayout.createSequentialGroup()
                                .addComponent(nameSchoolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(managementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void courseRegistrationBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void accountBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new AccountStudentPanel(user);
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify
    private javax.swing.JButton accountBtn;
    private javax.swing.JButton courseRegistrationBtn;
    private javax.swing.JPanel managementPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nameSchoolLabel;
    private javax.swing.JPanel nameSchoolPanel;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JButton showBtn;
    private javax.swing.JLabel signOutLabel;
    // End of variables declaration
}
