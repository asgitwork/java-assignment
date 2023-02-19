/*
1. Write a Java program to get a number from the user and print whether it is positive or negative.
Sample Output
Input number: 35
Expected Output :
Number is positive
*/

package Myjava;

import java.util.Scanner;

public class InputNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner in = new Scanner(System.in);
		
		Scanner obj=new Scanner(System.in);
		System.out.print("Input the number: ");

		int num1 = obj.nextInt();

		if(num1 > 0) 
			System.out.print("number is positve");
		else
			System.out.print("number is negative");

	}

}
