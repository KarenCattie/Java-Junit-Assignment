/*
* File name: [MyHealthData.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Assignment01]
* Date: [Oct 28, 2022]
* Professor: [Daniel]
* Purpose: This is the main method to test the run time of the MyHealthData
*/
import java.util.Scanner;
/**
 * This class is used for testing the MyHealthData, it will ask for user input of patient's info
 * instantiate an object of the MyHealthData for testing
 * then display the patient's data from the object that created
 * @author Yalin Su
 * @version 11.0.15
 * @since jdk11.0.15_9
 * @see java.lang.Object
 * @see java.util.Scanner
 * @see MyHealthData
 */
public class MyHealthDataTest {
	/**
	 * This is the entry point for the program
	 * Here will ask for user input for patient's data
	 * instantiate an object of the MyHealthData for testing
	 * then display the patient's data from the object that created
	 * @param args passing arguments that is given
	 */
	public static void main(String[] args) {
		
		/**
		 * import Scanner for user input
		 */
		Scanner input = new Scanner(System.in);
		
		/**
		 * declared all the variables that needed for the program
		 */
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		int currentYear;
		double height;
		double weight;
		
		/*
		 * ask user input from client to enter patient's info
		 */
		System.out.println("This is a health data check program.");
		System.out.println("Please enter your first name: ");
		firstName = input.nextLine();
		System.out.println("Please enter your last name: ");
		lastName = input.nextLine();
		System.out.println("Please enter your gender (Male/Female/Self-defined): ");
		gender = input.nextLine();
		System.out.println("Please enter your date of birth in year: ");
		birthYear = input.nextInt();
		input.nextLine();
		System.out.println("Please enter the current year: ");
		currentYear = input.nextInt();
		input.nextLine();
		System.out.println("Please enter your height in inches: ");
		height = input.nextDouble();
		input.nextLine();
		System.out.println("Please enter your weight in pounds: ");
		weight = input.nextDouble();
		input.nextLine();
		/*
		 * no need for input from client anymore so closed scanner
		 */
		input.close();
		/**
		 * instantiated an object of the MyHealthData for testing
		 * and use the client's input info as the parameters 
		 */
		MyHealthData objtest = new MyHealthData(firstName, lastName, gender, height, weight, birthYear, currentYear);
		/**
		 * display all the health info from the object that just created
		 */
		objtest.displayMyHealthData();

	}

}
