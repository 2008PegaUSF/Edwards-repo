package FileInputOutputTest;

import java.io.IOException;
import java.lang.ClassNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Student newStu = new Student();
		
		
		//Check to see if certain file exists
		System.out.println("Type filename to see if it exists: \n");
		String tmpFileName = sc.nextLine() + ".txt";
		
		
		//If file exists open file and loads object
		if(checkFile(tmpFileName) == true ) {
			
			//Trys to open file if error is thrown lets us know why
			try {
				
			//Open file input stream	
			FileInputStream fi = new FileInputStream(tmpFileName);
			
			//Opens Object input stream
			ObjectInputStream objInput = new ObjectInputStream(fi);
			
			//Loads file into student object
			newStu = (Student)objInput.readObject();
			
			//Closes the object and file streams
			objInput.close();
			fi.close();
			}catch(IOException ioe) {
				
				System.out.println("IO Exception " + ioe.getMessage());
			
			}catch(ClassNotFoundException cnf) {
				
				System.out.println("Class Not Found " + cnf.getMessage());
			
			}
		
		}
		
		//If file doesn't exist starts to make the object tosave to file
		else {
			
			
			System.out.println("No File Exists!\nType new Student ID:");
			
			
			newStu.studentID = Integer.parseInt(sc.nextLine());
			
			
			System.out.println(newStu.studentID);
			
			
			System.out.println("Enter new Student first name:");
			
			
			newStu.firstName = sc.nextLine();
			
			
			System.out.println("Enter new Student last name:");
			
			
			newStu.lastName = sc.nextLine();
			
			
			System.out.println(newStu.lastName);
			
			
			//Trys to save file if failure will catch exception to handle
			try {
				
				
				FileOutputStream fo = new FileOutputStream("text.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fo);
				oos.writeObject(newStu);
				oos.close();
				fo.close();
				
				
				}catch(IOException ioe) {
					System.out.println("IO Exception " + ioe.getMessage());
				}
			
			
		}
		
		System.out.println(newStu.studentID);
		System.out.println(newStu.firstName);
		System.out.println(newStu.lastName);
		
		
		
	}
	
	public static boolean checkFile(String fileName) {
		
		
		File tmpDir = new File(fileName);
		boolean exists = tmpDir.exists();
		return exists;
	}

}
