package day1;

import java.util.Scanner;

public class CalculatorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter first num1");
		int num1=scn.nextInt();
		
		System.out.println("Enter second num2");
		int num2=scn.nextInt();
		
		CalculatorMethods  cal=new CalculatorMethods();
		
		cal.addition(num1,num2);
		
		cal.subtraction(num1,num2);
		
		cal.multiplication(num1,num2);
		
		cal.divison(num1,num2);
		
		cal.remainder(num1,num2);
	}
		
	//methods
	
	public void addition(int a,int b)
	{
		int sum=a+b;
	    System.out.println("sum of" +a+ "+" +b+ "=" +sum);
	    
	}
	
	public void subtraction(int a, int b)
	{
		int dif=a-b;
		System.out.println("Difference of"+a+"-"+b+"="+dif);
		
		
	}
	
	public void multiplication(int a,int b)
	{
		float mul =a*b;
		System.out.println("product of"+a+ "*" +b+ "=" +mul);
		
	}
	
	public void divison(int a,int b)
	{ 
		float div=a/b;
	System.out.println("divison of"+a+"/" +b+ "="+div);
	
	}
	
	public void remainder(int a,int b)
	
	{ int rem=a%b;
	  System.out.println("remder of"+a+"%"+b+"="+rem );
	  
	}
	}

	


