package Demo;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveto_mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		Actions a1=new Actions(d);
			WebElement trg=d.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
			//a1.moveToElement(trg).contextClick().perform();
			a1.moveToElement(trg).perform();
			a1.sendKeys(Keys.ARROW_DOWN);
			a1.sendKeys(Keys.ARROW_DOWN);
			
			
			Thread.sleep(2000);
			d.close();
		
		
	}

}
