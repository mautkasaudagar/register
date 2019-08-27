
package registration;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import static javafx.scene.paint.Color.color;
import  javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Registration extends JFrame{
    private JTextField t1,t2,t3;
    private JPasswordField p1,p2;
    private JLabel l1,l2,l3,l4,l5;
    private JButton b1,b2,b3;
    private JPanel pan;

     Registration()  
    {  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Registration Form in Java");  
        pan=new JPanel();
        pan.setLayout(null);
        pan.setBackground(new java.awt.Color(102,255,102));
        l1 = new JLabel("First Name:");  
        l1.setBackground(new java.awt.Color(153, 255, 153));  
        l1.setFont(new java.awt.Font("Vijaya", 1, 24));  
        l2 = new JLabel("Last Name:");  
        l3 = new JLabel("Email-ID:");  
        l4 = new JLabel("Create Passowrd:");  
        l5 = new JLabel("Confirm Password:");  
          
        t1 = new JTextField();  
        t2 = new JTextField();  
        p1 = new JPasswordField();  
        p2 = new JPasswordField();   
        b1 = new JButton("Submit");  
        b2 = new JButton("Clear");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        
        
        l1.setBounds(100, 30, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);  
        l4.setBounds(80, 150, 200, 30);  
        l5.setBounds(80, 190, 200, 30);  
        t1.setBounds(300, 70, 200, 30);  
        t2.setBounds(300, 110, 200, 30);  
        p1.setBounds(300, 150, 200, 30);  
        p2.setBounds(300, 190, 200, 30);    
        b1.setBounds(50, 350, 100, 30);  
        b2.setBounds(170, 350, 100, 30);  
        add(l1);  
        add(l2);  
        add(t1);  
        add(l3);  
        add(t2);  
        add(l4);  
        add(p1);  
        add(l5);  
        add(p2);    
        add(b1);  
        add(b2); 
    
    }
    public static void main(String[] args) {
     
    }
    
}
