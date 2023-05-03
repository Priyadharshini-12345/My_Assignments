package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[2]")).sendKeys("priya");
		driver.findElement(By.xpath("(//td[@class='x-btn-center']//following::button)[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();
		WebElement findElement = driver.findElement(By.id("updateLeadForm_companyName"));
		findElement.clear();
		findElement.sendKeys("google");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement findElement2 = driver.findElement(By.id("viewLead_companyName_sp"));
		System.out.println(findElement2.getText());
		//driver.close();
	}

}
