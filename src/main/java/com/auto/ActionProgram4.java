package com.auto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		Actions act=new Actions(driver);
		//act.moveToElement(user).sendKeys("rama").build().perform();
		act.sendKeys(user, "Rama").build().perform();
		act.sendKeys(pass, "Krishna").build().perform();
		//act.moveToElement(button).click().build().perform();
		act.click(button).build().perform();
	}

}

