package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(op);
		System.out.println("Namaste");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		System.out.println("abc");
		driver.get("https://www.yatra.com/");
		
		System.out.println("Namoskar");
	
	
	}
	
	
	
	
	
}
