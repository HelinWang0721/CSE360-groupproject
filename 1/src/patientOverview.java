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

public class patientOverview extends JFrame{
	public static void main(String[] args) {
		new patientOverview();
	}
	
	public patientOverview() {
		JFrame frame = new JFrame("Patient overview");
		frame.setBounds(500, 500, 700, 600);
		String name0 = "Alex";
		
		JLabel label1 = new JLabel("Name:");
		JLabel label2 = new JLabel("Gender:");
		JLabel label3 = new JLabel("Age:");
		JLabel name = new JLabel();
		name.setText(name0);
		JLabel gender = new JLabel();
		JLabel age = new JLabel();
		
		JLabel label5 = new JLabel("Patient's health condition");
		JLabel label6 = new JLabel("Weight:");
		JLabel label7 = new JLabel("Height:");
		JLabel label8 = new JLabel("Temperature:");
		JLabel label9 = new JLabel("Blood pressure:");
		JLabel weight = new JLabel();
		name.setText(name0);
		JLabel height = new JLabel();
		JLabel temp = new JLabel();
		JLabel bp = new JLabel();

		JLabel label10 = new JLabel("More details");
		JLabel label11 = new JLabel("Known allergies:");
		JLabel label12 = new JLabel("Health concerns:");
		JLabel allergy = new JLabel();
		JLabel concern = new JLabel();
		
		JButton b1 =  new JButton("Back to menu");
		
		frame.setLayout(null);
		//first column
		label1.setBounds(50, 50, 50, 20);
		name.setBounds(100, 50, 50, 20);
		label2.setBounds(50, 100, 50, 20);
		gender.setBounds(100, 100, 50, 20);
		label3.setBounds(50, 150, 50, 20);
		age.setBounds(100, 150, 50, 20);
		
		//second column
		label5.setBounds(200, 50, 200, 20);
		label6.setBounds(200, 100, 50, 20);
		height.setBounds(200, 100, 50, 20);
		label7.setBounds(200, 150, 50, 20);
		weight.setBounds(200, 150, 50, 20);
		label8.setBounds(200, 200, 100, 20);
		temp.setBounds(200, 200, 50, 20);
		label9.setBounds(200, 250, 150, 20);
		bp.setBounds(200, 250, 50, 20);
		
		//third column
		label10.setBounds(400, 50, 200, 20);
		label11.setBounds(400, 100, 100, 20);
		allergy.setBounds(400, 100, 50, 20);
		label12.setBounds(400, 250, 100, 20);
		concern.setBounds(400, 250, 50, 20);
		
		
		b1.setBounds(480, 420, 150, 50);
		
		
		
		b1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		NursePanel next = new NursePanel();
	    		frame.setVisible(false);  		
	    		}	    	 
	     });
		
		
		
		
		
		
		
		
		
		
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.add(label8);
		frame.add(label9);
		frame.add(label10);
		frame.add(label11);
		frame.add(label12);
		frame.add(name);
		frame.add(gender);
		frame.add(age);
		frame.add(weight);
		frame.add(height);
		frame.add(temp);
		frame.add(bp);
		frame.add(allergy);
		frame.add(concern);
		frame.add(b1);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
