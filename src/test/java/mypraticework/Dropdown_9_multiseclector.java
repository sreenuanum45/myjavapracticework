package mypraticework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import mypractice_utility.MultiDropdown;

public class Dropdown_9_multiseclector {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		WebElement dd=driver.findElement(By.xpath("(//div[contains(@class,'selection multiple')])[2]"));
		MultiDropdown md=new MultiDropdown();
		md.multipleSelectAndDeselect(dd);
		
	}

	

}

