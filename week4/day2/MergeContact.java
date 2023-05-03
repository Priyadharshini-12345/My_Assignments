package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[4]")).click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.xpath("(//form[@name='MergePartyForm']//img)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		System.out.println(windowHandles.size());
		List<String> list = new ArrayList<>(windowHandles);
		String wh=list.get(1);
		driver.switchTo().window(wh);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(windowHandle);
		driver.findElement(By.xpath("(//form[@name='MergePartyForm']//img)[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<>(windowHandles2);
		String wh2=list2.get(1);
		driver.switchTo().window(wh2);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(windowHandle);
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
	    System.out.println(text);
		Thread.sleep(2000);
		alert.accept();
		driver.switchTo().window(windowHandle);
		System.out.println(driver.getTitle());
		
	}

}
