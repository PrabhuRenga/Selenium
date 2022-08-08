package org.slnm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\Selenium\\Drve\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		driver.manage().window().maximize();
		WebElement btn = driver.findElement(By.xpath("//button[@name='newbrowsertab453']"));
		btn.click();

	Set<String> m = driver.getWindowHandles();
	  List<String> s=new ArrayList(m);
	  driver.switchTo().window(s.get(1));
	  WebElement click = driver.findElement(By.xpath("//span[text()='Selenium WebDriver ']"));
             click.click();
             Set<String> m1 = driver.getWindowHandles();
             List<String> s1=new ArrayList(m1);
          driver.switchTo().window(s1.get(2));  
          String w = driver.getCurrentUrl();
          System.out.println(w);
          
          driver.switchTo().window(s.get(1));
         System.out.println(driver.getCurrentUrl());
          
             // driver.switchTo().window(s1.get(1));
              
             
	}

}
