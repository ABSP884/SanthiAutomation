package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropDown {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//a[text()[contains(.,'Create new account')]]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input [@name='firstname']")).sendKeys("santhi");
	driver.findElement(By.xpath("//input [@name='lastname']")).sendKeys("Reddy");
	//collection approach
	//driver.findElement(By.xpath("//input [@type='text'][4]")).sendKeys("santhi@gmail.com");
	driver.findElement(By.xpath("(//div[text()='Mobile number or email address']/following::input)[1]")).sendKeys("575775576");
		//using CSS locater
	//driver.findElement(By.cssSelector("input#u_3_g_9B")).sendKeys("santhi@gmail.com");	
			
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("santhi@gmail.com");
	//driver.findElement(By.xpath("//div [text()[contains(.,'Mobile number or email address')]]]")).sendKeys("santhi@gmail.com");
	driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("santhi123");
    WebElement  date = driver.findElement(By.xpath("//select[@id='day']"));
	Select s = new Select(date);
	s.selectByIndex(19);
	
	WebElement month = driver.findElement(By.xpath("//select [@id='month']"));
	Select m = new Select(month);
	m.selectByValue("11");
	
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select y = new Select(year);
	y.selectByVisibleText("1984");
	
	driver.findElement(By.xpath("//input[@name='sex']")).click();
	driver.findElement(By.xpath("//button [text() [contains(.,'Sign Up')]]")).click();
	

	}

}
