package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuj\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Anuj/Desktop/dropdown.htm");
		
		Select select = new Select(driver.findElement(By.id("1")));

		List<WebElement> options = select.getOptions();
		
		for(WebElement text:options ){
			System.out.println(text.getText());
			String st="123";
		if (st.equals(text.getText())) 
			select.selectByValue(st);
		}
		}
}
