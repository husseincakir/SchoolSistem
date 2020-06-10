package employee;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class employeeedit extends javax.swing.JFrame {
    Connection connect ;
    Statement statement ; 
    PreparedStatement preparedStatement ;
    ResultSet resultset ; 
    public employeeedit() {
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
    String id = jTextemployee.getText();
    try{
        DBconnect();
        String query = "select * from employee where "
                       + "idnum='"  + id +"'";
        
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
                resultset = statement.executeQuery("select * from employee where idnum = "+jTextemployee.getText());
                while(resultset.next()){
                String name = resultset.getString("name");
                String surname = resultset.getString("surname");
                String idnum = resultset.getString("idnum");
                String gender = resultset.getString("gender");
                String dateofbirth = resultset.getString("dateofbirth");
                String datestart = resultset.getString("datestart");
                String dateend = resultset.getString("dateend");
                String salary = resultset.getString("salary");
                String jop =  resultset.getString("jop");
                jTextname.setText(name);
                jTextsurname.setText(surname);
                jTextidnum.setText(idnum);
                if(gender.equals("Male"))
                jRadiomale.setSelected(true);
                else{jRadiofamle.setSelected(true);}
                jTextdateB.setText(dateofbirth);
                jTextdateS.setText(datestart);
                jTextdateE.setText(dateend);
                jTextsalary.setText(salary);
                jTextjop.setText(jop);
                
            }
        } 
        catch (Exception ex) {
            ex.printStackTrace(); 
    
        }
    }
    private void DBdelete(){
        try {
            DBconnect();
             connect.prepareStatement("delete from employee where idnum = "+jTextemployee.getText()).executeUpdate();
        } catch (Exception ex) {
           ex.printStackTrace(); 
        }
    
    
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
        jLabel16 = new javax.swing.JLabel();
        jTextname = new javax.swing.JTextField();
        jTextsurname = new javax.swing.JTextField();
        jRadiomale = new javax.swing.JRadioButton();
        jRadiofamle = new javax.swing.JRadioButton();
        jButtoncancel = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jTextemployee = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jTextdateB = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextidnum = new javax.swing.JTextField();
        jTextdateS = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextsalary = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextdateE = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextjop = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N
        student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel11.setText("Employees Edit");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel12.setText("FirstName :");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel13.setText("SurName : ");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel14.setText("Gender :");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel15.setText("Date of Birth :");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel16.setText("Contract Start :");

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

        jTextemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextemployeeActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel21.setText("Employee ID");

        search.setBackground(new java.awt.Color(64, 64, 122));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
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

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel17.setText("ID-Number");

        jTextidnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidnumActionPerformed(evt);
            }
        });

        jTextdateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdateSActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel18.setText("Contract End :");

        jTextsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextsalaryActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel19.setText("Salary :");

        jTextdateE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdateEActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel20.setText("Type of  job :");

        jTextjop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextjopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(search)
                                    .addGap(8, 8, 8))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20)))
                                    .addGap(18, 18, 18))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(196, 196, 196)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel11))
                                .addComponent(student))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextdateB, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextidnum, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jRadiomale)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jRadiofamle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jTextname, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(176, 176, 176)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtoncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update))
                    .addComponent(jTextjop)
                    .addComponent(jTextsalary)
                    .addComponent(jTextdateE)
                    .addComponent(jTextdateS))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)
                            .addComponent(jTextdateS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18)
                            .addComponent(jTextdateE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jTextsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel20))
                            .addComponent(jTextjop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jTextsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextidnum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadiofamle)
                            .addComponent(jRadiomale))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextdateB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jButtoncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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

    private void jTextnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextnameActionPerformed

    private void jTextsurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextsurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextsurnameActionPerformed

    private void jButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncancelActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButtoncancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        String employeeid = jTextemployee.getText();

        String name = jTextname.getText();
        String surname = jTextsurname.getText();
        String id_num = jTextidnum.getText();
        String gender = "";
        if(jRadiomale.isSelected()){
            gender = "Male" ;
        }
        else if(jRadiofamle.isSelected()){
            gender = "Famle" ;
        }

        String dateB = jTextdateB.getText();
        String dateS = jTextdateS.getText();
        String dateE = jTextdateE.getText();
        String salary = jTextsalary.getText();
        String jop = jTextjop.getText();

        if(employeeid.equals("")){
            JOptionPane.showMessageDialog(this,"Employee ID Not entered");

        }
        else{
            String id = checkid();
            if(id.equals("")){
                JOptionPane.showMessageDialog(this,"Employee ID Not found");
                jTextemployee.setText("");
            }
            else{

                DBconnect();

                if(name==""||surname==""||id_num==""||gender==""||dateB==""||dateS==""||dateE==""||salary==""||jop==""){

                    JOptionPane.showMessageDialog(this,"Some information is missing");

                }
                else{
                    try {
                        connect.prepareStatement("update employee set name= "+"'"+name+"'"+"where idnum = "+"'"+employeeid+"'").executeUpdate();
                        connect.prepareStatement("update employee set surname= "+"'"+surname+"'"+"where idnum = "+"'"+employeeid+"'").executeUpdate();
                        connect.prepareStatement("update employee set idnum= "+"'"+id_num+"'"+"where idnum = "+"'"+employeeid+"'").executeUpdate();
                        connect.prepareStatement("update employee set gender= "+"'"+gender+"'"+"where idnum = "+"'"+employeeid+"'").executeUpdate();
                        connect.prepareStatement("update employee set dateofbirth= "+"'"+dateB+"'"+"where idnum = "+"'"+employeeid+"'").executeUpdate();
                        connect.prepareStatement("update employee set datestart= "+"'"+dateS+"'"+"where idnum = "+"'"+employeeid+"'").executeUpdate();
                        connect.prepareStatement("update employee set dateend= "+"'"+dateE+"'"+"where idnum = "+"'"+employeeid+"'").executeUpdate();
                        connect.prepareStatement("update employee set salary= "+"'"+salary+"'"+"where idnum = "+"'"+employeeid+"'").executeUpdate();
                        connect.prepareStatement("update employee set jop= "+"'"+jop+"'"+"where idnum = "+"'"+employeeid+"'").executeUpdate();
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
        employee_options employee_options = new employee_options();
        employee_options.setVisible(true);
        employee_options.pack();
        employee_options.setLocationRelativeTo(null);
        employee_options.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextemployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextemployeeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String id = checkid();

        String employeeid = jTextemployee.getText();

        if(employeeid.equals("")){

            JOptionPane.showMessageDialog(this,"Employee ID Not entered");
        }
        else{

            if(id.equals("")){
                JOptionPane.showMessageDialog(this,"Employee ID Not found");
                jTextemployee.setText("");
            }
            else{
                DBread();
            }

        }
    }//GEN-LAST:event_searchActionPerformed

    private void jTextdateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdateBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdateBActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        String id = checkid();

        String employeeid = jTextemployee.getText();

        if(employeeid.equals("")){

            JOptionPane.showMessageDialog(this,"Employee ID Not entered");
        }
        else{

            if(id.equals("")){
                JOptionPane.showMessageDialog(this,"Employee ID Not found");
                jTextemployee.setText("");
            }
            else{
                DBdelete();
                JOptionPane.showMessageDialog(this,"Delete was successful");
                jTextname.setText("");
                jTextsurname.setText("");
                jTextidnum.setText("");
                jTextdateB.setText("");
                jTextdateS.setText("");
                jTextdateE.setText("");
                jTextsalary.setText("");
                jTextjop.setText("");

            }

        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jTextidnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidnumActionPerformed

    private void jTextdateSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdateSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdateSActionPerformed

    private void jTextsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextsalaryActionPerformed

    private void jTextdateEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdateEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdateEActionPerformed

    private void jTextjopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextjopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextjopActionPerformed

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
            java.util.logging.Logger.getLogger(employeeedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeedit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtoncancel;
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
    private javax.swing.JTextField jTextdateE;
    private javax.swing.JTextField jTextdateS;
    private javax.swing.JTextField jTextemployee;
    private javax.swing.JTextField jTextidnum;
    private javax.swing.JTextField jTextjop;
    private javax.swing.JTextField jTextname;
    private javax.swing.JTextField jTextsalary;
    private javax.swing.JTextField jTextsurname;
    private javax.swing.JButton search;
    private javax.swing.JLabel student;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
