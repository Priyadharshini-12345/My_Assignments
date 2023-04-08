package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumClassSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement leadstab = driver.findElement(By.linkText("Leads"));
		leadstab.click();
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Amazon");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Priya");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Tamil");
		//WebElement createlead2 = driver.findElement(By.className("smallSubmit"));
		//createlead2.click();
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//dropdown.sendKeys("Employee");
		Select dd = new Select(dropdown);
		//dd.selectByVisibleText("Cold Call");
		//dd.selectByValue("LEAD_DIRECTMAIL");
		dd.selectByIndex(6);
		
	}

}
