package com.auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   //implicit wait 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		WebDriverWait wait=new WebDriverWait(driver,30);      //explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@target='_blank'])[2]")));
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
	}

}
