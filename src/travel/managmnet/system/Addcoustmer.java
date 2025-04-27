package travel.managmnet.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Addcoustmer extends JFrame implements ActionListener {
    JLabel lbusername,lbname;
    JTextField tfnumber,tfcountry,tfaddress,tfphone,tfemail;
    JComboBox c;
    JRadioButton male,female;
    JButton add,back;
   
    Addcoustmer(String username){
         setBounds(300, 200, 700, 400);
         setLayout(null);
         getContentPane().setBackground(Color.WHITE);
         
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(50,30,150,12);
        add(lblusername);
        
        lbusername=new JLabel();
        lbusername.setBounds(210,30,150,18);
        add(lbusername);
        
        
        JLabel id = new JLabel("ID");
        id.setBounds(50,60,150,12);
        add(id);
        
        c= new JComboBox(new String[]{"Passport","AddharCard","PanCard","Vehicle License"});
        c.setBounds(210,58,150,18);
        c.setBackground(Color.white);
        add(c);
        
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
        
        male=new JRadioButton("Male");
        male.setBounds(210,146,61,18);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(280,146,70,18);
        add(female);
        
        JLabel country= new JLabel("Country");
        country.setBounds(50,180,150,12);
        add(country);
        
        tfcountry=new JTextField();
        tfcountry.setBounds(210,176,150,18);
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
        
        add=new JButton("Add");
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
        
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i8=i7.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel image1=new JLabel(i9);
        image1.setBounds(350,0,400,400);
        add(image1);
        
        try{
            Conn cs=new Conn();
            ResultSet rs=cs.s.executeQuery("select * from accounts where username='"+username+"'");
              while(rs.next()){
                   lbusername.setText(rs.getString("username"));
                   lbname.setText(rs.getString("name"));
               }
        }catch(Exception e){
            e.printStackTrace();
        }
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String username=lbusername.getText();
            String name=lbname.getText();
            String id=(String) c.getSelectedItem();
            String number=tfnumber.getText();
            String country=tfcountry.getText();
            String address =tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String gender =null;
            if(male.isSelected())
                gender="Male";
            else
                    gender="Female";
            
            
            
           try{
               Conn cs=new Conn();
               
               String query="insert into coustmer values('"+username+"','"+name+"','"+id+"','"+number+"','"+country+"','"+address+"','"+phone+"','"+email+"','"+gender+"')";
                              
//              cs.s.executeQuery(query);
             cs.s.executeUpdate(query);
               
               JOptionPane.showMessageDialog(null,"Coustmer Added");
           }catch(Exception e){
               e.printStackTrace();
           }
            
        }else{
            setVisible(false);
        }
    }
     public static void main(String[] args){
         new Addcoustmer(" ");
     }
}
