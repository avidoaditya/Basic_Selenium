package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Chrome Driver is Launched");
		
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		
		String title = driver.getTitle();
		
	System.out.println(title);

				

	
		
		System.out.println("Namaste:");
		
		
		
	}

}
