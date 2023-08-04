package mypraticework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframetest8 {

	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://chercher.tech/practice/frames");
		driver.switchTo().frame("frame1");
		//driver.findElement(By.xpath("b[@id='topic']/following-sibling::input")).sendKeys("sreenu");
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("sreenu");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
	}

}
