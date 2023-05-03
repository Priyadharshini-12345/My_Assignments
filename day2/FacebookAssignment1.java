package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Priya");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Tamil");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("7940674701");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("Pass@123");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select dd1 = new Select(dropdown1);
		dd1.selectByValue("8");
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select dd2 = new Select(dropdown2);
		dd2.selectByVisibleText("Jul");
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select dd3 = new Select(dropdown3);
		dd3.selectByVisibleText("1995");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

}
