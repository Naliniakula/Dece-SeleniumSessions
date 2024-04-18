package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("samsung");
		boolean isdispalystatus=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(isdispalystatus);
		driver.findElement((By.linkText("Software"))).click();
		List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
	System.out.println("the total numbe rof header links: " +headerlinks.size());
	List<WebElement> tot_lkns=driver.findElements(By.tagName("a"));
	System.out.println("the total no of links: "+tot_lkns.size());
	// total number of images
	 List<WebElement> images=driver.findElements(By.tagName("img"));
	 System.out.println(" the total number of images are :"+images.size());
		driver.quit();
	}

}
