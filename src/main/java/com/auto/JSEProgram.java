package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('email').value='santhi';");
		WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='santhi';",user);
		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",sub);
		String url="";
		url=js.executeScript("return document .URL;").toString();
		System.out.println(url);
		String pageTitle="";
		pageTitle=js.executeScript("return document .title;").toString();
		System.out.println(pageTitle);
		js.executeScript("history.go(0)");
		js.executeScript("window.scrollBy(0,500)");
		
		
		
		

	}

}
