package com.auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement table = driver.findElement(By.xpath("//table[@id='webtable']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Total rows in a table is :"+rows.size());
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> colCount = rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<colCount.size();j++)
			{
				String value = colCount.get(j).getText();
				if(value.equals("Google"))
				{
					System.out.println(colCount.get(0).getText());
					//colCount.get(0).click();
					//colCount.get(0).sendKeys("Shanthi");
				}
			}
		}
		
	}

}