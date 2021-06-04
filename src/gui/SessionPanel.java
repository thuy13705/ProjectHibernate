package gui;

import dao.CourseSessionDao;
import dao.SemesterDao;
import pojo.ClassSubject;
import pojo.CourseSession;
import pojo.Semester;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SessionPanel extends javax.swing.JPanel {

    private CourseSession courseSession=null;
    SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
    public SessionPanel() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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

        jLabel1.setText("jLabel1");

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
        List<CourseSession> courseSessionList= CourseSessionDao.getSessionList();
        showTable(courseSessionList);
        sessionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sessionTableMouseClicked(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(420, 420, 420)
                                                .addComponent(addBtn))
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
                                                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(56, 56, 56)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(endLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(endTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(startLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(startTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(96, Short.MAX_VALUE))
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
                                .addGap(51, 51, 51)
                                .addComponent(addBtn)
                                .addGap(33, 33, 33))
        );
    }// </editor-fold>

    private void showTable(List<CourseSession> list) {
        int size= list.size();
        Object [][] semester=new Object[size][7];
        for (int i=0;i<size; i++){
            semester[i][0]=i+1;
            semester[i][1]=list.get(i).getIdSession();
            semester[i][2]=list.get(i).getNameSession();
            Semester semester1= list.get(i).getIdSemester();
            if (semester1!=null){
                semester[i][3]=semester1.getIdSemester();
            }
            semester[i][4]=dateFormat.format(list.get(i).getStartDay());
            semester[i][5]=dateFormat.format(list.get(i).getEndDay());
        }
        sessionTable.setModel(new javax.swing.table.DefaultTableModel(semester,
                new String [] {
                        "STT", "ID", "Name", "Semester","Start Day","End Day"
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
        List<CourseSession> list= CourseSessionDao.fullTextSearch(searchTxt.getText());
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
    private void sessionTableMouseClicked(java.awt.event.MouseEvent evt) {
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
                    CourseSessionDao.addSession(new CourseSession(id,name,startDay,endDay,semesterCurrent,null));
                    JOptionPane.showMessageDialog(new CourseSystemFrame(),"Add Session Success.");
                }
            }
        }
        List<CourseSession> list=CourseSessionDao.getSessionList();
        showTable(list);
    }

    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {
        List<CourseSession> list=CourseSessionDao.getSessionList();
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


    // Variables declaration - do not modify
    private javax.swing.JButton addBtn;
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
    private javax.swing.JTable sessionTable;
    private javax.swing.JComboBox<String> sortBox;
    private javax.swing.JButton sortBtn;
    private javax.swing.JLabel startLabel;
    private com.toedter.calendar.JDateChooser startTxt;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JScrollPane tableScroll;
    // End of variables declaration
}
