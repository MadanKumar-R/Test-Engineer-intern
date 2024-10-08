package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_verification {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		String url=d.getCurrentUrl();
		System.out.print(url);
		if(url.contains(url)) {
			System.out.println(": test for main url passed");
		}
		else {
				System.out.println(": test for main url failed");
		}
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		String url_1=d.getCurrentUrl();
		System.out.print(url_1);
		if(url_1.contains(url_1)) {
			System.out.println(": test for register url passed");
		}
		else {
				System.out.println(": test for register url failed");
		}
		Thread.sleep(1000);
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
		d.close();
		//d.quit();
	}
}
