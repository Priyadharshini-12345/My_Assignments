package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement frameelement = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameelement);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
	    alert.sendKeys("Priya");
	    alert.accept();
	    WebElement element = driver.findElement(By.id("demo"));
	    String text = element.getText();
	    if(text.contains("Priya"))
	    {
	    	System.out.println("Pass");
	    }
	    else
	    {
	    	System.out.println("Fail");
	    }
	    driver.switchTo().defaultContent();
	}

}
