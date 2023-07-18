package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.id("alertButton")).click();
	
	Thread.sleep(1000);
	
	Alert alert=driver.switchTo().alert();
	System.out.println("Click ok on Alert pop up");
	Thread.sleep(1000);
	
	driver.findElement(By.id("alertButton")).click();
	Thread.sleep(2000);
	
	Alert alert1=driver.switchTo().alert();
	String text = alert1.getText();
	System.out.println(text);
	
	
	
	
	}
}
