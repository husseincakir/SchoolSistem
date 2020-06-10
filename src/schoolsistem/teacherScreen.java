package schoolsistem;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class teacherScreen extends javax.swing.JFrame {
    Connection connect ;
    Statement statement ; 
    PreparedStatement preparedStatement ;
    ResultSet resultset ; 
    public teacherScreen() {
        initComponents();
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
    private void DBread(){
        DBconnect();
        try {
            resultset = statement.executeQuery("select * from students where idstudents = "+jTextstudentid.getText());
              while(resultset.next()){
                String name = resultset.getString("name");
                String surname = resultset.getString("surname");
                String physics = resultset.getString("physics");
                String chemistry = resultset.getString("chemistry");
                String maths = resultset.getString("maths");
                String sciences = resultset.getString("sciences");
                String english = resultset.getString("english");
                String turkish = resultset.getString("turkish");
                jTextname.setText(name);
                jTextsurname.setText(surname);
                jTextphysics.setText(physics);
                jTextchemistry.setText(chemistry);
                jTextmaths.setText(maths);
                jTextsciences.setText(sciences);
                jTextturkish.setText(english);
                jTextenglish.setText(turkish);
                
            }
        } 
        catch (Exception ex) {
            ex.printStackTrace(); 
    
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        student = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextturkish = new javax.swing.JTextField();
        jTextphysics = new javax.swing.JTextField();
        jTextchemistry = new javax.swing.JTextField();
        jTextenglish = new javax.swing.JTextField();
        jButtoncancel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jTextstudentid = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jTextsciences = new javax.swing.JTextField();
        jTextsurname = new javax.swing.JTextField();
        jTextmaths = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextname = new javax.swing.JTextField();
        update = new javax.swing.JButton();

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

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel12.setText("Physics point :");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel13.setText("SurName : ");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel14.setText("Maths point :");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel17.setText("Sciences point :");

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel18.setText("Turkish point :");

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel19.setText("Chemistry ponit :");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel20.setText("English point :");

        jTextturkish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextturkishActionPerformed(evt);
            }
        });

        jTextphysics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextphysicsActionPerformed(evt);
            }
        });

        jTextchemistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextchemistryActionPerformed(evt);
            }
        });

        jTextenglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextenglishActionPerformed(evt);
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
        jLabel9.setText("H32M School - Teacher");
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
        jButtonBack.setText("Logout");
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

        jTextsciences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextsciencesActionPerformed(evt);
            }
        });

        jTextsurname.setEditable(false);
        jTextsurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextsurnameActionPerformed(evt);
            }
        });

        jTextmaths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextmathsActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel22.setText("Name :");

        jTextname.setEditable(false);
        jTextname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextnameActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230)
                .addComponent(student)
                .addContainerGap(330, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel13))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextsurname)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtoncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update))
                    .addComponent(jTextstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextturkish, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextenglish)
                        .addComponent(jTextsciences, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextmaths)
                        .addComponent(jTextchemistry)
                        .addComponent(jTextphysics, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtoncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextphysics, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextchemistry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextmaths, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextsciences, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextturkish, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextenglish, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)))
                            .addComponent(jLabel12))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseClicked

    }//GEN-LAST:event_studentMouseClicked

    private void jTextturkishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextturkishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextturkishActionPerformed

    private void jTextphysicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextphysicsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextphysicsActionPerformed

    private void jTextchemistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextchemistryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextchemistryActionPerformed

    private void jTextenglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextenglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextenglishActionPerformed

    private void jButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncancelActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButtoncancelActionPerformed

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
        loginasteacher loginasteacher = new loginasteacher();
        loginasteacher.setVisible(true);
        loginasteacher.pack();
        loginasteacher.setLocationRelativeTo(null);
        loginasteacher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextstudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextstudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextstudentidActionPerformed

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

    private void jTextsciencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextsciencesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextsciencesActionPerformed

    private void jTextsurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextsurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextsurnameActionPerformed

    private void jTextmathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextmathsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextmathsActionPerformed

    private void jTextnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextnameActionPerformed

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

            
                String physics = jTextphysics.getText();
                String chemistry = jTextchemistry.getText();
                String maths = jTextmaths.getText();
                String sciences = jTextsciences.getText();
                String english = jTextturkish.getText();
                String turkish = jTextenglish.getText();
                DBconnect();



                
                    try {
                        connect.prepareStatement("update students set physics= "+"'"+physics+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
                        connect.prepareStatement("update students set chemistry= "+"'"+chemistry+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
                        connect.prepareStatement("update students set maths= "+"'"+maths+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
                        connect.prepareStatement("update students set sciences= "+"'"+sciences+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
                        connect.prepareStatement("update students set english= "+"'"+english+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
                        connect.prepareStatement("update students set turkish= "+"'"+turkish+"'"+"where idstudents = "+"'"+studentid+"'").executeUpdate();
                       
                        JOptionPane.showMessageDialog(this,"Update was successful");
                        DBread();

                    }

                    catch(Exception ex){

                        ex.printStackTrace();

                    }
                }

            }
    }//GEN-LAST:event_updateActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(teacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacherScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtoncancel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextchemistry;
    private javax.swing.JTextField jTextenglish;
    private javax.swing.JTextField jTextmaths;
    private javax.swing.JTextField jTextname;
    private javax.swing.JTextField jTextphysics;
    private javax.swing.JTextField jTextsciences;
    private javax.swing.JTextField jTextstudentid;
    private javax.swing.JTextField jTextsurname;
    private javax.swing.JTextField jTextturkish;
    private javax.swing.JButton search;
    private javax.swing.JLabel student;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
