
package travel.managmnet.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Updatedetails extends JFrame implements ActionListener{
    JLabel lbusername,lbname;
    JTextField tfid,tfgender,tfnumber,tfcountry,tfaddress,tfphone,tfemail;
    JRadioButton male,female;
    JButton add,back;
//    String username;
    Updatedetails(String username){
        setBounds(300, 200, 700, 400);
         setLayout(null);
         getContentPane().setBackground(Color.WHITE);
         
         JLabel text=new JLabel("UPDATE CUSTOMER DETAILS");
         text.setBounds(200,0,900,25);
         text.setFont(new Font("Times of Roman",Font.BOLD,18));
         add(text);
         
         
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(50,30,150,12);
        add(lblusername);
        
        lbusername=new JLabel();
        lbusername.setBounds(210,30,150,18);
        add(lbusername);
        
        
        JLabel id = new JLabel("ID");
        id.setBounds(50,60,150,12);
        add(id);
        
        tfid= new JTextField();
        tfid.setBounds(210,58,150,18);
        add(tfid);
        
        JLabel number= new JLabel("Number");
        number.setBounds(50,90,150,12);
        add(number);
        
        tfnumber=new JTextField();
        tfnumber.setBounds(210,88,150,18);
        add(tfnumber);
        
        JLabel name = new JLabel("Name");
        name.setBounds(50,120,150,12);
        add(name);
        
        lbname= new JLabel();
        lbname.setBounds(210,118,150,18);
        add(lbname);
        
        
        JLabel gender= new JLabel("Gender");
        gender.setBounds(50,150,150,12);
        add(gender);
        
       tfgender=new JTextField();
        tfgender.setBounds(210,146,150,18);
        add(tfgender);
        
        JLabel country= new JLabel("Country");
        country.setBounds(50,180,150,15);
        add(country);
        
        tfcountry=new JTextField();
        tfcountry.setBounds(210,176,150,20);
        add(tfcountry);
        
        JLabel address= new JLabel("Address");
        address.setBounds(50,210,150,12);
        add(address);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(210,206,150,18);
        add(tfaddress);
        
        JLabel phone= new JLabel("Phone");
        phone.setBounds(50,240,150,12);
        add(phone);
        
        tfphone=new JTextField();
        tfphone.setBounds(210,236,150,18);
        add(tfphone);
        
        JLabel email= new JLabel("Email");
        email.setBounds(50,270,150,12);
        add(email);
        
        tfemail=new JTextField();
        tfemail.setBounds(210,266,150,18);
        add(tfemail);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/update.jpeg"));
        Image  i2=i1.getImage().getScaledInstance( 250,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(400,50,250,250);
        add(image);
        
        
        add=new JButton("Update");
        add.setBounds(90,310,90,20);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.GRAY);
        add.addActionListener(this);
        add(add);
        
        back= new JButton("Back");
        back.setBounds(240,310,90,20);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.GRAY);
        back.addActionListener(this);
        add(back);
        setVisible(true);
        
        try{
            Conn cs=new Conn();
            ResultSet rs=cs.s.executeQuery("select * from coustmer where username = '"+username+"'");
            while(rs.next()){
                lbusername.setText(rs.getString("username"));
                lbname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfcountry.setText(rs.getString("country"));
                tfemail.setText(rs.getString("email"));
                tfphone.setText(rs.getString("phone"));
                tfgender.setText(rs.getString("gender"));
                tfaddress.setText(rs.getString("address"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String username=lbusername.getText();
            String name=lbname.getText();
            String number=tfnumber.getText();
            String country=tfcountry.getText();
            String address =tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String gender =tfgender.getText();
            String id=tfid.getText();
            
            
           try{
               Conn cs=new Conn();
               
               String query="update coustmer set username='"+username+"',name='"+name+"', id ='"+id+"', number ='"+number+"', country='"+country+"', address ='"+address+"',phone='"+phone+"',email ='"+email+"',gender ='"+gender+"'";
//                 cs.s.executeQuery(query);
             
               cs.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Updated Succesfully");
           }catch(Exception e){
               e.printStackTrace();
           }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Updatedetails("");
    }
}
