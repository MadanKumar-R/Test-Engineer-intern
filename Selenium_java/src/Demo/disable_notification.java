package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disable_notification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver d=new ChromeDriver(opt);
		d.manage().window().maximize();
		d.get("https://www.easemytrip.com/");
		
		Thread.sleep(4000);
		d.close();
	}

}
