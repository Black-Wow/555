/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectex;
import com.mysql.cj.x.protobuf.MysqlxSession;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.regex.MatchResult.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;





/**
 *
 * @author abdullah
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
      
        
    }
 

    boolean validation(){
        String fname,uname,pass,cpass,mail,ans;
        fname=register_Name.getText();
        uname=register_uname.getText();
        pass=register_pass.getText();
        cpass=register_cpass.getText();
        mail=register_mail.getText();
        ans=txtAnswer.getText();
        
     
     
        if (fname.equals("")) {
            
          lbl5.setText("Please enter your name **"); 
          lbl1.setText("Required*");
            return false;   
        }    if (uname.equals("")) {
            lbl2.setText("Required*");
          lbl5.setText("Please enter your username **"); 
          
            return false;   
        }  if (pass.equals("")) {
            lbl3.setText("Required*");
            lbl5.setText( "Please enter your password **");
            return false;   
        }  if (cpass.equals("")) {
             lbl4.setText("Required*");
           lbl5.setText("Please enter confirm password **");
            return false;   
        }  if (mail.equals("")) {
            
          lbl5.setText("Please enter your email **"); 
          lbl7.setText("Required*");
            return false;   
        }  if (ans.equals("")) {
            
          lbl5.setText("Please enter your answer **"); 
          lbl6.setText("Required*");
            return false;   
        }if (!(Pattern.matches("^[A-Za-z0-9._-]{2,25}$", uname))) {
             
            lbl5.setText( "Please enter a vaild username **");
            return false;   
        }     if (!(Pattern.matches("^[A-Za-z0-9+_.-]+@gmail.c(.+)$", mail ))) {
            
            lbl5.setText("Please enter a vaild email **");
           return false;
            
        
       
        }  
        if (pass.length() < 8) {
            lbl5.setText("Password should be more than 8 digits **");
            return false;
        } if (!pass.equals(cpass)) {
             lbl5.setText("Password not match **");
           return false;  
            
        } 
        
        return true;
    
    }
   
  
    public void clear(){
        register_Name.setText("");
        register_uname.setText("");
        register_pass.setText("");
        register_cpass.setText("");
        register_mail.setText("");
       
        jQution.setSelectedItem("");
        txtAnswer.setText("");
    }

  
      
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        register_Name = new javax.swing.JTextField();
        register_uname = new javax.swing.JTextField();
        register_pass = new javax.swing.JTextField();
        register_cpass = new javax.swing.JTextField();
        register_mail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        jQution = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setToolTipText("oiuoi");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name  :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 130, 35));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username  :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 130, 35));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password  :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 221, 130, 35));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Confirm Password  :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 278, 130, 35));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email  :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 335, 130, 35));

        register_Name.setBackground(new java.awt.Color(51, 0, 51));
        register_Name.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        register_Name.setForeground(new java.awt.Color(255, 255, 255));
        register_Name.setBorder(null);
        register_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_NameActionPerformed(evt);
            }
        });
        jPanel1.add(register_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 240, 35));

        register_uname.setBackground(new java.awt.Color(51, 0, 51));
        register_uname.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        register_uname.setForeground(new java.awt.Color(255, 255, 255));
        register_uname.setBorder(null);
        register_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_unameActionPerformed(evt);
            }
        });
        register_uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                register_unameKeyPressed(evt);
            }
        });
        jPanel1.add(register_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 240, 35));

        register_pass.setBackground(new java.awt.Color(51, 0, 51));
        register_pass.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        register_pass.setForeground(new java.awt.Color(255, 255, 255));
        register_pass.setBorder(null);
        register_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                register_passKeyPressed(evt);
            }
        });
        jPanel1.add(register_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 240, 35));

        register_cpass.setBackground(new java.awt.Color(51, 0, 51));
        register_cpass.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        register_cpass.setForeground(new java.awt.Color(255, 255, 255));
        register_cpass.setBorder(null);
        register_cpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                register_cpassKeyPressed(evt);
            }
        });
        jPanel1.add(register_cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 240, 35));

        register_mail.setBackground(new java.awt.Color(51, 0, 51));
        register_mail.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        register_mail.setForeground(new java.awt.Color(255, 255, 255));
        register_mail.setBorder(null);
        register_mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                register_mailKeyPressed(evt);
            }
        });
        jPanel1.add(register_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 240, 35));

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\iconsflow (2)\\Signup.png")); // NOI18N
        jButton1.setText(" Sign up");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, 43));

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setFont(new java.awt.Font("Traditional Arabic", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\iconsflow (2)\\login.png")); // NOI18N
        jButton3.setText("Sign in");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, 43));

        lbl1.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 120, 35));

        lbl2.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 120, 35));

        lbl3.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 120, 35));

        lbl4.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 120, 35));

        lbl5.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        lbl5.setForeground(new java.awt.Color(204, 255, 204));
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 330, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 328, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 328, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 328, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 328, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 328, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Ink Free", 3, 45)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\iconsflow (2)\\Signup.png")); // NOI18N
        jLabel7.setText(" Sign up");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 460, 60));

        jLabel8.setBackground(new java.awt.Color(51, 0, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Question :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 394, 130, 35));

        jLabel9.setBackground(new java.awt.Color(51, 0, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Answer :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 446, 130, 35));

        txtAnswer.setBackground(new java.awt.Color(51, 0, 51));
        txtAnswer.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        txtAnswer.setForeground(new java.awt.Color(153, 255, 255));
        txtAnswer.setActionCommand("<Not Set>");
        txtAnswer.setBorder(null);
        jPanel1.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 250, 35));

        jQution.setBackground(new java.awt.Color(0, 51, 102));
        jQution.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jQution.setForeground(new java.awt.Color(153, 255, 255));
        jQution.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "what is your best freind name ?", "What is your birth day?", "what kind of humen you are?" }));
        jQution.setBorder(null);
        jPanel1.add(jQution, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 220, 38));

        jSeparator7.setBackground(new java.awt.Color(204, 255, 204));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 328, 4));

        jSeparator8.setBackground(new java.awt.Color(204, 255, 204));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 328, 3));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 20, 19));

        lbl6.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        lbl6.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 120, 35));

        lbl7.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        lbl7.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 120, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String sql = "insert into register values(?,?,?,?,?,?,?,?)";    
               
        try {

       
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            
           
            PreparedStatement pst1 = conn.prepareStatement("select max(register_id)+1 from register");
            ResultSet rs = pst1.executeQuery();
            String id_reg="" ;
           if(rs.next())
           {
              id_reg= rs.getString(1);
            }
           
        PreparedStatement ps =conn.prepareStatement(sql);
        ps.setString(1, id_reg);
        ps.setString(2, register_Name.getText());
        ps.setString(3,register_uname.getText());
        ps.setString(4, register_pass.getText());
        ps.setString(5,register_cpass.getText());
        ps.setString(6, register_mail.getText());
       
        ps.setString(7, jQution.getSelectedItem().toString());
        ps.setString(8, txtAnswer.getText()); 
       
         if (validation()==true) {
               
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"register scucc");
                clear();
  
            
         } else{
              JOptionPane.showMessageDialog(null,"register faild");
         }
            
    } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void register_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_register_passKeyPressed
   String pass = register_pass.getText();
        if (pass.length() < 7) {
            lbl5.setText("Password should be more than 8 digits");
            
        }else{
            lbl5.setText("");
        }
     
    }//GEN-LAST:event_register_passKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         LoginForm lg = new LoginForm();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void register_mailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_register_mailKeyPressed
      if (!(Pattern.matches("^[A-Za-z0-9+_.-]+@gmail.c(.+)$", register_mail.getText() ))) {
            lbl5.setText("Enter a vaild email");
           
            
        }else{
           lbl5.setText("");
      } 
    }//GEN-LAST:event_register_mailKeyPressed

    private void register_cpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_register_cpassKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_cpassKeyPressed

    private void register_unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_register_unameKeyPressed
       if (!(Pattern.matches("^[A-Za-z0-9._-]{2,25}$", register_uname.getText()))) {
            lbl5.setText( "please enter vaild username(a-z0-9)");
       }else{
       lbl5.setText(null);}
    }//GEN-LAST:event_register_unameKeyPressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void register_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_NameActionPerformed

    private void register_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_unameActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jQution;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JTextField register_Name;
    private javax.swing.JTextField register_cpass;
    private javax.swing.JTextField register_mail;
    private javax.swing.JTextField register_pass;
    private javax.swing.JTextField register_uname;
    private javax.swing.JTextField txtAnswer;
    // End of variables declaration//GEN-END:variables

   
}