package mypraticework;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manage_Timeouts_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        Duration d= driver.manage().timeouts().getScriptTimeout();
        System.out.println(d);
       // driver.manage().timeouts().setScriptTimeout(Duration.ofMillis(3));
        driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
       driver.get("https://www.gmail.com");
       WebElement e =driver.findElement(By.name("identifier"));
       driver.executeScript("arguments[0].style.border='5px blue solid'",e);

    }
}
