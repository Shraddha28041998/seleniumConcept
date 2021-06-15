package com.cyient.seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenEmrLogins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      WebDriver driver=new ChromeDriver();
	      driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
	      String actualTitle=driver.getTitle();
	      System.out.println(actualTitle);
	      String actualUrl=driver.getCurrentUrl();
	      System.out.println(actualUrl);
		}
	}


