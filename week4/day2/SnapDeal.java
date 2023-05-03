package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele = driver.findElement(By.xpath("(//a[@class='menuLinks leftCategoriesProduct ']//span)[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//span[@class='linkTest'])[1]")).click();
		WebElement shoes = driver.findElement(By.xpath("//div[@class='category-name-wrapper clearfix ']/span"));
		System.out.println("total no of shoes "+shoes.getText());
		driver.findElement(By.xpath("(//a[@class='child-cat-node dp-widget-link hashAdded']/div)[5]")).click();
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']/div")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
        WebElement fromval = driver.findElement(By.name("fromVal"));
        fromval.clear();
        fromval.sendKeys("900");
        WebElement toval = driver.findElement(By.name("toVal"));
        toval.clear();
        toval.sendKeys("1200");
        driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow btn')]")).click();
        WebElement ele2 = driver.findElement(By.xpath("//picture[@class='picture-elem']//img"));
        Actions action2 = new Actions(driver);
		action2.moveToElement(ele2).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
		
		
        
		
		
		
	}

}
