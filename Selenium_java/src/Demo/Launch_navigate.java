package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://demowebshop.tricentis.com/login");
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Register']")).click();
	}
}
