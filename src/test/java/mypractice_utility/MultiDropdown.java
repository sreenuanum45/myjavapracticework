package mypractice_utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultiDropdown {
	 public void multidropdownHighlight(List<WebElement>l2,RemoteWebDriver driver)throws InterruptedException {
		  int sdd=0,mdd=0; int visible=0,invisible=0;
		  
		  Thread.sleep(5000); //finding the single and multi dropdown for(WebElement
for(  WebElement e:l2) {
 
 if(e.isDisplayed()) {
 
 if(e.getAttribute("class").contains("multiple")) {
	  mdd++;
 driver.executeScript("arguments[0].style.border='4px solid yellow';", e); }
 else { 
	  sdd++;
 driver.executeScript("arguments[0].style.border='5px solid blue';", e); 
 }
 visible++; 
 } 
 else {
	  invisible++;
 }
 }
}
	  public void multipleSelectAndDeselect( WebElement dd) throws Throwable {
		 
			dd.click();
			List<WebElement>items=dd.findElements(By.xpath("child::*"));
			for(WebElement item:items) {
				 item.click();
				 Thread.sleep(1000);
			}
			List<WebElement>dsele=dd.findElements(By.xpath("child::a"));
			for(WebElement deselected:dsele) {
				deselected.findElement(By.xpath("child::i")).click();
				 Thread.sleep(1000);
			}

	  }
	  public void dropdownCount(List<WebElement>l1,RemoteWebDriver driver) {
		  int visible = 0,invisible=0;
			
	      for(WebElement e:l1) {
	    	  if(e.isDisplayed()) {
	  			visible++;
	  			
				driver.executeScript("arguments[0].style.border='3px solid red';", e);
	  		}
	  		else {
	  			invisible++;
	  		
	  		}
	      }
	      System.out.println(visible);
	      System.out.println(invisible);
		}

}
