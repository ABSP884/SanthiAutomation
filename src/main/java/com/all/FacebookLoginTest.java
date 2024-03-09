package com.all;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginTest {
	@Test(dataProvider="Authentication")
	public void fb(String data1,String data2)
	{
		  System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	         driver.get("https://www.facebook.com/");
	         driver.manage().window().maximize();
	          System.out.println(driver.getTitle());
	          System.out.println(driver.getCurrentUrl());
	            driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data1);
	            driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(data2);
	            driver.findElement(By.xpath("//button [text()='Log in']")).click();
	}
	
	@DataProvider(name="Authentication")
	public Object[][] credentials()
	{
		return new Object[][] {{"Santhi","santhi123"},{"Rama","Krishna"}};
	}

}
