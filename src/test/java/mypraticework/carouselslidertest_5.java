package mypraticework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import mypractice_utility.CarouselSliderUtility;


public class carouselslidertest_5 {

	public static void main(String[]args) throws Throwable  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.shoppersstop.com/");
	
		
		
		List<WebElement >slider1= driver.findElements(By.xpath("//div[@class='slick-track']"));
		for(int i=0;i<=slider1.size();i++) {
		
			WebElement slider=driver.findElement(By.xpath("(//div[@class='slick-track'])[i]"));
			CarouselSliderUtility obj=new CarouselSliderUtility();
			System.out.println(obj.getCountOfSlider(slider));
			
			  System.out.println(obj.getTypeOfSlider(slider));
			  if(obj.AreSliderMovingAutomaticallyInSlider(slider))
			  {
			  System.out.println(obj.getMovingDirectionOfSlider(slider));
			  System.out.println(obj.getSliderMoveDuration(slider)); 
			  }
			  else {
			  System.out.println("slider are not moving"); 
			  }
			  
			  
			  System.out.println(obj.getslideMovingStyle(slider));
			  System.out.println(obj.getDelayBetweenSlidesMove(slider));
		}
		
		 

	}}


		

	

