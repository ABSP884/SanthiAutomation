package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHGDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement country  = driver.findElement(By.xpath("//select[@id='country']"));
		Select s =new Select(country);
		s.selectByIndex(4);
		//s.selectByValue("AS");
		//s.selectByVisibleText("Aruba");

	}

}
