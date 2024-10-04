package edu.wit.cs.comp1000;
import java.util.Scanner;

/**
 * Program that prompts user for 5 numbers and prints the sum and averages of the positive numbers, negative numbers, and all 5 numbers.
 */
public class PA2a {
	
	/**
	 * Start of program. Declares variables, prompts user for 5 nums, does calculations, determines plurality, outputs results.
	 * 
	 * @param args
	 */
	
//	There is probably a cleaner way to do this, but this is the best I got.
	public static void main(String[] args) {
//		Variables
		Scanner input = new Scanner(System.in);	
		
		int enteredNum;
		double posNums = 0;
		double negNums = 0;
		
		String posPlural = "s";
		String negPlural = "s";
		
		int sumAllPos = 0;
		int sumAllNeg = 0;
		int sumAll = 0;
		double avgAllPos = 0;
		double avgAllNeg = 0;
		double avgAll = 0;
		
//		Number entry
		System.out.printf("Enter five whole numbers: ");
		
//		Calculations
		for (int i = 0; i < 5; i++) {
			enteredNum = input.nextInt();
			sumAll = sumAll + enteredNum;
			if (enteredNum > 0) {
				posNums++;
				sumAllPos = sumAllPos + enteredNum;
			} else if (enteredNum <= 0) {
				negNums++;
				sumAllNeg = sumAllNeg + enteredNum;
			}
		}
		
		if (posNums >= 1) {
			avgAllPos = sumAllPos / posNums;
		} else {
			avgAllPos = 0;
			
		}
		
		if (negNums >= 1) {
			avgAllNeg = sumAllNeg / negNums;
		} else {
			avgAllNeg = 0;
		}
		
		avgAll = sumAll / 5.0;
		
		input.close();
		
//		Determine plurality of "numbers"
		if (posNums == 1) {
			posPlural = "";
		} else if (negNums == 1) {
			negPlural = "";
		}

//		Result output
		System.out.printf("The sum of the %.0f positive number%s: %d%n", posNums, posPlural, sumAllPos);
		System.out.printf("The sum of the %.0f non-positive number%s: %d%n", negNums, negPlural, sumAllNeg);
		System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
		System.out.printf("The average of the %.0f positive number%s: %.2f%n", posNums, posPlural, avgAllPos);
		System.out.printf("The average of the %.0f non-positive number%s: %.2f%n", negNums, negPlural, avgAllNeg);
		System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);
	}
}
