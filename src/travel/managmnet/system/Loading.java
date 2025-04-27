package travel.managmnet.system;
import javax.swing.*;
import java.awt.*;


public class Loading extends JFrame implements Runnable{
    JProgressBar bar;
    Thread t;
    String username;
    Loading(String username){
        
        this.username=username;
        t= new Thread(this);
        setBounds(300, 200, 700, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel j2=new JLabel("Travel & Tour Application");
        j2.setBounds(50,0,500,100);
        j2.setForeground(Color.BLACK);
        j2.setFont(new Font("Times New Roman",Font.BOLD,28));
        add(j2);
        
        JLabel j1=new JLabel("Loading please Wait....");
        j1.setBounds(250,50,500,100);
        j1.setForeground(Color.BLACK);
        add(j1);
        
        bar = new JProgressBar();
        bar.setBounds(210,120,220,35);
        bar.setStringPainted(true);
        add(bar);
        
        
        JLabel usernamelb= new JLabel("Welcome "+username);
        usernamelb.setBounds(15,250,500,100);
        usernamelb.setFont(new Font("Times New Roman",Font.BOLD,15));
        usernamelb.setForeground(Color.red);
        add(usernamelb);
        t.start();
        
        setVisible(true);
        
    }
    
    public void run(){
        try{
            
            for(int i = 1;i <= 101 ; i++){
                int max=bar.getMaximum();
                int value=bar.getValue();
                
                if(value < max){
                    bar.setValue(bar.getValue() + 1);
                }else{
                    setVisible(false);
                    new Dashboard(username);
                }
                Thread.sleep(50);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
    }
   public static void main(String[] args){
       new Loading();
       
   }
}
