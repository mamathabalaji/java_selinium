package day1;

public class Examplebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Examplebrowser em=new Examplebrowser();
		
		em.openBrowser("firefox");
				
       // em.openBrowser("chrome");
        em.openBrowser();
		
	}
	    
        
     public void openBrowser(String browser)
	
	{ if (browser.equalsIgnoreCase("chrome"))
	   { System.out.println("open chrome");
		
	    }
	else if (browser.equalsIgnoreCase("Firefox")) 
	{
		System.out.println("open Firefox");
	}
	}
	
	
	public void openBrowser()
	
	{ System.out.println("open chrome browser");
	
	}
}		
	
	
		
		
		
	
	

