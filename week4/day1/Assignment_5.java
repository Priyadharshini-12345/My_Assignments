package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node01g9qdv71sr3dlcdsjj5viw7c220661.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //driver.switchTo().frame(0);
        WebElement drag1 = driver.findElement(By.id("form:conpnl_header"));
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(drag1, 100, 100).perform();
        Thread.sleep(3000);
        WebElement drag = driver.findElement(By.id("form:drag_content"));
        WebElement drop = driver.findElement(By.id("form:drop_header"));
        builder.dragAndDrop(drag, drop).perform();
        WebElement dragnew = driver.findElement(By.xpath("(//tr[@class='ui-widget-content ui-datatable-even']/td)[1]"));
        WebElement dropnew = driver.findElement(By.xpath("(//tr[@class='ui-widget-content ui-datatable-odd']/td)[1]"));
        builder.dragAndDrop(dragnew, dropnew).perform();
        File source = driver.findElement(By.xpath("(//img)[6]")).getScreenshotAs(OutputType.FILE);
        File dest = new File("./snaps/IMG002.png");
        FileUtils.copyFile(source, dest);
        
		
       
	}

}
