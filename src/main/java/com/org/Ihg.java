package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ihg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.linkText("Sign in")).click();  
		//driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.id("firstName")).sendKeys("santhi");
		driver.findElement(By.id("lastName")).sendKeys("pocha");
		driver.findElement(By.id("email")).sendKeys("santhi@gmail.com");
		driver.findElement(By.id("confirmEmail")).sendKeys("santhi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("S123");
		driver.findElement(By.id("confirmPassword")).sendKeys("S123");
		driver.findElement(By.id("address1")).sendKeys("Kurnool");
		driver.findElement(By.id("address2")).sendKeys("Anantapur");
		driver.findElement(By.id("city")).sendKeys("Anantapur");
		driver.findElement(By.id("state")).sendKeys("Andhrapradesh");
		driver.findElement(By.id("zipCode")).sendKeys("1234");
		driver.findElement(By.linkText("Join Now")).click();
		
	}

}
