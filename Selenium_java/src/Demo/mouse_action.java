package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//for drop and drop using mouse action
public class mouse_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://testpages.eviltester.com/styled/drag-drop-javascript.html");
		d.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions a1=new Actions(d);
			WebElement src=d.findElement(By.xpath("(//p[text()='Drag me'])[2]"));
				WebElement trg=d.findElement(By.xpath("(//div[@id=\"droppable1\"])"));
			//a1.clickAndHold(src).release(trg).perform();
				a1.dragAndDrop(src, trg).perform();
		    Thread.sleep(1000);
			WebElement src_1=d.findElement(By.xpath("(//p[text()=\"Drag me\"])[1]"));
				WebElement trg_1=d.findElement(By.xpath("//div[@id=\"droppable2\"]"));
			//a1.clickAndHold(src_1).release(trg_1).perform();
				a1.dragAndDrop(src_1, trg_1);
			Thread.sleep(2000);
			d.close();
	}

}
