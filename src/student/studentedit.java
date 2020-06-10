/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hussein
 */
public class studentedit extends javax.swing.JFrame {
    Connection connect ;
    Statement statement ; 
    PreparedStatement preparedStatement ;
    ResultSet resultset ; 
    
    public studentedit() {
        initComponents();
        pack();
        this.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\Yazilim\\NetBeans projects\\SchoolSistem\\icons/sc.png");  
        this.setIconImage(icon); 
       
    }
    private void DBconnect(){
        try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
             connect = DriverManager.getConnection("jdbc:mysql://localhost/schooldatabase?user=root&password=123456");
             statement = connect.createStatement();
        }catch(Exception ex){
            ex.printStackTrace(); 
        
        }
    
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        student = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextfathername = new javax.swing.JTextField();
        jTextname = new javax.swing.JTextField();
        jTextmothername = new javax.swing.JTextField();
        jTextsurname = new javax.swing.JTextField();
        jRadiomale = new javax.swing.JRadioButton();
        jRadiofamle = new javax.swing.JRadioButton();
        jComboBoxClass = new javax.swing.JComboBox<>();
        jComboBox_eduL = new javax.swing.JComboBox<>();
        jButtoncancel = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jTextstudentid = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jTextdateR = new javax.swing.JTextField();
        jTextdateB = new javax.swing.JTextField();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student.png"))); // NOI18N
        student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel11.setText("Students Edit");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel12.setText("FirstName :");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel13.setText("SurName : ");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel14.setText("Gender :");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel15.setText("Date of Birth :");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel16.setText("Class :");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel17.setText("Educational level :");

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel18.setText("FatherName :");

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel19.setText("MotherName :");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel20.setText("Date of registration :");

        jTextfathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextfathernameActionPerformed(evt);
            }
        });

        jTextname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextnameActionPerformed(evt);
            }
        });

        jTextmothername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextmothernameActionPerformed(evt);
            }
        });

        jTextsurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextsurnameActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadiomale);
        jRadiomale.setText("Male");

        buttonGroup1.add(jRadiofamle);
        jRadiofamle.setText("Famle");

        jComboBoxClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox_eduL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primary", "Preparatory", "Secondary" }));
        jComboBox_eduL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_eduLActionPerformed(evt);
            }
        });

        jButtoncancel.setBackground(new java.awt.Color(64, 64, 122));
        jButtoncancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtoncancel.setText("Cancel");
        jButtoncancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtoncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncancelActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(64, 64, 122));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(44, 44, 84));
        jPanel4.setForeground(new java.awt.Color(44, 44, 84));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("x");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7jLabel1MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8jLabel2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("H32M School - Administration");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButtonBack.setBackground(new java.awt.Color(64, 64, 122));
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setText("Back");
        jButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jTextstudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextstudentidActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel21.setText("Student ID");

        search.setBackground(new java.awt.Color(64, 64, 122));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jTextdateR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdateRActionPerformed(evt);
            }
        });

        jTextdateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdateBActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(64, 64, 122));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addComponent(student))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel12))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadiofamle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadiomale))
                                    .addComponent(jComboBox_eduL, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextmothername, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextname, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextdateR)))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxClass, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextfathername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextsurname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextdateB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtoncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update)))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jTextstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(313, 313, 313))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTextfathername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextdateB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_eduL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextmothername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jRadiomale)
                            .addComponent(jRadiofamle))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtoncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jTextdateR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseClicked

    }//GEN-LAST:event_studentMouseClicked

    private void jTextfathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextfathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextfathernameActionPerformed

    private void jTextnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextnameActionPerformed

    private void jTextmothernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextmothernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextmothernameActionPerformed

    private void jTextsurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextsurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextsurnameActionPerformed

    private void jComboBox_eduLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_eduLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_eduLActionPerformed

    private void jButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncancelActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButtoncancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        
        
        
        String studentid = jTextstudentid.getText();
        if(studentid.equals("")){
        JOptionPane.showMessageDialog(this,"Student ID Not entered");
        
        }
        else{
            String id = checkid();
            if(id.equals("")){
                JOptionPane.showMessageDialog(this,"Student ID Not found");
                jTextstudentid.setText("");
            }
            else{
          
        DBconnect();
        
        String name = jTextname.getText();
        String surname = jTextsurname.getText();
        String fathername = jTextfathername.getText();
        String mothername = jTextmothername.getText();
        String gender = ""; 
        if(jRadiomale.isSelected()){
        gender = "Male" ; 
        }
        else if(jRadiofamle.isSelected()){
        gender = "Famle" ;
        
        }
        String educational_level  = jComboBox_eduL.getSelectedItem().toString();
        String dateofR = jTextdateR.getText();
        String dateofB = jTextdateB.getText();
        String Class = jComboBoxClass.getSelectedItem().toString();
        
        if(name==""||surname==""||fathername==""||gender==""){
        
        JOptionPane.showMessageDialog(this,"Some information is missing");
        
        
        }
        else{
try {
            connect.prepareStatement("update students set name= "+"'"+name+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
            connect.prepareStatement("update students set surname= "+"'"+surname+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
            connect.prepareStatement("update students set fathername= "+"'"+fathername+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
            connect.prepareStatement("update students set mathername= "+"'"+mothername+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
            connect.prepareStatement("update students set gender= "+"'"+gender+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
            connect.prepareStatement("update students set edulevel= "+"'"+educational_level+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
            connect.prepareStatement("update students set dateofregistration= "+"'"+dateofR+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
            connect.prepareStatement("update students set dateofbirth= "+"'"+dateofB+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
            connect.prepareStatement("update students set class= "+"'"+Class+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
            JOptionPane.showMessageDialog(this,"Update was successful");
            DBread(); 
            
    }

                catch(Exception ex){
                    
                    ex.printStackTrace();   
                      
                      }
        }
    
        }}
    }//GEN-LAST:event_updateActionPerformed

    private void jLabel7jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7jLabel1MouseClicked

    private void jLabel8jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8jLabel2MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel8jLabel2MouseClicked

    private void jLabel9jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9jLabel5MouseClicked

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        student_options student_options = new student_options();
        student_options.setVisible(true);
        student_options.pack();
        student_options.setLocationRelativeTo(null);
        student_options.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextstudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextstudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextstudentidActionPerformed

    private void DBread(){
        DBconnect();
        try {
            resultset = statement.executeQuery("select * from students where idstudents = "+jTextstudentid.getText());
              while(resultset.next()){
                String name = resultset.getString("name");
                String surname = resultset.getString("surname");
                String fathername = resultset.getString("fathername");
                String mothername = resultset.getString("mathername");
                String gender = resultset.getString("gender");
                String edulevel = resultset.getString("edulevel");
                String dateofregistration = resultset.getString("dateofregistration");
                String dateofbirth = resultset.getString("dateofbirth");
                String Class =  resultset.getString("class");
                jTextname.setText(name);
                jTextfathername.setText(fathername);
                jTextmothername.setText(mothername);
                jTextsurname.setText(surname);
                if(gender.equals("Male"))
                jRadiomale.setSelected(true);
                else{jRadiofamle.setSelected(true);}
                if(edulevel.equals("Primary")){
                jComboBox_eduL.setSelectedIndex(0);}
                if(edulevel.equals("Preparatory")){
                jComboBox_eduL.setSelectedIndex(1);
                }
                if(edulevel.equals("Secondary")){
                jComboBox_eduL.setSelectedIndex(2);
                }
                
                jTextdateR.setText(dateofregistration);
                jTextdateB.setText(dateofbirth);
                
                
                ///////////////////////////////////////////////
                if(Class.equals("1")){
                jComboBoxClass.setSelectedIndex(0);
                
                }
                 if(Class.equals("2")){
                jComboBoxClass.setSelectedIndex(1);
                
                }if(Class.equals("3")){
                jComboBoxClass.setSelectedIndex(2);
                
                }
                if(Class.equals("4")){
                jComboBoxClass.setSelectedIndex(3);
                
                }
                if(Class.equals("5")){
                jComboBoxClass.setSelectedIndex(4);
                
                }
                if(Class.equals("6")){
                jComboBoxClass.setSelectedIndex(5);
                
                }if(Class.equals("7")){
                jComboBoxClass.setSelectedIndex(6);
                
                }if(Class.equals("8")){
                jComboBoxClass.setSelectedIndex(7);
                
                }
                if(Class.equals("9")){
                jComboBoxClass.setSelectedIndex(8);
                
                }
                if(Class.equals("10")){
                jComboBoxClass.setSelectedIndex(9);
                
                }
                if(Class.equals("11")){
                jComboBoxClass.setSelectedIndex(10);
                
                }
                if(Class.equals("12")){
                jComboBoxClass.setSelectedIndex(11);
                
                }
//////////////////////////////////////////////////////////////////////
                
                
                
            }
        } 
        catch (Exception ex) {
            ex.printStackTrace(); 
    
        }
    }
    private void DBdelete(){
        try {
            DBconnect();
             connect.prepareStatement("delete from students where idstudents = "+jTextstudentid.getText()).executeUpdate();
        } catch (Exception ex) {
           ex.printStackTrace(); 
        }
    
    
    }
   
    private String checkid(){
    String id = jTextstudentid.getText();
    try{
        DBconnect();
        String query = "select * from students where "
                       + "idstudents='"  + id +"'";
        
        statement.executeQuery(query);
        while(statement.getResultSet().next()){
            return id ; 
        
        }
        
        }catch(Exception ex){
            
                 ex.printStackTrace(); 
        }
        return "" ; 
        
    }
    
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
    String id = checkid();
      
       
       String studentid = jTextstudentid.getText();
   

  
       
        if(studentid.equals("")){

         
             JOptionPane.showMessageDialog(this,"Student ID Not entered");
        }
        else{
         
            if(id.equals("")){
                JOptionPane.showMessageDialog(this,"Student ID Not found");
                jTextstudentid.setText("");
            }
            else{
            DBread();
            }
        
        }
        
    }//GEN-LAST:event_searchActionPerformed

    private void jTextdateRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdateRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdateRActionPerformed

    private void jTextdateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdateBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdateBActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       
           String id = checkid();
      
       
       String studentid = jTextstudentid.getText();
     

  
       
        if(studentid.equals("")){

         
             JOptionPane.showMessageDialog(this,"Student ID Not entered");
        }
        else{
         
            if(id.equals("")){
                JOptionPane.showMessageDialog(this,"Student ID Not found");
                jTextstudentid.setText("");
            }
            else{
           DBdelete();
           JOptionPane.showMessageDialog(this,"Delete was successful");
           jTextname.setText("");
           jTextstudentid.setText("");
           jTextmothername.setText("");
           jTextfathername.setText("");
           jTextsurname.setText("");
           jTextdateB.setText("");
           jTextdateR.setText("");
           
            }
        
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentedit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtoncancel;
    private javax.swing.JComboBox<String> jComboBoxClass;
    private javax.swing.JComboBox<String> jComboBox_eduL;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadiofamle;
    private javax.swing.JRadioButton jRadiomale;
    private javax.swing.JTextField jTextdateB;
    private javax.swing.JTextField jTextdateR;
    private javax.swing.JTextField jTextfathername;
    private javax.swing.JTextField jTextmothername;
    private javax.swing.JTextField jTextname;
    private javax.swing.JTextField jTextstudentid;
    private javax.swing.JTextField jTextsurname;
    private javax.swing.JButton search;
    private javax.swing.JLabel student;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
