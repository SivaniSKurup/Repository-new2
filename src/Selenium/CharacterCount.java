package Selenium;

import java.util.Scanner;
public class CharacterCount {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        
	        int characterCount = input.length();
	        
	        System.out.println("Total characters: " + characterCount);
	}

}
