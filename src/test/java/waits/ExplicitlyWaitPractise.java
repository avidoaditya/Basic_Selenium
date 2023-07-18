package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class ExplicitlyWaitPractise {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("http://localhost:8888");
	
	//username textfie
	driver.findElement(By.name("user_name")).sendKeys("admin");
	
	//password textfield 
	driver.findElement(By.name("user_password")).sendKeys("admin");
	
	//login button
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.linkText("Organizations")).click();
	
	//driver.findElements(By.xpath("))
	WebDriver 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	FluentWait wait=new FluentWait(driver);
	
	wait.pollingEvery(Duration.ofMillis(200));
	wait.withTimeout(Duration.ofSeconds(5));
	
	
	

}
