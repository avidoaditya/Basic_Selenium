package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApp {

public static void main(String[] args) {		
	ChromeDriver driver = new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	//navigation to the url
	driver.get("https://www.facebook.com/");
	
	String title = driver.getTitle();
	
	driver.findElement(By.name("email")).sendKeys("Aditya");
	
	driver.findElement(By.name("pass")).sendKeys("Qspider");
	
	driver.findElement(By.id("u_0_5_VN")).click();
	
	
	
	
	
	
	
	
	
}
}



