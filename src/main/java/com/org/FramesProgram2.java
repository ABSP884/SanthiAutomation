package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame("frame2");
		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s = new Select (animal);
		s.selectByValue("avatar");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Santhi");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame1").switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		//using CSS locater
	
		
	}

}
