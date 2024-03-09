package com.auto;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMWindows {
public static String parent,facebook,linkedIn,Twitter,youtube;
public static Set<String> all;
public static Iterator<String> it;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 parent = driver.getWindowHandle();
System.out.println("Orange HRM window : "+parent);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
System.out.println(driver.getTitle());//it will print orange hrm
 all = driver.getWindowHandles();
 it = all.iterator();
while(it.hasNext())
{
	facebook = it.next();
	if(!parent.equals(facebook))
	{
		driver.switchTo().window(facebook);
	}
}
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.xpath("//input[@id=':rn:']")).sendKeys("FBShanthi");
driver.findElement(By.xpath("//input[@id=':rp:']")).sendKeys("FBpassword");
driver.switchTo().window(parent);
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
all = driver.getWindowHandles();
it = all.iterator();
while(it.hasNext())
{
	linkedIn = it.next();
	if(!parent.equals(linkedIn))
	{
		driver.switchTo().window(linkedIn);
	}
}
System.out.println(driver.getTitle()); //linked in page title 
System.out.println(driver.getCurrentUrl()); //linkedIn page url
driver.switchTo().window(facebook);
driver.findElement(By.xpath("//span[text()='Forgotten password?']")).click();
driver.switchTo().window(parent);





	}

}
