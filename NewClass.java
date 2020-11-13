/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author abdullah
 */
import javax.swing.*;
import java.awt.event.*;

class MyFrame implements ActionListener{

JFrame frame;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
JTextField t1,t2,t3,t4,t5;
JButton b1,b2;

public MyFrame(){
frame=new JFrame(" BILL ");
frame.setLayout(null);

l1=new JLabel("Item");
l2=new JLabel("Price");
l3=new JLabel("Quantity");
l4=new JLabel("Samosa");
l5=new JLabel("uadapa");
l6=new JLabel("SAndwich");
l7=new JLabel("burger");
l8=new JLabel("pizza");
l9=new JLabel("15");
l10=new JLabel("10");
l11=new JLabel("25");
l12=new JLabel("50");
l13=new JLabel("100");


l14=new JLabel("your bill will be appear here");
l15=new JLabel(" : ");

t1=new JTextField("0");
t2=new JTextField("0");
t3=new JTextField("0");
t4=new JTextField("0");
t5=new JTextField("0");

b1=new JButton("Bill");
b2=new JButton("CANCEl");

l1.setBounds(40,40,40,40);
l2.setBounds(120,40,40,40);
l3.setBounds(170,40,60,40);

l4.setBounds(40,70,60,20);
l5.setBounds(40,100,60,20);
l6.setBounds(40,130,60,20);
l7.setBounds(40,160,60,20);
l8.setBounds(40,190,60,20);

l9.setBounds(120,70,40,20);
l10.setBounds(120,100,40,20);
l11.setBounds(120,130,40,20);
l12.setBounds(120,160,40,20);
l13.setBounds(120,190,40,20);

l14.setBounds(40,250,200,40);
l15.setBounds(40,280,200,40);

t1.setBounds(170,70,40,30);
t2.setBounds(170,100,40,30);
t3.setBounds(170,130,40,30);
t4.setBounds(170,160,40,30);
t5.setBounds(170,190,40,30);

b1.setBounds(40,220,100,30);
b2.setBounds(130,220,100,30);

frame.add(l1);
frame.add(l2);
frame.add(l3);
frame.add(l4);
frame.add(l5);
frame.add(l6);
frame.add(l7);
frame.add(l8);
frame.add(l9);
frame.add(l10);
frame.add(l11);
frame.add(l12);
frame.add(l13);
frame.add(l14);
frame.add(l15);

frame.add(t1);
frame.add(t2);
frame.add(t3);
frame.add(t4);
frame.add(t5);

frame.add(b1);
frame.add(b2);

b1.addActionListener(this);
b2.addActionListener(this);

frame.setSize(700,600);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent ae){

if(ae.getSource()==b1){
int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0;

a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=Integer.parseInt(t3.getText());
d=Integer.parseInt(t4.getText());
e=Integer.parseInt(t5.getText());
f=a+b+c+d+e;
g=a*15;
h=b*10;
i=c*25;
j=d*50;
k=e*100;
l=g+h+i+j+k;

l14.setText("total Item : "+f);
l15.setText("your total amount : "+l);
}
else{
l14.setText("nothing");

}
}
}

class clickswing{
public static void main(String [] args){
new MyFrame();

}
}
