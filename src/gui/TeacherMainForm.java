package gui;

import pojo.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TeacherMainForm extends javax.swing.JPanel {

    private Users user;
    public TeacherMainForm(Users users) {
        user=users;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        studentBtn = new javax.swing.JButton();
        teacherBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        subjectBtn = new javax.swing.JButton();
        courseBtn = new javax.swing.JButton();
        semesterBtn = new javax.swing.JButton();
        accountBtn = new javax.swing.JButton();
        sessionBtn = new javax.swing.JButton();
        registrationBtn = new javax.swing.JButton();
        signOutBtn = new javax.swing.JButton();
        nameSchoolPanel = new javax.swing.JPanel();
        nameSchoolLabel = new javax.swing.JLabel();
        managementPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1200, 700));

        menuPanel.setBackground(new java.awt.Color(173, 240, 249));
        menuPanel.setPreferredSize(new java.awt.Dimension(273, 650));

        studentBtn.setBackground(new java.awt.Color(117, 86, 253));
        studentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        studentBtn.setForeground(new java.awt.Color(255, 255, 255));
        studentBtn.setText("Student Management");
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        teacherBtn.setBackground(new java.awt.Color(117, 86, 253));
        teacherBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        teacherBtn.setForeground(new java.awt.Color(255, 255, 255));
        teacherBtn.setText("Teacher Management");
        teacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherBtnActionPerformed(evt);
            }
        });

        classBtn.setBackground(new java.awt.Color(117, 86, 253));
        classBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        classBtn.setForeground(new java.awt.Color(255, 255, 255));
        classBtn.setText("Class Management");
        classBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classBtnActionPerformed(evt);
            }
        });

        subjectBtn.setBackground(new java.awt.Color(117, 86, 253));
        subjectBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subjectBtn.setForeground(new java.awt.Color(255, 255, 255));
        subjectBtn.setText("Subject Management");
        subjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBtnActionPerformed(evt);
            }
        });

        courseBtn.setBackground(new java.awt.Color(117, 86, 253));
        courseBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        courseBtn.setForeground(new java.awt.Color(255, 255, 255));
        courseBtn.setText("Course Management");
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });

        semesterBtn.setBackground(new java.awt.Color(117, 86, 253));
        semesterBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        semesterBtn.setForeground(new java.awt.Color(255, 255, 255));
        semesterBtn.setText("Semester Management");
        semesterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterBtnActionPerformed(evt);
            }
        });

        accountBtn.setBackground(new java.awt.Color(117, 86, 253));
        accountBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accountBtn.setForeground(new java.awt.Color(255, 255, 255));
        accountBtn.setText("My Account");
        accountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBtnActionPerformed(evt);
            }
        });

        sessionBtn.setBackground(new java.awt.Color(117, 86, 253));
        sessionBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sessionBtn.setForeground(new java.awt.Color(255, 255, 255));
        sessionBtn.setText("Session Management");
        sessionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionBtnActionPerformed(evt);
            }
        });

        registrationBtn.setBackground(new java.awt.Color(117, 86, 253));
        registrationBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrationBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrationBtn.setText("Registration Management");
        registrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationBtnActionPerformed(evt);
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
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(accountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(studentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(teacherBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(classBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(subjectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(semesterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sessionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(courseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(registrationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addComponent(signOutBtn)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(accountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(teacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(classBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(subjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(semesterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sessionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(courseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(signOutBtn)
                                .addContainerGap())
        );

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
                                .addContainerGap(333, Short.MAX_VALUE)
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
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        managementPanelLayout.setVerticalGroup(
                managementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(managementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(nameSchoolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1222, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(nameSchoolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                                        .addComponent(managementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>

    private void teacherBtnActionPerformed(ActionEvent evt) {
        JPanel panel=new TeacherPanel();
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }
    private void classBtnActionPerformed(ActionEvent evt) {
        JPanel panel=new ClassPanel();
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }
    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new StudentPanel();
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }

    private void subjectBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new SubjectPanel();
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new CoursePanel();
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }

    private void semesterBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new SemesterPanel();
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }
    private void signOutBtnActionPerformed(ActionEvent evt) {
        JPanel panel=new SignInPanel();
        user=null;
        removeAll();
        setLayout(new BorderLayout());
        add(panel);
        validate();
        repaint();
    }

    private void accountBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new AccountPanel(user);
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }


    private void sessionBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new SessionPanel();
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();    }

    private void registrationBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JPanel panel=new RegistrationPanel();
        managementPanel.removeAll();
        managementPanel.setLayout(new BorderLayout());
        managementPanel.add(panel);
        managementPanel.validate();
        managementPanel.repaint();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton accountBtn;
    private javax.swing.JButton classBtn;
    private javax.swing.JButton courseBtn;
    private javax.swing.JPanel managementPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nameSchoolLabel;
    private javax.swing.JPanel nameSchoolPanel;
    private javax.swing.JButton registrationBtn;
    private javax.swing.JButton semesterBtn;
    private javax.swing.JButton sessionBtn;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JButton studentBtn;
    private javax.swing.JButton subjectBtn;
    private javax.swing.JButton teacherBtn;
    // End of variables declaration
}


