package mypraticework;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevtoolsTest {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		HashMap<String,Object>params=new HashMap<String,Object>();
		params.put("latitude",17.385044);
		params.put("Longitude", 78.486671);
		params.put("accuracy",1);
		((ChromiumDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride", params);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("abdul kalam ",Keys.ENTER);
		
		
	}

}
