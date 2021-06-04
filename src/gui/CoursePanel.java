package gui;


import dao.*;
import pojo.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoursePanel extends javax.swing.JPanel {
    private CourseOpen courseOpen=null;
    public CoursePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        namePanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortBox = new javax.swing.JComboBox<>();
        sortBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        sesionLabel = new javax.swing.JLabel();
        subjecttxt = new javax.swing.JTextField();
        teacherLabel = new javax.swing.JLabel();
        teachertxt = new javax.swing.JTextField();
        roomLabel = new javax.swing.JLabel();
        roomTxt = new javax.swing.JTextField();
        dayLabel = new javax.swing.JLabel();
        dayTxt = new com.toedter.calendar.JDateChooser();
        subjectLabel = new javax.swing.JLabel();
        caTxt = new javax.swing.JTextField();
        caLabel = new javax.swing.JLabel();
        slotLabel = new javax.swing.JLabel();
        slotTxt = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();

        namePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));

        studentLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentLabel.setText("Course Management");

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

        List<CourseOpen> courseOpens= CourseOpenDao.getCourseList();
        showTable(courseOpens);
        courseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseTableMouseClicked(evt);
            }
        });
        tableScroll.setViewportView(courseTable);

        addBtn.setText("Add Course");
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

        deleteBtn.setText("Delete");
        deleteBtn.setToolTipText("");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        sesionLabel.setText("Session");

        teacherLabel.setText("Teacher");


        roomLabel.setText("Room");

        dayLabel.setText("Day");

        subjectLabel.setText("Subject");

        caLabel.setText("Ca");

        slotLabel.setText("Slots");

