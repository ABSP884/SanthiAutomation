package com.santhi;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeTest {
	@Test
	public void orange() {
		
		  System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe")	;
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  driver.manage().window().maximize();
		  System.out.println(driver.getCurrentUrl());
		  System.out.println(driver.getTitle());
	}

}
