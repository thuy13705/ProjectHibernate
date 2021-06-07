package gui.teacher;

import com.toedter.calendar.JDateChooser;
import dao.*;
import gui.CourseSystemFrame;
import pojo.CourseOpen;
import pojo.CourseRegistration;
import pojo.Student;
import pojo.Subjects;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class RegistrationPanel extends javax.swing.JPanel {


    public RegistrationPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        namePanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        registrationTable = new javax.swing.JTable();
        searchTxt = new javax.swing.JTextField();
        studentBtn = new javax.swing.JButton();
        courseBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();

        namePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));

        studentLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentLabel.setText("Registration Management");

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
                namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(namePanelLayout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(studentLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        namePanelLayout.setVerticalGroup(
                namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(namePanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(studentLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        List<CourseRegistration> list=new ArrayList<>();
        if (SemesterDao.semesterCurrent()!=null)
        {
            list= RegistrationDao.getRegistrationList(SemesterDao.semesterCurrent());

        }
        showTable(list);
        tableScroll.setViewportView(registrationTable);

        tableScroll.setViewportView(registrationTable);


        studentBtn.setText("Student");
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        courseBtn.setText("Course");
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
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
                                .addGap(15, 15, 15)
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(courseBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentBtn)
                                .addGap(18, 18, 18)
                                .addComponent(resetBtn)
                                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studentBtn)
                                        .addComponent(courseBtn)
                                        .addComponent(resetBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>


    private void showTable(List<CourseRegistration> list){
        int size= list.size();
        Object [][] objects=new Object[size][9];
        for (int i=0;i<size; i++){
            objects[i][0]=i+1;
            Student student=list.get(i).getIdStudent();
            objects[i][1]=student.getIdStudent();
            objects[i][2]=student.getNameStudent();
            CourseOpen courseOpen= list.get(i).getIdCourse();
            objects[i][3]=courseOpen.getIdCourse();
            Subjects subjects= courseOpen.getIdSubject();
            objects[i][4]=subjects.getIdSubject();
            objects[i][5]=subjects.getNameSubject();
            objects[i][6]=courseOpen.getTeacher();
            objects[i][7]=courseOpen.getDayCourse()+", "+courseOpen.getStudyTime();
            objects[i][8]=list.get(i).getTimeRegistration();
        }
        registrationTable.setModel(new javax.swing.table.DefaultTableModel(objects
                ,
                new String [] {
                        "STT", "idStudent", "Name Student", "idCourse", "idSujbect", " Name Subject", "Teacher", "Time Study", "Time Registration"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String search=searchTxt.getText();
        CourseOpen courseOpen=CourseOpenDao.getCourse(search);
        if (courseOpen!=null){
            List<CourseRegistration> list=RegistrationDao.getRegistrationCourseList(courseOpen,SemesterDao.semesterCurrent());
            showTable(list);
        }
        else
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"course is not exist");
    }

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String search=searchTxt.getText();
        Student student=StudentDao.getStudent(search);
        if (student!=null){
            List<CourseRegistration> list=RegistrationDao.getRegistrationStudentList(student,SemesterDao.semesterCurrent());
            showTable(list);
        }
        else
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"course is not exist");
    }

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {
        showTable(RegistrationDao.getRegistrationList(SemesterDao.semesterCurrent()));
    }


    // Variables declaration - do not modify
    private javax.swing.JButton courseBtn;
    private javax.swing.JPanel namePanel;
    private javax.swing.JTable registrationTable;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JButton studentBtn;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JScrollPane tableScroll;
    // End of variables declaration
}







