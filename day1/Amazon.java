package week4.day1;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung mobiles",Keys.ENTER);
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='sg-row']//h2"));
		for(WebElement webelement : names)
		{
			System.out.println("Result names :"+ webelement.getText());
		}
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		for(WebElement webelements : price)
		{
			System.out.println("Result Price: "+webelements.getText());
		}
		Map<String,Integer>map= new HashMap<>();
		for (int i = 0; i < webelement.size(); i++) {
		    map.put(webelement.getText(i), webelements.getText(i));
		}
		}
	}
