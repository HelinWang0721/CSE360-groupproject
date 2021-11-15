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

public class newPatient extends JFrame{
	public static void main(String[] args) {
		new newPatient();
	}
	
	public newPatient() {
		JFrame frame = new JFrame("New patient");
		frame.setBounds(500, 500, 500, 450);
		
		JPanel page1 = new JPanel();
		JPanel page2 = new JPanel();
		JPanel page3 = new JPanel();
		
		//page1 label
		JLabel label1 = new JLabel("Patient's essential info");
		JLabel label2 = new JLabel("Name");
		JLabel label3 = new JLabel("Gender");
		JLabel label4 = new JLabel("Age");
		//page2 label
		JLabel label5 = new JLabel("Patient's health condition");
		JLabel label6 = new JLabel("Weight");
		JLabel label7 = new JLabel("Height");
		JLabel label8 = new JLabel("Temperature");
		JLabel label9 = new JLabel("Blood pressure");
		//page3 label
		JLabel label10 = new JLabel("More details");
		JLabel label11 = new JLabel("Known allergies");
		JLabel label12 = new JLabel("Health concerns");
		
		JButton b1 = new JButton("Next");
		JButton b2 = new JButton("Next");
		JButton b3 = new JButton("Finish");
		
		//page1 textfield
		JTextField name = new JTextField();
		JTextField gender = new JTextField();
		JTextField age = new JTextField();
		//page2 textfield
		JTextField weight = new JTextField();
		JTextField height = new JTextField();
		JTextField temp = new JTextField();
		JTextField bp = new JTextField();
		//page3 textfield
		JTextField allergy = new JTextField();
		JTextField concern = new JTextField();
		
		//set page1
		page1.setBounds(0, 0, 500, 450);
		page1.setLayout(null);
		
		label1.setBounds(170, 10, 300, 20);
		label2.setBounds(100, 80, 50, 20);
		label3.setBounds(100, 180, 50, 20);
		label4.setBounds(100, 280, 50, 20);
		
		b1.setBounds(370, 350, 80, 35);
		
		name.setBounds(170, 80, 150, 25);
		gender.setBounds(170, 180, 150, 25);
		age.setBounds(170, 280, 150, 25);
		
		page1.add(label1);
		page1.add(label2);
		page1.add(label3);
		page1.add(label4);
		page1.add(name);
		page1.add(gender);
		page1.add(age);
		page1.add(b1);
		
		//set page2
		page2.setBounds(0, 0, 500, 450);
		page2.setLayout(null);
		
		label5.setBounds(170, 10, 300, 20);
		label6.setBounds(50, 80, 150, 20);
		label7.setBounds(50, 150, 150, 20);
		label8.setBounds(50, 220, 150, 20);
		label9.setBounds(50, 290, 150, 20);
		
		b2.setBounds(370, 350, 80, 35);
		
		weight.setBounds(200, 80, 150, 25);
		height.setBounds(200, 150, 150, 25);
		temp.setBounds(200, 220, 150, 25);
		bp.setBounds(200, 290, 150, 25);	
		
		page2.add(label5);
		page2.add(label6);
		page2.add(label7);
		page2.add(label8);
		page2.add(label9);
		page2.add(weight);
		page2.add(height);
		page2.add(temp);
		page2.add(bp);
		page2.add(b2);
		
		//set page3
		page2.setBounds(0, 0, 500, 450);		
		page3.setLayout(null);
		
		label10.setBounds(170, 10, 300, 20);
		label11.setBounds(50, 50, 150, 20);
		label12.setBounds(50, 220, 150, 20);
		
		b3.setBounds(370, 350, 80, 35);
		
		allergy.setBounds(200, 50, 150, 130);
		concern.setBounds(200, 220, 150, 130);
		
		page3.add(label10);
		page3.add(label11);
		page3.add(label12);
		page3.add(b3);
		page3.add(allergy);
		page3.add(concern);

		
		//set page1 button
		b1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		String name1 = name.getText();
	    		String gender1 =  gender.getText();
	    		int age1 = Integer.parseInt(age.getText());
	    		page1.setVisible(false);
	    		page2.setVisible(true);
	    		if(age1 <= 18) {
	    			label9.setVisible(false);
	    			bp.setVisible(false);
	    		}
	    	 }
	     });
		//set page2 button
		b2.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		double weight1 = Double.parseDouble(weight.getText());
	    		double height1 = Double.parseDouble(height.getText());
	    		double temp1 = Double.parseDouble(temp.getText());
	    		if(Integer.parseInt(age.getText()) >= 18) {
	    			double bp1 = Double.parseDouble(bp.getText());
	    		}
	    		
	    		page2.setVisible(false);
	    		page3.setVisible(true);
	    	 }
	     });
		
		b3.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent arg0) {
	    		String allergy1 = allergy.getText();
	    		String concern1 = concern.getText();
	    		frame.setVisible(false);
	    		patientOverview next = new patientOverview();
	    		
	    	 }
	     });
		
		frame.add(page1);
		frame.add(page2);
		frame.add(page3);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
