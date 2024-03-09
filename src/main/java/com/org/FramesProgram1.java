package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//By using Using id or name:
		
		/* WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Santhi Reddy");*/
		
		//By using index
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='SingleFrame'][1]"));		
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Santhi Reddy"); 
		
		
		
	}

}
