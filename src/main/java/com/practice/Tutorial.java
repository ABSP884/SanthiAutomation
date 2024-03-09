package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
	 System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	 driver.manage().window().maximize();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());

	}

}
