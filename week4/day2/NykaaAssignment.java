package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//ul[@class='HeaderNav css-f7ogli']//a)[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("Title contains L'Oreal Paris");
		}
		else
		{
			System.out.println("Title doensot contains L'Oreal Paris");
		}
		driver.findElement(By.xpath("//div[@class='css-ar51ef']//button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='control control-radio']//span)[4]")).click();
		driver.findElement(By.xpath("//div[@id='first-filter']//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='css-1do4irw']//div)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=' css-1nozswx']//span)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='title'])[1]")).click();
		

		
	}

}
