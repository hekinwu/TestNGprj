package com.lombardrisk.TestNGprj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGDemo {

	public WebDriver driver;
	private String openURL;
	
	@Test
	public void testlogin() {
		openURL = "http://172.20.30.167:8083/agilereporter/";
		
		driver.get(openURL + "/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
						
		driver.findElement(By.id("loginForm:inputUsername")).sendKeys("admin");
		driver.findElement(By.id("loginForm:inputPassword")).sendKeys("password");
		
		driver.findElement(By.id("loginForm:btnSignIn")).click();
		
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
