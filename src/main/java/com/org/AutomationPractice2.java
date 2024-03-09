package com.org;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
				ChromeDriver driver = new ChromeDriver(); 
				driver.get("https://www.jiomart.com/");
				driver.manage().window().maximize();
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());

	}

}
