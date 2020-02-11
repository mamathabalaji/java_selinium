package day1;

public class GlobalLocalvariable {
//	String city ="Bangalore";//global variable is outside main method but inside classand can be acessed anywhere in that class methods

	static String city="Bangalore";
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
GlobalLocalvariable g=new  GlobalLocalvariable();
  
 String city="pune";
 
		g.student("mam",33);
		
	   g.student("Manasvi",22,"Delhi");
	   
	   student("Loukya",21,99);
	   
		
	}
	
	public void student(String name,int roll)
	{
		String city ="pune";
		
		System.out.println("Student name is " +name);
		System.out.println("roll num is "+roll);
		System.out.println("city is "+city);
		System.out.println("static city is " +this.city);//to avoid conflict between local n static variablw we use this.
	}

	
	public void student(String name,int roll, String city)
	{
		
		System.out.println("Student name is " +name);
		System.out.println("roll num is "+roll);
		System.out.println("city is "+city);
	}
	
	
	// Static method
	
	public static void  student(String name,int roll,int marks)
	{ 
		System.out.println("Student name is  "+ name);
	
       System.out.println("Roll num is "+roll);
       
       System.out.println("Marks obtained is "+marks);
       
       System.out.println("City is " +city);
	
	}
	
	
	
	  
}
