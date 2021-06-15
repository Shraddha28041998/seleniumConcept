package com.cyient.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenEmrLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
	    
	    
	driver.findElement(By.id("authuser")).sendKeys("admin");
	driver.findElement(By.id("clearpass")).sendKeys("pass");
	}

}
