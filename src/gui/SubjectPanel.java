package gui;


import dao.ClassSubjectDao;
import dao.SubjectDao;
import dao.TeacherDao;
import dao.UsersDao;

import pojo.ClassSubject;
import pojo.Subjects;
import pojo.Teacher;
import pojo.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SubjectPanel extends javax.swing.JPanel {

    private Subjects subjects=null;
    public SubjectPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        namePanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortBox = new javax.swing.JComboBox<>();
        sortBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        namePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));

        studentLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentLabel.setText("Subject Management");

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

        List<Subjects> list= SubjectDao.getSubjectList();
        showTable(list);
        subjectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectTableMouseClicked(evt);
            }
        });
        tableScroll.setViewportView(subjectTable);

        addBtn.setText("Add Subject");
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

        emailLabel.setText("Credits");


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
                                .addGap(32, 32, 32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(58, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addComponent(emailLabel)
                                .addGap(52, 52, 52)
                                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(editBtn)
                                .addGap(25, 25, 25)
                                .addComponent(addBtn)
                                .addGap(25, 25, 25)
                                .addComponent(deleteBtn)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idLabel)
                                        .addComponent(emailLabel)
                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editBtn)
                                        .addComponent(deleteBtn)
                                        .addComponent(addBtn))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void showTable(List<Subjects> list) {
        int size= list.size();
        Object [][] subjects=new Object[size][7];
        for (int i=0;i<size; i++){
            subjects[i][0]=i+1;
            subjects[i][1]=list.get(i).getIdSubject();
            subjects[i][2]=list.get(i).getNameSubject();
            subjects[i][3]=list.get(i).getCredits();

        }
        subjectTable.setModel(new javax.swing.table.DefaultTableModel(subjects,
                new String [] {
                        "STT", "ID", "Name", "Credit"
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
        String id=idTxt.getText();
        String name=nameTxt.getText();
        String credit=emailTxt.getText();


        if (id.equals(subjects.getSubjects())){
            if (name!="" && credit!=""){
                SubjectDao.updateSubject(new Subjects(id,name,Integer.parseInt(credit)));
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit success.");

            }
            else
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Has a empty field.");
        }
        else{
            if (name!="" &&  credit!="" ){

                SubjectDao.deleteSubject(subjects.getIdSubject());
                SubjectDao.addSubject(new Subjects(id,name,Integer.parseInt(credit)));
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit success.");

            }
            else
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Has a empty field.");
        }
        List<Subjects> list=SubjectDao.getSubjectList();
        showTable(list);
    }

    private void searchBtnActionPerformed(ActionEvent evt) {
        List<Subjects> list=SubjectDao.fullTextSearch(searchTxt.getText());
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

    private void subjectTableMouseClicked(java.awt.event.MouseEvent evt) {
        int row=subjectTable.getSelectedRow();
        if (row>=0){
            idTxt.setText(subjectTable.getModel().getValueAt(row,1).toString());
            nameTxt.setText(subjectTable.getModel().getValueAt(row,2).toString());
            emailTxt.setText(subjectTable.getModel().getValueAt(row,3).toString());
            subjects= SubjectDao.getSubject(subjectTable.getModel().getValueAt(row,1).toString());
        }    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String id=idTxt.getText();
        String name=nameTxt.getText();
        Integer credit=Integer.parseInt(emailTxt.getText());
        if (id.equals("")){
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID is empty.");
        }
        else {
            Subjects subjects= SubjectDao.getSubject(id);
            if (subjects!=null)
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID exists.");
            else
            {
                SubjectDao.addSubject(new Subjects(id,name,credit));
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Add Class Success.");
            }
        }
        List<Subjects> list=SubjectDao.getSubjectList();
        showTable(list);
    }


    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {
        List<Subjects> list=SubjectDao.getSubjectList();
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
        String id=subjects.getIdSubject();

        int output=JOptionPane.showConfirmDialog(new CourseSystemFrame(),"Are you sure you want to delete?", String.valueOf(JOptionPane.QUESTION_MESSAGE),JOptionPane.YES_NO_OPTION);
        if (output==JOptionPane.YES_OPTION){
           SubjectDao.deleteSubject(id);
        }
        List<Subjects> list=SubjectDao.getSubjectList();
        showTable(list);
    }


    public List<Subjects> sortAscendingByID(List<Subjects> list){
        Collections.sort(list, new Comparator<Subjects>() {
            @Override
            public int compare(Subjects  sv1, Subjects sv2) {
                return sv1.getIdSubject().compareTo(sv2.getIdSubject());
            }
        });
        return list;
    }

    public List<Subjects> sortDescendingByID(List<Subjects> list){
        Collections.sort(list, new Comparator<Subjects>() {
            @Override
            public int compare(Subjects  sv1, Subjects sv2) {
                return sv2.getIdSubject().compareTo(sv1.getIdSubject());
            }
        });
        return list;
    }

    public List<Subjects> sortAscendingByName(List<Subjects> list){
        Collections.sort(list, new Comparator<Subjects>() {
            @Override
            public int compare(Subjects  sv1, Subjects sv2) {
                return sv1.getNameSubject().compareTo(sv2.getNameSubject());
            }
        });
        return list;
    }

    public List<Subjects> sortDescendingByName(List<Subjects> list){
        Collections.sort(list, new Comparator<Subjects>() {
            @Override
            public int compare(Subjects  sv1, Subjects sv2) {
                return sv2.getNameSubject().compareTo(sv1.getNameSubject());
            }
        });
        return list;
    }
    // Variables declaration - do not modify
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
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JComboBox<String> sortBox;
    private javax.swing.JButton sortBtn;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JTable subjectTable;
    private javax.swing.JScrollPane tableScroll;
    // End of variables declaration
}
