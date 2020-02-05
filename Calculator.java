package day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		char choice;
		double result = 0;
	// scanner class object to read values
		 Scanner buf=new Scanner(System.in);
		 
		 System.out.println("Enter first number");
		 num1=buf.nextInt();
		 
		 System.out.println("Enter second number");
		 num2=buf.nextInt();
		 
		 System.out.println("Enter choice of operation(+,-,*,/,%)");
		 choice = buf.next().charAt(0);
		 
		 
         System.out.println(choice);
	switch (choice) {
		case '+':
			result=(num1 + num2);
					break;
					
		case '-':
			result=(num1- num2);
			break;
			
			
		case '*':
		    result=(num1 * num2);
		    break;
		    
		case '/':
			result=(num1 / num2);
			break;
			
		case '%':
			result=(num1 % num2);
			break;
	
		default:
			System.out.println("Invalid operation");
			break;
		}
		
	        System.out.println(result);   

	}
	
}
