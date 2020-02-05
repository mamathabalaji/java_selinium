package day1;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  
  
  System.out.println("Enter salary");
 int sal=sc.nextInt();
 
 
  
  TaxCalculation tx = new TaxCalculation();
  
  tx.calculation(sal);
  
	}
  
  public void calculation(int a)
  
  {
  float t1= 0;
  float t2 = (float) 0.1;
  float t3 = (float) 0.2;
  float t4 =(float) 0.3;
  
  
  {  if(a<=5)
     {int taxdsal=(a-0);
       System.out.println(taxdsal);
     }
       
     else if(a<=10)
     {
    	int taxdsal=(int)(a-(a*t2));
    	System.out.println(taxdsal);
    	
     }
     else if(a<=20)
     {
    	int taxdsal=(int) (a-(a*t3));
    	System.out.println(taxdsal);
    	
     }
     else if(a>=30)
     {
    	int taxdsal=(int) (a-(a*t4));
    	System.out.println(taxdsal);
    	
     }
  
     else
     {System.out.println("invalid");
     }
  
     }
  }
}

/* test 
 
 */
  