/**
 * 
 */

/**
 * @author Zhiyuan Cai
 *
 */
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BackEnd {
	static ArrayList<Patient> patientList;
	//ArrayList<Doctor> doctorList;
	static ArrayList<Nurse> nurseList;
	
	static void init() {
		patientList = new ArrayList<Patient>();
		load();
	}
	
	static void exit() {
		save();
	}
	
	
	static void load(){
		try {
		      File data = new File("data.txt");
		      Scanner myReader = new Scanner(data);
		      ArrayList<String> lines = new ArrayList<String>();
		      while (myReader.hasNextLine()) {
		        lines.add(myReader.nextLine());
		      }
		      myReader.close();
		      decode(lines);
		      
		    } catch (FileNotFoundException e) {
		    	patientList = new ArrayList<Patient>();
		    	//doctorList = new ArrayList<Doctor>();
		    	//nurseList = new ArrayList<Nurse>();
		    }
		
	}
	
	static boolean nurseLogin(String Account, String Password) {	
		try {
			File nurseData = new File("C:\\Users\\Zhiyuan Cai\\eclipse-workspace\\1\\src\\Nurse.txt");
			Scanner myReader = new Scanner(nurseData);
			int i = 1;			
			String account, password, email;
			while(myReader.hasNextLine()) {
				//System.out.println(myReader.nextLine());
				int flag = 0;
				if(i % 3 == 1) {
					account = myReader.nextLine();
					if(account.equals(Account)) {
						flag = 1;
					}else {
						flag = 0;
					}
					i++;
				}else if(i % 3 == 2) {
					password = myReader.nextLine();
					if(password.equals(Password)) {
						flag = 1;
					}else {
						flag = 0;
					}
					i++;
				}else {
					email = myReader.nextLine();
					i++;
				}
				if(flag == 1) {
					return true;					
				}
			}
		}catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		return false;
	}
	
	static void save() {
		try {
			FileWriter data = new FileWriter("data.txt");
			data.write(encode());
			data.close();
		} catch (IOException e) {
			
		}
	}
	
	static boolean patientLogin(String username, String password) {
		for (int i = 0; i < patientList.size(); i++) {
			if (patientList.get(i).username.equals(username) && patientList.get(i).password.equals(password)) {
				System.out.print("login successfully\n");
				return true;
			}
		}
		System.out.print("login failed\n");
		return false;
	}
	

	static boolean addPatient(Patient newPatient) {
		if (newPatient.username == "" || newPatient.password == "" || newPatient.username == null || newPatient.password == null) {
			return false;
		}
		for (int i = 0; i < patientList.size(); i++) {
			if (patientList.get(i).username == newPatient.username) {
				return false;
			}
		}
		patientList.add(newPatient);
		return true;
	}
	
	static String encode() {
		String dataString = "patient\n";
		for (int i = 0; i < patientList.size(); i++) {
			if (patientList.get(i).username == "" || patientList.get(i).password == "" || patientList.get(i).username == null || patientList.get(i).password == null) continue;
			dataString += "username=" + patientList.get(i).username + "\n";
			dataString += "password=" + patientList.get(i).password + "\n";
			dataString += "firstName=" + patientList.get(i).firstName + "\n";
			dataString += "lastName=" + patientList.get(i).lastName + "\n";
			dataString += "birthday=" + patientList.get(i).birthday + "\n";
			dataString += "gender=" + patientList.get(i).gender + "\n";
			dataString += "mobile=" + patientList.get(i).mobile + "\n";
		}
		
		dataString += "doctor\n";
		//////////////////////////////////////////////////
		dataString += "nurse\n";
		//////////////////////////////////////////////////////
		return dataString;
	}
	
	static void decode(ArrayList<String> lines) {
		int i = 0;
		Patient newPatient = new Patient();
		while (i < lines.size()) {
			String line = lines.get(i);
			if (line.indexOf("password=") == 0) newPatient.password = line.replaceFirst("password=", ""); 
			else if (line.indexOf("firstName=") == 0) newPatient.firstName = line.replaceFirst("firstName=", ""); 
			else if (line.indexOf("lastName=") == 0) newPatient.lastName = line.replaceFirst("lastName=", ""); 
			else if (line.indexOf("birthday=") == 0) newPatient.birthday = line.replaceFirst("birthday=", ""); 
			else if (line.indexOf("gender=") == 0) newPatient.gender = line.replaceFirst("gender=", ""); 
			else if (line.indexOf("mobile=") == 0) newPatient.mobile = line.replaceFirst("mobile=", "");  
			else if (line.indexOf("username=") == 0) {
				if (newPatient.username != "" && newPatient.password != "" && newPatient.username != null && newPatient.password != null) {
					patientList.add(newPatient);
					newPatient = new Patient();
				}
				newPatient.username = line.replaceFirst("username=", "");
			}
			i++;
			if (line.indexOf("doctor") == 0) break;
		}
		if (newPatient.username != "" && newPatient.password != "" && newPatient.username != null && newPatient.password != null) {
			patientList.add(newPatient);
			newPatient = new Patient();
		}
		
		/////////////////////////
		
		
		////////////////////////////////
	}
}