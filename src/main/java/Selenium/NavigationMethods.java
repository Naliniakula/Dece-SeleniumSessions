package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}
	

}

