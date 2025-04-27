package travel.managmnet.system;
import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable {
    Thread t1;
    Splash(){
    //   setSize(800,600);
    //   setLocation(200,100);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2= i1.getImage().getScaledInstance(1200,600, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        setVisible(true);
        t1=new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            t1.sleep(3000);
//            new login();
        setVisible(false);
        new Login();
        }catch(Exception e){}
    }
    public static void main(String[] args){
        Splash frame =new Splash();
        int x=1;
        
        
        for(int i = 1;i <= 500; x+=7, i+=6){
        frame.setLocation(750- (x+i) / 2, 400 - (i/2));
        frame.setSize(x + i, i);

        try{
            Thread.sleep(10);
        }catch (Exception e){}
    }
    }
    
}
