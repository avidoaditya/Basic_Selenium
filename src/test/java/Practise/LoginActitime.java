package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActitime {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
	
		driver.get("http://localhost:8888");
		 
	 WebElement usernameEle = driver.findElement(By.name("user_name"));
	 
	 usernameEle.sendKeys("admin");
	 
	 WebElement passwordEle = driver.findElement(By.name("user_password"));
	 
	 passwordEle.sendKeys("admin");
	 
	 WebElement loginEle = driver.findElement(By.id("submitButton"));
	 
	 loginEle.click();	
	  
	 driver.findElement(By.linkText("Organizations")).click();
	 
		
		
		
		
	}

}
