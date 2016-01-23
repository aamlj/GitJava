//author: Mike Jones

//program description: determines if a credit card number is valid using the "Luhn Check" as well as 

//the number of digits. Validity is also determined by the first digit of the card. 

import java.util.Scanner;

public class CreditCardValidator{
	
	
				
	/** Return this number if it is a single digit, otherwise
	 *   return the sum of the two digits */

	public static int getDigit(int number){
	
		// Check the size of the “number” passed. If the size is 1 digit long, then just return that number. 
		
		//	 Otherwise, if the size of the digit is 2 digits long, then add those two digits and return that number.
	 
		if (number <= 9) {    

			return number;

		} else {

			int firstDigit = number % 10;  

			int secondDigit = (int) (number / 10); 

			return  firstDigit + secondDigit;  
		}
	    }
	
	/** Return the sum of odd-place digits in the number */

	public static int sumOfOddPlace(long number) {

	 // Get the sum of every odd digit from right to left and save this in a variable.
		
			long modNumber = 10;

			long divNumber = 1;

			long sumOfOddDigits = 0;

			long currentDigit = 0;

				do
		{
					//Get the next even numbered digit from right to left and multiply it by 2 (double it).
					
					currentDigit = ((number % modNumber) / divNumber);  

					sumOfOddDigits = sumOfOddDigits + currentDigit;  

					modNumber = modNumber * 100;

					divNumber = divNumber * 100;
		}


		 while (divNumber <= number);{  

						return (int) sumOfOddDigits;  
		}
	    
		}
	
	/**Get the next even numbered digit from right to left and multiply it by 2 */

	public static long sumOfDoubleEvenPlace(long number){
		 
		// Double every second digit in the card number and save the sum in a variable.
	
		long modNumber = 100;

		long divNumber = 10;

		long sumOfDoubleEvenPlace = 0;

		long currentDigit = 0;


		do

		{

			currentDigit = ((number % modNumber) / divNumber) * 2;     	     

			sumOfDoubleEvenPlace = sumOfDoubleEvenPlace + getDigit((int)(currentDigit));

			modNumber = modNumber * 100;

			divNumber = divNumber * 100;



		} while (divNumber <= number);

		 return sumOfDoubleEvenPlace;

	    }
	
	
   
	
	/**Return true if the d digit is a prefix for number*/
	
	public static boolean PrefixMatch(long number,int d) {
		
		// Check the initial 1 or 2 numbers of the credit card number provided	
		
		return getPrefix(number, getSize(d)) == d;
	}
		 
		
		
		
		
		
	 /**Return the number of digits in d */
	
	public static int getSize (long  d) {
		
	//Get the size of the credit card number (d) passed in.
			
			int i = 0;

			while (d > 0) {

				d = d / 10;

				i++;
		}

			return i;

		}
	   
	
		/** Return the first k number of digits from number. If the */	
		/** number of digits in number is less than k, return number*/
	
	public static  long getPrefix (long number, int k) {
		 
		// Check if the number passed in “k” is a prefix of the “number” passed (which is the credit card).
			
		if (getSize(number) < k) {

				return number;

		} else {

				int size = (int) getSize(number);

				for (int i = 0; i < (size - k); i++) {

					number = number / 10;
		}

				return number;
		}
		
		}

	/** Return true if the card number is valid */

	 
	
	public static boolean isValid(long number) {  
		
	//If the isValid() function returns true, then inform the user that the credit card was valid. 
	 //Otherwise, inform the user that the credit card was invalid.

		long total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);


		if ((total % 10 == 0) && ((PrefixMatch(number, 4) || PrefixMatch(number, 5)

				|| PrefixMatch(number, 6) || PrefixMatch(number, 37)) && (getSize(number)>=13 ) && (getSize(number)<=16 ))) {

			return true;

		} else {

			return false;

		}
	    
	    }


	public static void main(String[] args) {
		
		//prompt user for input and use the isValid method to see if card is valid
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your credit card number: ");

		long  number = input.nextLong();

		if (isValid(number)) {

			System.out.println("\n" + number + " is an valid card number. ");

		} else {

			System.out.println("\n" + number + " is an invalid card number. ");
		}

	    }

        } 	


