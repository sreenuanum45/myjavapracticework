package mypraticework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manage_Window {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.navigate().to("https://www.mercurytravels.co.in");
        driver.manage().window().minimize();
        Thread.sleep(4000);

        int x=driver.manage().window().getSize().width;
        int y=driver.manage().window().getSize().height;
        System.out.println("get current size :   "+x+"     "+y);
        Dimension dim=new Dimension(1200,1000);
        driver.manage().window().setSize(dim);
        Thread.sleep(4000);
        int a=driver.manage().window().getPosition().getX();
        int b=driver.manage().window().getPosition().getY();
        System.out.println("current size:"+a+"  "+b);
        Thread.sleep(4000);
      Point p=new Point(100,200);
        driver.manage().window().setPosition(p);
        Thread.sleep(4000);
        //get full screen
        driver.manage().window().fullscreen(); //Maximise without tool bars
        Thread.sleep(5000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(5000);
    }
}
