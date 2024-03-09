package com.auto;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeForm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
