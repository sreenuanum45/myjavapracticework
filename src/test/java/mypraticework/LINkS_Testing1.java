package mypraticework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import mypractice_utility.LinksUtility;

public class LINkS_Testing1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		//Launch google
		driver.get("https://www.flipkart.com/");
		Thread.sleep(7000);
		//collect all links
		List<WebElement>links=driver.findElements(By.xpath("//*"));
		//List<WebElement>links1=driver.findElements(By.xpath("//a"));
		LinksUtility lu=new LinksUtility();
		lu.linksInPage(links);
		//lu.linksInPage(links1);
}
}