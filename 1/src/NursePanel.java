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
		JFrame frame = new JFrame("Nurse subsystem");
		frame.setBounds(500, 500, 300, 400);
		
		
		
		JLabel label = new JLabel("Please select one to go next page");
		
		JButton b1 = new JButton("Create new patient");
		JButton b2 = new JButton("Communicate with patient");
		JButton b3 = new JButton("Exam result");
		JButton b4 = new JButton("Medicine");
		
		frame.setLayout(null);		//set layout
		label.setBounds(50, 20, 200, 30);
		b1.setBounds(50, 50, 200, 30);
		b2.setBounds(50, 100, 200, 30);
		b3.setBounds(50, 150, 200, 30);
		b4.setBounds(50, 200, 200, 30);
		
		//add action listeners
		b1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		newPatient next = new newPatient();
	    		frame.setVisible(false);
	    	 }
	     });
		b2.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		communication next = new communication();
	    		frame.setVisible(false);
	    	 }
	     });
		
		b3.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		ExamResult next = new ExamResult();
	    		frame.setVisible(false);
	    	 }
	     });
		
		b4.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		Medicine next = new Medicine();
	    		frame.setVisible(false);
	    	 }
	     });
		
		//add panels to the frame

	    frame.add(label);
	    frame.add(b1);	     
	    frame.add(b2);
	    frame.add(b3);
	    frame.add(b4);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
