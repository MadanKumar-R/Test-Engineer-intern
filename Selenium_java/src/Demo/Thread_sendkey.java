package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_sendkey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		d.findElement(By.id("FirstName")).sendKeys("madan");
		Thread.sleep(1000);
		d.findElement(By.id("LastName")).sendKeys("kumar");
		Thread.sleep(1000);
		d.findElement(By.id("Email")).sendKeys("madan87922@gmail.com");
		Thread.sleep(1000);
		d.findElement(By.id("Password")).sendKeys("madan@87922");
		Thread.sleep(1000);
		d.findElement(By.id("ConfirmPassword")).sendKeys("madan@87922");
	}

}