//        List<CourseSession> courseSessions=CourseSessionDao.getSessionList();
//        String []model=new String[];
//        for (int i=0; i<courseSessions.size(); i++){
//
//        }
        jSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {"SE001", "Item 1", "Item 2", "Item 3"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tableScroll)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                                .addComponent(sortBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sortBtn)
                                                .addGap(30, 30, 30))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(caLabel)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(caTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(idLabel)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(teacherLabel)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(teachertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(15, 15, 15)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(sesionLabel)
                                                                        .addComponent(roomLabel)
                                                                        .addComponent(slotLabel))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(roomTxt)
                                                                        .addComponent(slotTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                                        .addComponent(jSpinner1))
                                                                .addGap(20, 20, 20)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(subjectLabel)
                                                                        .addComponent(dayLabel))
                                                                .addGap(18, 18, 18))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(addBtn)
                                                                .addGap(50, 50, 50)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(subjecttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                                        .addComponent(dayTxt))
                                                .addGap(125, 125, 125))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(241, 241, 241)
                                                .addComponent(deleteBtn)
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchBtn)
                                        .addComponent(sortBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sortBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(subjecttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(subjectLabel))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(dayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dayLabel)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(idLabel)
                                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(sesionLabel)
                                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(teacherLabel)
                                                        .addComponent(teachertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(roomLabel)
                                                        .addComponent(roomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(caLabel)
                                        .addComponent(caTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(slotLabel)
                                        .addComponent(slotTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteBtn)
                                        .addComponent(addBtn))
                                .addGap(12, 12, 12))
        );
    }// </editor-fold>

    private void searchBtnActionPerformed(ActionEvent evt) {
        List<CourseOpen> list= CourseOpenDao.fullTextSearch(searchTxt.getText());
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

    private void showTable(List<CourseOpen> list) {
        int size= list.size();
        Object [][] objects=new Object[size][10];
        for (int i=0;i<size; i++){
            objects[i][0]=i+1;
            objects[i][1]=list.get(i).getIdCourse();
            Semester semester= list.get(i).getIdSemester();
            if (semester!=null){
                objects[i][2]=semester.getIdSemester();
            }
            else {
                objects[i][2]="";
            }
            CourseSession courseSession= list.get(i).getIdSession();
            if (courseSession!=null){
                objects[i][3]=courseSession.getIdSession();
            }
            else {
                objects[i][3]="";
            }
            Subjects subjects= list.get(i).getIdSubject();
            if (subjects!=null){
                objects[i][4]=subjects.getIdSubject();
            }
            else {
                objects[i][4]="";
            }
            objects[i][5]=list.get(i).getTeacher();
            objects[i][6]=list.get(i).getRoom();
            objects[i][7]=list.get(i).getDayCourse().toString();
            objects[i][8]=list.get(i).getStudyTime().toString();
            objects[i][9]=list.get(i).getSlots().toString();
        }
        courseTable.setModel(new javax.swing.table.DefaultTableModel(objects
               ,
                new String [] {
                        "STT", "idCourse", "idSemester", "idSession", "idSubject", "Teacher", "room", "Day", "Ca", "Slots"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }

    private void courseTableMouseClicked(java.awt.event.MouseEvent evt) {
        int row=courseTable.getSelectedRow();
        if (row>=0){
            idTxt.setText(courseTable.getModel().getValueAt(row,1).toString());
            jSpinner1.setValue(courseTable.getModel().getValueAt(row,3).toString());
            subjecttxt.setText(courseTable.getModel().getValueAt(row,4).toString());
            teachertxt.setText(courseTable.getModel().getValueAt(row,5).toString());
            roomTxt.setText(courseTable.getModel().getValueAt(row,6).toString());
//            dayTxt.setText(courseTable.getModel().getValueAt(row,7).toString());
            caTxt.setText(courseTable.getModel().getValueAt(row,8).toString());
            slotTxt.setText(courseTable.getModel().getValueAt(row,9).toString());
            courseOpen= CourseOpenDao.getCourse(courseTable.getModel().getValueAt(row,1).toString());
        }
    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String id=idTxt.getText();
        String session= (String) jSpinner1.getValue();
        Semester semester=SemesterDao.semesterCurrent();
        Subjects subject= SubjectDao.getSubject(subjecttxt.getText());
        String teacher=teachertxt.getText();
        String room=roomTxt.getText();
//        Integer day=Integer.parseInt(dayTxt.getText());
        Integer ca=Integer.parseInt(caTxt.getText());
        Integer slots=Integer.parseInt(slotTxt.getText());
        if (id.equals("")){
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID is empty.");
        }
        else {
            CourseOpen courseOpen1=CourseOpenDao.getCourse(id);
            if (courseOpen1!=null)
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID exists.");
            else
            {
                if (!session.equals("") && semester!=null && subject!=null && !teacher.equals("") && !room.equals("")  && ca>=1 && ca<=4 && slots>0){
                    CourseSession courseSession= CourseSessionDao.getSession(session);
                    CourseOpenDao.addCourse(new CourseOpen(id,semester,courseSession,subject,teacher,room,null,ca,slots,null));
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Add Semester Success.");
                }
            }
        }
        List<CourseOpen> list=CourseOpenDao.getCourseList();
        showTable(list);
    }


    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public List<CourseOpen> sortAscendingByID(List<CourseOpen> list){
        Collections.sort(list, new Comparator<CourseOpen>() {
            @Override
            public int compare(CourseOpen  sv1, CourseOpen sv2) {
                return sv1.getIdCourse().compareTo(sv2.getIdCourse());
            }
        });
        return list;
    }

    public List<CourseOpen> sortDescendingByID(List<CourseOpen> list){
        Collections.sort(list, new Comparator<CourseOpen>() {
            @Override
            public int compare(CourseOpen  sv1, CourseOpen sv2) {
                return sv2.getIdCourse().compareTo(sv1.getIdCourse());
            }
        });
        return list;
    }

    public List<CourseOpen> sortAscendingByName(List<CourseOpen> list){
        Collections.sort(list, new Comparator<CourseOpen>() {
            @Override
            public int compare(CourseOpen  sv1, CourseOpen sv2) {
                return sv1.getTeacher().compareTo(sv2.getTeacher());
            }
        });
        return list;
    }

    public List<CourseOpen> sortDescendingByName(List<CourseOpen> list){
        Collections.sort(list, new Comparator<CourseOpen>() {
            @Override
            public int compare(CourseOpen  sv1, CourseOpen sv2) {
                return sv2.getTeacher().compareTo(sv1.getTeacher());
            }
        });
        return list;
    }
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel caLabel;
    private javax.swing.JTextField caTxt;
    private javax.swing.JTable courseTable;
    private javax.swing.JLabel dayLabel;
    private com.toedter.calendar.JDateChooser dayTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTxt;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel namePanel;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JTextField roomTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel sesionLabel;
    private javax.swing.JLabel slotLabel;
    private javax.swing.JTextField slotTxt;
    private javax.swing.JComboBox<String> sortBox;
    private javax.swing.JButton sortBtn;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTextField subjecttxt;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JTextField teachertxt;
}
