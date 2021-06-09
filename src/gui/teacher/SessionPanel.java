package gui.teacher;

import dao.*;
import gui.ChangePassword;
import gui.CourseSystemFrame;
import pojo.*;
import pojo.CourseSession;
import pojo.Semester;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SessionPanel extends javax.swing.JPanel {

    private CourseSession courseSession=null;
    SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
    public SessionPanel() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        namePanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        sessionTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortBox = new javax.swing.JComboBox<>();
        sortBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        startTxt = new com.toedter.calendar.JDateChooser();
        nameTxt = new javax.swing.JTextField();
        endTxt = new com.toedter.calendar.JDateChooser();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();

        namePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));

        studentLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentLabel.setText("Session Management");

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
        sessionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    sessionTableMouseClicked(evt);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        tableScroll.setViewportView(sessionTable);

        addBtn.setText("Add Session");
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

        nameLabel.setText("Name:");

        startLabel.setText("Start Day:");

        endLabel.setText("End Day");

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    editBtnActionPerformed(evt);
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
                                .addContainerGap()
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sortBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortBtn)
                                .addGap(90, 90, 90))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(idLabel)
                                                .addGap(49, 49, 49)
                                                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(nameLabel)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(addBtn)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                                                .addComponent(deleteBtn)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(endLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(endTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(startLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(startTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(editBtn)))
                                .addContainerGap(95, Short.MAX_VALUE))
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
                                .addComponent(tableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idLabel)
                                        .addComponent(startLabel)
                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(startTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(endLabel)
                                        .addComponent(endTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addBtn)
                                        .addComponent(deleteBtn)
                                        .addComponent(editBtn))
                                .addGap(36, 36, 36))
        );
        editBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
    }// </editor-fold>

    private void editBtnActionPerformed(ActionEvent evt) throws ParseException {
        int output=JOptionPane.showConfirmDialog(new CourseSystemFrame(),"Are you sure you want to Edit?", String.valueOf(JOptionPane.QUESTION_MESSAGE),JOptionPane.YES_NO_OPTION);
        if (output==JOptionPane.YES_OPTION){
            String id=idTxt.getText();
            String name=nameTxt.getText();
            Date startDay=dateFormat.parse(dateFormat.format(startTxt.getDate()));
            Date endDay=dateFormat.parse(dateFormat.format(endTxt.getDate()));

            if (id.equals(courseSession.getIdSession())){
                if (!name.equals("")){
                    courseSession.setNameSession(name);
                    courseSession.setStartDay(startDay);
                    courseSession.setEndDay(endDay);
                    CourseSessionDao.updateSession(courseSession);
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit Successfully.");
                }
                else
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Editing is fail.");
            }
            else
            {
                if (!name.equals("") && !id.equals("")){
                    Semester semester=courseSession.getIdSemester();
                    CourseSessionDao.deleteSession(courseSession.getIdSession());
                    CourseSessionDao.addSession(new CourseSession(id,name,startDay,endDay,semester));
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit Successfully.");
                }
                else
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Editing is fail.");
            }
        }
        else
            resetInformation();

        showTable(getList());
        resetInformation();
    }


    private void deleteBtnActionPerformed(ActionEvent evt){
        if (courseSession!=null)
        {
            CourseSessionDao.deleteSession(courseSession.getIdSession());
            JOptionPane.showMessageDialog(new CourseSystemFrame(), "Delete Session Successfully.");
        }
        else
            resetInformation();
        showTable(getList());
        resetInformation();
    }

    private void showTable(List<CourseSession> list) {
        int size= list.size();
        Object [][] semester=new Object[size][7];
        for (int i=0;i<size; i++){
            semester[i][0]=i+1;
            semester[i][1]=list.get(i).getIdSession();
            semester[i][2]=list.get(i).getNameSession();
            semester[i][3]=dateFormat.format(list.get(i).getStartDay());
            semester[i][4]=dateFormat.format(list.get(i).getEndDay());
        }
        sessionTable.setModel(new javax.swing.table.DefaultTableModel(semester,
                new String [] {
                        "STT", "ID", "Name","Start Day","End Day"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }

    private void searchBtnActionPerformed(ActionEvent evt) {
        List<CourseSession> list=CourseSessionDao.fullTextSearch(searchTxt.getText(),SemesterDao.semesterCurrent());
        showTable(list);
    }

    private void sessionTableMouseClicked(java.awt.event.MouseEvent evt) throws ParseException {
        int row=sessionTable.getSelectedRow();
        if (row>=0){
            idTxt.setText(sessionTable.getModel().getValueAt(row,1).toString());
            nameTxt.setText(sessionTable.getModel().getValueAt(row,2).toString());
            Date start= dateFormat.parse(sessionTable.getModel().getValueAt(row,3).toString());
            Date end= dateFormat.parse(sessionTable.getModel().getValueAt(row,4).toString());
            startTxt.setDate(start);
            endTxt.setDate(end);
            courseSession=CourseSessionDao.getSession(sessionTable.getModel().getValueAt(row,1).toString());
        }
        idTxt.setEnabled(false);
        editBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        String id=idTxt.getText();
        String name=nameTxt.getText();
        Date startDay=dateFormat.parse(dateFormat.format(startTxt.getDate()));
        Date endDay=dateFormat.parse(dateFormat.format(endTxt.getDate()));

        Semester semesterCurrent=SemesterDao.semesterCurrent();
        System.out.println(semesterCurrent.getIdSemester());
        if (id.equals("")){
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID is empty.");
        }
        else {
            CourseSession courseSession=CourseSessionDao.getSession(id);
            if (courseSession!=null)
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID exists.");
            else
            {
                if (!name.equals("")  && startDay!=null && endDay!=null){
                    CourseSessionDao.addSession(new CourseSession(id,name,startDay,endDay,semesterCurrent));
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Add Session Success.");
                }
            }
        }
        List<CourseSession> list=getList();
        showTable(list);
        resetInformation();
    }

    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {
        List<CourseSession> list=CourseSessionDao.getSessionList(SemesterDao.semesterCurrent());
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

    public List<CourseSession> sortAscendingByID(List<CourseSession> list){
        Collections.sort(list, new Comparator<CourseSession>() {
            @Override
            public int compare(CourseSession  sv1, CourseSession sv2) {
                return sv1.getIdSession().compareTo(sv2.getIdSession());
            }
        });
        return list;
    }

    public List<CourseSession> sortDescendingByID(List<CourseSession> list){
        Collections.sort(list, new Comparator<CourseSession>() {
            @Override
            public int compare(CourseSession  sv1, CourseSession sv2) {
                return sv2.getIdSession().compareTo(sv1.getIdSession());
            }
        });
        return list;
    }

    public List<CourseSession> sortAscendingByName(List<CourseSession> list){
        Collections.sort(list, new Comparator<CourseSession>() {
            @Override
            public int compare(CourseSession  sv1, CourseSession sv2) {
                return sv1.getNameSession().compareTo(sv2.getNameSession());
            }
        });
        return list;
    }

    public List<CourseSession> sortDescendingByName(List<CourseSession> list){
        Collections.sort(list, new Comparator<CourseSession>() {
            @Override
            public int compare(CourseSession  sv1, CourseSession sv2) {
                return sv2.getNameSession().compareTo(sv1.getNameSession());
            }
        });
        return list;
    }

    private void resetInformation(){
        idTxt.setEnabled(true);
        idTxt.setText("");
        nameTxt.setText("");
        startTxt.setDate(new Date());
        endTxt.setDate(new Date());
        editBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
    }

    private List<CourseSession> getList(){
        List<CourseSession> courseSessionList=CourseSessionDao.getSessionList(SemesterDao.semesterCurrent());
        return courseSessionList;
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel endLabel;
    private com.toedter.calendar.JDateChooser endTxt;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel namePanel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JButton editBtn;
    private javax.swing.JTable sessionTable;
    private javax.swing.JComboBox<String> sortBox;
    private javax.swing.JButton sortBtn;
    private javax.swing.JLabel startLabel;
    private com.toedter.calendar.JDateChooser startTxt;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JScrollPane tableScroll;
    // End of variables declaration
}

