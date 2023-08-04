package mypraticework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class To_method_Check {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        long st= System.currentTimeMillis();
      driver.navigate().to("https://www.mercurytravels.co.in");
        driver.navigate().to("https://www.google.co.in");
        long et= System.currentTimeMillis();
        System.out.println(et-st);
    }
}
