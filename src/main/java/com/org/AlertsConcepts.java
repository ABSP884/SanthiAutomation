package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsConcepts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		//first alert
	    WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	    simple.click();
	    Alert simple1 = driver.switchTo().alert();
	    Thread.sleep(3000);
	    simple1.accept();
	    Thread.sleep(3000);
	   // WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	   // confirm.click();
	    driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	    //second alert
	    WebElement confirm2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	    confirm2.click();
	    Alert confirm3 = driver.switchTo().alert();	 
	    confirm3.dismiss();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	    //Third alert
	    WebElement text = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	    text.click();
	    Alert text2 = driver.switchTo().alert();
	    Thread.sleep(3000);
	    text2.sendKeys("santhi Reddy");
	    text2.accept();
	    //Text alert
	    //Alert text3 = driver.switchTo().alert();
	    //Thread.sleep(3000);
	    //text3.sendKeys("santhi Reddy");
	 
	   
	    
	    
	    

	}

	private static void    dismiss() {
		// TODO Auto-generated method stub
		
	}

}
