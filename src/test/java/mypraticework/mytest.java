package mypraticework;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mytest {
	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	String s=driver.getCurrentUrl();
	System.out.println(s);
	/*
	 * String s1=driver.getPageSource(); System.out.println(s1);
	 */
	String s2=driver.getTitle();
	System.out.println(s2);
	driver.findElement(By.linkText("Try it Yourself")).click();
	
	/*
	 * String s3=driver.getWindowHandle(); System.out.println(s3)
	 */;
	 //driver.findElement(By.linkText("try it yourself")).click();
	 
	 Thread.sleep(2000);
	 Set<String>x=driver.getWindowHandles();
	 System.out.println(x);
	 ArrayList<String>l=new ArrayList<String>(x);
	 System.out.println(l);
	 driver.switchTo().window(l.get(1));
	 driver.findElement(By.id("tryhome")).click();
	 driver.findElement(By.className("ga-fp")).click(); 
	 //driver.close();
	 //driver.manage().window().fullscreen();
	 
	 
	 //ArrayList<String>y=new ArrayList()<String>(x);
	//driver.close();

	}

}
