package com.auto;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookAuto2 {
public static ChromeDriver driver;
public static int i=0;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
driver=new ChromeDriver();
FaceBookAuto2 book=new FaceBookAuto2();
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Santhi");
Thread.sleep(10000);
book.snap();
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Santhi1");
Thread.sleep(10000);
book.snap();
driver.findElement(By.xpath("//button[@name='login']")).click();
Thread.sleep(10000);
book.snap();
	}
	
	public void snap() throws IOException
	{
		Random r=new Random();
		if(r.nextInt()!=0)
		{
		i=i+1;	
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//images//pic"+i+".png");
		FileUtils.copyFile(src, dest);
		
		}
	}

}