package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable//");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.id("draggable"));
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(drag, 100, 100).perform();
        Point location = drag.getLocation();
        int x = location.getX();
        int y = location.getY();
        System.out.println(x);
        System.out.println(y);
        

	}

}
