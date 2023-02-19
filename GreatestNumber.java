/*
2. Take three numbers from the user and print the greatest number

Sample Output
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87s

*/

package Myjava;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner in = new Scanner(System.in);
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Input the 1st number:");
		int num1= obj.nextInt();
		
		System.out.println("Input the 2nd number:");
		int num2= obj.nextInt();
		
		System.out.println("Input the 3rd number:");
		int num3 = obj.nextInt();
		
		if(num1 > num2) { 
			if(num1 > num3) 
				System.out.print("The greatest number is :" +num1);
		}
		else
		{
			if(num2 >num3)
				System.out.print("The greatest number is :" +num2);
			else 
				System.out.print("The greatest number is :" +num3);
		}
	}
}
