package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		d.findElement(By.xpath("(//input[@name=\"Gender\"])[1]")).click();
		Thread.sleep(1000);
		d.findElement(By.name("FirstName")).sendKeys("madan");
		Thread.sleep(1000);
		d.findElement(By.name("LastName")).sendKeys("kumar");
		Thread.sleep(1000);
		d.findElement(By.name("Email")).sendKeys("madan87922@gmail.com");
		Thread.sleep(1000);
		d.findElement(By.name("Password")).sendKeys("madan@87922");
		Thread.sleep(1000);
		d.findElement(By.name("ConfirmPassword")).sendKeys("madan@87922");
		
				
	}

}
