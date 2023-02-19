/*
5.	Write a program in Java to input 5 numbers from keyboard and find their sum and average
Sample Output
Input the 5 numbers : 1 2 3 4 5
Expected Output :
Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4	                                                                               
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0  

*/

package Myjava;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner in = new Scanner(System.in);
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Input 5 numbers : ");
		int num1= obj.nextInt();
		int num2= obj.nextInt();
		int num3= obj.nextInt();
		int num4= obj.nextInt();
		int num5= obj.nextInt();

		int sum =num1+num2+num3+num4+num5;
		int avg = sum/5;
		
		System.out.println("The sum of 5 no is :" + sum);
		System.out.println("The Average is : "+ avg);
		
	}
}
