package gpaCalculator;

import java.util.Scanner;

public class EligabilityChecker{

	public static void main(String[] args) {
		int age;
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Please Input your age: ");
		
		age = inputScanner.nextInt();
		if(age < 18) {
			System.out.println("You are not eligable.");
		}
		else if (age == 18) {
			System.out.println("You are eligable with conditional approval");
		}
		
		
		else {
			System.out.println("You are eligable to join our Mini competition ");
		}
	
		System.out.println(age);
			} 
	}
