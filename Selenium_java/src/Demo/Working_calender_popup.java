package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_calender_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/datepicker/");
		String url=d.getCurrentUrl();
		if(url.contains(url)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		d.switchTo().frame(0);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//d.findElement(By.xpath("//span[text()='Prev']")).click();
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		d.findElement(By.xpath("//input[@class=\"hasDatepicker\"]")).click();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		d.findElement(By.xpath("//span[text()='Prev']")).click();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		d.findElement(By.xpath("//a[@data-date=\"8\"]")).click();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		d.switchTo().parentFrame();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		d.findElement(By.xpath("//a[text()='Selectable']")).click();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		d.close();
		
		
	}

}
