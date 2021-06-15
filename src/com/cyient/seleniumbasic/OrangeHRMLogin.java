package com.cyient.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");

driver.findElement(By.id("txtUsername")).sendKeys("admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("menu_pin_viewMyDetails")).click();
	

        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("personal_txtOtherID")).sendKeys("test123");
        driver.findElement(By.id("btnSave")).click();
    
        driver.findElement(By.linkText("Emergency Contacts")).click();
      
              driver.findElement(By.id("emgcontacts_name")).sendKeys("sh");
              driver.findElement(By.id("emgcontacts_relationship")).sendKeys("mother");
              driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("768849");
             driver.findElement(By.id("emgcontacts_mobilePhonee")).sendKeys("894590");
              driver.findElement(By.id("emgcontacts_workPhone")).sendKeys("");
             driver.findElement(By.id("btnSaveEContact")).click();
              
            }
    }
     
        
    
