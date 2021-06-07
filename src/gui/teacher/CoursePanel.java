package gui.teacher;


import dao.*;
import gui.CourseSystemFrame;
import pojo.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
        teacherLabel = new javax.swing.JLabel();
        teachertxt = new javax.swing.JTextField();
        roomLabel = new javax.swing.JLabel();
        roomTxt = new javax.swing.JTextField();
        dayLabel = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        caLabel = new javax.swing.JLabel();
        slotLabel = new javax.swing.JLabel();
        slotTxt = new javax.swing.JTextField();
        subjectBox = new javax.swing.JComboBox<>();
        caBox = new javax.swing.JComboBox<>();
        dayBox = new javax.swing.JComboBox<>();
        registrationBtn = new javax.swing.JButton();

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

        showTable(getList());

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

        teacherLabel.setText("Teacher");

        roomLabel.setText("Room");

        dayLabel.setText("Day");

        subjectLabel.setText("Subject");

        caLabel.setText("Ca");

        slotLabel.setText("Slots");
        List<Subjects> subjectsList=SubjectDao.getSubjectList();
        String []subjectModel=new String[subjectsList.size()];
        for (int i=0; i<subjectsList.size();i++){
            Subjects subjects=subjectsList.get(i);
            subjectModel[i]=subjects.getIdSubject();
        }
        subjectBox.setModel(new javax.swing.DefaultComboBoxModel<>(subjectModel));

        caBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ca 1", "Ca 2", "Ca 3", "Ca 4" }));

        dayBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6","Thứ 7","Chủ nhật" }));

        registrationBtn.setText("Registration for student");
        registrationBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    registrationBtnActionPerformed(actionEvent);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
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
                                                .addGap(241, 241, 241)
                                                .addComponent(deleteBtn)
                                                .addGap(60, 60, 60)
                                                .addComponent(addBtn)
                                                .addGap(60, 60, 60)
                                                .addComponent(registrationBtn)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(roomLabel)
                                                        .addComponent(idLabel))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(roomTxt))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(slotLabel)
                                                        .addComponent(subjectLabel)
                                                        .addComponent(dayLabel))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(slotTxt)
                                                        .addComponent(subjectBox, 0, 189, Short.MAX_VALUE)
                                                        .addComponent(dayBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(teacherLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(teachertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(caLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(caBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(137, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(subjectLabel)
                                                        .addComponent(subjectBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(teacherLabel)
                                                                        .addComponent(teachertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(15, 15, 15))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(idLabel)
                                                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(roomLabel)
                                                        .addComponent(roomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dayLabel)
                                                        .addComponent(caLabel)
                                                        .addComponent(caBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(slotLabel)
                                        .addComponent(slotTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteBtn)
                                        .addComponent(addBtn)
                                        .addComponent(registrationBtn))
                                .addGap(12, 12, 12))
        );
        deleteBtn.setEnabled(false);
        registrationBtn.setEnabled(false);
    }// </editor-fold>

    private void registrationBtnActionPerformed(ActionEvent actionEvent) throws ParseException {
        JTextField idTxt=new JTextField();
        Object []msg={"ID Student:",idTxt};
        int out=JOptionPane.showConfirmDialog(new CourseSystemFrame(),msg,"Enter the ID Studdent",JOptionPane.OK_CANCEL_OPTION);
        if (out==JOptionPane.OK_OPTION){
            String id=idTxt.getText();
            Student student=StudentDao.getStudent(id);
            if (student!=null){
                List<CourseRegistration> list=RegistrationDao.check(student,courseOpen);
                for (int i=0; i<list.size(); i++){
                    System.out.println(list.get(i).getIdCourse());
                    System.out.println(list.get(i).getIdCourse());
                }
                if (RegistrationDao.check(student,courseOpen).size()==0){
                    SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.S");
                    Date time=dateFormat.parse(dateFormat.format(new Date()));
                    RegistrationDao.addRegistration(new CourseRegistration(time,courseOpen,student,courseOpen.getIdSemester()));
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Successful.");
                }
                else
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Exist.");
            }
            else
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Student doesn't exist.");
        }
    }


    private void searchBtnActionPerformed(ActionEvent evt) {
        List<CourseOpen> list= CourseOpenDao.fullTextSearch(searchTxt.getText(),SemesterDao.semesterCurrent());
        showTable(list);
    }

    private void showTable(List<CourseOpen> list) {
        int size= list.size();
        Object [][] objects=new Object[size][10];
        for (int i=0;i<size; i++){
            objects[i][0]=i+1;
            objects[i][1]=list.get(i).getIdCourse();
            Subjects subjects= list.get(i).getIdSubject();
            if (subjects!=null){
                objects[i][2]=subjects.getIdSubject();
            }
            else {
                objects[i][2]="";
            }
            objects[i][3]=list.get(i).getTeacher();
            objects[i][4]=list.get(i).getRoom();
            objects[i][5]=list.get(i).getDayCourse();
            objects[i][6]=list.get(i).getStudyTime();
            objects[i][7]=list.get(i).getSlots().toString();
        }
        courseTable.setModel(new javax.swing.table.DefaultTableModel(objects,
                new String [] {
                        "STT", "idCourse", "idSubject", "Teacher", "room", "Day", "Ca", "Slots"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
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
            subjectBox.setSelectedItem(courseTable.getModel().getValueAt(row,2).toString());
            teachertxt.setText(courseTable.getModel().getValueAt(row,3).toString());
            roomTxt.setText(courseTable.getModel().getValueAt(row,4).toString());
            dayBox.setSelectedItem(courseTable.getModel().getValueAt(row,5).toString());
            caBox.setSelectedItem(courseTable.getModel().getValueAt(row,6).toString());
            slotTxt.setText(courseTable.getModel().getValueAt(row,7).toString());
            courseOpen= CourseOpenDao.getCourse(courseTable.getModel().getValueAt(row,1).toString());
        }
        deleteBtn.setEnabled(true);
        idTxt.setEnabled(false);
        registrationBtn.setEnabled(true);
    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String id=idTxt.getText();
        Semester semester=SemesterDao.semesterCurrent();
        Subjects subject= SubjectDao.getSubject(subjectBox.getSelectedItem().toString());
        String teacher=teachertxt.getText();
        String room=roomTxt.getText();
        String day=dayBox.getSelectedItem().toString();
        String ca=caBox.getSelectedItem().toString();
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
                if (!teacher.equals("") && !room.equals("") && slots>0 && semester!=null && subject!=null){
                    CourseOpenDao.addCourse(new CourseOpen(id,semester,subject,teacher,room,day,ca,slots,null));
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Add Semester Success.");
                }
                else{
                    if (semester==null){
                        JOptionPane.showMessageDialog(new CourseSystemFrame(),"Not current semester.");
                    }
                    else
                        JOptionPane.showMessageDialog(new CourseSystemFrame(),"Field is empty.");
                }
            }
        }
        showTable(getList());
        resetInformation();
    }


    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {
        List<CourseOpen> list= getList();
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
        int output= JOptionPane.showConfirmDialog(new CourseSystemFrame(),"Are you sure you want to delete?", String.valueOf(JOptionPane.QUESTION_MESSAGE),JOptionPane.YES_NO_OPTION);
        if (output==JOptionPane.YES_OPTION){
            String id=courseOpen.getIdCourse();
            CourseOpenDao.deleteCourse(id);
            JOptionPane.showMessageDialog(new CourseSystemFrame(), "Delete successfully.");
        }
        showTable(getList());
        resetInformation();
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

    private List<CourseOpen> getList(){
        List<CourseOpen> courseOpens=CourseOpenDao.getCourseList(SemesterDao.semesterCurrent());
        return courseOpens;
    }

    private void resetInformation(){
        idTxt.setEnabled(true);
        idTxt.setText("");
        teachertxt.setText("");
        roomTxt.setText("");
        slotTxt.setText("");
        subjectBox.setSelectedIndex(0);
        dayBox.setSelectedIndex(0);
        caBox.setSelectedIndex(0);
        deleteBtn.setEnabled(false);
        registrationBtn.setEnabled(false);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> caBox;
    private javax.swing.JLabel caLabel;
    private javax.swing.JTable courseTable;
    private javax.swing.JComboBox<String> dayBox;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTxt;
    private javax.swing.JPanel namePanel;
    private javax.swing.JButton registrationBtn;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JTextField roomTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel slotLabel;
    private javax.swing.JTextField slotTxt;
    private javax.swing.JComboBox<String> sortBox;
    private javax.swing.JButton sortBtn;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JComboBox<String> subjectBox;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JTextField teachertxt;
    // End of variables declaration
}




