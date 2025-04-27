package travel.managmnet.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    String username;
    Dashboard(String username ){
       this.username=username;
        setBounds(0,0,1920,1200);
        setLayout(null);
       
        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1920,70);
        p1.setBackground(new Color(0,0,102));
//        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(p1);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,70,250,1000);
        p2.setBackground(new Color(0,0,102));
        add(p2);
        
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2= i1.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
  
        
        JLabel l1= new JLabel("Dashboard");
        l1.setBounds(80,10,300,40);
        l1.setFont(new Font("Times of Roman",Font.BOLD,30));
        l1.setForeground(Color.white);
        p1.add(l1);
        
        
        b1= new JButton("Add Personal Details");
        b1.setBackground(new Color(0,0,102));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Roboto",Font.BOLD,18));
        b1.setBounds(0,0,250,50);
        b1.setMargin(new Insets(0,0,0,60));
        b1.addActionListener(this);
        p2.add(b1);
        
        b2= new JButton("Update Personal Details");
        b2.setBackground(new Color(0,0,102));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Roboto",Font.BOLD,18));
        b2.setBounds(0,49,250,50);
        b2.setMargin(new Insets(0,0,0,30));
        b2.addActionListener(this);
        p2.add(b2);
        
        
        b3= new JButton("View Details");
        b3.setBackground(new Color(0,0,102));
        b3.setForeground(Color.white);
        b3.setFont(new Font("Roboto",Font.BOLD,18));
        b3.setBounds(0,99,250,50);
        b3.setMargin(new Insets(0,0,0,130));
        b3.addActionListener(this);
        p2.add(b3);
        
         b4= new JButton("Delete Personal Details");
        b4.setBackground(new Color(0,0,102));
        b4.setForeground(Color.white);
        b4.setFont(new Font("Roboto",Font.BOLD,18));
        b4.setBounds(0,149,250,50);
        b4.setMargin(new Insets(0,0,0,40));
        p2.add(b4);
        
        b5= new JButton("Check Package");
        b5.setBackground(new Color(0,0,102));
        b5.setForeground(Color.white);
        b5.setFont(new Font("Roboto",Font.BOLD,18));
        b5.setBounds(0,199,250,50);
        b5.setMargin(new Insets(0,0,0,110));
        b5.addActionListener(this);
        p2.add(b5);
        
        b6= new JButton("Book Package");
        b6.setBackground(new Color(0,0,102));
        b6.setForeground(Color.white);
        b6.setFont(new Font("Roboto",Font.BOLD,18));
        b6.setBounds(0,249,250,50);
        b6.setMargin(new Insets(0,0,0,115));
        b6.addActionListener(this);
        p2.add(b6);
        
        
        b7= new JButton("View Package");
        b7.setBackground(new Color(0,0,102));
        b7.setForeground(Color.white);
        b7.setFont(new Font("Roboto",Font.BOLD,18));
        b7.setBounds(0,299,250,50);
        b7.setMargin(new Insets(0,0,0,115));
        b7.addActionListener(this);
        p2.add(b7);
        
        b8= new JButton("View Hotels");
        b8.setBackground(new Color(0,0,102));
        b8.setForeground(Color.white);
        b8.setFont(new Font("Roboto",Font.BOLD,18));
        b8.setBounds(0,349,250,50);
        b8.setMargin(new Insets(0,0,0,135));
        b8.addActionListener(this);
        p2.add(b8);
        
        
        b9= new JButton("Book Hotels");
        b9.setBackground(new Color(0,0,102));
        b9.setForeground(Color.white);
        b9.setFont(new Font("Roboto",Font.BOLD,18));
        b9.setBounds(0,399,250,50);
        b9.setMargin(new Insets(0,0,0,135));
        b9.addActionListener(this);
        p2.add(b9);
        
        
        b10= new JButton("View Booked Hotel");
        b10.setBackground(new Color(0,0,102));
        b10.setForeground(Color.white);
        b10.setFont(new Font("Roboto",Font.BOLD,18));
        b10.setBounds(0,449,250,50);
        b10.setMargin(new Insets(0,0,0,75));
        b10.addActionListener(this);
        p2.add(b10);
        
        
         b11= new JButton("Destination");
        b11.setBackground(new Color(0,0,102));
        b11.setForeground(Color.white);
        b11.setFont(new Font("Roboto",Font.BOLD,18));
        b11.setBounds(0,499,250,50);
        b11.setMargin(new Insets(0,0,0,140));
        b11.addActionListener(this);
        p2.add(b11);
        
        
        b12= new JButton("Payments");
        b12.setBackground(new Color(0,0,102));
        b12.setForeground(Color.white);
        b12.setFont(new Font("Roboto",Font.BOLD,18));
        b12.setBounds(0,549,250,50);
        b12.setMargin(new Insets(0,0,0,150));
        b12.addActionListener(this);
        p2.add(b12);
        
        
        
        b13= new JButton("About");
        b13.setBackground(new Color(0,0,102));
        b13.setForeground(Color.white);
        b13.setFont(new Font("Roboto",Font.BOLD,18));
        b13.setBounds(0,599,250,50);
        b13.setMargin(new Insets(0,0,0,180));
        b13.addActionListener(this);
        p2.add(b13);
        
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/homepage.jpg"));
        Image i5=i4.getImage().getScaledInstance(1520,900,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new  JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text=new JLabel("Travel and Tour Management");
        text.setBounds(300, 70,1000,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("TImes of Roman",Font.BOLD,40));
        image.add(text);

        
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        try{
        if(ae.getSource()== b1){
            new Addcoustmer(username);
        }else if(ae.getSource() == b3){
            new Viewcustomer(username);
        }else if(ae.getSource()==b2){
            new Updatedetails(username);
        }else if(ae.getSource()==b5){
            new Checkpack();
        }else if(ae.getSource()==b6){
            new Bookpack(username);
        }else if(ae.getSource()==b7){
            new Viewpackage(username);
        }else if(ae.getSource()==b8){
            new CheckHotels().setVisible(true);
        }else if(ae.getSource()==b9){
            new BookHotel(username);
        }else if(ae.getSource()==b10){
            new ViewHotels(username).setVisible(true);
        }else if (ae.getSource()==b11){
            new Destination().setVisible(true);
        }else if(ae.getSource()==b12){
            new Payment();
        }
        else
        {
            new About();
        }
        
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
     public static void main(String[] args){
         new Dashboard(" ");
         
     }
    
}
