package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stale {
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demowebshop.tricentis.com/");
			
			WelcomePage wp=new WelcomePage(driver);
			wp.getsearchTF().sendKeys("mobiles",Keys.ENTER);
			wp.getsearchTF().sendKeys("Selenium");
}
}
