package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver= new ChromeDriver();
	
	WebDriver driver1=new ChromeDriver();
	System.out.println("Chrome Browser launched");
	
	driver.manage().window().maximize();
	
	driver1.get("https://flipkart.com");
	System.out.println("flipkart is loaded");
	
	 String title=driver1.getTitle();
	 System.out.println("page title "+title);
	 
	 String url=driver1.getCurrentUrl();
	 System.out.println("Current url:"+url);
	 
	 String sourceCode=driver.getPageSource();
	 System.out.println("Page Source is:"+sourceCode);
	 
	  String id = driver.getWindowHandle();
	  System.out.println("Session id of current id:"+id);
	  
	  driver.navigate().refresh();
	 
	  Thread.sleep(2000);
	  driver.close(); //close only current browser
	  System.out.println("Browser is closed");
	  driver.quit();
	  
	  
	  
	  
	  
	  }
}


