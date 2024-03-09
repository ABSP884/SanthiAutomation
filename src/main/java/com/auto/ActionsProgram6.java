package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProgram6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(6000);
		WebElement toys = driver.findElement(By.xpath("//span[text()='Beauty, Toys & More']/../.."));
		Thread.sleep(3000);
		WebElement foods = driver.findElement(By.xpath("//a[text()='Food & Drinks']"));
		WebElement cooking = driver.findElement(By.xpath("//a[text()='Cooking Essentials']"));
		Actions act=new Actions(driver);
		act.moveToElement(toys).moveToElement(foods).moveToElement(cooking).click().build().perform();
		
	}

}


