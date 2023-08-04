package mypraticework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fblogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("8919188076");
		driver.findElement(By.id("pass")).sendKeys("naveen80");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
