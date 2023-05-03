package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
	    WebElement number = driver.findElement(By.name("phoneCountryCode"));
	    number.clear();
	    number.sendKeys("91");	
	    driver.findElement(By.name("phoneNumber")).sendKeys("9884516182");
	    driver.findElement(By.linkText("Find Leads")).click();
	    WebElement findElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
	    String lead=findElement.getText();
	    System.out.println(lead);
	    findElement.click();
	    driver.findElement(By.className("subMenuButtonDangerous")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input")).sendKeys(lead);
	    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	    WebElement findElement2 = driver.findElement(By.xpath("//div[@class='x-panel-bbar']//following::div"));
	    String message = findElement2.getText();
	    System.out.println(message);
	    driver.close();
	    
	 
	}
	

}
