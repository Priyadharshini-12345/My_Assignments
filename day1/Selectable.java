package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.switchTo().frame(0);
        WebElement item2 = driver.findElement(By.xpath("(//ol[@id='selectable']/li)[2]"));
        WebElement item5 = driver.findElement(By.xpath("(//ol[@id='selectable']/li)[5]"));
        WebElement item3 = driver.findElement(By.xpath("(//ol[@id='selectable']/li)[3]"));
        WebElement item6 = driver.findElement(By.xpath("(//ol[@id='selectable']/li)[6]"));
        Actions builder = new Actions(driver);
        Thread.sleep(5000);
        builder.keyDown(Keys.CONTROL).click(item2).click(item3).click(item5).scrollToElement(item6).click(item6).keyUp(Keys.CONTROL).perform();
        
	}

}
