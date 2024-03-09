package com.auto;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
Actions act=new Actions(driver);
WebElement button2 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//act.doubleClick(button2).build().perform();
act.moveToElement(button2).doubleClick().build().perform();
Thread.sleep(3000);
Alert alt = driver.switchTo().alert();
alt.accept();
	}

}


