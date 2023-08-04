
  package mypraticework;

  import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import
  org.openqa.selenium.chrome.ChromeDriver;
import
  org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import mypractice_utility.MultiDropdown;
  public class Dropdown_2 {
  
  public static void main(String[] args) throws Throwable {
  WebDriverManager.chromedriver().setup(); RemoteWebDriver driver=new
  ChromeDriver(); driver.manage().window().maximize(); //Launch site
  driver.get("https://semantic-ui.com/modules/dropdown.html");
  List<WebElement>l2=driver.findElements(By.
  xpath("//div[@class='ui active tab']/div/div[contains(@class,' dropdown')]"));
MultiDropdown md=new MultiDropdown(); 
//md.multidropdownHighlight(l2, new ChromeDriver()); 
md.dropdownCount(l2, driver);




}
  
  }
