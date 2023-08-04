package mypractice_utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch {
	public static void browserlaunch(String s) throws Throwable {
		RemoteWebDriver driver =null;
		if(s.equals("Chrome")||s.equals("CHROME")||s.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.quit();
		}
		else if(s.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("https://www.google.com/maps");
			driver.manage().window().maximize();
			Thread.sleep(4444);
			driver.quit();
		}
		else if(s.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			
		
		}
		else {
			System.out.println("please cheeck browser name");
			System.exit(0);
		}

	}
	}


