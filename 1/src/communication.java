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

public class communication {
	public static void main(String[] args) {
		new communication();
	}
	
	public communication() {
		JFrame frame = new JFrame("Communicate with patients");
		frame.setBounds(500, 500, 500, 450);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 500, 450);
		
		JLabel label1 = new JLabel("First name:");
		JLabel label2 = new JLabel("Last name:");
		
		JTextField firstName = new JTextField();
		JTextField lastName = new JTextField();
		
		JButton b1 = new JButton("Select");
		
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(firstName);
		panel1.add(lastName);	
		panel1.add(b1);
		panel1.setLayout(null);
		
		label1.setBounds(100, 100, 100, 30);
		label2.setBounds(100, 200, 100, 30);
		firstName.setBounds(200, 100, 100, 30);
		lastName.setBounds(200, 200, 100, 30);
		b1.setBounds(350, 330, 100, 35);
		
		panel1.setVisible(true);
////////////////////////////////		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 0, 500, 450);
				
		JLabel label3 = new JLabel("Message From patient:");		
		JLabel label4 = new JLabel("Message to send:");
		JLabel label5 = new JLabel();
		JTextField message = new JTextField();
		JButton b2 = new JButton("Back");
		
		panel2.add(label3);
		panel2.add(label4);
		panel2.add(label5);
		panel2.add(message);
		panel2.add(b2);
		panel2.setLayout(null);
		
		label3.setBounds(50, 20, 150, 30);
		label5.setBounds(50, 50, 400, 30);
		label4.setBounds(50, 120, 150, 30);
		message.setBounds(50, 150, 350, 200);
		b2.setBounds(370, 350, 80, 35);
		
		b1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		panel1.setVisible(false);
	    		panel2.setVisible(true);
//need a search patient function
	    	 }
	     });
		
		b2.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		frame.setVisible(false);
	    		NursePanel next = new NursePanel();
//need a read message from patient data.txt 
	    	 }
	     });
		
		
		
		
		frame.add(panel1);
		frame.add(panel2);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}



