package org.githubSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PushPull {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\DataDriven1\\drive\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys("happy");
	WebElement userName = driver.findElement(By.id("pass"));
	userName.sendKeys("password");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
	System.out.println("pull activities");
	System.out.println("done");
	

}}
