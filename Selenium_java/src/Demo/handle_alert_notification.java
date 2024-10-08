package Demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_alert_notification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		String url_1=d.getCurrentUrl();
		if(url_1.contains(url_1)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		d.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
			Alert alt=d.switchTo().alert();
			//the main code for sleep
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			//Thread.sleep(1000);
			alt.accept();
			
			String s1=d.findElement(By.id("result")).getText();
			System.out.println(s1);
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			//the main code for sleep
			//Thread.sleep(1000);
		d.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
			Alert alt1=d.switchTo().alert();
			//Thread.sleep(2000);
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			alt1.dismiss();
			
			String s2=d.findElement(By.id("result")).getText();
			System.out.println(s2);
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			//Thread.sleep(1000);
			d.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			Alert alt2=d.switchTo().alert();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			//Thread.sleep(2000);
			
			alt2.dismiss();
			
			String s3=d.findElement(By.id("result")).getText();
			System.out.println(s3);
			//the main synatx
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			//Thread.sleep(2000);
			d.close();
	}

}
