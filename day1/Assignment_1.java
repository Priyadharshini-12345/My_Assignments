package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		List<WebElement> rows = driver.findElements(By.xpath("(//table)[2]//tbody//tr"));
		int rowsize = rows.size();
		System.out.println("List of Security Names "+rowsize);
		List<String> names = new ArrayList<String>();
		for(int i =1 ;i<rowsize;i++)
		{
		String securitynames = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr["+i+"]//td[1]")).getText();
		names.add(securitynames);
		System.out.println(securitynames);		
		}
		Set<String> set = new HashSet<String>(names);
		int size = set.size();
		System.out.println(size);
		if(rowsize!=size)
		{
			System.out.println("Duplicated are present");
		}

}
}
