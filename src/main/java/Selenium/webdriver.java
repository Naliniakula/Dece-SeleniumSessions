package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webdriver {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.gmail.com");
	String act_title=driver.getTitle();
	System.out.println("the actual title is :" + act_title);
	if (act_title.equals("Gmail123"))
		
	{
	System.out.println("Pass");	
	}
	else
	{
		System.out.println("Fail");	
	
	}
	String url=driver.getCurrentUrl(); 
	System.out.println("The url is :"+ url);
	driver.close();
	}
	

}
