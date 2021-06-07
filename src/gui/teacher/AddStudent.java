package gui.teacher;

import dao.ClassSubjectDao;
import dao.StudentDao;
import dao.UsersDao;
import gui.CourseSystemFrame;
import pojo.ClassSubject;
import pojo.Student;
import pojo.Users;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddStudent extends javax.swing.JDialog {


    public AddStudent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        addLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JButton();
        canccelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        addLabel.setForeground(new java.awt.Color(117, 86, 253));
        addLabel.setText("Add Student");

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLabel.setText("ID:");
        idLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameLabel.setText("Name:");

        genderLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        genderLabel.setText("Gender:");

        idTxt.setColumns(30);
        idTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        nameTxt.setColumns(30);
        nameTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        genderTxt.setColumns(30);
        genderTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

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


        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Class:");

        jTextField1.setColumns(30);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(218, 218, 218)
                                                .addComponent(addLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addComponent(confirmBtn)
                                                .addGap(142, 142, 142)
                                                .addComponent(canccelBtn)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(nameLabel)
                                        .addComponent(idLabel)
                                        .addComponent(genderLabel))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(addLabel)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idLabel)
                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(genderLabel)
                                        .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(confirmBtn)
                                        .addComponent(canccelBtn))
                                .addGap(109, 109, 109))
        );

        pack();
    }// </editor-fold>
    private void cancelBtnActionPerformed(ActionEvent actionEvent) {
        setVisible(false);
    }

    private void confirmBtnActionPerformed(ActionEvent actionEvent) {
        String id=idTxt.getText();
        System.out.println(id);
        String name=nameTxt.getText();
        String gender=genderTxt.getText();
        ClassSubject classes=ClassSubjectDao.getClass(jTextField1.getText());
        if (!id.equals("")){
           Student st=StudentDao.getStudent(id);
           if (st==null){
               String username=id;
               String email=id+"@student.hcmus.edu.vn";
               String pass=id;
               Integer tmp=1;
               if (gender.equalsIgnoreCase("Nữ"))
                   tmp=1;
               else if (gender.equalsIgnoreCase("Nam"))
                   tmp=0;
               else
                   JOptionPane.showMessageDialog(new CourseSystemFrame(),"Gender Incorrect.");
               Student student=new Student();
               if (classes!=null){
                   student=new Student(id,name,username,pass,email,tmp,classes);
               }
               else{
                   if (jTextField1.getText().equals(""))
                       student=new Student(id,name,username,pass,email,tmp);
                   else{
                       JOptionPane.showMessageDialog(new CourseSystemFrame(),"Class not exist");
                       return;
                   }
               }
               StudentDao.addStudent(student);
               Users user=new Users(id,pass,1);
               UsersDao.addUser(user);
               JOptionPane.showMessageDialog(new CourseSystemFrame(),"Add student success.");
               setVisible(false);

           }
           else{
               JOptionPane.showMessageDialog(new CourseSystemFrame(),"Student exist.");
           }
        }
        else{
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"Field is empty.");
        }

    }

    // Variables declaration - do not modify
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton canccelBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    // End of variables declaration
}

