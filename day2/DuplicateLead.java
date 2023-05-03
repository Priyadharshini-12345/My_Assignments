package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("k.priya@gmail.com");
		driver.findElement(By.xpath("(//td[@class='x-btn-center']//following::button)[6]")).click();
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a"));
	    String lead=findElement.getText();
	    System.out.println(lead);
	    findElement.click();
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    System.out.println(driver.getTitle());
	    driver.findElement(By.className("smallSubmit"));
	    
	    	}

}
