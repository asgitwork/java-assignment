/*
3.	 Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

Sample Output
Input number: 3
Expected Output :
Wednesday

*/

package Myjava;

import java.util.Scanner;

public class NumberWeekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner in = new Scanner(System.in);
		
		String [] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; 

		Scanner obj=new Scanner(System.in);
		System.out.println("Input number:");
		int num= obj.nextInt();
		
		System.out.println(weekdays[num-1]);
	}
}
