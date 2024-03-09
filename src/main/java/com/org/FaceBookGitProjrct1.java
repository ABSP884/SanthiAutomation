package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookGitProjrct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	         driver.get("https://www.facebook.com/");
	                driver.manage().window().maximize();
	          System.out.println(driver.getTitle());
	          System.out.println(driver.getCurrentUrl());
	            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Santhi");
	            driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("santhi123");
	            //driver.findElement(By.xpath("//button[@type='submit']")).click();
	           driver.findElement(By.xpath("//button [text()='Log in']")).click();
	           System.out.println("New git project");
	}

}
