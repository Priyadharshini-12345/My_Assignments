package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement table = driver.findElement(By.xpath("//div[@class='render']/table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("no of rows "+ rows.size());
		for(int i=0;i<rows.size();i++)
		{
			WebElement element = rows.get(i);
			WebElement cols = element.findElement(By.tagName("td"));
			System.out.println("no of cols "+ cols.getSize());
		}
	}

}

