/*
* File name: [MyHealthData.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Assignment01]
* Date: [Oct 28, 2022]
* Professor: [Daniel]
* Purpose: build a constructor class that held correct getter, setter methods, calculation methods and display method 
* 		   for outputting the correct patient's health data in order to support the run time of the MyHealthDataTest
*/
//22F CST8284
//Assignment 1: MyHealthData.java

//This system maintains important health information about a patient.
//Note: This class assumes values passed to the set methods are correct.
// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!


//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

//START CODE
/**
 * This class is built to support the run time of the MyHealthDataTest, it held calculation methods for patient's personal health data.
 * @author Yalin Su
 * @version 11.0.15
 * @since jdk11.0.15_9
 * @see java.lang.Object
 *
 */
	public class MyHealthData {
		
		/**
		 * Declared variables for a patient's information
		 */
		private String firstName;
		private String lastName;
		private String gender;
		private int birthYear;
		private int currentYear;
		private double height;
		private double weight;
//END CODE


// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
//START CODE
	/**
	 * Constructor that receive patient's information that declared above as parameters
	 * @param firstName patient's first name
	 * @param lastName patient's last name
	 * @param gender patient's gender
	 * @param height patient's height
	 * @param weight patient's weight
	 * @param birthYear patient's birth year
	 * @param currentYear patient's current year
	 */
	public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear, int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
		}
//END CODE



//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
	/**
	 * getter method for getting the value of first name
	 * @return firstName patient's first name
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * setter method for setting the value of first name
	 * @param firstName patient's first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * getter method for getting the value of last name
	 * @return lastName patient's last name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * setter method for setting the value of last name
	 * @param lastName patient's last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * getter method for getting the value of gender
	 * @return gender patient's gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * setter method for setting the value of gender
	 * @param gender patient's gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * getter method for getting the value of birth year
	 * @return birthYear patient's birth year
	 */
	public int getBirthYear() {
		return birthYear;
	}
	/**
	 * setter method for setting the value of birth year
	 * @param birthYear patient's birth year
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	/**
	 * getter method for getting the value of current year
	 * @return currentYear patient's current year
	 */
	public int getCurrentYear() {
		return currentYear;
	}
	/**
	 * setter method for setting the value of current year
	 * @param currentYear patient's current year
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	/**
	 * getter method for getting the value of patient's height
	 * @return height patient's height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * setter method for setting the value of patient's height
	 * @param height patient's height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * getter method for getting the value of patient's weight
	 * @return weight patient's weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * setter method for setting the value of patient's weight
	 * @param weight patient's weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * getter method for getting the value of patient's age
	 * @return currentYear - birthYear patient's age
	 */
	public int getAge() {
		return currentYear - birthYear;
	}
	/**
	 * getter method for getting the value of patient's Maximum heart rate
	 * @return 220 - getAge() patient's Maximum heart rate
	 */
	public int getMaximumHeartRate() {
		return 220 - getAge();
	}
	/**
	 * getter method for getting the value of patient's Minimum target heart rate
	 * @return getMaximumHeartRate() * 0.5 patient's Minimum target heart rate
	 */
	public double getMinimumTargetHeartRate() {
		return getMaximumHeartRate() * 0.5;
	}
	/**
	 * getter method for getting the value of patient's Maximum target heart rate
	 * @return getMaximumHeartRate() * 0.85 patient's Maximum target heart rate
	 */
	public double getMaximumTargetHeartRate() {
		return getMaximumHeartRate() * 0.85;
	}

// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
	/**
	 * getter method for getting the value of patient's BMI
	 * @return (getWeight() * 703) / (getHeight() * getHeight()) patient's BMI
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
} 

// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION

	/**
	 * a method that shows all the patient's health data
	 */
	public void displayMyHealthData() 
{ 

//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
   
// START CODE
		System.out.printf("Your first name is: %s%n"
						 +"Your last name is: %s%n"
						 +"Your gender is: %s%n"
						 +"Your date of birth in year: %d%n"
						 +"Your height is: %.2f%n"
						 +"Your weight value is: %.2f%n"
						 +"Your age is: %d%n"
						 +"Your maximum heart rate is: %d%n"
						 +"Your minimum target heart rate is: %.2f%n"
						 +"Your maximum target heart rate is: %.2f%n"
						 +"Your BMI value is: %.2f%n"
						 ,firstName
						 ,lastName
						 ,gender
						 ,birthYear
						 ,height
						 ,weight
						 ,getAge()
						 ,getMaximumHeartRate()
						 ,getMinimumTargetHeartRate()
						 ,getMaximumTargetHeartRate()
						 ,getBMI());
//END CODE
   
//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

   System.out.println("BMI VALUES");
   System.out.println("Underweight: less than 18.5");
   System.out.println("Normal:      between 18.5 and 24.9");
   System.out.println("Overweight:  between 25 and 29.9");
   System.out.println("Obese:       30 or greater");   
} 

} // end class MyHealthData



