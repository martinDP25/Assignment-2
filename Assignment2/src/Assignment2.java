// -------------------------------------------------------
// Assignment 2
// Written by: Matthew Da Silva - 40008582
// For COMP 248 Section EE – Fall 2018
// --------------------------------------------------------

import java.util.Scanner;//Importing Scanner utility

public class Assignment2 {

	public static void main(String[] args) {

		double listening, reading, writing, speaking, overall, diff, roundedOverall;//Declaring double variable type for scores
		int caseSelection;//Declaring integer variable type for Case Selection
		Scanner myKeys = new Scanner (System.in);//Assigning Scanner variable
		
		//Welcome message and user prompt of Case choice
		System.out.println("-----*****-----*****-----*****-----*****-----*****-----*****-----");
		System.out.println("\tWelcome to Concordia Language Proficiency Evaluator!");
		System.out.println("\t\t\tbased on IELTS exam");
		System.out.println("-----*****-----*****-----*****-----*****-----*****-----*****-----");
		System.out.println("");
		System.out.println("Here are the available options: ");
		System.out.println("\t 1 - Language Proficiency Requirements for the Applicant");
		System.out.println("\t 2 - Evaluation of your Language Proficiency");
		System.out.println("");
		System.out.print("Please enter the digit corresponding to your case: ");

		//Storing user input in caseSelection variable
		caseSelection = myKeys.nextInt();
		
		//Start of main IF statement. Case 1 gives the applicant requirement information
		if (caseSelection==1) {
			System.out.println("");
			System.out.println("- The overall score of IELTS exam of applicants needs to be equal or above 6.5 and the scores");
			System.out.println("for writing and reading skills should not be below 6.0. If your overall score is 6, and your");
			System.out.println("reading and writing scores are at aleast 6, you will be eligible for conditional admission. So");
			System.out.println("you need to take an English course in the first semester. Otherwise you have to retake the IELTS");
			System.out.println("exam.");
			System.out.println("Thanks for choosing Concordia.");
		}
		//Case 2 allows applicant to enter the 4 necessary scores
		else if (caseSelection==2) {
			System.out.println("");
			System.out.print("Please enter your Listening score: ");
			listening = myKeys.nextDouble();
			System.out.println("");
			System.out.print("Please enter your Speaking score: ");
			speaking = myKeys.nextDouble();
			System.out.println("");
			System.out.print("Please enter your Reading score: ");
			reading = myKeys.nextDouble();
			System.out.println("");
			System.out.print("Please enter your Writing score: ");
			writing = myKeys.nextDouble();
			System.out.println("");
			overall = (listening+speaking+reading+writing)/4;
			
			//Calculation to get rounded overall score, following by printing the overall rounded score for applicant to see
			diff = overall - (int)overall;
				if (diff < 0.25) {
					roundedOverall = (int)overall;
					System.out.println("\tYour overall score is: " + roundedOverall);
				}else if (diff < 0.75) {
					roundedOverall = (int)overall + 0.5;
					System.out.println("\tYour overall score is: " + roundedOverall);
				}else {
					roundedOverall = (int)overall + 1;
					System.out.println("\tYour overall score is: " + roundedOverall);
				}
				
			//Printing of reading and writing score for applicant to see
			System.out.println("\tYour reading score is: " + reading);
			System.out.println("\tYour writing score is: " + writing);
			System.out.println("");
			System.out.println("");

			//Applicants overall score is 6.5 or higher, with reading and writing scores of at least 6 -
			//If this condition is met, applicant is eligible for admission
			if (roundedOverall>=6.5 && reading>=6 && writing>=6) {

				System.out.println("Congratulations: You are eligible for Admission.");
			}
			//Applicants score is 6.5 or higher, and either one or both (reading and writing) scores are below 6 -
			//If this condition is met, applicant is eligible for conditional admission
			if (roundedOverall>=6.5 && (reading<6 || writing<6)) {

				System.out.println("You are eligible for Conditional Admission.");
			}
			//Applicants score is 6, and both reading and writing scores are at least 6 -
			//If this condition is met, applicant is eligible for conditional admission
			if (roundedOverall==6 && reading>=6 && writing>=6) {

				System.out.println("You are eligible for Conditional Admission.");
			}
			//Applicants overall score is 6, and reading and/or writing scores are less than 6 -
			//If this condition is met, applicant is not eligible for admission
			if (roundedOverall==6 && (reading<6 || writing<6)) {

				System.out.println("Sorry, you have to retake the exam.");
			}
			//Applicants overall score is less than 6 -
			//If this condition is met, applicant is not eligible for admission
			if (roundedOverall<6) {

				System.out.println("Sorry, you have to retake the exam.");
			}
		}
		//Prompts applicant to restart if a case other than Case 1 or Case 2 is chosen
		else {
			System.out.println("");
			System.out.println("This is an invalid answer. Please restart and choose Case 1 or Case 2.");

		}

	}
}
