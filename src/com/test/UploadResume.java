package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadResume {
	
	@Test
	public void uploadResume() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuj\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys("anuj.jain@bistasolutions.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("Mayajain@2602");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@class='aic']/div/div")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//div[@id=':ox']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Anuj\\Desktop\\AutoIt\\FileUpload.exe");
		driver.findElement(By.xpath(".//*[@id=':nk']")).sendKeys("anuj.jain@bistasolutions.com");
	}

}
