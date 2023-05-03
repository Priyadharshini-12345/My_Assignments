package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement elementTable = driver.findElement(By.xpath("(//div[@id='divTrainsList']//table)[1]"));
		List<WebElement> elementRows = elementTable.findElements(By.tagName("tr"));
		//for(int i=0;i<elementRows.size();i++)
		//{
			//WebElement eachrow= elementRows.get(i);
			//List<WebElement> elementColumn = eachrow.findElements(By.tagName("td"));
			//for(int j=0;j<elementColumn.size();j++)
			//{
			//	System.out.println(elementColumn.get(j).getText());
			//}
			for(int i=0;i<elementRows.size();i++)
			{
				WebElement eachrow = elementRows.get(i);
				List<WebElement> cols = eachrow.findElements(By.tagName("td"));
				String text = cols.get(1).getText();
				System.out.println(text);
				
		}
		
		
	}

}
