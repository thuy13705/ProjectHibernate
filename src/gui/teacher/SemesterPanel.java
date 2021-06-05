package gui.teacher;

import dao.CourseOpenDao;
import dao.CourseSessionDao;
import dao.SemesterDao;
import gui.CourseSystemFrame;
import pojo.CourseOpen;
import pojo.CourseSession;
import pojo.Semester;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SemesterPanel extends javax.swing.JPanel {

    private Semester semester=null;
    SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
    public SemesterPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        namePanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        semesterTabel = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortBox = new javax.swing.JComboBox<>();
        sortBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        yearTxt = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        setBtn = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        startTxt = new com.toedter.calendar.JDateChooser();
        endLabel = new javax.swing.JLabel();
        startTxt1 = new com.toedter.calendar.JDateChooser();

        namePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));

        studentLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentLabel.setText("Semester Management");

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
        List<Semester> semesterList= SemesterDao.getSemester();
        showTable(semesterList);
        semesterTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    semesterTabelMouseClicked(evt);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        tableScroll.setViewportView(semesterTabel);

        addBtn.setText("Add Semmester");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    addBtnActionPerformed(evt);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
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

        yearLabel.setText("year:");

        deleteBtn.setText("Delete");
        deleteBtn.setToolTipText("");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        setBtn.setText("Set Semester");
        setBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setBtnActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        startLabel.setText("Start:");



        endLabel.setText("End:");



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
                                .addGap(50, 50, 50))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(yearLabel)
                                                        .addComponent(idLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(startLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(startTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(104, 104, 104)
                                                                .addComponent(endLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(startTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(170, 170, 170)
                                                                .addComponent(nameLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(254, 254, 254)
                                                .addComponent(deleteBtn)
                                                .addGap(50, 50, 50)
                                                .addComponent(addBtn)
                                                .addGap(50, 50, 50)
                                                .addComponent(setBtn)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(idLabel)
                                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(yearLabel)
                                                        .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(startLabel)
                                                        .addComponent(startTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nameLabel)
                                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(endLabel)
                                                        .addComponent(startTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteBtn)
                                        .addComponent(setBtn)
                                        .addComponent(addBtn))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>
    private void showTable(List<Semester> list) {
        int size= list.size();
        Object [][] semester=new Object[size][7];
        for (int i=0;i<size; i++){
            semester[i][0]=i+1;
            semester[i][1]=list.get(i).getIdSemester();
            semester[i][2]=list.get(i).getNameSemester();
            semester[i][3]=list.get(i).getYearSemester();
            semester[i][4]=dateFormat.format(list.get(i).getStartDay());
            semester[i][5]=dateFormat.format(list.get(i).getEndDay());
            semester[i][6]=list.get(i).getState();
        }
        semesterTabel.setModel(new javax.swing.table.DefaultTableModel(semester,
                new String [] {
                        "STT", "ID", "Name", "Year","Start Day","End Day","State"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }

    private void searchBtnActionPerformed(ActionEvent evt) {
        List<Semester> list=SemesterDao.fullTextSearch(searchTxt.getText());
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

    private void semesterTabelMouseClicked(java.awt.event.MouseEvent evt) throws ParseException {
        int row=semesterTabel.getSelectedRow();
        if (row>=0){
            idTxt.setText(semesterTabel.getModel().getValueAt(row,1).toString());
            nameTxt.setText(semesterTabel.getModel().getValueAt(row,2).toString());
            yearTxt.setText(semesterTabel.getModel().getValueAt(row,3).toString());
            Date start= dateFormat.parse(semesterTabel.getModel().getValueAt(row,4).toString());
            Date end= dateFormat.parse(semesterTabel.getModel().getValueAt(row,5).toString());
            startTxt.setDate(start);
            startTxt1.setDate(end);
            semester=SemesterDao.getSemester(semesterTabel.getModel().getValueAt(row,1).toString());
        }
    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        String id=idTxt.getText();
        String name=nameTxt.getText();
        String year=yearTxt.getText();
        Date startDay=dateFormat.parse(dateFormat.format(startTxt.getDate()));
        Date endDay=dateFormat.parse(dateFormat.format(startTxt1.getDate()));
        if (id.equals("")){
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID is empty.");
        }
        else {
            Semester semester=SemesterDao.getSemester(id);
            if (semester!=null)
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID exists.");
            else
            {
                if (!name.equals("") && year!=null && startDay!=null && endDay!=null){
                    SemesterDao.addSemester(new Semester(id,name,year,startDay,endDay,null,0,null));
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Add Semester Success.");
                }
            }
        }
        List<Semester> list=SemesterDao.getSemester();
        showTable(list);
    }


    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {
        List<Semester> list=SemesterDao.getSemester();
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
            String id=semester.getIdSemester();
            Iterator<CourseOpen> courseOpenIterator=semester.getCourses().iterator();
            while(courseOpenIterator.hasNext()){
                CourseOpen courseOpen=courseOpenIterator.next();
                courseOpen.setIdSemester(null);
                CourseOpenDao.updateCourse(courseOpen);
            }
            Iterator<CourseSession> courseSessionIterator=semester.getSessions().iterator();
            while(courseSessionIterator.hasNext()){
                CourseSession courseSession=courseSessionIterator.next();
                courseSession.setIdSemester(null);
                CourseSessionDao.updateSession(courseSession);
            }
            SemesterDao.deleteSemester(id);
            JOptionPane.showMessageDialog(new CourseSystemFrame(), "Delete successfully.");
        }
        List<Semester> list=SemesterDao.getSemester();
        showTable(list);    }

    private void setBtnActionPerformed(java.awt.event.ActionEvent evt) {
        List<Semester> semesterList=SemesterDao.getSemester();
        for (int i=0; i<semesterList.size(); i++){
            semesterList.get(i).setState(0);
            SemesterDao.updateSemester(semesterList.get(i));

        }
        semester.setState(1);
        SemesterDao.updateSemester(semester);
        JOptionPane.showMessageDialog(new CourseSystemFrame(),"Set Semester Successfully.");
        List<Semester> list=SemesterDao.getSemester();
        showTable(list);
    }
    public List<Semester> sortAscendingByID(List<Semester> list){
        Collections.sort(list, new Comparator<Semester>() {
            @Override
            public int compare(Semester  sv1, Semester sv2) {
                return sv1.getIdSemester().compareTo(sv2.getIdSemester());
            }
        });
        return list;
    }

    public List<Semester> sortDescendingByID(List<Semester> list){
        Collections.sort(list, new Comparator<Semester>() {
            @Override
            public int compare(Semester  sv1, Semester sv2) {
                return sv2.getIdSemester().compareTo(sv1.getIdSemester());
            }
        });
        return list;
    }

    public List<Semester> sortAscendingByName(List<Semester> list){
        Collections.sort(list, new Comparator<Semester>() {
            @Override
            public int compare(Semester  sv1, Semester sv2) {
                return sv1.getNameSemester().compareTo(sv2.getNameSemester());
            }
        });
        return list;
    }

    public List<Semester> sortDescendingByName(List<Semester> list){
        Collections.sort(list, new Comparator<Semester>() {
            @Override
            public int compare(Semester  sv1, Semester sv2) {
                return sv2.getNameSemester().compareTo(sv1.getNameSemester());
            }
        });
        return list;
    }

    // Variables declaration - do not modify

    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel endLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel namePanel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTable semesterTabel;
    private javax.swing.JButton setBtn;
    private javax.swing.JComboBox<String> sortBox;
    private javax.swing.JButton sortBtn;
    private javax.swing.JLabel startLabel;
    private com.toedter.calendar.JDateChooser startTxt;
    private com.toedter.calendar.JDateChooser startTxt1;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration
}
