package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://jqueryui.com/droppable/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.switchTo().frame(0);
		        WebElement drag = driver.findElement(By.id("draggable"));
		        WebElement drop = driver.findElement(By.id("droppable"));
		        Actions builder = new Actions(driver);
		        builder.dragAndDrop(drag, drop).perform();
		        
	}

}
