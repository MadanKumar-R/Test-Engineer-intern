package Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_select {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://demowebshop.tricentis.com/");
		String url=d.getCurrentUrl();
		if(url.contains(url)) {
			System.out.println("UrL passed");
		}
		else {
			System.out.println("Failed");
		}
		Thread.sleep(1000);
		//d.findElement(By.partialLinkText("Books"));
		d.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		String url_1=d.getCurrentUrl();
		if(url_1.contains(url_1)) {
			System.out.println("click books[1] passed");
		}
		else {
			System.out.println("Failed");
		}
		WebElement s1=d.findElement(By.id("products-orderby"));
		Select s2=new Select(s1);
		//s2.selectByIndex(3);
		//s2.selectByValue("https://demowebshop.tricentis.com/books?orderby=11");
		s2.selectByVisibleText("Created on");
		
		WebElement s3=d.findElement(By.id("products-pagesize"));
		Select s4=new Select(s3);
		s4.selectByIndex(0);
		//s4.selectByVisibleText("12");
		//s4.selectByValue("https://demowebshop.tricentis.com/books?pagesize=4");
		
		TakesScreenshot ts=(TakesScreenshot)d;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File trg=new File("./ddd/S1.png");
			FileHandler.copy(src,trg);
			
		Thread.sleep(3000);
		d.close();
	}
}
