
package travel.managmnet.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Bookpack extends JFrame  implements ActionListener{
    
    JTextField persons;
    JLabel lbusername,lbid,lbphone,lbnumber,lbcost;
    JComboBox choice;
    JButton book,checkprice,back; 
     
     String username;
     
    Bookpack(String username){
        this.username=username;
         setBounds(300, 200, 700, 400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text=new JLabel("BOOK PACKAGE");
        text.setBounds(250,14,200,35);
        text.setFont(new Font("TImes of Roman",Font.BOLD,20));
        text.setForeground(new Color(173, 52, 52));
        add(text);
        
        JLabel l1=new JLabel("Username : ");
        l1.setBounds(70,70,120,15);
        add(l1);
        
        lbusername=new JLabel();
        lbusername.setBounds(180,70,120,15);
        add(lbusername);
        
        JLabel l2=new JLabel("Select Package : ");
        l2.setBounds(70,100,120,15);
        add(l2);
        
        choice=new JComboBox(new String[] {"GOLD package","SILVER package","BRONZE package"});
        choice.setBounds(200,100,120,18);
        add(choice);
        
        JLabel l3=new JLabel("No.of persons :");
        l3.setBounds(70,130,120,15);
        add(l3);
        
        persons=new JTextField();
        persons.setBounds(200,135,120,15);
        add(persons);
        
        JLabel id=new JLabel("ID");
        id.setBounds(70,160,120,15);
        add(id);
        
        lbid=new JLabel();
        lbid.setBounds(200,165,120,15);
        add(lbid);
        
        lbnumber=new JLabel("Number: ");
        lbnumber.setBounds(70,190,120,15);
        add(lbnumber);
        
        lbnumber=new JLabel();
        lbnumber.setBounds(200,195,120,15);
        add(lbnumber);
        
        lbphone=new JLabel("Phone: ");
        lbphone.setBounds(70,220,120,15);
        add(lbphone);
        
        lbphone=new JLabel();
        lbphone.setBounds(200,225,120,15);
        add(lbphone);
        
        lbcost=new JLabel("Cost: ");
        lbcost.setBounds(70,250,120,15);
        add(lbcost);
        
        lbcost=new JLabel();
        lbcost.setBounds(200,255,120,15);
        add(lbcost);
        
        
        checkprice=new JButton("CheckPrice");
        checkprice.setBounds(20,300,110,19);
        checkprice.addActionListener(this);
        add(checkprice);
        
        book=new JButton("Book");
        book.setBounds(150,300,110,19);
        book.addActionListener(this);
        add(book);
        
        back=new JButton("Back");
        back.setBounds(280,300,110,19);
        back.addActionListener(this);
        add(back);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(450,50,200,200);
        add(image); 
        
        try{
             Conn cs=new Conn();
            ResultSet rs=cs.s.executeQuery("select * from coustmer where username = '"+username+"'");
            while(rs.next()){
                lbusername.setText(rs.getString("username"));
                lbid.setText(rs.getString("id"));
                lbnumber.setText(rs.getString("number"));
                lbphone.setText(rs.getString("phone"));
                persons.setText(rs.getString("persons"));
        }}catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
        
    }
    public void  actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == back){
                setVisible(false);
//                new Dashboard("");
            }
            else if(ae.getSource() == book){
                Conn cs=new Conn();
                cs.s.executeUpdate("insert into bookpack values ('"+lbusername.getText()+"','"+choice.getSelectedItem()+"','"+persons.getText()+"','"+lbid.getText()+"','"+lbphone.getText()+"','"+lbnumber.getText()+"','"+lbcost.getText()+"')");
                
                JOptionPane.showMessageDialog(null,"Booked Succesfuly");
            }
            else{
                int cost=0,person=0;
                String pack =(String) choice.getSelectedItem();
                if(pack.equals("Gold Package")){
                    cost+=12000;
                }else if(pack.equals("Silver Package")){
                    cost+=25000;
                }else{
                    cost+=32000;
                }
                person=Integer.parseInt(persons.getText());
                 cost*=person;
                 lbcost.setText("Rs "+cost);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
         new Bookpack("");
    }
    
}
