package gui.student;

import dao.*;
import gui.CourseSystemFrame;
import pojo.*;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseStudentPanel extends javax.swing.JPanel {
    private Student student;
    public CourseStudentPanel(Student student) throws ParseException {
        this.student=student;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() throws ParseException {

        controlPanel = new javax.swing.JPanel();
        courseScroll = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        listScroll = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        courseLabel = new javax.swing.JLabel();
        listLabel = new javax.swing.JLabel();
        confirm1Btn = new javax.swing.JButton();
        confirm2Btn = new javax.swing.JButton();
        namePanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        msgLabel = new javax.swing.JLabel();

        showResult();
        courseScroll.setViewportView(courseTable);
        List<CourseOpen> list=getCourse(getSubjectList());
        showCourse(list);
        listScroll.setViewportView(listTable);

        courseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        courseLabel.setText("Course List");

        listLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        listLabel.setText("Result List");
        listTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListTableMouseClicked(evt);
            }
        });

        confirm1Btn.setText("Confirm");
        confirm1Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RegistrationBtnActionPerformed(actionEvent);
            }
        });

        confirm2Btn.setText("Confirm");
        confirm2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ResultBtnActionPerformed(actionEvent);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
                controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, controlPanelLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(courseScroll)
                                                        .addComponent(listScroll)
                                                        .addGroup(controlPanelLayout.createSequentialGroup()
                                                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(listLabel)
                                                                        .addComponent(courseLabel))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(controlPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(confirm2Btn))
                                        .addGroup(controlPanelLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(confirm1Btn)))
                                .addGap(10, 10, 10))
        );
        controlPanelLayout.setVerticalGroup(
                controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(courseLabel)
                                .addGap(3, 3, 3)
                                .addComponent(listScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirm1Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirm2Btn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        namePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        namePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nameLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        nameLabel.setText("Course Registration");
        nameLabel.setToolTipText("");

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
                namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namePanelLayout.createSequentialGroup()
                                .addContainerGap(278, Short.MAX_VALUE)
                                .addComponent(nameLabel)
                                .addGap(320, 320, 320))
        );
        namePanelLayout.setVerticalGroup(
                namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(namePanelLayout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        msgLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        msgLabel.setText("Not the time to register for the course");
        msgLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        msgLabel.setFocusable(false);
        msgLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        msgLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(243, 243, 243)
                                        .addComponent(msgLabel)
                                        .addContainerGap(243, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(308, 308, 308)
                                        .addComponent(msgLabel)
                                        .addContainerGap(308, Short.MAX_VALUE)))
        );
        if (!checkTime()){
            controlPanel.setVisible(false);
        }
    }// </editor-fold>

    private void ListTableMouseClicked(MouseEvent evt) {
    }

    private void RegistrationBtnActionPerformed(ActionEvent actionEvent) {
        List<CourseRegistration> list=new ArrayList<>();
        int size=listTable.getRowCount();
        for (int i=0; i<size; i++){
            boolean check= (boolean) listTable.getModel().getValueAt(i,8);
            if (check==true){
                String time=listTable.getValueAt(i,5).toString();
                Subjects subjects=CourseOpenDao.getCourse(listTable.getModel().getValueAt(i,1).toString()).getIdSubject();
                if (checkTimeStudy(time,getResult()) && checkTimeStudy(time,list) && checkSubject(subjects,list)){
                    CourseOpen courseOpen=CourseOpenDao.getCourse(listTable.getModel().getValueAt(i,1).toString());
                    CourseRegistration courseRegistration=new CourseRegistration(new Date(),courseOpen,student,SemesterDao.semesterCurrent());
                    list.add(courseRegistration);
                }
                else{
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Not Registration");
                    return;
                }
            }
        }
        if ((list.size()+countSuject())<=8){
            for (int i=0; i<list.size(); i++){
                RegistrationDao.addRegistration(list.get(i));
            }
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"Successfully.");
        }
        else{
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"Only 8 subjects can be registered");
        }
        showCourse(getCourse(getSubjectList()));
        showResult();
    }

    private void ResultBtnActionPerformed(ActionEvent actionEvent) {

        int output=JOptionPane.showConfirmDialog(new CourseSystemFrame(),"Are you sure you want to delete?", String.valueOf(JOptionPane.QUESTION_MESSAGE),JOptionPane.YES_NO_OPTION);
        if (output==JOptionPane.YES_OPTION){
            int size=courseTable.getRowCount();
            for (int i=0; i<size; i++){
                boolean check= (boolean) courseTable.getModel().getValueAt(i,6);
                if (check==true){
                    CourseOpen courseOpen=CourseOpenDao.getCourse(courseTable.getValueAt(i,1).toString());
                    RegistrationDao.deleteRegistration(student,courseOpen);
                }
            }
        }
        showCourse(getCourse(getSubjectList()));
        showResult();
    }

    private boolean checkTimeStudy(String time,List<CourseRegistration> list){
        for (int i=0; i<list.size(); i++){
            CourseOpen courseOpen=list.get(i).getIdCourse();
            String timeStudy=courseOpen.getDayCourse()+", "+courseOpen.getStudyTime();
            if (timeStudy.equals(time))
                return false;
        }
        return true;
    }

    private boolean checkSubject(Subjects subjects,List<CourseRegistration> list){
        for (int i=0; i<list.size(); i++){
            Subjects subjects1=list.get(i).getIdCourse().getIdSubject();
            if (subjects.getIdSubject().equals(subjects1.getIdSubject()))
                return false;
        }
        return true;
    }

    private void showResult(){
        List<CourseRegistration> list=getResult();
        int size=list.size();
        Object [][] objects=new Object[size][7];
        for (int i=0;i<size; i++){
            objects[i][0]=i+1;
            CourseOpen courseOpen= list.get(i).getIdCourse();
            objects[i][1]=courseOpen.getIdCourse();
            Subjects subjects= courseOpen.getIdSubject();
            objects[i][2]=subjects.getNameSubject();
            objects[i][3]=courseOpen.getTeacher();
            objects[i][4]=subjects.getCredits();
            objects[i][5]=courseOpen.getDayCourse()+", "+courseOpen.getStudyTime();
            objects[i][6]=false;
        }
        courseTable.setModel(new javax.swing.table.DefaultTableModel(objects,
                new String [] {
                        "STT", "ID Course", "NameSubject", "Teacher", "Credits", "Date", "Delete"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class,java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }

    private void showCourse(List<CourseOpen> list){
        int size=list.size();
        Object [][] objects=new Object[size][9];
        for (int i=0;i<size; i++){
            objects[i][0]=i+1;
            CourseOpen courseOpen= list.get(i);
            Subjects subjects= courseOpen.getIdSubject();
            objects[i][1]=courseOpen.getIdCourse();
            objects[i][2]=subjects.getNameSubject();
            objects[i][3]=courseOpen.getTeacher();
            objects[i][4]=subjects.getCredits();
            objects[i][5]=courseOpen.getDayCourse()+", "+courseOpen.getStudyTime();
            objects[i][6]=courseOpen.getSlots();
            objects[i][7]=countSlot(courseOpen);
            objects[i][8]=false;

        }
        listTable.setModel(new javax.swing.table.DefaultTableModel(
              objects,
                new String [] {
                        "STT", "ID Course","Name Subject", "Teacher", "Credits", "Day", "Slots", "Registation Slots", "Registration"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class,  java.lang.String.class,java.lang.String.class, java.lang.String.class,
                    java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }

    private int countSuject(){
        List<CourseRegistration> list=RegistrationDao.getRegistrationStudentList(student,SemesterDao.semesterCurrent());
        return list.size();
    }

    private int countSlot(CourseOpen courseOpen){
        List<CourseRegistration> list=new ArrayList<>();
        if (SemesterDao.semesterCurrent()!=null)
        {
            list=RegistrationDao.getRegistrationCourseList(courseOpen,SemesterDao.semesterCurrent());
        }
        return list.size();
    }

    private boolean checkTime() throws ParseException {
        Date currentDate=new Date();
        List<CourseSession> list=new ArrayList<>();
        if (SemesterDao.semesterCurrent()!=null)
        {
            list= CourseSessionDao.getSessionList(SemesterDao.semesterCurrent());
            SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.S");
            for (int i=0; i<list.size(); i++){
                Date start=list.get(i).getStartDay();
                Date end=list.get(i).getEndDay();
                String endDay=dateFormat.format(end);
                String s = endDay.replaceAll("00:00:00.0", "23:59:59.999");
                end=dateFormat.parse(s);
                int check1=currentDate.compareTo(start);
                int check2=currentDate.compareTo(end);
                if (check1==1 && check2==-1)
                    return true;
            }
        }
        return false;
    }

    private List<CourseRegistration> getResult(){
        List<CourseRegistration> list=new ArrayList<>();
        if (SemesterDao.semesterCurrent()!=null)
        {
            list=RegistrationDao.getRegistrationStudentList(student,SemesterDao.semesterCurrent());
        }
        return list;
    }

    private List<Subjects> getSubjectList(){
        List<CourseRegistration> list=new ArrayList<>();
        List<Subjects> subjectsList=new ArrayList<>();
        if (SemesterDao.semesterCurrent()!=null)
        {
           list= RegistrationDao.getRegistrationStudentList(student,SemesterDao.semesterCurrent());
            for (int i=0; i<list.size(); i++){
                CourseOpen courseOpen=list.get(i).getIdCourse();
                Subjects subjects=courseOpen.getIdSubject();
                subjectsList.add(subjects);
            }
        }

        return subjectsList;
    }

    private List<CourseOpen> getCourse(List<Subjects> subjects){
        List<CourseOpen> list=new ArrayList<>();
        if (SemesterDao.semesterCurrent()!=null){
            if (subjects.size()==0)
                list= CourseOpenDao.getCourseList(SemesterDao.semesterCurrent());
            else
                list= CourseOpenDao.getCourseList(subjects,SemesterDao.semesterCurrent());
        }
        return list;
    }
    // Variables declaration - do not modify
    private javax.swing.JButton confirm1Btn;
    private javax.swing.JButton confirm2Btn;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JScrollPane courseScroll;
    private javax.swing.JTable courseTable;
    private javax.swing.JLabel listLabel;
    private javax.swing.JScrollPane listScroll;
    private javax.swing.JTable listTable;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel namePanel;
    // End of variables declaration
}
