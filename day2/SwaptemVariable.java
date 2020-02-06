package day2;

import java.util.Scanner;

public class SwaptemVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,temp;
		System.out.println("enter a and b");
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
			
		System.out.println("before swapping a and b" +a+ "&" +b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping a and b" +a+ "&" +b);
						
		

	}

}
