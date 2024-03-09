package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProgram7 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(15000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(6000);
		WebElement account = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Thread.sleep(3000);
		WebElement baby = driver.findElement(By.xpath("//span[text()='Baby Wishlist']"));
		Actions act=new Actions(driver);
		act.moveToElement(account).moveToElement(baby).click().build().perform();
		
		
		
	}

}
