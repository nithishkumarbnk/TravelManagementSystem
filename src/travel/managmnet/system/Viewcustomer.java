package travel.managmnet.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Viewcustomer extends JFrame implements ActionListener {
    
    JLabel lbemail,lbusername,lbid,lbnumber,lbname,lbgender,lbcountry,lbaddress,lbphone;
    JButton back;
    
    Viewcustomer(String username){
        setBounds(300, 200, 700, 400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
       
        JLabel l1=new JLabel("Username : ");
        l1.setBounds(210,50,120,15);
        add(l1);
        
        lbusername=new JLabel();
        lbusername.setBounds(310,50,120,15);
        add(lbusername);
        
        JLabel l2=new JLabel("ID : ");
        l2.setBounds(210,80,120,15);
        add(l2);
        
         lbid=new JLabel();
        lbid.setBounds(310,80,120,15);
        add(lbid);
        
        
        JLabel l3=new JLabel("Number : ");
        l3.setBounds(210,110,120,15);
        add(l3);
        
        lbnumber=new JLabel();
        lbnumber.setBounds(310,110,120,15);
        add(lbnumber);
        
        JLabel l4=new JLabel("Name : ");
        l4.setBounds(210,140,120,15);
        add(l4);
        
        lbname=new JLabel();
        lbname.setBounds(310,140,120,15);
        add(lbname);
        
        JLabel l5=new JLabel("Gender : ");
        l5.setBounds(210,170,120,15);
        add(l5);
        
        lbgender=new JLabel();
        lbgender.setBounds(310,170,120,15);
        add(lbgender);
        
        
        JLabel l6=new JLabel("Country : ");
        l6.setBounds(210,200,120,15);
        add(l6);
        
        lbcountry=new JLabel();
        lbcountry.setBounds(310,200,120,15);
        add(lbcountry);
        
        JLabel l7=new JLabel("Address : ");
        l7.setBounds(210,230,120,15);
        add(l7);
        
        lbaddress=new JLabel();
        lbaddress.setBounds(310,230,120,15);
        add(lbaddress);
        
        JLabel l8=new JLabel("Phone : ");
        l8.setBounds(210,260,120,15);
        add(l8);
        
        lbphone=new JLabel();
        lbphone.setBounds(310,260,120,15);
        add(lbphone);
        
        JLabel l9=new JLabel("Email : ");
        l9.setBounds(210,290,120,15);
        add(l9);
        
        lbemail=new JLabel();
        lbemail.setBounds(310,290,120,15);
        add(lbemail);
        
        
        back=new JButton("Back");
        back.setBounds(320,320,90,20);
        back.setBackground(Color.GRAY);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/coustmerdetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(450,50,200,200);
        add(image);        
        
        
        setVisible(true); 
        
    try{
        Conn cs=new Conn();
        String query="select * from coustmer where username = '"+username+"'";
        ResultSet rs = cs.s.executeQuery(query);
        while(rs.next()){
            lbusername.setText(rs.getString("username"));
            lbid.setText(rs.getString("id"));
            lbnumber.setText(rs.getString("number"));
            lbgender.setText(rs.getString("gender"));
            lbaddress.setText(rs.getString("address"));
            lbphone.setText(rs.getString("phone"));
            lbemail.setText(rs.getString("email"));
            lbname.setText(rs.getString("name"));
            lbcountry.setText(rs.getString("country"));
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
    
    
    public static void main(String[] args){
        
        new Viewcustomer(" ");
        
    }

    
}
