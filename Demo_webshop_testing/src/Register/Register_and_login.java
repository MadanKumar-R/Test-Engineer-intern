package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_and_login {
			
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String a="jo9789@gmail.com";
		
		WebDriver d=new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		String Url=d.getCurrentUrl();
		if(Url.contains(Url)) {
			System.out.println("main url Passed");
		}
		else {
			System.out.println("main url Failed");
		}
		Thread.sleep(1000);
		//Register
		d.findElement(By.xpath("//a[text()='Register']")).click();
		String Url1=d.getCurrentUrl();
		if(Url1.contains(Url1)) {
			System.out.println("register page Passed");
		}
		else {
			System.out.println("register page Failed");
		}
		Thread.sleep(1000);
		d.findElement(By.id("gender-male")).click();
		d.findElement(By.id("FirstName")).sendKeys("Manish");
		d.findElement(By.id("LastName")).sendKeys("AR");
		d.findElement(By.id("Email")).sendKeys(a);
		d.findElement(By.id("Password")).sendKeys("Jolly@0987");
		d.findElement(By.name("ConfirmPassword")).sendKeys("Jolly@0987");
		d.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
		Thread.sleep(2000);
		String Url2=d.getCurrentUrl();
		if(Url2.contains(Url2)) {
			System.out.println("after registering Passed");
		}
		else {
			System.out.println("after registering Failed");
		}
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Log out']")).click();
		String Url3=d.getCurrentUrl();
		if(Url3.contains(Url3)) {
			System.out.println("after log out Passed");
		}
		else {
			System.out.println("after log out Failed");
		}
		Thread.sleep(1000);
		
		//Login
		d.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
		String Url4=d.getCurrentUrl();
		if(Url4.contains(Url4)) {
			System.out.println("log in page Passed");
		}
		else {
			System.out.println("log in page Failed");
		}
		Thread.sleep(1000);
		
		d.findElement(By.id("Email")).sendKeys(a);
		d.findElement(By.id("Password")).sendKeys("Jolly@0987");
		Thread.sleep(2000);
		d.findElement(By.name("RememberMe")).click();
		
		d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String Url5=d.getCurrentUrl();
		if(Url5.contains(Url5)) {
			System.out.println("log in done page Passed");
		}
		else {
			System.out.println("log in done page Failed");
		}
		Thread.sleep(1000);
		
		//Books Page
		d.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		String Url6=d.getCurrentUrl();
		if(Url6.contains(Url6)) {
			System.out.println("book page Passed");
		}
		else {
			System.out.println("book page Failed");
		}
		WebElement s1=d.findElement(By.name("products-orderby"));
		Select s2=new Select(s1);
		s2.selectByValue("https://demowebshop.tricentis.com/books?orderby=11");
		
		WebElement s3=d.findElement(By.name("products-pagesize"));
		Select s4=new Select(s3);
		s4.selectByIndex(0);
		
		WebElement s5=d.findElement(By.name("products-viewmode"));
		Select s6=new Select(s5);
		s6.selectByIndex(1);
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//a[text()='Science']")).click();
		String Url7=d.getCurrentUrl();
		if(Url7.contains(Url7)) {
			System.out.println("Science page Passed");
		}
		else {
			System.out.println("Science page Failed");
		}
		
		d.findElement(By.xpath("(//a[normalize-space()='Computing and Internet'])[2]")).click();
		String Url8=d.getCurrentUrl();
		if(Url8.contains(Url8)) {
			System.out.println("Computing and Internet page Passed");
		}
		else {
			System.out.println("Computing and Internet Failed");
		}
		Thread.sleep(1000);
		d.findElement(By.xpath("(//input[@id='addtocart_13_EnteredQuantity'])[1]")).clear();
		d.findElement(By.xpath("(//input[@id='addtocart_13_EnteredQuantity'])[1]")).sendKeys("5");
		d.findElement(By.id("add-to-cart-button-13")).click();
		
		d.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
		String Url9=d.getCurrentUrl();
		if(Url9.contains(Url9)) {
			System.out.println("cart page Passed");
		}
		else {
			System.out.println("cart page Failed");
		}
		Thread.sleep(1000);
		WebElement s7=d.findElement(By.xpath("//select[@id='CountryId']"));
		Select s8=new Select(s7);
		s8.selectByVisibleText("India");
		
		d.findElement(By.xpath("//input[@id='termsofservice']")).click();
		d.findElement(By.xpath("//button[@id='checkout']")).click();
		String Url10=d.getCurrentUrl();
		if(Url10.contains(Url10)) {
			System.out.println("checkout page Passed");
		}
		else {
			System.out.println("checkout page Failed");
		}
		d.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("mysore");
		d.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("puram");
		d.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("570005");
		d.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("8936295898");
		WebElement s9=d.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		Select s10=new Select(s9);
		s10.selectByVisibleText("India");
		
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='shippingoption_2']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@value='Confirm']")).click();
		Thread.sleep(3000);
		//d.close();
	}
}
