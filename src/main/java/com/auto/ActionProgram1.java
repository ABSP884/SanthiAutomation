package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
WebElement boarder = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(boarder);
Actions act=new Actions(driver);
Thread.sleep(3000);
WebElement abc = driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement cbz = driver.findElement(By.xpath("//div[@id='droppable']"));
act.dragAndDrop(abc, cbz).build().perform();

	}

}


