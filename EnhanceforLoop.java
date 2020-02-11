package day1;

public class EnhanceforLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] students = {"mam","Manasvi","Loukya","Balu"};
		
//enhance for loop
	
	for(String ref:students)
			
		{System.out.println("Enhanceforloop" +ref);}
		
		
		// simple for loop
	
		int arraylength=students.length;
		
		for (int i=0;i<arraylength;i++)
			
		{
			System.out.println("this is for loop "+i);
		}
		
		//if
		
		for(String ref:students)
		if (ref.contains("Loukya"))
		{System.out.println("print found");
		 break;
		 }
		else 
		   {System.out.println("not found");}// two times it print not found  then 3 re plce found
		
		
			
	}

}
