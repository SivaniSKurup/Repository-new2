package Selenium;

public class stringReverse {

	public static void main(String[] args) {
		 String input = "Sivani";
	        String reversed = "";
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }
	        System.out.println("Reversed string: " + reversed);

	}

}
