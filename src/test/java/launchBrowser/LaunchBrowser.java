package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		//To launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Chrome Broswer launched");
		
		//FirefoxDriver driver=new FirefoxDriver();
		System.out.println("Firefox Driver is Launched");
		
	}
	
}

