package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//ul[@class='layout-menu']/li)[2]")).click();
		driver.findElement(By.xpath("//span[text()='Alert']/..")).click();
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']/span")).click();
	    Alert alert = driver.switchTo().alert();
	    String text = alert.getText();
	    System.out.println(text);
		Thread.sleep(2000);
		alert.accept();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']/span")).click();
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
	    System.out.println(text1);
		Thread.sleep(2000);
		alert1.dismiss();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']/span")).click();
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
	    System.out.println(text2);
		Thread.sleep(2000);
		alert2.sendKeys("Priya");
		alert2.accept();
		
	}

}
