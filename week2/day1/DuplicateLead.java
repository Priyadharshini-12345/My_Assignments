package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tamil");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Krish");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Description added");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("k.pri@gmail.com");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("New York");
		WebElement createlead2 = driver.findElement(By.className("smallSubmit"));
		createlead2.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyname=driver.findElement(By.id("createLeadForm_companyName"));
		companyname.clear();
		companyname.sendKeys("Capgemini");
		WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
		firstname.clear();
		firstname.sendKeys("dharshini");
		driver.findElement(By.className("smallSubmit")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
			
	}

}
