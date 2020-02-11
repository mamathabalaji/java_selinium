package day1;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="pavan_balaji-8861036034";
      System.out.println(name);
      System.out.println("to lowercase  "+name.toLowerCase());
      System.out.println("to upper  "+name.toUpperCase());
      System.out.println("count length of string " +name.length());
      System.out.println("split the name _0" +name.split("_") [0]);
      System.out.println("split the name _1" +name.split("_") [1]);
     // System.out.println("split the name" +name.split("_") [2]);
      
     String fullname=name.split("-")[0];
     String fname= name.split("-")[1];
     
     System.out.println(fullname.toUpperCase());
     System.out.println(fname.toLowerCase());
     System.out.println(fname.length());
    // System.out.println(fname.split("")[1]);
     System.out.println(fullname.substring(7,11));
      System.out.println(fullname.substring(0,7)+fullname.substring(7,12).toUpperCase());
      
      System.out.println("Mam"=="mam");
      System.out.println("Mam"=="Mam");
      
      System.out.println("Mam".equals("mam"));
      System.out.println("Mam".equalsIgnoreCase("mam"));
      System.out.println(name.hashCode());
      
      
	}

}
