
package travel.managmnet.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Payment extends JFrame implements ActionListener{
    JButton b1,b2;
    Payment(){
        
        setBounds(300, 200, 700, 400);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2=i1.getImage().getScaledInstance(700,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        add(l1);
        
         b1=new JButton("pay");
        b1.setBounds(500,0,80,40);
        b1.addActionListener(this);
        l1.add(b1);
        
         b2=new JButton("Back");
        b2.setBounds(600,0,80,40);
        b2.addActionListener(this);
        l1.add(b2);
        
        
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            setVisible(false);
        }else{
            new Paytm();
        }
    }
    
    
    
    
    public static void main(String args[]){
        new Payment();
    }
}
