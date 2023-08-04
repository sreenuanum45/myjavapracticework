
package mypraticework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import mypractice_utility.TableDataPrint;
public class CricketExchange {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch google
		driver.get("https://crex.live/stats/ipl-2023-orange-cap-list");
		Thread.sleep(10000);
		List<WebElement> tables = driver.findElements(By.xpath("//table//tbody"));
		TableDataPrint tdp=new TableDataPrint();
		tdp.EachColoumTextPrint(tables);
	}
}

