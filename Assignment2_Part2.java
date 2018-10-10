import java.util.Scanner; 

public class Assignment2_Part2 {

	public static void main(String[] args) {
		int ogDigits, nDigits, div=0, sum=0, left=0;
		Scanner myKeys = new Scanner(System.in);

		System.out.println("***************************************************");
		System.out.println("\tWelcome to our Calculation Program!");
		System.out.println("***************************************************");
		System.out.println("");

		System.out.print("Please, enter a number with 7 digits max: ");
		ogDigits=myKeys.nextInt();
		nDigits=ogDigits;
		
		while(nDigits>0) 
		{
			
			left=nDigits%10;
			sum=sum+left;
			nDigits=nDigits/10;			
		}
		//while(nDigits>0)
		
			div=nDigits%2;
		
		
		System.out.println("");
		System.out.println("The sum of the digits of " + ogDigits + " is: " + sum);
		
		System.out.println("");
		System.out.println("The divisors are as follows: ");
		System.out.println(div);
	}
}
