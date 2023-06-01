package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class TaskOne
{
    public static void main( String[] args ) throws InterruptedException 
    {

    	
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	//open the url
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	//maximize the screen
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Sri dharani");
    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S") ;
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("sridharani@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("sridharani@505");
    	JavascriptExecutor js = (JavascriptExecutor) driver ;
    	Thread.sleep(5000) ;
    	js.executeScript("window.scrollBy(0,1000)", "") ;
    	driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
    	
//    	
    	//subscribe
    	
    	
    	
    
    }
}