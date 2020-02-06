package day2;

import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		System.out.println("Enter two number a and b");
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Before swapping" +a+ "&" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping" +a+ "&" +b);

	}

}
