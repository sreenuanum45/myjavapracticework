package mypraticework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframetest6 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_target");
		   driver.switchTo().frame("iframeResult");
		      Thread.sleep(5000);
		      driver.switchTo().frame(0);
		      System.out.println(driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']/ancestor::body[1]")).getText());
		    String e=driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']/parent::p")).getText();
		      System.out.println(e);
		      Thread.sleep(5000);
		      driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']/parent::p")).click();
		      driver.switchTo().defaultContent();
		      

	}

}
