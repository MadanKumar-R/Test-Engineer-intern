package Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_script_scroll_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demowebshop.tricentis.com/login");
		
		JavascriptExecutor ref1=(JavascriptExecutor)d;
		ref1.executeScript("window.scrollTo(0,500);");
		d.close();
	}

}
