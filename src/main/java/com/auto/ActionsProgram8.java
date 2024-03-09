package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProgram8 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		WebElement fr1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(fr1);
		Thread.sleep(2000);
		//WebElement one = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement one = driver.findElement(By.xpath("//li[text()[contains(.,'Item 1')]]"));
		Thread.sleep(2000);
		WebElement three = driver.findElement(By.xpath("//li[text()='Item 3']"));
		Thread.sleep(2000);
		WebElement five = driver.findElement(By.xpath("//li[text()='Item 5']"));
		Thread.sleep(2000);
		WebElement seven = driver.findElement(By.xpath("//li[text()='Item 7']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).moveToElement(one).click().moveToElement(three).click().moveToElement(five).click().moveToElement(seven).click().build().perform();
		
		
		
	}

}
