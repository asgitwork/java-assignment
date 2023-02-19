/*
4.	Write a program in Java to display the first 10 natural numbers
*/

package Myjava;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner in = new Scanner(System.in);
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no for natural number you want to print : ");
		int num= obj.nextInt();
		for(int i=1; i<=num; i++)
			System.out.println(i);
	}
}
