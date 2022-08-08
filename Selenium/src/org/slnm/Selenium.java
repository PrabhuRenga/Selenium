package org.slnm;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
		
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\Selenium\\Drve\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		//dimensions
//		Dimension dimension = new Dimension(500,500);
//		driver.manage().window().setSize(dimension);
//		
//		Thread.sleep(3000);
//		//point
//		Point point = new Point(500,500);
//		driver.manage().window().setPosition(point);
		
		
//		driver.navigate().to("https://www.facebook.com/");
//		
//		//robot keys
//		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
//		userName.sendKeys("Prabhu");
//		
//		 Robot robot = new Robot();
//		 
//		 robot.keyPress(KeyEvent.VK_CONTROL);
//		 robot.keyPress(KeyEvent.VK_A);
//		 
//		 robot.keyRelease(KeyEvent.VK_CONTROL);
//		 robot.keyRelease(KeyEvent.VK_A);
//		 
//		 robot.keyPress(KeyEvent.VK_CONTROL);
//		 robot.keyPress(KeyEvent.VK_X);
//		 
//		 robot.keyRelease(KeyEvent.VK_CONTROL);
//		 robot.keyRelease(KeyEvent.VK_X);
//		 
//		 robot.keyPress(KeyEvent.VK_TAB);
//		 robot.keyRelease(KeyEvent.VK_TAB);
//		 
//		 robot.keyPress(KeyEvent.VK_CONTROL);
//		 robot.keyPress(KeyEvent.VK_V);
//		 
//		 robot.keyRelease(KeyEvent.VK_CONTROL);
//		 robot.keyRelease(KeyEvent.VK_V);
//		 
//		 
//		 WebElement visible = driver.findElement(By.xpath("//div[@class='_9lsa']"));
//		 visible.click();
		 
		
		
//		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
//		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
//		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//		
//		Actions actions = new Actions(driver);
//		
//		actions.clickAndHold(source).moveToElement(target).release().perform();
//		
//		
//		Thread.sleep(3000);
//		
//		
//		WebElement source1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
//		WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//		
//		
//		actions.clickAndHold(source1).moveToElement(target1).release().perform();
//		
		
//		driver.navigate().to("https://solarsystem.nasa.gov/");
//		Thread.sleep(3000);
//		
//		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		
		////		js.executeScript("window.scrollBy(0,500)");
//		
//		
//		WebElement scrollDown = driver.findElement(By.xpath("(//div[@class='grid_title'])[10]"));
//		js.executeScript("arguments[0].scrollIntoView(false)", scrollDown);
//		
		
		
		driver.navigate().to("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fogbl&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fogbl&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		WebElement txt = driver.findElement(By.xpath("//input[@type='email']"));
		txt.sendKeys("PrabhuRenga");
		
		Thread.sleep(3000);
		 
		js.executeScript("arguments[0].setAttribute('Style','background:blue;border:solid 10px green')",txt);
		
		TakesScreenshot screen  =(TakesScreenshot) driver;
		
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		File file = new File("D:\\prabhu\\gamilscreen.jpg");
		
		FileUtils.copyFile(screenshotAs, file);
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
	
}
