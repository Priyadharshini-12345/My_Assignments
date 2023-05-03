package week5.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class baseClass {
	public ChromeDriver driver;
  @BeforeMethod
  public void precondition() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev127698.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("PhteA++dGE88");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[@class='sn-polaris-navigation polaris-header-menu']/div").click();
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Incident",Keys.ENTER);
		shadow.setImplicitWait(10);
		//clicking incidents
		shadow.findElementByXPath("//mark[@class='filter-match']").click();
		
  }
  @AfterMethod
  
  public void postcondition() {
	  driver.close();
  }
}
