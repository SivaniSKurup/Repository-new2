package Selenium;

import java.util.Scanner;

public class OddandEven {

	 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter array size: ");
		        int size = sc.nextInt();

		        int[] array = new int[size];

		        System.out.println("Enter array elements:");
		        for (int i = 0; i < size; i++) {
		            array[i] = sc.nextInt();
		        }

		        System.out.println("Odd Numbers:");
		        for (int num : array) {
		            if (num % 2 != 0) {
		                System.out.println(num);
		            }
		        }

		        System.out.println("Even Numbers:");
		        for (int num : array) {
		            if (num % 2 == 0) {
		                System.out.println(num);
		            }
		        }
		    }
		}



