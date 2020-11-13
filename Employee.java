/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author abdullah
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Employee() {
        initComponents();
        
       
         jPanel13.setBackground(new Color(0,0,0,0));
     
         jPanel15.setBackground(new Color(0,0,0,0));
         
         jLabel10.setVisible(false);
         jLabel10.setEnabled(false);
         jTextField1.setBackground(new Color(0,0,0,100));
         jTextField2.setBackground(new Color(0,0,0,100));
         jTextField3.setBackground(new Color(0,0,0,100));
         jTextField4.setBackground(new Color(0,0,0,100));
         jTextField5.setBackground(new Color(0,0,0,100));
         jTextField6.setBackground(new Color(0,0,0,100));
          jButton1.setBackground(new Color(0,0,0,100));
          Displyt1();
          Displyt2();
          Displyt3();
          
         
    }
      public void addItem(){
        String name = jTextField9.getText();
        int price =Integer.parseInt(jTextField10.getText());
        int qty = Integer.parseInt(jTextField11.getText());
        int total = price*qty;
       
        
    }
      
    private void Update(){
         String sql= "select * from register ";
        
        
       
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","Yossf#443");
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery(sql);
          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      
        
    }
    
       public void Displyt1(){ 
              
             
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","Yossf#443");
           String sql="select * from register";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      }
       
       
        public void Displyt2(){ 
              
             
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","Yossf#443");
           String sql="select * from product";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery();
           jTable2.setModel(DbUtils.resultSetToTableModel(rs)); 
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      }
        public void Displyt3(){ 
              
             
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","Yossf#443");
           String sql="select * from product";
           PreparedStatement ps ;
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery();
           jTable3.setModel(DbUtils.resultSetToTableModel(rs)); 
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      }
    // background color code
    public void backgroundcolor(){
        Color c = jColorChooser1.showDialog(null, "Background",getBackground() );
      jPanel2.setBackground(c);
       jPanel16.setBackground(c);
        jPanel17.setBackground(c);
         jPanel18.setBackground(c);
          jPanel19.setBackground(c);
           jPanel20.setBackground(c);
            jPanel21.setBackground(c);
             jPanel22.setBackground(c);
      
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        btnHome = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btnSettings = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btnTrack = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        btnProduct = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        btnUser = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel37 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton11 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        Insert1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        kGradientPanel3.setkEndColor(new java.awt.Color(204, 0, 0));
        kGradientPanel3.setkStartColor(new java.awt.Color(204, 0, 0));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_25px.png"))); // NOI18N
        jLabel27.setText(" Home");

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        kGradientPanel3.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 181, -1, -1));

        btnSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(0, 0, 102));
        jLabel28.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setIcon(new javax.swing.ImageIcon("D:\\resize\\settings (1).png")); // NOI18N
        jLabel28.setText(" Setting");
        jLabel28.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnSettingsLayout = new javax.swing.GroupLayout(btnSettings);
        btnSettings.setLayout(btnSettingsLayout);
        btnSettingsLayout.setHorizontalGroup(
            btnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnSettingsLayout.setVerticalGroup(
            btnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        kGradientPanel3.add(btnSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 571, 220, -1));

        btnTrack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTrack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(0, 0, 102));
        jLabel29.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setIcon(new javax.swing.ImageIcon("D:\\resize\\location.png")); // NOI18N
        jLabel29.setText("Track");
        jLabel29.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnTrackLayout = new javax.swing.GroupLayout(btnTrack);
        btnTrack.setLayout(btnTrackLayout);
        btnTrackLayout.setHorizontalGroup(
            btnTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnTrackLayout.setVerticalGroup(
            btnTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        kGradientPanel3.add(btnTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 493, 220, -1));

        btnProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(0, 0, 102));
        jLabel30.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setIcon(new javax.swing.ImageIcon("D:\\resize\\delevery (1).png")); // NOI18N
        jLabel30.setText("Product");
        jLabel30.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnProductLayout = new javax.swing.GroupLayout(btnProduct);
        btnProduct.setLayout(btnProductLayout);
        btnProductLayout.setHorizontalGroup(
            btnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnProductLayout.setVerticalGroup(
            btnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        kGradientPanel3.add(btnProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 415, 220, -1));

        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(0, 0, 102));
        jLabel31.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setIcon(new javax.swing.ImageIcon("D:\\resize\\iconfinder_Login Manager_7261 (1).png")); // NOI18N
        jLabel31.setText(" Login");
        jLabel31.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        kGradientPanel3.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 337, -1, -1));

        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(0, 0, 102));
        jLabel32.setFont(new java.awt.Font("Javanese Text", 1, 22)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setIcon(new javax.swing.ImageIcon("D:\\resize\\user (1).png")); // NOI18N
        jLabel32.setText(" User");
        jLabel32.setMaximumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout btnUserLayout = new javax.swing.GroupLayout(btnUser);
        btnUser.setLayout(btnUserLayout);
        btnUserLayout.setHorizontalGroup(
            btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserLayout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnUserLayout.setVerticalGroup(
            btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        kGradientPanel3.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 259, -1, -1));

        jPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon("D:\\resize\\color.png")); // NOI18N
        jLabel35.setText("  Background Color");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jLabel35)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mousePress(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon("D:\\resize\\shutdown-icon.png")); // NOI18N
        jLabel36.setText("  Log out");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel36)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel3.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\resize\\Downloads-black-icon.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\resize\\G12-Load-Up-icon.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 690));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel16.setBackground(new java.awt.Color(204, 0, 51));

        kGradientPanel1.setBackground(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkGradientFocus(44);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel16, "card2");

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(255, 255, 255));
        jTable3.setRowHeight(32);
        jTable3.setRowMargin(3);
        jTable3.setSelectionBackground(new java.awt.Color(204, 0, 0));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        kGradientPanel6.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel6.setkStartColor(new java.awt.Color(0, 0, 0));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_25px_2.png"))); // NOI18N
        jLabel37.setText("  ");

        jTextField18.setBackground(new java.awt.Color(0, 0, 0));
        jTextField18.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(255, 255, 255));
        jTextField18.setText("Search");
        jTextField18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField16FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField16FocusLost(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(204, 255, 255));
        jButton11.setText("Search");
        jButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton11.setRequestFocusEnabled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setAlignmentX(5.0F);
        jLabel23.setAlignmentY(1.5F);

        jLabel38.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setAlignmentX(5.0F);
        jLabel38.setAlignmentY(1.5F);

        jLabel39.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setAlignmentX(5.0F);
        jLabel39.setAlignmentY(1.5F);

        jLabel40.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setAlignmentX(5.0F);
        jLabel40.setAlignmentY(1.5F);

        jLabel41.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setAlignmentX(5.0F);
        jLabel41.setAlignmentY(1.5F);

        jTextField14.setBackground(new java.awt.Color(51, 51, 51));
        jTextField14.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setAlignmentX(5.0F);
        jTextField14.setAlignmentY(1.5F);
        jTextField14.setBorder(null);

        jTextField19.setBackground(new java.awt.Color(51, 51, 51));
        jTextField19.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(255, 255, 255));
        jTextField19.setAlignmentX(5.0F);
        jTextField19.setAlignmentY(1.5F);
        jTextField19.setBorder(null);

        jTextField20.setBackground(new java.awt.Color(51, 51, 51));
        jTextField20.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(255, 255, 255));
        jTextField20.setAlignmentX(5.0F);
        jTextField20.setAlignmentY(1.5F);
        jTextField20.setBorder(null);

        jTextField21.setBackground(new java.awt.Color(51, 51, 51));
        jTextField21.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(255, 255, 255));
        jTextField21.setAlignmentX(5.0F);
        jTextField21.setAlignmentY(1.5F);
        jTextField21.setBorder(null);

        jTextField22.setBackground(new java.awt.Color(51, 51, 51));
        jTextField22.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(255, 255, 255));
        jTextField22.setAlignmentX(5.0F);
        jTextField22.setAlignmentY(1.5F);
        jTextField22.setBorder(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(jTextField21)
                            .addComponent(jTextField20)
                            .addComponent(jTextField19)
                            .addComponent(jTextField14)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(131, 131, 131)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
            .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel17, "card3");

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.setAlignmentX(5.0F);
        jPanel23.setAlignmentY(1.5F);

        jLabel12.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setAlignmentX(5.0F);
        jLabel12.setAlignmentY(1.5F);

        jLabel13.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setAlignmentX(5.0F);
        jLabel13.setAlignmentY(1.5F);

        jLabel14.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setAlignmentX(5.0F);
        jLabel14.setAlignmentY(1.5F);

        jLabel15.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setAlignmentX(5.0F);
        jLabel15.setAlignmentY(1.5F);

        jLabel16.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setAlignmentX(5.0F);
        jLabel16.setAlignmentY(1.5F);

        jLabel17.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setAlignmentX(5.0F);
        jLabel17.setAlignmentY(1.5F);

        jTextField1.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setAlignmentX(5.0F);
        jTextField1.setAlignmentY(1.5F);
        jTextField1.setBorder(null);

        jTextField2.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setAlignmentX(5.0F);
        jTextField2.setAlignmentY(1.5F);
        jTextField2.setBorder(null);

        jTextField3.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setAlignmentX(5.0F);
        jTextField3.setAlignmentY(1.5F);
        jTextField3.setBorder(null);

        jTextField4.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setAlignmentX(5.0F);
        jTextField4.setAlignmentY(1.5F);
        jTextField4.setBorder(null);

        jTextField5.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setAlignmentX(5.0F);
        jTextField5.setAlignmentY(1.5F);
        jTextField5.setBorder(null);

        jTextField6.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setAlignmentX(1.5F);
        jTextField6.setAlignmentY(1.5F);
        jTextField6.setAutoscrolls(false);
        jTextField6.setBorder(null);

        Insert.setBackground(new java.awt.Color(51, 0, 51));
        Insert.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Insert.setText("Insert");
        Insert.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 0, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 0, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("jButton4");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextField7.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setAlignmentX(1.5F);
        jTextField7.setAlignmentY(1.5F);
        jTextField7.setAutoscrolls(false);
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setAlignmentX(1.5F);
        jTextField8.setAlignmentY(1.5F);
        jTextField8.setAutoscrolls(false);
        jTextField8.setBorder(null);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel18.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 311, -1, 315));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 51, 0));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(22);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 0));
        jTable1.setSelectionForeground(new java.awt.Color(255, 0, 0));
        jTable1.setShowGrid(false);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel18.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 920, 250));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_25px_2.png"))); // NOI18N
        jLabel24.setText("  ");
        jPanel18.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jTextField15.setBackground(new java.awt.Color(0, 0, 0));
        jTextField15.setFont(new java.awt.Font("Traditional Arabic", 0, 20)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setText("Search");
        jTextField15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField15FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField15FocusLost(evt);
            }
        });
        jPanel18.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 5, 179, 39));

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 11, 130, 39));
        jPanel18.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 47, 179, 10));

        jLabel42.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setAlignmentX(5.0F);
        jLabel42.setAlignmentY(1.5F);
        jPanel18.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField23.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(255, 255, 255));
        jTextField23.setAlignmentX(5.0F);
        jTextField23.setAlignmentY(1.5F);
        jTextField23.setBorder(null);
        jPanel18.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel18, "card4");

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel19, "card5");

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel20, "card6");

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable2.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 51, 0));
        jTable2.setRequestFocusEnabled(false);
        jTable2.setRowHeight(22);
        jTable2.setSelectionBackground(new java.awt.Color(204, 204, 0));
        jTable2.setSelectionForeground(new java.awt.Color(255, 0, 0));
        jTable2.setShowGrid(false);
        jTable2.setSurrendersFocusOnKeystroke(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setAlignmentX(5.0F);
        jPanel24.setAlignmentY(1.5F);

        jLabel18.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setAlignmentX(5.0F);
        jLabel18.setAlignmentY(1.5F);

        jLabel19.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setAlignmentX(5.0F);
        jLabel19.setAlignmentY(1.5F);

        jLabel20.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setAlignmentX(5.0F);
        jLabel20.setAlignmentY(1.5F);

        jLabel21.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setAlignmentX(5.0F);
        jLabel21.setAlignmentY(1.5F);

        jLabel22.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setAlignmentX(5.0F);
        jLabel22.setAlignmentY(1.5F);

        jTextField9.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(51, 0, 0));
        jTextField9.setAlignmentX(5.0F);
        jTextField9.setAlignmentY(1.5F);
        jTextField9.setBorder(null);

        jTextField10.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(51, 0, 0));
        jTextField10.setAlignmentX(5.0F);
        jTextField10.setAlignmentY(1.5F);
        jTextField10.setBorder(null);

        jTextField11.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(51, 0, 0));
        jTextField11.setAlignmentX(5.0F);
        jTextField11.setAlignmentY(1.5F);
        jTextField11.setBorder(null);

        jTextField12.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(51, 0, 0));
        jTextField12.setAlignmentX(5.0F);
        jTextField12.setAlignmentY(1.5F);
        jTextField12.setBorder(null);

        jTextField13.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(51, 0, 0));
        jTextField13.setAlignmentX(5.0F);
        jTextField13.setAlignmentY(1.5F);
        jTextField13.setBorder(null);

        Insert1.setBackground(new java.awt.Color(51, 0, 51));
        Insert1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Insert1.setText("Insert");
        Insert1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Insert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 0, 51));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setText("Update");
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 0, 51));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton6.setText("jButton3");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 0, 51));
        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton7.setText("jButton4");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel26.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("img");

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                    .addContainerGap(47, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Insert1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(56, 56, 56)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(70, 70, 70))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(Insert1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 81, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel21, "card7");

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel22, "card8");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 27, 960, 670));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 0, 0));
        kGradientPanel2.setkGradientFocus(600);
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 960, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/img/G12-Load-Up-icon.png"));
        jLabel10.setIcon(ii);
        jLabel10.setVisible(true);
        jLabel10.setEnabled(true);
        jLabel8.setVisible(false);
        jLabel8.setEnabled(false);
        jPanel36.setVisible(true);
        jPanel36.setEnabled(true);

    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed

        jLabel10.setVisible(false);
        jLabel10.setEnabled(false);
        jLabel8.setVisible(true);
        jLabel8.setEnabled(true);
        jPanel36.setVisible(false);
        jPanel36.setEnabled(false);
    }//GEN-LAST:event_jLabel10MousePressed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","Yossf#443");
            String sql = "insert into register values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ps.setString(1, jTextField1.getText());
            ps.setString(2, jTextField2.getText());
            ps.setString(3, jTextField3.getText());
            ps.setString(4, jTextField4.getText());
            ps.setString(5, jTextField5.getText());
            ps.setString(6, jTextField6.getText());
            ps.setString(7, jTextField8.getText());
            ps.setString(8, jTextField7.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "secuss");
            Displyt1();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_InsertActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","Yossf#443");
            String sql = "update  register set name=? , password=? , confirmPassword=? , email=? , phone=?, qeuastion=? , answer=? where username ='"+jTextField2.getText()+"' ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ps.setString(1, jTextField1.getText());

            ps.setString(2, jTextField3.getText());
            ps.setString(3, jTextField4.getText());
            ps.setString(4, jTextField5.getText());
            ps.setString(5, jTextField6.getText());
            ps.setString(6, jTextField8.getText());
            ps.setString(7, jTextField7.getText());

            ps.executeUpdate();
            Displyt1();
            JOptionPane.showMessageDialog(null, "secuss");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int s= JOptionPane.showConfirmDialog(null, "Do you want to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if (s==0) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","Yossf#443");
                String sql = "delete from register where username =?";
                PreparedStatement ps ;
                ps=conn.prepareStatement(sql);
                ps.setString(1,jTextField2.getText());
                ps.executeUpdate();

                Displyt1();
                JOptionPane.showMessageDialog(null, "secuss");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        int Srow =jTable1.getSelectedRow();
        jTextField1.setText(model.getValueAt(Srow, 0).toString());
        jTextField2.setText(model.getValueAt(Srow, 1).toString());
        jTextField3.setText(model.getValueAt(Srow, 2).toString());
        jTextField4.setText(model.getValueAt(Srow, 3).toString());
        jTextField5.setText(model.getValueAt(Srow, 4).toString());
        jTextField6.setText(model.getValueAt(Srow, 5).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusGained
        if (jTextField15.getText().equals("Search")) {
            jTextField15.setText("");
            jTextField15.setForeground(new Color(255,255,255));

        }
    }//GEN-LAST:event_jTextField15FocusGained

    private void jTextField15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusLost
        if (jTextField15.getText().equals("")) {
            jTextField15.setText("Search");
            jTextField15.setForeground(new Color(153,153,153));

        }
    }//GEN-LAST:event_jTextField15FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s= jTextField15.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","Yossf#443");
            String sql = "select * from register  where username=?";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ps.setString(1, jTextField15.getText());

            ResultSet rs= ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        int Srow =jTable2.getSelectedRow();

        jTextField9.setText(jTable2.getValueAt(Srow, 0).toString());
        jTextField10.setText(jTable2.getValueAt(Srow, 1).toString());
        jTextField11.setText(jTable2.getValueAt(Srow, 2).toString());
        jTextField12.setText(jTable2.getValueAt(Srow, 3).toString());
        jTextField13.setText(jTable2.getValueAt(Srow, 4).toString());
        Image ii =((ImageIcon)jTable2.getValueAt(Srow, 5)).getImage().getScaledInstance(jLabel25.getWidth(), jLabel25.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image =new ImageIcon(ii);
        jLabel25.setIcon(image);

    }//GEN-LAST:event_jTable2MouseClicked

    private void Insert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","Yossf#443");
            String sql = "insert into product values(?,?,?,?,?,?)";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ps.setString(1, jTextField9.getText());
            ps.setString(2, jTextField10.getText());
            ps.setString(3, jTextField11.getText());
            ps.setString(4, jTextField12.getText());
            ps.setString(5, jTextField13.getText());
            ps.setBytes(6, img);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "secuss");
            Displyt1();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_Insert1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        JFileChooser fc= new JFileChooser();
        FileNameExtensionFilter fnef=new FileNameExtensionFilter("images", "png","jpg","jpeg");
        fc.addChoosableFileFilter(fnef);
        fc.showOpenDialog(null);
        File fl=fc.getSelectedFile();

        jLabel25.setIcon(new ImageIcon(fl.toString()));
        filename=fl.getAbsolutePath();
        try {
            File file= new File(filename);
            FileInputStream fis= new FileInputStream(file);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            byte[] buf =new byte[1024];
            for(int readnum;(readnum=fis.read(buf))!=-1;){
                baos.write(buf,0,readnum);

            }
            img=baos.toByteArray();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void mouseEnterd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnterd
      
        if(evt.getSource()==btnHome) {
            btnHome.setBackground(new Color(155,102,0));
        }
       
        if(evt.getSource()==btnUser) {
            btnUser.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnLogin) {
            btnLogin.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnProduct){
            btnProduct.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnTrack) {
            btnTrack.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==btnSettings) {
            btnSettings.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==jPanel13) {
            jPanel13.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==jPanel37) {
            jPanel37.setBackground(new Color(155,102,0));
        }
        if(evt.getSource()==jPanel15) {
            jPanel15.setBackground(new Color(155,102,0));
        }
    }//GEN-LAST:event_mouseEnterd

    private void mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExit
         if(evt.getSource()==btnHome) {
            btnHome.setBackground(new Color(170,0,0));
        }
       
        if(evt.getSource()==btnUser){
            btnUser.setBackground(new Color(170,0,0));
        }
        if(evt.getSource()==btnLogin) {
            btnLogin.setBackground(new Color(170,0,0));
        }
        if(evt.getSource()==btnSettings) {
            btnSettings.setBackground(new Color(170,0,0));
        }
        if(evt.getSource()==btnProduct){
            btnProduct.setBackground(new Color(170,0,0));
        }
        if(evt.getSource()==btnTrack) {
            btnTrack.setBackground(new Color(170,0,0));
        }
       
        if(evt.getSource()==jPanel13) {
            jPanel13.setBackground(new Color(170,0,0));
        }
        if(evt.getSource()==jPanel37) {
            jPanel37.setBackground(new Color(170,0,0));
        }
        if(evt.getSource()==jPanel15) {
            jPanel15.setBackground(new Color(170,0,0));
        }
    }//GEN-LAST:event_mouseExit

    private void mousePress(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousePress
       if(evt.getSource()==btnHome){
            jPanel16.setVisible(true);
            jPanel18.setVisible(false);
            jPanel19.setVisible(false);
            jPanel20.setVisible(false);
            jPanel21.setVisible(false);
            jPanel17.setVisible(false);
        }
     

        if(evt.getSource()==btnUser){
            jPanel17.setVisible(false);
            jPanel18.setVisible(false);
            jPanel19.setVisible(true);
            jPanel20.setVisible(false);
            jPanel21.setVisible(false);
            jPanel16.setVisible(false);
        }
        if(evt.getSource()==btnLogin){
            jPanel17.setVisible(false);
            jPanel18.setVisible(false);
            jPanel19.setVisible(false);
            jPanel20.setVisible(true);
            jPanel21.setVisible(false);
            
            jPanel16.setVisible(false);
        }
        if(evt.getSource()==btnProduct){
            jPanel17.setVisible(false);
            jPanel18.setVisible(false);
            jPanel19.setVisible(false);
            jPanel20.setVisible(false);
            jPanel21.setVisible(true);
            
            jPanel16.setVisible(false);
        }
        if(evt.getSource()==btnTrack){
            jPanel17.setVisible(false);
            jPanel18.setVisible(true);
            jPanel19.setVisible(false);
            jPanel20.setVisible(false);
            jPanel21.setVisible(false);
           
            jPanel16.setVisible(false);
        }
        if(evt.getSource()==btnSettings){
            jPanel16.setVisible(false);
            jPanel18.setVisible(false);
            jPanel19.setVisible(false);
            jPanel20.setVisible(false);
            jPanel21.setVisible(false);
            
            jPanel17.setVisible(true);
        }
    }//GEN-LAST:event_mousePress

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16FocusLost

    private void jTextField16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16FocusGained

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
     
        int Srow =jTable3.getSelectedRow();

        jTextField14.setText(jTable3.getValueAt(Srow, 0).toString());
        jTextField19.setText(jTable3.getValueAt(Srow, 1).toString());
        jTextField20.setText(jTable3.getValueAt(Srow, 2).toString());
        jTextField21.setText(jTable3.getValueAt(Srow, 3).toString());
        jTextField22.setText(jTable3.getValueAt(Srow, 4).toString());
         byte[] byteArray = (byte[]) jTable3.getValueAt(Srow, 5);
        if (jTable3.getValueAt(Srow,5) ==null) {
      jLabel1.setText("No image");
      jLabel1.setIcon(null);
         }else{
           try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray)) {
               BufferedImage bImg = ImageIO.read(bais);
               ImageIcon icon = new ImageIcon(bImg);
               jLabel1.setIcon(icon);
               jLabel1.setText("");
              // jTextField14.setText(filename);
           } catch (IOException ex) {
              
           }
        }

    }//GEN-LAST:event_jTable3MouseClicked

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insert;
    private javax.swing.JButton Insert1;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JPanel btnProduct;
    private javax.swing.JPanel btnSettings;
    private javax.swing.JPanel btnTrack;
    private javax.swing.JPanel btnUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel6;
    // End of variables declaration//GEN-END:variables
byte[] img=null;
String filename=null;
}
