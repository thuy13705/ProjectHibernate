package gui.teacher;

import dao.TeacherDao;
import dao.UsersDao;
import gui.CourseSystemFrame;
import pojo.Teacher;
import pojo.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTeacher extends javax.swing.JDialog {

    public AddTeacher(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        addLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JButton();
        canccelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        addLabel.setForeground(new java.awt.Color(117, 86, 253));
        addLabel.setText("Add Teacher");

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLabel.setText("ID:");
        idLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameLabel.setText("Name:");

        idTxt.setColumns(30);
        idTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        nameTxt.setColumns(30);
        nameTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        confirmBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                confirmBtnActionPerformed(actionEvent);
            }
        });

        canccelBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        canccelBtn.setText("Cancel");
        canccelBtn.addActionListener(new ActionListener() {
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
                                                .addGap(209, 209, 209)
                                                .addComponent(confirmBtn)
                                                .addGap(100, 100, 100)
                                                .addComponent(canccelBtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(nameLabel)
                                                        .addComponent(idLabel))
                                                .addGap(60, 60, 60)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(274, 274, 274)
                                                .addComponent(addLabel)))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(addLabel)
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idLabel)
                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(confirmBtn)
                                        .addComponent(canccelBtn))
                                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void cancelBtnActionPerformed(ActionEvent actionEvent) {
        setVisible(false);
    }

    private void confirmBtnActionPerformed(ActionEvent actionEvent) {
        String id=idTxt.getText();
        String name=nameTxt.getText();
        if (id.equals("")){
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID is empty.");
        }
        else{
            Teacher teacher= TeacherDao.getTeacher(id);
            if (teacher==null){
                String email=id+"@gv.hcmus.edu.vn";
                TeacherDao.addTeacher(new Teacher(id,name,id,id,email));
                UsersDao.addUser(new Users(id,id,0));
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Add Teacher successfully.");
                setVisible(false);
            }
            else
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID exists.");
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton canccelBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    // End of variables declaration
}
