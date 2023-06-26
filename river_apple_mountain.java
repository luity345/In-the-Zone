import java.io.*;
import java.util.*;

public class InTheZone {
	//main method
	public static void main(String[] args) {
		
		//prompting the user for a number
		System.out.println("Please enter a number between 1 and 10: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		//checking if the number is between 1 and 10
		if (num >= 1 && num <= 10) {
			//creating an array with values between 1 and 10
			int[] numArray = new int[10];
			for (int i = 0; i < 10; i++) {
				numArray[i] = i+1;
			}
			
			//checks if the number is already present in the array
			boolean isPresent = false;
			for (int i = 0; i < 10; i++) {
				if (num == numArray[i]) {
					isPresent = true;
					break;
				}
			}
			
			//if the number is present, prints out the message
			if (isPresent == true) {
				System.out.println("You are In the Zone!");
			}
			
			//if the number is not present, prints out the message
			else {
				System.out.println("Sorry, you are not In the Zone.");
			}
		}
		
		//if the number is not between 1 and 10, prints out the message
		else {
			System.out.println("Sorry, you are not In the Zone.");
		}
		
		//closing the scanner
		in.close();
		
	}

}