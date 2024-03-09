package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement products = driver.findElement(By.xpath("//select[@id='first']"));
		Select s=new Select(products);
		//s.selectByIndex(2);
			s.selectByValue("Apple");
			
			WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
			Select sp=new Select(animals);
			sp.selectByVisibleText("Avatar");
			
			//Multiple drop own
			WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
			Select se=new Select(food);
			se.selectByVisibleText("Donut");
			se.selectByVisibleText("Bonda");
			Thread.sleep(8000);
			//se.deselectByVisibleText("Donut");
			se.deselectAll();
	}

}
