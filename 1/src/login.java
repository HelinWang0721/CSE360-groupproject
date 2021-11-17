import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
	
	public login() {
		 JFrame frame = new JFrame("Hopital System Login");  //set the Farm and its title

		 JPanel panel1 = new JPanel();					//set the panel
		 JPanel panel2 = new JPanel();	
		 JPanel panel3 = new JPanel();
		 
		 JTextField accountInput = new JTextField(15);	//set textfield
		 JTextField passwordInput = new JTextField(15);
		 
	     frame.setBounds(500, 500, 350, 350);				//set the window
	     
	     JLabel account = new JLabel("Account:");		//add label
	     JLabel password = new JLabel("Password:");
	     
	     JButton button = new JButton("Login");			//add button
	     
	     button.addActionListener(new ActionListener() {  //actions after pressing the button
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		String account = accountInput.getText();
	    		String password = passwordInput.getText();
	    		BackEnd loginCheck = new BackEnd();
	    		
	    		if(loginCheck.nurseLogin(account, password) == true) {
	    			JOptionPane.showMessageDialog(frame, "Login successfully");
	    			frame.setVisible(false);
	    			NursePanel frame2 = new NursePanel();    			
	    		}
	    		else {
	    			JOptionPane.showMessageDialog(frame, "Incorrect account or password");
	    			System.out.print(accountInput.getText());
	    			
	    		}
	    	 }
	     });
	     
	     frame.setLayout(new GridLayout(3,1));			//add what creates before to the frame and panel
	     frame.add(panel1);
	     frame.add(panel2);
	     frame.add(panel3);
	     
	     panel1.add(account);
	     panel1.add(accountInput);	     
	     panel2.add(password);
	     panel2.add(passwordInput);
	     panel3.add(button);

	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setVisible(true);  
	}
	
	public static void main(String[] args) {
		new login();
	}
}
