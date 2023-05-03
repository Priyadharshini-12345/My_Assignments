package week5.assignment;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateIncident extends baseClass {
	 @Test

	public  void updateInci() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//update existing incident
		Shadow shadow = new Shadow(driver);
		WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		//incident update
		WebElement findElement = driver.findElement(By.xpath("(//td[@class='vt']/a)[1]"));	
		findElement.click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
	     Select dd = new Select(dropdown);
		 dd.selectByIndex(0);
		 WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='incident.state']"));
		 Select dd2 = new Select(dropdown2);
	     dd2.selectByVisibleText("In Progress");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
	     //check updation
	     WebElement findElement2 = driver.findElement(By.xpath("(//td[@class='vt']/a)[1]"));	
		 findElement2.click();
            String Priority =
			  driver.findElement(By.xpath("(//span[@class='sn-widget-list-table-cell'])[2]")).getText();
            String Status =
			  driver.findElement(By.xpath("(//span[@class='sn-widget-list-table-cell'])[4]")).getText();
            System.out.println("Priority "+Priority);
			  System.out.println("Status "+Status);
			  System.out.println("Incident updated successfully");
			 
	     
		  
		
	}

}
