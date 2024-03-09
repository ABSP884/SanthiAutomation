package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("userName")).sendKeys("santhi");
		driver.findElement(By.id("userEmail")).sendKeys("santhi@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("IUIIOIUO,hjhhhk,Anantapur");
		driver.findElement(By.id("permanentAddress")).sendKeys("IUIIOIUO,hjhhhk,Anantapur,1-234");
		driver.findElement(By.xpath("//*[@id='submit']")).click();
}
}