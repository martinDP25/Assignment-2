// -------------------------------------------------------
// Assignment 2
// Written by: Matthew Da Silva - 40008582
// For COMP 248 Section EE – Fall 2018
//
// Assignment 2 can be broken down into 2 parts. Part 1 is a 
// language assessment program which prompts the user to enter
// marks for key language skills. The output is a response based 
// on the condition that their marks satisfy. Part 1 deals primarily 
// with nested IF statements.
// Part 2 is a program that gets user input (max 7 digits), sums each 
// digit together and finds all possible divisors of that sum. The program then 
// asks the user if they would like to use the program again. If "Yes" is 
// answered, it repeats. If "No" is answered, the program goes into its ending phase.
// Part 2 primarily deals with loops, along with IF statements.
//
//			**********NOTE**********
// PART 1 AND 2 ARE WITHIN THE SAME PUBLIC CLASS (Assignment 2). PLEASE USE MULTI-LINE
// CUTS WHERE PROMPTED/WHERE ALREADY PRESENT. 
// --------------------------------------------------------

import java.util.Scanner;//Importing Scanner utility

public class Assignment2 {

	public static void main(String[] args) {

//APPLY MULTI-LINE COMMENT CUT 
		
							//******PART 1******
		//Declaring double variable type for scores
		double listening, reading, writing, speaking, overall, diff, roundedOverall;
		
		//Declaring integer variable type for Case Selection
		int caseSelection;
		
		//Assigning Scanner variable
		Scanner myKeys = new Scanner (System.in);
		
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
			//The overall (double) variable minus the overall (int) variable to. If the decimal conditions are met, the value 
			//is type casted to an integer value, then an addition is made if necessary.
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

/*
		
								//******PART 2******
		
		//Declaring integer variable type for number input and calculations
		int ogDigits, nDigits, h, split=1, div=1, sum=0, left=0;
				
		//Declaring String variable for Yes/No repetition at the end
		String rep="Yes";
				
		while(rep.equals("Yes")) 
		{
					
			//Assigning Scanner variable
			Scanner myKeys2 = new Scanner(System.in);
			
			//Welcome message
			System.out.println("");
			System.out.println("***************************************************");
			System.out.println("\tWelcome to our Calculation Program!");
			System.out.println("***************************************************");
			System.out.println("");
			System.out.print("Please, enter a number with 7 digits max: ");
						
			ogDigits=myKeys2.nextInt();
						
			//Condition if more than 7 digits are entered
			if(ogDigits>99999990)
			{
				System.out.println("");
				System.out.println("I'm sorry, that was more than 7 digits. Please restart the program.");
				break;
			}
							
				nDigits=ogDigits;
			
			//Loops as long as nDigits is greater than 0 (as long as there are whole number available)
			while(nDigits>0) 
			{
				//Singles out the last digit from ogDigits during beginning each loop (stored in left variable)
				left=nDigits%10;
						
				//Sums each last digit from ogDigits during each loop (stored in sum variable)
				sum=sum+left;
						
				//Removes last digit from ogDigits at the end of each loop 
				nDigits=nDigits/10;			
			}
				//Prints sum of digits as well as their divisors
				System.out.println("");
				System.out.println("The sum of the digits of " + ogDigits + " is: " + sum);
				System.out.println("");
				System.out.println("The divisors of " + sum + " are as follows: ");
					
			//Divisor starts are 1, is less than or equal to the sum variable, and increments by 1 each loop.
			//This loop allows every possible divisor from 1 to the sum of digits we are dealing with
			for(h=1; h<=sum; h++)
			{
				//When condition is met and a clear remainder of 0 is present, the divisor is printed
				if(sum%h==0)
				{
					System.out.print(h + " ");
				}	
			}
			System.out.println("");
			System.out.println("");
			System.out.print("Do you want to try another number? Yes to repeat, No to stop (*Cap Sensitive*): ");
					
			//Gets input from user to repeat or end the program. "Yes" satisfies the main loop, "No" exits the loop
			rep=myKeys2.next();
			}
				
		if(rep.equals("No"))
		{
			//Ending message
			System.out.println("");
			System.out.println("Thank you, and have a nice day!");
		}		
*/	
	}
}
