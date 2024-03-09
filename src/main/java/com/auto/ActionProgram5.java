package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		Actions act=new Actions(driver);
		//act.moveToElement(textbox).sendKeys("mobiles").build().perform();
		act.sendKeys(textbox, "mobiles",Keys.ENTER).build().perform();
	}

}


