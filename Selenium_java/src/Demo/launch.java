package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();//upcasting method
		d.get("https://demowebshop.tricentis.com/login");//-->get accepts only string hence" "
		d.manage().window().maximize();//inheritence
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Register']")).click();/* By and xpath is static and text is""*/
		d.findElement(By.id("FirstName")).sendKeys("Mohan");
		d.findElement(By.id("LastName")).sendKeys("R");
		d.findElement(By.name("Email")).sendKeys("jkjkjk123@gmail.com");
		d.findElement(By.id("Password")).sendKeys("hhh@12345");
		d.findElement(By.id("ConfirmPassword")).sendKeys("hhh@12345");
		d.findElement(By.id("register-button")).click();
		d.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
	}

}
