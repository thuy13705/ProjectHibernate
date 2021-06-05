package gui.teacher;

import dao.ClassSubjectDao;
import dao.StudentDao;
import dao.TeacherDao;
import dao.UsersDao;
import gui.student.AddStudent;
import gui.CourseSystemFrame;
import pojo.ClassSubject;
import pojo.Student;
import pojo.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class StudentPanel extends javax.swing.JPanel {

    private Student student;
    public StudentPanel() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        namePanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortBox = new javax.swing.JComboBox<>();
        sortBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        ckassTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 700));

        namePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));

        studentLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentLabel.setText("Student Management");

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
        List<Student> list=StudentDao.getStudentList();
        showTable(list);
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        tableScroll.setViewportView(studentTable);

        addBtn.setText("Add Student");
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addBtnActionPerformed(actionEvent);
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

        classLabel.setText("Class");

        genderLabel.setText("Gender");
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(usernameLabel)
                                                        .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(57, 57, 57)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(genderLabel)
                                                        .addComponent(classLabel)
                                                        .addComponent(emailLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ckassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(editBtn)
                                                .addGap(159, 159, 159)
                                                .addComponent(deleteBtn)
                                                .addGap(146, 146, 146)
                                                .addComponent(resetBtn)))
                                .addGap(61, 61, 61))
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
                                        .addComponent(classLabel)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ckassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLabel)
                                        .addComponent(genderLabel)
                                        .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editBtn)
                                        .addComponent(deleteBtn)
                                        .addComponent(resetBtn))
                                .addContainerGap(41, Short.MAX_VALUE))
        );

    }// </editor-fold>

    private void searchBtnActionPerformed(ActionEvent evt) {
        List<Student> list=StudentDao.fullTextSearch(searchTxt.getText());
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
    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {
        List<Student> list=StudentDao.getStudentList();
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


    private void addBtnActionPerformed(ActionEvent evt) {
        JDialog dialog=new AddStudent(new CourseSystemFrame(),true);
        dialog.setVisible(true);
        List<Student> list=StudentDao.getStudentList();
        showTable(list);
        tableScroll.setViewportView(studentTable);
    }

    private void showTable(List<Student> list) {
        int size= list.size();
        Object [][]students=new Object[size][7];
        for (int i=0;i<size; i++){
            students[i][0]=i+1;
            students[i][1]=list.get(i).getIdStudent();
            students[i][2]=list.get(i).getNameStudent();
            students[i][3]=list.get(i).getUsername();
            students[i][4]=list.get(i).getEmail();
            ClassSubject classSubject= list.get(i).getIdClass();
            if (classSubject!=null){
                students[i][5]=classSubject.getNameClass();
            }
            else {
                students[i][5]="";
            }
            String gender="";
            if (list.get(i).getGender()==1){
                gender="Nữ";
            }
            else{
                gender="Nam";
            }
            students[i][6]=gender;
        }
        studentTable.setModel(new javax.swing.table.DefaultTableModel(students
                ,
                new String [] {
                        "STT", "ID", "Name", "Username", "Email", "Class", "Gender"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String id=student.getIdStudent();

        int output=JOptionPane.showConfirmDialog(new CourseSystemFrame(),"Are you sure you want to delete?", String.valueOf(JOptionPane.QUESTION_MESSAGE),JOptionPane.YES_NO_OPTION);
        if (output==JOptionPane.YES_OPTION){
            StudentDao.deleteStudent(id);
            UsersDao.deleteUser(id);
        }
        List<Student> list=StudentDao.getStudentList();
        showTable(list);
    }
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String id=idTxt.getText();
        String name=nameTxt.getText();
        String gender=genderTxt.getText();
        String username=usernameTxt.getText();
        String email=emailTxt.getText();
        String classes=ckassTxt.getText();
        System.out.println(classes);

        int tmp=-1;
        if (gender.equals("Nữ")){
            tmp=1;
        }
        else if (gender.equals("Nam")){
            tmp=0;
        }
        ClassSubject classSubject=null;
        if (!classes.equals("")){
            classSubject= ClassSubjectDao.getClass(classes);
        }
        Student st=StudentDao.getStudent(id);
        if (id.equals(student.getIdStudent())){
            if (tmp!=-1 && classSubject!=null){
                StudentDao.updateStudent(new Student(id,name,username,st.getPasswordSt(),email,tmp,classSubject));
                UsersDao.updateUser(new Users(username,st.getPasswordSt(),1));
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit success.");
            }
            else{
                if (tmp==-1)
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Gender is incorrect.");
                if (classSubject==null )
                {
                    if (classes.equals("")){
                        StudentDao.updateStudent(new Student(id,name,username,st.getPasswordSt(),email,tmp,null));
                        UsersDao.updateUser(new Users(username,st.getPasswordSt(),1));
                        JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit success.");
                    }
                    else
                        JOptionPane.showMessageDialog(new CourseSystemFrame(),"Class doesn't exist.");
                }
            }
        }
        else {
            if (st==null){
                String pass=student.getPasswordSt();
                UsersDao.deleteUser(student.getIdStudent());
                TeacherDao.deleteTeacher(student.getIdStudent());
                if (tmp!=-1 && null != classSubject){
                    StudentDao.addStudent(new Student(id,name,username,pass,email,tmp,classSubject));
                    UsersDao.addUser(new Users(username,pass,1));
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit success.");
                }
                else{
                    if (tmp==-1)
                        JOptionPane.showMessageDialog(new CourseSystemFrame(),"Gender is incorrect.");
                    if (classSubject==null )
                    {
                        if (classes.equals("")){
                            StudentDao.updateStudent(new Student(id,name,username,pass,email,tmp,null));
                            UsersDao.updateUser(new Users(username,pass,1));
                            JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit success.");
                        }
                        else
                            JOptionPane.showMessageDialog(new CourseSystemFrame(),"Class doesn't exist.");
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID exists.");
            }
        }
        List<Student> list=StudentDao.getStudentList();
        showTable(list);
    }

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {

        int output=JOptionPane.showConfirmDialog(new CourseSystemFrame(),"Are you sure you want to reset password?", String.valueOf(JOptionPane.QUESTION_MESSAGE),JOptionPane.YES_NO_OPTION);
        if (output==JOptionPane.YES_OPTION){
            student.setPasswordSt(student.getIdStudent());
            Users users=new Users(student.getUsername(),student.getPasswordSt(),1);
            StudentDao.updateStudent(student);
            UsersDao.updateUser(users);
        }
        List<Student> list=StudentDao.getStudentList();
        showTable(list);
    }
    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {
        int row=studentTable.getSelectedRow();
        if (row>=0){
            idTxt.setText(studentTable.getModel().getValueAt(row,1).toString());
            nameTxt.setText(studentTable.getModel().getValueAt(row,2).toString());
            usernameTxt.setText(studentTable.getModel().getValueAt(row,3).toString());
            emailTxt.setText(studentTable.getModel().getValueAt(row,4).toString());
            ckassTxt.setText(studentTable.getModel().getValueAt(row,5).toString());
            genderTxt.setText(studentTable.getModel().getValueAt(row,6).toString());
            student=StudentDao.getStudent(studentTable.getModel().getValueAt(row,1).toString());
        }
    }
    public List<Student> sortAscendingByID(List<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student  sv1, Student sv2) {
                return sv1.getIdStudent().compareTo(sv2.getIdStudent());
            }
        });
        return list;
    }

    public List<Student> sortDescendingByID(List<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student  sv1, Student sv2) {
                return sv2.getIdStudent().compareTo(sv1.getIdStudent());
            }
        });
        return list;
    }

    public List<Student> sortAscendingByName(List<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student  sv1, Student sv2) {
                return sv1.getNameStudent().compareTo(sv2.getNameStudent());
            }
        });
        return list;
    }

    public List<Student> sortDescendingByName(List<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student  sv1, Student sv2) {
                return sv2.getNameStudent().compareTo(sv1.getNameStudent());
            }
        });
        return list;
    }
    // Variables declaration - do not modify
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField ckassTxt;
    private javax.swing.JLabel classLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTxt;
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
    private javax.swing.JTable studentTable;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration
}




