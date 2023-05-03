package week5.assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateIncident extends baseClass {
	 @Test

	public  void createInci() throws InterruptedException {
		
		//creating new incidents
		Shadow shadow = new Shadow(driver);
		WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("sysverb_new")).click();
		String incident = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println("Incident "+incident);
		driver.findElement(By.id("incident.short_description")).sendKeys("Created via automation1");
		driver.findElement(By.id("sysverb_insert")).click();
		driver.switchTo().defaultContent();
		//verify existance
		WebElement frame2 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame2);
		//WebElement dropdwon = driver.findElement(By.xpath("//div[@class='form-control default-focus-outline']"));
		//Select dd = new Select(dropdwon);
		//dd.selectByVisibleText("Number");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incident,Keys.ENTER);
		//check matching
		String incident2 = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if(incident.equals(incident2))
		{
			System.out.println("Incident created sucessfully "+incident2);
		}
			
		
		
		
		

		
		

		
		
		
	}

}
