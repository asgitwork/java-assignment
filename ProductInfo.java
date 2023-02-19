/*
6.	Write a program to take product information using scanner like
 product id, product name, product price, quantity,category,brand 
 and display
*/

package Myjava;

import java.util.Scanner;

public class ProductInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner in = new Scanner(System.in);
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Input Product ID : ");
		String prodid= obj.next();

		System.out.println("Input Product Name : ");
		String prod_name= obj.next();

		System.out.println("Input Product Price : ");
		int prod_price= obj.nextInt();

		System.out.println("Input Product Quantity : ");
		int quantity= obj.nextInt();

		System.out.println("Input Product Brand : ");
		String brand= obj.next();
		
		System.out.println("The Product ID is : " + prodid);
		System.out.println("The Product Name is : " + prod_name);
		System.out.println("The Product Price is : " + prod_price);
		System.out.println("The Product Quantity is : "+ quantity);
		System.out.println("The Product Brand is : " + brand);
		
	}
}
