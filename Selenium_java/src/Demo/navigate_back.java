package Demo;
import org.openqa.selenium.By;
import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_back {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(1000);
		d.navigate().back();
		}
}
