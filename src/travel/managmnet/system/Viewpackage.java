package travel.managmnet.system;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

public class Viewpackage extends JFrame implements ActionListener {
    
    
        
    JLabel lbusername,lbpackage,lbpersons,lbnumber,lbid,lbphone,lbcost;
    JButton back;
    
    String username;
    Viewpackage(String username){
        this.username=username;
        
        setBounds(300, 200, 700, 400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel head=new JLabel("BOOKED DETAILS");
        head.setBounds(280,0,500,50);
        head.setFont(new Font("Times of Roman",Font.BOLD,20));
        head.setForeground(Color.red);
        add(head);
        
        JLabel l1=new JLabel("Username : ");
        l1.setBounds(110,50,120,15);
        add(l1);
        
        lbusername=new JLabel();
        lbusername.setBounds(210,50,120,15);
        add(lbusername);
        
        JLabel l2=new JLabel("ID : ");
        l2.setBounds(110,80,120,15);
        add(l2);
        
         lbid=new JLabel();
        lbid.setBounds(210,80,120,15);
        add(lbid);
        
        
        JLabel l3=new JLabel("Number : ");
        l3.setBounds(110,110,120,15);
        add(l3);
        
        lbnumber=new JLabel();
        lbnumber.setBounds(210,110,120,15);
        add(lbnumber);
        
        JLabel l4=new JLabel("Package : ");
        l4.setBounds(110,140,120,15);
        add(l4);
        
        lbpackage=new JLabel();
        lbpackage.setBounds(210,140,120,15);
        add(lbpackage);
        
        JLabel l5=new JLabel("Persons : ");
        l5.setBounds(110,170,120,15);
        add(l5);
        
        lbpersons=new JLabel();
        lbpersons.setBounds(210,170,120,15);
        add(lbpersons);
        
        
        JLabel l6=new JLabel("Cost : ");
        l6.setBounds(110,200,120,15);
        add(l6);
        
        lbcost=new JLabel();
        lbcost.setBounds(210,200,120,15);
        add(lbcost);
        
        JLabel l7=new JLabel("Phone : ");
        l7.setBounds(110,230,120,15);
        add(l7);
        
        lbphone=new JLabel();
        lbphone.setBounds(210,230,120,15);
        add(lbphone);

        
        
        back=new JButton("Back");
        back.setBounds(300,320,90,20);
        back.setBackground(Color.GRAY);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Viewpack.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(450,50,200,200);
        add(image);        
        
        
        setVisible(true); 
        
    try{
        Conn cs=new Conn();
        String query="select * from bookpack where username = '"+username+"'";
        ResultSet rs = cs.s.executeQuery(query);
        while(rs.next()){
            lbusername.setText(rs.getString("username"));
            lbid.setText(rs.getString("id"));
            lbnumber.setText(rs.getString("lbnumber"));
            lbpackage.setText(rs.getString("package"));
            lbpersons.setText(rs.getString("persons"));
            lbphone.setText(rs.getString("phone"));
            lbcost.setText(rs.getString("lbcost"));
            
        }
    }catch(Exception e){
        e.printStackTrace();
    }
            
              
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
//            new Dashboard();
        }
    }
    
    
    public static void main(String args[]){
        new Viewpackage("");
    }
    
}
