package com.cyient.seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CyientTest {

	public static void main(String[] args) {
	
      
      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.cyient.com/");
      String actualTitle=driver.getTitle();
      System.out.println(actualTitle);
      String actualUrl=driver.getCurrentUrl();
      System.out.println(actualUrl);
	}
	
}
