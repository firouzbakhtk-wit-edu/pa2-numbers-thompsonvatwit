package edu.wit.cs.comp1000;
import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		double discriminant;
		String root1 = "";
		String root2 = "";
		
		System.out.printf("Enter a b c: ");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		input.close();
		
		discriminant = (b * b) - (4 * a * c);
		
		if (discriminant < 0) {
			root1 = "imaginary";
		} else if (discriminant == 0) {
			root1 = "" + discriminant;
		} else if (discriminant > 0) {
			root1 = "" + discriminant;
			root2 = ", " + discriminant;
		}
		
		System.out.printf("Roots: " + root1 + root2);
//		System.out.print(discriminant);
	}

}
