package com.grp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FipcartTest {
	@Test(groups= {"sanity"})
	public void flipcart() {
		
		  System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe")	;
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  System.out.println(driver.getCurrentUrl());
		  System.out.println(driver.getTitle());
	}

}
