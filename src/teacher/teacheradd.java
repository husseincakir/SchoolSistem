/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

import teacher.teachers_options;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hussein
 */
public class teacheradd extends javax.swing.JFrame {

    
    Connection connect ;
    Statement statement ; 
    PreparedStatement preparedStatement ;
    ResultSet resultset ; 
    
    public teacheradd() {
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
    private void DBadd(){
        
        
        
        String name = jTextname.getText();
        String surname = jTextsurname.getText();
        String id_num = Jid_num.getText();
        String gender = ""; 
        if(jRadiomale.isSelected()){
        gender = "Male" ; 
        }
        else if(jRadiofamle.isSelected()){
        gender = "Famle" ;
        
        }
        String dateofB = dateB.getText();
        String dateS = datesatart.getText();
        String dateE = dateend.getText();
        String salary = jTextsalary.getText();
        String password = jpassword.getText();
        
        
        if(name==""||surname==""||id_num==""||gender==""||salary==""||password==""){
        
        JOptionPane.showMessageDialog(this,"Some information is missing");
        
        
        }
        else{
        
        try {
            
            connect.prepareStatement("insert into teachers(name,surname,idnum,gender,dateofbirth,datestart,dateend,salary,password) "
             + "values("+"'"+name+"'"+","+"'"+surname+"'"+","+"'"+id_num+"'"+","+"'"+gender+"'"+
            ","+"'"+dateofB+"'"+","+"'"+dateS+"'"+","+"'"+dateE+"'"+","+"'"+salary+"'"+","+"'"+password+"'"+")" ).executeUpdate();
            
                    JOptionPane.showMessageDialog(this, "Added successfully");                    
                    this.dispose();
        teachers_options teachers_options = new teachers_options();
        teachers_options.setVisible(true);
        teachers_options.pack();
        teachers_options.setLocationRelativeTo(null);
        teachers_options.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception ex) {
           ex.printStackTrace(); 
            
        }}
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        student = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextname = new javax.swing.JTextField();
        jTextsurname = new javax.swing.JTextField();
        jRadiomale = new javax.swing.JRadioButton();
        jRadiofamle = new javax.swing.JRadioButton();
        dateB = new datechooser.beans.DateChooserCombo();
        jButtoncancel = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Jid_num = new javax.swing.JTextField();
        datesatart = new datechooser.beans.DateChooserCombo();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dateend = new datechooser.beans.DateChooserCombo();
        jLabel24 = new javax.swing.JLabel();
        jTextsalary = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teachers.png"))); // NOI18N
        student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel11.setText("Teachers");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel12.setText("FirstName :");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel13.setText("SurName : ");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel14.setText("Gender :");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel15.setText("Date of Birth :");

        jTextname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextnameActionPerformed(evt);
            }
        });

        jTextsurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextsurnameActionPerformed(evt);
            }
        });

        jRadiomale.setText("Male");

        jRadiofamle.setText("Famle");
        jRadiofamle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadiofamleActionPerformed(evt);
            }
        });

        dateB.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));

    jButtoncancel.setBackground(new java.awt.Color(64, 64, 122));
    jButtoncancel.setForeground(new java.awt.Color(255, 255, 255));
    jButtoncancel.setText("Cancel");
    jButtoncancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtoncancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtoncancelActionPerformed(evt);
        }
    });

    add.setBackground(new java.awt.Color(64, 64, 122));
    add.setForeground(new java.awt.Color(255, 255, 255));
    add.setText("Add");
    add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    add.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addActionPerformed(evt);
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

    jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
    jLabel21.setText("ID-Number");

    Jid_num.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Jid_numActionPerformed(evt);
        }
    });

    datesatart.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));

jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
jLabel22.setText("Contract Start :");

jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
jLabel23.setText("Contract End :");

dateend.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
    new datechooser.view.appearance.ViewAppearance("custom",
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
            new java.awt.Color(0, 0, 0),
            new java.awt.Color(0, 0, 255),
            false,
            true,
            new datechooser.view.appearance.swing.ButtonPainter()),
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
            new java.awt.Color(0, 0, 0),
            new java.awt.Color(0, 0, 255),
            true,
            true,
            new datechooser.view.appearance.swing.ButtonPainter()),
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
            new java.awt.Color(0, 0, 255),
            new java.awt.Color(0, 0, 255),
            false,
            true,
            new datechooser.view.appearance.swing.ButtonPainter()),
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
            new java.awt.Color(128, 128, 128),
            new java.awt.Color(0, 0, 255),
            false,
            true,
            new datechooser.view.appearance.swing.LabelPainter()),
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
            new java.awt.Color(0, 0, 0),
            new java.awt.Color(0, 0, 255),
            false,
            true,
            new datechooser.view.appearance.swing.LabelPainter()),
        new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
            new java.awt.Color(0, 0, 0),
            new java.awt.Color(255, 0, 0),
            false,
            false,
            new datechooser.view.appearance.swing.ButtonPainter()),
        (datechooser.view.BackRenderer)null,
        false,
        true)));

jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
jLabel24.setText("Salary :");

jTextsalary.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    jTextsalaryActionPerformed(evt);
    }
    });

    jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
    jLabel25.setText("Set Password");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(92, 92, 92)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13))
                    .addGap(71, 71, 71)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextname, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addComponent(jTextsurname)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel21)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(Jid_num, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jRadiomale)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadiofamle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateend, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22)
                        .addComponent(jLabel24))
                    .addGap(42, 42, 42)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextsalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datesatart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel25)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtoncancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(add))
                        .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(104, 104, 104))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(312, 312, 312)
                    .addComponent(student)
                    .addGap(374, 374, 374))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addGap(405, 405, 405))))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(101, 101, 101))
                .addComponent(student))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel11)
            .addGap(36, 36, 36)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(datesatart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)))
            .addGap(16, 16, 16)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(dateend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(Jid_num, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadiofamle)
                        .addComponent(jRadiomale)
                        .addComponent(jLabel14))
                    .addGap(14, 14, 14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addComponent(dateB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtoncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseClicked

    }//GEN-LAST:event_studentMouseClicked

    private void jTextnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextnameActionPerformed

    private void jTextsurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextsurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextsurnameActionPerformed

    private void jButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncancelActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButtoncancelActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        DBconnect();
        DBadd();
       


    }//GEN-LAST:event_addActionPerformed

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
        teachers_options teachers_options = new teachers_options();
        teachers_options.setVisible(true);
        teachers_options.pack();
        teachers_options.setLocationRelativeTo(null);
        teachers_options.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void Jid_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jid_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jid_numActionPerformed

    private void jRadiofamleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadiofamleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadiofamleActionPerformed

    private void jTextsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextsalaryActionPerformed

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
            java.util.logging.Logger.getLogger(teacheradd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacheradd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacheradd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacheradd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacheradd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jid_num;
    private javax.swing.JButton add;
    private datechooser.beans.DateChooserCombo dateB;
    private datechooser.beans.DateChooserCombo dateend;
    private datechooser.beans.DateChooserCombo datesatart;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtoncancel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadiofamle;
    private javax.swing.JRadioButton jRadiomale;
    private javax.swing.JTextField jTextname;
    private javax.swing.JTextField jTextsalary;
    private javax.swing.JTextField jTextsurname;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JLabel student;
    // End of variables declaration//GEN-END:variables
}
