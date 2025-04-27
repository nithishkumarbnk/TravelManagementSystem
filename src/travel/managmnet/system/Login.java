
package travel.managmnet.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton b1,b2,b3;
    JTextField textField,passwordField;
    JLabel l1,l2,l3,l4;
    Login(){
        
//        setBackground(new Color(255, 255, 204));	
        setBounds(300, 200, 700, 400);
		
       JPanel pl = new JPanel();
	pl.setBackground(Color.WHITE);
	setContentPane(pl);
	pl.setLayout(null);

	l1 = new JLabel("Username : ");
	l1.setBounds(124, 89, 95, 24);
	pl.add(l1);

	l2 = new JLabel("Password : ");
	l2.setBounds(124, 124, 95, 24);
	pl.add(l2);

	textField = new JTextField();
	textField.setBounds(210, 93, 157, 18);
	pl.add(textField);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(210, 128, 157, 18);
	pl.add(passwordField);

	l3 = new JLabel("");
	l3.setBounds(377, 79, 46, 34);
	pl.add(l3);

	l4 = new JLabel("");
	l4.setBounds(377, 124, 46, 34);
	pl.add(l3);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/loginmain.jpeg"));
        Image i1 = c1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel l6 = new JLabel(i2);
        l6.setBounds(480, 70, 150, 150);
        add(l6);
        
        
         b1 = new JButton("Login");
	b1.addActionListener(this);
                
	b1.setBounds(149, 181, 100, 18);
	pl.add(b1);
		
        b2 = new JButton("SignUp");
	b2.addActionListener(this);
	
	b2.setBounds(289, 181, 90, 18);
	pl.add(b2);

	b3 = new JButton("Forgot Password");
	b3.addActionListener(this);
	
	b3.setBounds(190, 231, 150, 18);
	pl.add(b3);


        JPanel panel2 = new JPanel();
        panel2.setBounds(24, 40, 434, 263);
        pl.add(panel2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == b1){
            try{
                String username=textField.getText();
                String password=passwordField.getText();
                
                
                String query= "Select * from accounts where username = '"+username+"' AND pass = '"+password+"'";
                
                Conn c= new Conn();
                ResultSet r =c.s.executeQuery(query);
                
                if(r.next()){
                    setVisible(false);
                    new Loading(username);
                }else{
                    JOptionPane.showMessageDialog(null,"incorrect username or password");
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()== b2){
            setVisible(false);
            new Signup();
        }else{
            setVisible(false);
//            new ForgetPassword();
        }
        
    }
    
    public static void main(String[] args){
       new Login();
    }
}
