package features;
import javax.swing.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LoginField extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private static JButton logBut, createBut;
	private static JLabel logUser, logPass;
	private static JTextField logUserField, logPassField;
	private static JPanel logPan;	
	
	public LoginField(){
	
	logPan = new JPanel(new GridLayout(6,3));
	logBut = new JButton("Sign-In");
	createBut = new JButton("Sign-Up");
	logUser = new JLabel();
	logPass = new JLabel();
	logUserField = new JTextField(20);
	logPassField = new JPasswordField(20);
	
	logUser.setText("Enter Username");
	logPass.setText("Enter Password");
	
	add(logPan,BorderLayout.CENTER);
	
    logPan.add(logUser);   
    logPan.add(logUserField);     
    logPan.add(logPass);    
    logPan.add(logPassField);    
    logPan.add(logBut);   
    logPan.add(createBut);
    
    logBut.addActionListener(this);
    createBut.addActionListener(this);
    setTitle("Claims Database Sign-In");         

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
        String enterUser = logUserField.getText();  
        String enterPass = logPassField.getText();  
          
        if (enterUser.equals("username") && enterPass.equals("password")) { 
               
            System.out.println("Success!");
        }  
        else{   
            System.out.println("Incorrect Username or Password");  
        } 

		
	}

}
