package gui;

import pojo.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class StudentMainForm extends javax.swing.JPanel {

    private Users user;
    public StudentMainForm(Users users) {
        user=users;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        nameSchoolPanel = new javax.swing.JPanel();
        nameSchoolLabel = new javax.swing.JLabel();
        managementPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        courseBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        accountBtn = new javax.swing.JButton();
        signOutBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 700));

        nameSchoolPanel.setBackground(new java.awt.Color(117, 86, 253));
        nameSchoolPanel.setPreferredSize(new java.awt.Dimension(1200, 50));

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

        managementPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(2, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout managementPanelLayout = new javax.swing.GroupLayout(managementPanel);
        managementPanel.setLayout(managementPanelLayout);
        managementPanelLayout.setHorizontalGroup(
                managementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 956, Short.MAX_VALUE)
        );
        managementPanelLayout.setVerticalGroup(
                managementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        menuPanel.setBackground(new java.awt.Color(173, 240, 249));
        menuPanel.setPreferredSize(new java.awt.Dimension(275, 650));

        courseBtn.setBackground(new java.awt.Color(117, 86, 253));
        courseBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        courseBtn.setForeground(new java.awt.Color(255, 255, 255));
        courseBtn.setText("Course Registration");
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });

        showBtn.setBackground(new java.awt.Color(117, 86, 253));
        showBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showBtn.setForeground(new java.awt.Color(255, 255, 255));
        showBtn.setText("Show Course Registration");

        accountBtn.setBackground(new java.awt.Color(117, 86, 253));
        accountBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accountBtn.setForeground(new java.awt.Color(255, 255, 255));
        accountBtn.setText("My Account");
        accountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBtnActionPerformed(evt);
            }
        });

        signOutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signOutBtn.setText("Sign Out");
        signOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(accountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(courseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(signOutBtn)
                                .addGap(82, 82, 82))
        );
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(accountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(courseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE)
                                .addComponent(signOutBtn)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(managementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(nameSchoolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(nameSchoolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                                        .addComponent(managementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>

    private void signOutBtnActionPerformed(ActionEvent evt) {
        JPanel panel=new SignInPanel();
        user=null;
        removeAll();
        setLayout(new BorderLayout());
        add(panel);
        validate();
        repaint();
    }

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new CourseStudentPanel();
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }

    private void accountBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new AccountStudentPanel(user);
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton accountBtn;
    private javax.swing.JButton courseBtn;
    private javax.swing.JPanel managementPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nameSchoolLabel;
    private javax.swing.JPanel nameSchoolPanel;
    private javax.swing.JButton showBtn;
    private javax.swing.JButton signOutBtn;
    // End of variables declaration
}

