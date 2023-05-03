package week5.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteIncident extends baseClass {
	 @Test

	public  void deleteInci() throws InterruptedException {
		// TODO Auto-generated method stub
		Shadow shadow = new Shadow(driver);
		//delete
		WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		//incident update
		WebElement findElement = driver.findElement(By.xpath("(//td[@class='vt']/a)[1]"));	
		findElement.click();
		String incident = driver.findElement(By.id("incident.number")).getAttribute("value");
		driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		driver.switchTo().defaultContent();
		
		//verify deleted incident
		WebElement frame2 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incident,Keys.ENTER);
           
		String text = driver.findElement(By.xpath("//div[@class='list2_empty-state-list']")).getText();
		String text2 ="No records to display";
				if(text.equalsIgnoreCase(text2))
				{
					System.out.println("Deletion successfull");
				}
				else
				{
					System.out.println("Deletion not successfull");
				}
		
		
	}

}
