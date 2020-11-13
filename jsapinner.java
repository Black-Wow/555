/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author abdullah
 */
public class jsapinner {
     private void stateChange(javax.swing.event.ChangeEvent evt) {                             
    // 11111111111111111111111111111111111//
        
        if (evt.getSource()==  jSpinner_item1) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=1 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }     
          
        int qtyn=Integer.parseInt(jSpinner_item1.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item1.getValue().toString());
        total.setText((String.valueOf(tot)));
         
        
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
        
            
          
            
       
       //2222222222222222222222222222222//
          if (evt.getSource()==  jSpinner_item2) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id= 2";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item2.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item2.getValue().toString());
        total.setText((String.valueOf(tot)));
        jSpinner_item1.setValue(0);
         
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
          
          //333333333333333333333333333///
             if (evt.getSource()==  jSpinner_item3) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=3 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item3.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item3.getValue().toString());
        total.setText((String.valueOf(tot)));
        jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
          
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
             
             //444444444444444444444//
            if (evt.getSource()==  jSpinner_item4) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=4 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item4.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item4.getValue().toString());
        total.setText((String.valueOf(tot)));
       jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
          
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
            
       ///5555555555555555555555555555555555555///
        if (evt.getSource()==  jSpinner_item5) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=5 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item5.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item5.getValue().toString());
        total.setText((String.valueOf(tot)));
         jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
        
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
        ///666666666666666666666666666666///
         if (evt.getSource()==  jSpinner_item6) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=6 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item6.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item6.getValue().toString());
        total.setText((String.valueOf(tot)));
        jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
          
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
         //77777777777777777777777777777777777777777//
          if (evt.getSource()==  jSpinner_item7) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=7 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item7.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item7.getValue().toString());
        total.setText((String.valueOf(tot)));
        jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
          //888888888888888888888888888888888888//
           if (evt.getSource()==  jSpinner_item8) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=8 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item8.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item8.getValue().toString());
        total.setText((String.valueOf(tot)));
       jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
          
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
           //99999999999999999999999999999999999999999//
            if (evt.getSource()==  jSpinner_item9) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=9 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item9.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item9.getValue().toString());
        total.setText((String.valueOf(tot)));
         jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
          
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
            //10101010101010101010101010101010//
             if (evt.getSource()==  jSpinner_item10) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=10 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item10.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item10.getValue().toString());
        total.setText((String.valueOf(tot)));
      jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         
         jSpinner_item11.setValue(0);
         jSpinner_item12.setValue(0);
        }
             //11/11/11/11/11/11/11/11/
              if (evt.getSource()==  jSpinner_item11) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=11 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item11.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item11.getValue().toString());
        total.setText((String.valueOf(tot)));
         jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
        
         jSpinner_item12.setValue(0);
        }
              //121212121212121212121212121212121212//
               if (evt.getSource()==  jSpinner_item12) {
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xz_shopping_center","root","Yossf#443");
            String sql = "select * from product  where product_id=12 ";
            PreparedStatement ps ;
            ps=conn.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
              if (rs.next() ==false) {
                  JOptionPane.showMessageDialog(null, "Not found"); 
              }else{ 
                    String item_id=rs.getString("Product_id");
                    String item_Name=rs.getString("Product_name");
                    String item_Price=rs.getString("Product_price");
                id.setText(item_id);   
                name.setText(item_Name);
                price.setText(item_Price);         
              } 
        } catch (Exception e) { 
        }  
        int qtyn=Integer.parseInt(jSpinner_item12.getValue().toString());
        int pric = Integer.parseInt(price.getText());
        int tot = pric*qtyn ; 
        qty.setText(jSpinner_item12.getValue().toString());
        total.setText((String.valueOf(tot)));
       jSpinner_item1.setValue(0);
         jSpinner_item2.setValue(0);
         jSpinner_item3.setValue(0); 
         jSpinner_item4.setValue(0);
         jSpinner_item5.setValue(0);
         jSpinner_item6.setValue(0);
         jSpinner_item7.setValue(0);
         jSpinner_item8.setValue(0);
         jSpinner_item9.setValue(0);
         jSpinner_item10.setValue(0);
         jSpinner_item11.setValue(0);
        
        }
    }
        public static void main(String[] args) {
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Cart;
    private javax.swing.JTable Cart_Table;
    private javax.swing.JPanel Clothes;
    private javax.swing.JPanel Eletronic;
    private javax.swing.JPanel Furniture;
    private javax.swing.JPanel Help;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JTextField Order_State;
    private javax.swing.JPanel PnElectronic;
    private javax.swing.JPanel Product_Info;
    private javax.swing.JPanel Shoes;
    private javax.swing.JTextArea Text_Area_For_Bill;
    public static javax.swing.JTextField User_id;
    private javax.swing.JTextField id;
    private javax.swing.JLabel item10_img;
    private javax.swing.JLabel item10_img1;
    private javax.swing.JLabel item10_img2;
    private javax.swing.JLabel item10_img3;
    private javax.swing.JLabel item10_name;
    private javax.swing.JLabel item10_name1;
    private javax.swing.JLabel item10_name2;
    private javax.swing.JLabel item10_name3;
    private javax.swing.JLabel item10_price;
    private javax.swing.JLabel item10_price1;
    private javax.swing.JLabel item10_price2;
    private javax.swing.JLabel item10_price3;
    private javax.swing.JLabel item11_img;
    private javax.swing.JLabel item11_img1;
    private javax.swing.JLabel item11_img2;
    private javax.swing.JLabel item11_img3;
    private javax.swing.JLabel item11_name;
    private javax.swing.JLabel item11_name1;
    private javax.swing.JLabel item11_name2;
    private javax.swing.JLabel item11_name3;
    private javax.swing.JLabel item11_price;
    private javax.swing.JLabel item11_price1;
    private javax.swing.JLabel item11_price2;
    private javax.swing.JLabel item11_price3;
    private javax.swing.JLabel item12_img;
    private javax.swing.JLabel item12_img1;
    private javax.swing.JLabel item12_img2;
    private javax.swing.JLabel item12_img3;
    private javax.swing.JLabel item12_name;
    private javax.swing.JLabel item12_name1;
    private javax.swing.JLabel item12_name2;
    private javax.swing.JLabel item12_name3;
    private javax.swing.JLabel item12_price;
    private javax.swing.JLabel item12_price1;
    private javax.swing.JLabel item12_price2;
    private javax.swing.JLabel item12_price3;
    private javax.swing.JLabel item1_img;
    private javax.swing.JLabel item1_img1;
    private javax.swing.JLabel item1_img2;
    private javax.swing.JLabel item1_img3;
    private javax.swing.JLabel item1_name;
    private javax.swing.JLabel item1_name1;
    private javax.swing.JLabel item1_name2;
    private javax.swing.JLabel item1_name3;
    private javax.swing.JLabel item1_price;
    private javax.swing.JLabel item1_price1;
    private javax.swing.JLabel item1_price2;
    private javax.swing.JLabel item1_price3;
    private javax.swing.JLabel item2_img;
    private javax.swing.JLabel item2_img1;
    private javax.swing.JLabel item2_img2;
    private javax.swing.JLabel item2_img3;
    private javax.swing.JLabel item2_name;
    private javax.swing.JLabel item2_name1;
    private javax.swing.JLabel item2_name2;
    private javax.swing.JLabel item2_name3;
    private javax.swing.JLabel item2_price;
    private javax.swing.JLabel item2_price1;
    private javax.swing.JLabel item2_price2;
    private javax.swing.JLabel item2_price3;
    private javax.swing.JLabel item3_img;
    private javax.swing.JLabel item3_img1;
    private javax.swing.JLabel item3_img2;
    private javax.swing.JLabel item3_img3;
    private javax.swing.JLabel item3_name;
    private javax.swing.JLabel item3_name1;
    private javax.swing.JLabel item3_name2;
    private javax.swing.JLabel item3_name3;
    private javax.swing.JLabel item3_price;
    private javax.swing.JLabel item3_price1;
    private javax.swing.JLabel item3_price2;
    private javax.swing.JLabel item3_price3;
    private javax.swing.JLabel item4_img;
    private javax.swing.JLabel item4_img1;
    private javax.swing.JLabel item4_img2;
    private javax.swing.JLabel item4_img3;
    private javax.swing.JLabel item4_name;
    private javax.swing.JLabel item4_name1;
    private javax.swing.JLabel item4_name2;
    private javax.swing.JLabel item4_name3;
    private javax.swing.JLabel item4_price;
    private javax.swing.JLabel item4_price1;
    private javax.swing.JLabel item4_price2;
    private javax.swing.JLabel item4_price3;
    private javax.swing.JLabel item5_img;
    private javax.swing.JLabel item5_img1;
    private javax.swing.JLabel item5_img2;
    private javax.swing.JLabel item5_img3;
    private javax.swing.JLabel item5_name;
    private javax.swing.JLabel item5_name1;
    private javax.swing.JLabel item5_name2;
    private javax.swing.JLabel item5_name3;
    private javax.swing.JLabel item5_price;
    private javax.swing.JLabel item5_price1;
    private javax.swing.JLabel item5_price2;
    private javax.swing.JLabel item5_price3;
    private javax.swing.JLabel item6_img;
    private javax.swing.JLabel item6_img1;
    private javax.swing.JLabel item6_img2;
    private javax.swing.JLabel item6_img3;
    private javax.swing.JLabel item6_name;
    private javax.swing.JLabel item6_name1;
    private javax.swing.JLabel item6_name2;
    private javax.swing.JLabel item6_name3;
    private javax.swing.JLabel item6_price;
    private javax.swing.JLabel item6_price1;
    private javax.swing.JLabel item6_price2;
    private javax.swing.JLabel item6_price3;
    private javax.swing.JLabel item7_img;
    private javax.swing.JLabel item7_img1;
    private javax.swing.JLabel item7_img2;
    private javax.swing.JLabel item7_img3;
    private javax.swing.JLabel item7_name;
    private javax.swing.JLabel item7_name1;
    private javax.swing.JLabel item7_name2;
    private javax.swing.JLabel item7_name3;
    private javax.swing.JLabel item7_price;
    private javax.swing.JLabel item7_price1;
    private javax.swing.JLabel item7_price2;
    private javax.swing.JLabel item7_price3;
    private javax.swing.JLabel item8_img;
    private javax.swing.JLabel item8_img1;
    private javax.swing.JLabel item8_img2;
    private javax.swing.JLabel item8_img3;
    private javax.swing.JLabel item8_name;
    private javax.swing.JLabel item8_name1;
    private javax.swing.JLabel item8_name2;
    private javax.swing.JLabel item8_name3;
    private javax.swing.JLabel item8_price;
    private javax.swing.JLabel item8_price1;
    private javax.swing.JLabel item8_price2;
    private javax.swing.JLabel item8_price3;
    private javax.swing.JLabel item9_img;
    private javax.swing.JLabel item9_img1;
    private javax.swing.JLabel item9_img2;
    private javax.swing.JLabel item9_img3;
    private javax.swing.JLabel item9_name;
    private javax.swing.JLabel item9_name1;
    private javax.swing.JLabel item9_name2;
    private javax.swing.JLabel item9_name3;
    private javax.swing.JLabel item9_price;
    private javax.swing.JLabel item9_price1;
    private javax.swing.JLabel item9_price2;
    private javax.swing.JLabel item9_price3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner_item1;
    private javax.swing.JSpinner jSpinner_item10;
    private javax.swing.JSpinner jSpinner_item11;
    private javax.swing.JSpinner jSpinner_item12;
    private javax.swing.JSpinner jSpinner_item13;
    private javax.swing.JSpinner jSpinner_item14;
    private javax.swing.JSpinner jSpinner_item15;
    private javax.swing.JSpinner jSpinner_item16;
    private javax.swing.JSpinner jSpinner_item17;
    private javax.swing.JSpinner jSpinner_item18;
    private javax.swing.JSpinner jSpinner_item19;
    private javax.swing.JSpinner jSpinner_item2;
    private javax.swing.JSpinner jSpinner_item20;
    private javax.swing.JSpinner jSpinner_item21;
    private javax.swing.JSpinner jSpinner_item22;
    private javax.swing.JSpinner jSpinner_item23;
    private javax.swing.JSpinner jSpinner_item24;
    private javax.swing.JSpinner jSpinner_item25;
    private javax.swing.JSpinner jSpinner_item26;
    private javax.swing.JSpinner jSpinner_item27;
    private javax.swing.JSpinner jSpinner_item28;
    private javax.swing.JSpinner jSpinner_item29;
    private javax.swing.JSpinner jSpinner_item3;
    private javax.swing.JSpinner jSpinner_item30;
    private javax.swing.JSpinner jSpinner_item31;
    private javax.swing.JSpinner jSpinner_item32;
    private javax.swing.JSpinner jSpinner_item33;
    private javax.swing.JSpinner jSpinner_item34;
    private javax.swing.JSpinner jSpinner_item35;
    private javax.swing.JSpinner jSpinner_item36;
    private javax.swing.JSpinner jSpinner_item37;
    private javax.swing.JSpinner jSpinner_item38;
    private javax.swing.JSpinner jSpinner_item39;
    private javax.swing.JSpinner jSpinner_item4;
    private javax.swing.JSpinner jSpinner_item40;
    private javax.swing.JSpinner jSpinner_item41;
    private javax.swing.JSpinner jSpinner_item42;
    private javax.swing.JSpinner jSpinner_item43;
    private javax.swing.JSpinner jSpinner_item44;
    private javax.swing.JSpinner jSpinner_item45;
    private javax.swing.JSpinner jSpinner_item46;
    private javax.swing.JSpinner jSpinner_item47;
    private javax.swing.JSpinner jSpinner_item48;
    private javax.swing.JSpinner jSpinner_item5;
    private javax.swing.JSpinner jSpinner_item6;
    private javax.swing.JSpinner jSpinner_item7;
    private javax.swing.JSpinner jSpinner_item8;
    private javax.swing.JSpinner jSpinner_item9;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JTextField name;
    private javax.swing.JPanel pnClothes;
    private javax.swing.JPanel pnFurniture;
    private javax.swing.JPanel pnHelp;
    private javax.swing.JPanel pnHome;
    private javax.swing.JPanel pnSettings;
    private javax.swing.JPanel pnShoes;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField total;
    private javax.swing.JLabel total_tot;
    // End of variables declaration                
}
                      