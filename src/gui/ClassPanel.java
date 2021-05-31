package gui;

import dao.ClassSubjectDao;
import dao.StudentDao;
import dao.SubjectDao;
import dao.UsersDao;
import pojo.ClassSubject;
import pojo.Student;
import pojo.Subjects;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.*;

public class ClassPanel extends javax.swing.JPanel {

    private ClassSubject classSubject=null;

    public ClassPanel() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        namePanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        classTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortBox = new javax.swing.JComboBox<>();
        sortBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        namePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));

        studentLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentLabel.setText("Class Management");

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

        List<ClassSubject> classSubject=ClassSubjectDao.getClassList();
        showTable(classSubject);
        classTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classTableMouseClicked(evt);
            }
        });
        tableScroll.setViewportView(classTable);

        addBtn.setText("Add Class");
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
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(239, 239, 239)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(330, 330, 330)
                                                .addComponent(editBtn)
                                                .addGap(36, 36, 36)
                                                .addComponent(addBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteBtn)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                                                .addComponent(sortBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sortBtn)
                                                .addGap(38, 38, 38))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(tableScroll)
                                                .addContainerGap())))
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
                                .addGap(21, 21, 21)
                                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idLabel)
                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void editBtnActionPerformed(ActionEvent evt) {
        String id=idTxt.getText();
        String name=nameTxt.getText();


        if (id.equals(classSubject.getIdClass())){
            if (name!=""){
                classSubject.setNameClass(name);
                ClassSubjectDao.updateClass(classSubject);
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit success.");

            }
            else
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Has a empty field.");
        }
        else{
            if (name!="" ){

                ClassSubjectDao.deleteClass(classSubject.getIdClass());
                ClassSubjectDao.addClass(new ClassSubject(id,name,null));
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Edit success.");

            }
            else
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Has a empty field.");
        }
        List<ClassSubject> list=ClassSubjectDao.getClassList();
        showTable(list);
    }

    private void showTable(List<ClassSubject> list) {
        int size= list.size();
        Object [][] classes=new Object[size][7];
        for (int i=0;i<size; i++){
            classes[i][0]=i+1;
            classes[i][1]=list.get(i).getIdClass();
            classes[i][2]=list.get(i).getNameClass();
            Set<Student> students1=list.get(i).getStudents();
            int total=0;
            int totalMale=0;
            int totalFemale=0;
            Iterator<Student> studentIterator=list.get(i).getStudents().iterator();
            while(studentIterator.hasNext()){
                Student student=studentIterator.next();
                total++;
                if (student.getGender()==1)
                    totalFemale++;
                else
                    totalMale++;
            }
            classes[i][3]=total;
            classes[i][4]=totalMale;
            classes[i][5]=totalFemale;
        }
        classTable.setModel(new javax.swing.table.DefaultTableModel(classes,
                new String [] {
                        "STT", "ID", "Name", "Total", "Total male", "Total female"
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

    private void classTableMouseClicked(java.awt.event.MouseEvent evt) {
        int row=classTable.getSelectedRow();
        if (row>=0){
            idTxt.setText(classTable.getModel().getValueAt(row,1).toString());
            nameTxt.setText(classTable.getModel().getValueAt(row,2).toString());
            classSubject=ClassSubjectDao.getClass(classTable.getModel().getValueAt(row,1).toString());
        }
    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String id=idTxt.getText();
        String name=nameTxt.getText();
        if (id.equals("")){
            JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID is empty.");
        }
        else {
            ClassSubject classSubject1=ClassSubjectDao.getClass(id);
            if (classSubject1!=null)
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"ID exists.");
            else
            {
                ClassSubjectDao.addClass(new ClassSubject(id,name,null));
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Add Class Success.");
            }
        }
        List<ClassSubject> list=ClassSubjectDao.getClassList();
        showTable(list);
    }

    private void searchBtnActionPerformed(ActionEvent evt) {
        List<ClassSubject> list=ClassSubjectDao.fullTextSearch(searchTxt.getText());
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
        List<ClassSubject> list=ClassSubjectDao.getClassList();
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

        int output=JOptionPane.showConfirmDialog(new CourseSystemFrame(),"Are you sure you want to delete?", String.valueOf(JOptionPane.QUESTION_MESSAGE),JOptionPane.YES_NO_OPTION);
        if (output==JOptionPane.YES_OPTION){
            Iterator<Student> studentIterator=classSubject.getStudents().iterator();
            while(studentIterator.hasNext()){
                Student student=studentIterator.next();
                student.setIdClass(null);
                StudentDao.updateStudent(student);
                JOptionPane.showMessageDialog(new CourseSystemFrame(),"Class is successfully deleted.");
            }
            ClassSubjectDao.deleteClass(classSubject.getIdClass());
        }
        List<ClassSubject> list=ClassSubjectDao.getClassList();
        showTable(list);
    }

    public List<ClassSubject> sortAscendingByID(List<ClassSubject> list){
        Collections.sort(list, new Comparator<ClassSubject>() {
            @Override
            public int compare(ClassSubject  sv1, ClassSubject sv2) {
                return sv1.getIdClass().compareTo(sv2.getIdClass());
            }
        });
        return list;
    }

    public List<ClassSubject> sortDescendingByID(List<ClassSubject> list){
        Collections.sort(list, new Comparator<ClassSubject>() {
            @Override
            public int compare(ClassSubject  sv1, ClassSubject sv2) {
                return sv2.getIdClass().compareTo(sv1.getIdClass());
            }
        });
        return list;
    }

    public List<ClassSubject> sortAscendingByName(List<ClassSubject> list){
        Collections.sort(list, new Comparator<ClassSubject>() {
            @Override
            public int compare(ClassSubject  sv1, ClassSubject sv2) {
                return sv1.getNameClass().compareTo(sv2.getNameClass());
            }
        });
        return list;
    }

    public List<ClassSubject> sortDescendingByName(List<ClassSubject> list){
        Collections.sort(list, new Comparator<ClassSubject>() {
            @Override
            public int compare(ClassSubject  sv1, ClassSubject sv2) {
                return sv2.getNameClass().compareTo(sv1.getNameClass());
            }
        });
        return list;
    }
    // Variables declaration - do not modify
    private javax.swing.JButton addBtn;
    private javax.swing.JTable classTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
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
    private javax.swing.JScrollPane tableScroll;
    // End of variables declaration
}
