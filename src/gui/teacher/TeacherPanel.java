package gui.teacher;

import dao.TeacherDao;
import dao.UsersDao;
import gui.CourseSystemFrame;
import gui.teacher.AddTeacher;
import pojo.Teacher;
import pojo.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.*;

public class TeacherPanel extends javax.swing.JPanel {

    private Teacher teacher=null;

    public TeacherPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        namePanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        teacherTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortBox = new javax.swing.JComboBox<>();
        sortBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();

        namePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));

        studentLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentLabel.setText("Teacher Management");

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
                namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studentLabel)
                                .addGap(407, 407, 407))
        );
        namePanelLayout.setVerticalGroup(
                namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(namePanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(studentLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        List<Teacher> list= TeacherDao.getTeacherList();
        showTable(list);
        teacherTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherTableMouseClicked(evt);
            }
        });
        tableScroll.setViewportView(teacherTable);

        addBtn.setText("Add Teacher");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        sortBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending Name", "Descending Name", "Ascending ID", "Descending ID" }));

        sortBtn.setText("Sort");
        sortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBtnActionPerformed(evt);
            }
        });

        idLabel.setText("ID:");

        nameLabel.setText("Name:");

        usernameLabel.setText("Username");

        emailLabel.setText("Email");


        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        
        deleteBtn.setText("Delete");
        deleteBtn.setToolTipText("");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset  Password");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tableScroll)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sortBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortBtn)
                                .addGap(33, 33, 33)
                                .addComponent(addBtn)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(57, 57, 57))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addComponent(editBtn)
                                                .addGap(132, 132, 132)
                                                .addComponent(deleteBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(resetBtn)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(usernameLabel)
                                                        .addComponent(emailLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchBtn)
                                        .addComponent(addBtn)
                                        .addComponent(sortBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sortBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idLabel)
                                        .addComponent(emailLabel)
                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameLabel)
                                        .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editBtn)
                                        .addComponent(deleteBtn)
                                        .addComponent(resetBtn))
                                .addContainerGap(68, Short.MAX_VALUE))
        );
        deleteBtn.setEnabled(false);
        editBtn.setEnabled(false);
        resetBtn.setEnabled(false);
    }// </editor-fold>

    private void showTable(List<Teacher> list) {
        int size= list.size();
        Object [][] teachers=new Object[size][7];
        for (int i=0;i<size; i++){
            teachers[i][0]=i+1;
            teachers[i][1]=list.get(i).getIdTeacher();
            teachers[i][2]=list.get(i).getNameTeacher();
            teachers[i][3]=list.get(i).getUsername();
            teachers[i][4]=list.get(i).getEmail();
        }
        teacherTable.setModel(new javax.swing.table.DefaultTableModel(teachers,
                new String [] {
                        "STT", "ID", "Name", "Username", "Email"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }

    private void editBtnActionPerformed(ActionEvent evt) {
        int output=JOptionPane.showConfirmDialog(new CourseSystemFrame(),"Are you sure you want to edit?", String.valueOf(JOptionPane.QUESTION_MESSAGE),JOptionPane.YES_NO_OPTION);
        if (output==JOptionPane.YES_OPTION){
            String id=idTxt.getText();
            String name=nameTxt.getText();
            String username=usernameTxt.getText();
            String email=emailTxt.getText();

            if (name!="" &&  username!="" && email!=""){
                TeacherDao.updateTeacher(new Teacher(id,name,username,teacher.getPasswordTc(),email));
                UsersDao.updateUser(new Users(username,teacher.getPasswordTc(),0));
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit success.");

            }
            else
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Has a empty field.");
        }
        else
            resetInformation();

        List<Teacher> list=TeacherDao.getTeacherList();
        showTable(list);
        resetInformation();
    }

    private void searchBtnActionPerformed(ActionEvent evt) {
        List<Teacher> list=TeacherDao.fullTextSearch(searchTxt.getText());
        if (sortBox.getSelectedIndex()==0)
            list=sortAscendingByName(list);
        if (sortBox.getSelectedIndex()==1)
            list=sortDescendingByName(list);
        if (sortBox.getSelectedIndex()==2)
            list=sortAscendingByID(list);
        if (sortBox.getSelectedIndex()==3)
            list=sortDescendingByID(list);
        showTable(list);
    }

    private void teacherTableMouseClicked(java.awt.event.MouseEvent evt) {
        idTxt.setEnabled(false);
        deleteBtn.setEnabled(true);
        editBtn.setEnabled(true);
        resetBtn.setEnabled(true);
        int row=teacherTable.getSelectedRow();
        if (row>=0){
            idTxt.setText(teacherTable.getModel().getValueAt(row,1).toString());
            nameTxt.setText(teacherTable.getModel().getValueAt(row,2).toString());
            usernameTxt.setText(teacherTable.getModel().getValueAt(row,3).toString());
            emailTxt.setText(teacherTable.getModel().getValueAt(row,4).toString());
            teacher= TeacherDao.getTeacher(teacherTable.getModel().getValueAt(row,1).toString());
        }
    }

    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {
        List<Teacher> list=TeacherDao.getTeacherList();
        if (sortBox.getSelectedIndex()==0)
            list=sortAscendingByName(list);
        if (sortBox.getSelectedIndex()==1)
            list=sortDescendingByName(list);
        if (sortBox.getSelectedIndex()==2)
            list=sortAscendingByID(list);
        if (sortBox.getSelectedIndex()==3)
            list=sortDescendingByID(list);
        showTable(list);
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String id=teacher.getIdTeacher();

        int output=JOptionPane.showConfirmDialog(new CourseSystemFrame(),"Are you sure you want to delete?", String.valueOf(JOptionPane.QUESTION_MESSAGE),JOptionPane.YES_NO_OPTION);
        if (output==JOptionPane.YES_OPTION){
            TeacherDao.deleteTeacher(id);
            UsersDao.deleteUser(id);
        }
        else
            resetInformation();
        List<Teacher> list=TeacherDao.getTeacherList();
        showTable(list);
        resetInformation();
    }

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int output= JOptionPane.showConfirmDialog(new CourseSystemFrame(),"Are you sure you want to reset password?", String.valueOf(JOptionPane.QUESTION_MESSAGE),JOptionPane.YES_NO_OPTION);
        if (output==JOptionPane.YES_OPTION){
            teacher.setPasswordTc(teacher.getPasswordTc());
            Users users=new Users(teacher.getUsername(),teacher.getPasswordTc(),1);
            TeacherDao.updateTeacher(teacher);
            UsersDao.updateUser(users);
        }
        List<Teacher> list=TeacherDao.getTeacherList();
        showTable(list);
        resetInformation();
    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JDialog dialog=new AddTeacher(new CourseSystemFrame(),true);
        dialog.setVisible(true);
        List<Teacher> list=TeacherDao.getTeacherList();
        showTable(list);
    }

    public List<Teacher> sortAscendingByID(List<Teacher> list){
        Collections.sort(list, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher  sv1, Teacher sv2) {
                return sv1.getIdTeacher().compareTo(sv2.getIdTeacher());
            }
        });
        return list;
    }

    public List<Teacher> sortDescendingByID(List<Teacher> list){
        Collections.sort(list, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher  sv1, Teacher sv2) {
                return sv2.getIdTeacher().compareTo(sv1.getIdTeacher());
            }
        });
        return list;
    }

    public List<Teacher> sortAscendingByName(List<Teacher> list){
        Collections.sort(list, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher  sv1, Teacher sv2) {
                return sv1.getNameTeacher().compareTo(sv2.getNameTeacher());
            }
        });
        return list;
    }

    public List<Teacher> sortDescendingByName(List<Teacher> list){
        Collections.sort(list, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher  sv1, Teacher sv2) {
                return sv2.getNameTeacher().compareTo(sv1.getNameTeacher());
            }
        });
        return list;
    }

    private void resetInformation(){
        idTxt.setEnabled(true);
        idTxt.setText("");
        nameTxt.setText("");
        usernameTxt.setText("");
        emailTxt.setText("");
        deleteBtn.setEnabled(false);
        editBtn.setEnabled(false);
        resetBtn.setEnabled(false);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel namePanel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JComboBox<String> sortBox;
    private javax.swing.JButton sortBtn;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JTable teacherTable;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration                   
}
