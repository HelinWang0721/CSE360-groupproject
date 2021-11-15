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

public class NursePanel extends JFrame{
	public static void main(String[] args) {
		 new NursePanel();
	}
	
	public NursePanel() {
		JFrame frame2 = new JFrame("Nurse subsystem");
		frame2.setBounds(500, 500, 300, 350);
		
		JPanel panel1 = new JPanel();					//set the panel
		JPanel panel2 = new JPanel();	
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		JLabel label = new JLabel("Please select one to go next page");
		
		JButton b1 = new JButton("Create new patient");
		JButton b2 = new JButton("Communicate with patient");
		JButton b3 = new JButton("Exam result");
		JButton b4 = new JButton("Medicine");
		
		frame2.setLayout(new GridLayout(5,1));		//set layout
		
		//add action listeners
		b1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		newPatient next = new newPatient();
	    		frame2.setVisible(false);
	    	 }
	     });
		
		//add panels to the frame
		frame2.add(panel1);
	    frame2.add(panel2);
	    frame2.add(panel3);
	    frame2.add(panel4);
	    frame2.add(panel5);
	    panel1.add(label);
	    panel1.add(b1);	     
	    panel2.add(b2);
	    panel2.add(b3);
	    panel3.add(b4);
		
		frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame2.setVisible(true);
	}
}
