package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise2 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userEle = driver.findElement(By.name("email"));
		 
		 userEle.sendKeys("Aditya");
		 
		 WebElement passEle = driver.findElement(By.id("pass"));
		 
		 passEle.sendKeys("Waterloo");
		Thread.sleep(2000);
		 
	
		
	
	}
	
	

}
