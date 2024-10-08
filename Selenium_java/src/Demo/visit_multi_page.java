package Demo;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class visit_multi_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		String url=d.getCurrentUrl();
		if(url.contains(url)) {
			System.out.println("main url passed");
		}
		else {
			System.out.println("fialed");
		}
		Thread.sleep(1000);
		d.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
		Thread.sleep(1000);
		String url_1=d.getCurrentUrl();
		if(url_1.contains(url_1)) {
			System.out.println("computer url passed");
		}
		else {
			System.out.println("fialed");
		}
		Thread.sleep(1000);
		d.findElement(By.xpath("(//a[contains(text(),'Desktops')])[4]")).click();
		String url_2=d.getCurrentUrl();
		if(url_2.contains(url_2)) {
			System.out.println("desktop url passed");
		}
		else {
			System.out.println("fialed");
		}
		WebElement s1=d.findElement(By.id("products-orderby"));
		Select s2=new Select(s1);
		s2.selectByIndex(3);
		Thread.sleep(1000);
		WebElement s3=d.findElement(By.id("products-pagesize"));
		Select s4=new Select(s3);
		s4.selectByIndex(0);
		Thread.sleep(1000);
		
		d.findElement(By.linkText("Simple Computer")).click();
		String url_3=d.getCurrentUrl();
		if(url_3.contains(url_3)) {
			System.out.println("Simple Computer url passed");
		}
		else {
			System.out.println("fialed");
		}
		Thread.sleep(1000);
		d.findElement(By.id("product_attribute_75_5_31_96")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id=\"add-to-cart-button-75\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		Thread.sleep(2000);
		
		WebElement s5=d.findElement(By.id("CountryId"));
		Select s6=new Select(s5);
		s6.selectByVisibleText("India");
		Thread.sleep(1000);
		d.findElement(By.name("checkout")).click();
		
		
		Thread.sleep(2000);
		d.close();
	}

}
