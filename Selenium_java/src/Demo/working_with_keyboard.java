package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_keyboard {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://demowebshop.tricentis.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		//d.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		d.findElement(By.id("small-searchterms")).click();
		Robot r1=new Robot();
			r1.keyPress(KeyEvent.VK_C);
			r1.keyPress(KeyEvent.VK_C);
			r1.keyPress(KeyEvent.VK_C);
			r1.keyPress(KeyEvent.VK_C);
			
		
	}

}
