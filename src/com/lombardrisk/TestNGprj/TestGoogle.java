package com.lombardrisk.TestNGprj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestGoogle {

	public WebDriver driver;
	private String openURL;
	
	@Test
	public void testlogin() {
		openURL = "http://www.google.com/";
		
		driver.get(openURL + "/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
						
		driver.findElement(By.id("lst-ib")).sendKeys("Lombardrisk");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
			
	}

	

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Auto\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
