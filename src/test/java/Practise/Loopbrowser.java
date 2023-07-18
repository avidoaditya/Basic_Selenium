package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loopbrowser {

	public static void main(String[] args) {
ChromeDriver driver	=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().window().minimize();
driver.manage().window().maximize();
driver.manage().window().minimize();
driver.manage().window().fullscreen();
driver.get("http://www.zenmobile.in/zenservice/");
driver.findElement(By.id("userid")).sendKeys("zmaspupw163");
driver.findElement(By.id("pwd")).sendKeys("1122");
driver.findElement(By.id("button")).click();


	}

}
