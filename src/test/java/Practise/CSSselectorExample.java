package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorExample {
public static void main(String[] args)

{

	WebDriver driver = new ChromeDriver();
 
	driver.manage().window().maximize();

	driver.get("https://demo.actitime.com/login.do");
 
	//username textfield
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("trainee");
	
	//password textfield 
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("trainee");
	//login button
	driver.findElement(By.cssSelector("[id='loginButton')")).click();
	
	//driver.findElement(By.tagName("a")).click();
	driver.close();
 
}
}
