/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.Document;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author abdullah
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
pro1();
TableTrack();
sp1();
    }
      public void TableTrack(){ 
              
             
          try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
           String sql="SELECT \n" +
"trackdb.order_id,\n" +
"register.name,\n" +
"trackdb.Order_details,\n" +
"trackdb.order_total,\n" +
"trackdb.order_state\n" +
"from register\n" +
"inner join trackdb\n" +
"ON register.register_id=trackdb.user_id where user_id ='"+ jTextField1.getText()+"'";
            PreparedStatement ps ; 
           ps=conn.prepareStatement(sql);
           ResultSet rs =ps.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
           
          } catch (Exception e) { 
              JOptionPane.showMessageDialog(null, e);
          }
      
     
            
      }
    
    public void date(){
        try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","Yossf#443");
			
			java.util.Date date=new java.util.Date();
			
			java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
			
			PreparedStatement ps=conn.prepareStatement("insert into date  values(?,?)");
			ps.setDate(1,sqlDate);
			ps.setTimestamp(2,sqlTime);
			ps.executeUpdate();			
			
			ps.close();
			conn.close();
                        JOptionPane.showMessageDialog(null, "suc");
		}catch(Exception e){
			e.printStackTrace();
		}
    }
    
    
     public void sp1(){
           new Thread() {
           @Override
           public void run() { 
               try {
                   
                  if(jTextField2.getText().equals("Pending")) {
               for (int i = 0; i < 1; i++) {
                   Thread.sleep(2);
                   filler1.setSize(i,2);
                   } 
                  }
                  
                   if(jTextField2.getText().equals("IN Transit")) { 
               for (int i = 0; i < 130; i++) {
                   Thread.sleep(2);
                   filler1.setSize(i,2);
                   }  
                   }
                   
                   if(jTextField2.getText().equals("Reached Destinition")) {
               for (int i = 130; i < 265; i++) {
                   Thread.sleep(2);
                   filler1.setSize(i,2);
                   }  
                  }
                   
                   if(jTextField2.getText().equals("Out for Delivery")) {
               for (int i = 265; i < 400; i++) {
                   Thread.sleep(2);
                   filler1.setSize(i,2);
                   }  
                }
                   if(jTextField2.getText().equals("Complated")) {
               for (int i = 400; i < 530; i++) {
                   Thread.sleep(2);
                   filler1.setSize(i,2);
                   }  
                }
               } catch (Exception e) {
               }
           }
       }.start();      
    } 
     
  
       
   
   
     
       public void pro1(){
           new Thread() {
           @Override
           public void run() { 
               try {
                   
              
               for (int i = 0; i < 101; i++) {
                   Thread.sleep(34);
                   jLabel6.setText(Integer.toString(i )+"%");
                   jProgressBar1.setValue(i);
                   
                   } 
              
                 
               
               } catch (Exception e) {
               } 
               
           } 
           
           
       }.start();
           
    }
    
    public void sss(){
         if(jTextField2.getText().equals("Pending")){
           jPanel1.setBackground(Color.green);
           jPanel2.setBackground(Color.WHITE);
             jPanel3.setBackground(Color.WHITE);  
             jPanel4.setBackground(Color.WHITE);
               jPanel5.setBackground(Color.WHITE);
              
              sp1();
       }
         
 
        
        
        if(jTextField2.getText().equals("IN Transit")){
          jPanel1.setBackground(Color.green);
           jPanel2.setBackground(Color.GREEN);
             jPanel3.setBackground(Color.WHITE);  
             jPanel4.setBackground(Color.WHITE);
             jPanel5.setBackground(Color.WHITE);
             sp1();
                     }
        if(jTextField2.getText().equals("Reached Destinition")){
          jPanel1.setBackground(Color.green);
           jPanel2.setBackground(Color.GREEN);
             jPanel3.setBackground(Color.GREEN);  
             jPanel4.setBackground(Color.WHITE);
             jPanel5.setBackground(Color.WHITE);
           sp1();
        }
        if(jTextField2.getText().equals("Out for Delivery")){
           jPanel1.setBackground(Color.GREEN);
           jPanel2.setBackground(Color.GREEN);
             jPanel3.setBackground(Color.GREEN);  
             jPanel4.setBackground(Color.GREEN);
               jPanel5.setBackground(Color.WHITE);
               sp1();
        }
        if(jTextField2.getText().equals("Complated")){
           jPanel1.setBackground(Color.green);
           jPanel2.setBackground(Color.GREEN);
             jPanel3.setBackground(Color.GREEN);  
             jPanel4.setBackground(Color.GREEN);
            jPanel5.setBackground(Color.GREEN);
            sp1();
        }
        
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new RoundedPanel(360);
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JSeparator();
        canvas1 = new java.awt.Canvas();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        jPanel6 = new RoundedPanel(360, Color.BLUE);
        jPanel7 =  new RoundedPanel(120,Color.ORANGE);
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel8 = new RoundedPanel(120,Color.CYAN);
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        kGradientPanel15 = new keeptoo.KGradientPanel();
        updateProduct4 = new javax.swing.JButton();
        deleteProduct4 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        bill_text_area = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        lbl_Order_Id = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bill_amount = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        order_search = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "PickUp", "In Transit", "Reached Destinition", "Out for Delivery", "Complated" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 72, 138, -1));

        jTextField2.setText("Pending");
        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 108, -1));

        jTable1.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setCellSelectionEnabled(true);
        jTable1.setDragEnabled(true);
        jTable1.setFocusable(false);
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 410, 320));

        jTextField1.setEditable(false);
        jTextField1.setText("1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 77, 28, -1));

        jButton1.setText("report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 436, -1, -1));

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 155, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 280, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pending (1) (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 70, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/in transit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 600, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/deliveryed (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 600, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/out for delivery (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 600, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reached destinatrion (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 600, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 620, -1, 10));
        jSeparator1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 397, 298, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 459, 68, 53));

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jToolBar1.setMaximumSize(new java.awt.Dimension(5, 13));
        jToolBar1.setPreferredSize(new java.awt.Dimension(300, 25));
        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 152, 390, 0));

        jSeparator2.setForeground(new java.awt.Color(255, 102, 102));
        jSeparator2.setFont(new java.awt.Font("Symbol", 1, 48)); // NOI18N
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 182, 210, 10));
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, -1, -1));

        filler1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 5));
        filler1.setFocusTraversalPolicyProvider(true);
        filler1.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 613, -1, 0));

        jPanel6.setBackground(new java.awt.Color(102, 204, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7mousePress(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dtails.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Batang", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("My Details");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8mouseEnterd(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8mouseExit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8mousePress(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/taking order (1).png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Batang", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(60, 60, 60));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Taking More Orders");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        kGradientPanel15.setkEndColor(new java.awt.Color(255, 153, 51));
        kGradientPanel15.setkStartColor(new java.awt.Color(255, 153, 51));

        updateProduct4.setBackground(new java.awt.Color(51, 0, 51));
        updateProduct4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        updateProduct4.setText("Update");
        updateProduct4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateProduct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProduct4ActionPerformed(evt);
            }
        });

        deleteProduct4.setBackground(new java.awt.Color(51, 0, 51));
        deleteProduct4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deleteProduct4.setText("Delete");
        deleteProduct4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteProduct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProduct4ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(51, 0, 51));
        jButton15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton15.setText("Print");
        jButton15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        bill_text_area.setColumns(20);
        bill_text_area.setRows(5);
        jScrollPane7.setViewportView(bill_text_area);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "IN Transit", "Reached Destinition", "Out for Delivery", "Complated" }));

        lbl_Order_Id.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Order_Id.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        lbl_Order_Id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Order_Id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Order Id :");

        jLabel15.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total amount ");

        bill_amount.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        bill_amount.setForeground(new java.awt.Color(255, 255, 255));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_25px_2.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        order_search.setBackground(new java.awt.Color(0, 0, 0));
        order_search.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        order_search.setForeground(new java.awt.Color(204, 204, 204));
        order_search.setText("Search by Order ID");
        order_search.setBorder(null);
        order_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                order_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                order_searchFocusLost(evt);
            }
        });
        order_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_searchActionPerformed(evt);
            }
        });
        order_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                order_searchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel15Layout = new javax.swing.GroupLayout(kGradientPanel15);
        kGradientPanel15.setLayout(kGradientPanel15Layout);
        kGradientPanel15Layout.setHorizontalGroup(
            kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel15Layout.createSequentialGroup()
                .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order_search)
                                .addGap(123, 123, 123))
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(kGradientPanel15Layout.createSequentialGroup()
                                .addComponent(updateProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(deleteProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Order_Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bill_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        kGradientPanel15Layout.setVerticalGroup(
            kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order_search, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(240, 240, 240)
                .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Order_Id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bill_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(kGradientPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-icon-male-person-symbol-profile-circle-vector-20910853-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
     
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int row=jTable1.getSelectedRow();
jTextField2.setText((String) jTable1.getValueAt(row, 4));// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField2CaretUpdate
       sss();
    }//GEN-LAST:event_jTextField2CaretUpdate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
date();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPanel7mouseEnterd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7mouseEnterd

    }//GEN-LAST:event_jPanel7mouseEnterd

    private void jPanel7mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7mouseExit

    }//GEN-LAST:event_jPanel7mouseExit

    private void jPanel7mousePress(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7mousePress
        if (evt.getSource() == jPanel4) {
            Home.setVisible(false);
            Orders.setVisible(true);
            Taking_order_pn.setVisible(false);

        }
        if (evt.getSource() == jPanel7) {
            Home.setVisible(false);
            Orders.setVisible(false);
            Taking_order_pn.setVisible(true);
        }

    }//GEN-LAST:event_jPanel7mousePress

    private void jPanel8mouseEnterd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8mouseEnterd

    }//GEN-LAST:event_jPanel8mouseEnterd

    private void jPanel8mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8mouseExit

    }//GEN-LAST:event_jPanel8mouseExit

    private void jPanel8mousePress(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8mousePress
        if (evt.getSource() == jPanel4) {
            Home.setVisible(false);
            Orders.setVisible(true);
            Taking_order_pn.setVisible(false);

        }
        if (evt.getSource() == jPanel7) {
            Home.setVisible(false);
            Orders.setVisible(false);
            Taking_order_pn.setVisible(true);
        }

    }//GEN-LAST:event_jPanel8mousePress

    private void updateProduct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProduct4ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "update  taking_order set order_state=? where taking_order_id ='"+lbl_Order_Id.getText()+"' ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);

            ps.setString(1, jComboBox1.getSelectedItem().toString());
            ps.executeUpdate();

            pending_order();
            JOptionPane.showMessageDialog(null, "secuss");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateProduct4ActionPerformed

    private void deleteProduct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProduct4ActionPerformed
        int s= JOptionPane.showConfirmDialog(null, "Do you want to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if (s==0) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
                String sql = "delete from  taking_order where taking_order_id =?";
                PreparedStatement ps ;
                ps=conn.prepareStatement(sql);
                ps.setString(1,lbl_Order_Id.getText());
                ps.executeUpdate();

                pending_order();
                JOptionPane.showMessageDialog(null, "secuss");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_deleteProduct4ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        search_in_orders();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void order_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_order_searchFocusGained
        order_search.setText("");
    }//GEN-LAST:event_order_searchFocusGained

    private void order_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_order_searchFocusLost
        order_search.setText("Search by Order ID");
    }//GEN-LAST:event_order_searchFocusLost

    private void order_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_searchActionPerformed

    private void order_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_order_searchKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            if (order_search.getText().isEmpty()) {
                pending_order();
            }else{
                search_in_orders();
            }
        }
    }//GEN-LAST:event_order_searchKeyPressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bill_amount;
    private javax.swing.JTextArea bill_text_area;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton deleteProduct4;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private keeptoo.KGradientPanel kGradientPanel15;
    private javax.swing.JLabel lbl_Order_Id;
    private javax.swing.JTextField order_search;
    private javax.swing.JButton updateProduct4;
    // End of variables declaration//GEN-END:variables
class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }

        public RoundedPanel(int radius, Color bgColor) {       //888888
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        private RoundedPanel(int i, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            // graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border

        }
    }

}
