package mypraticework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import mypractice_utility.MultiDropdown;

public class Dropdowncount_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		
		List<WebElement>l1=driver.findElements(By.xpath("//div[@class='ui active tab']/div/div[contains(@class,'dropdown')]"));
		MultiDropdown md=new MultiDropdown();
		
		//md.dropdownCount(l1,driver);
		md.multidropdownHighlight(l1, driver);
		
	
	}
	}
	
	
