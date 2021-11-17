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

public class ExamResult extends JFrame {
	public static void main(String[] args) {
		new ExamResult();
	}
	
	public ExamResult() {
		JFrame frame = new JFrame("Exam result");
		frame.setBounds(500, 500, 500, 450);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 500, 450);
		JLabel label3 = new JLabel("First name:");
		JLabel label4 = new JLabel("Last name:");
		
		JTextField firstName = new JTextField();
		JTextField lastName = new JTextField();
		
		JButton b2 = new JButton("Select");

		panel1.add(label3);
		panel1.add(label4);
		panel1.add(firstName);
		panel1.add(lastName);	
		panel1.add(b2);
		panel1.setLayout(null);
		
		label3.setBounds(100, 100, 100, 30);
		label4.setBounds(100, 200, 100, 30);
		firstName.setBounds(200, 100, 100, 30);
		lastName.setBounds(200, 200, 100, 30);
		b2.setBounds(350, 330, 100, 35);	

////////////////////////////	
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 0, 500, 450);
		JLabel label1 = new JLabel("Exam result:");
		JLabel label2 = new JLabel("");
		JButton b1 = new JButton("Back");
		
		panel2.add(label1);
		panel2.add(label2);
		panel2.add(b1);
		panel2.setLayout(null);
		
		label1.setBounds(50, 80, 150, 20);	
		label2.setBounds(50, 150, 400, 100);
		b1.setBounds(370, 350, 80, 35);
	
		panel2.setVisible(false);
		
		b1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		
	    		frame.setVisible(false);
	    		NursePanel next = new NursePanel();
	    	 }
	     });
		
		b2.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		panel1.setVisible(false);
	    		panel2.setVisible(true);
	    	 }
	     });
		
		frame.add(panel1);
		frame.add(panel2);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
