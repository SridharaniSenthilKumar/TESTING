package com.selenium.daysix;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {
	public static void main(String [] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver() ;
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("Sri dharani") ;
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("sri") ;

		WebElement cpu= driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_CPU i5 8th Gen\"]"));
	// Initialize and wait till element(link) became clickable - timeout in 10 seconds
		Boolean firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeSelected(cpu));
	// Print the first result
	System.out.println(firstResult);
	  
		
		
	}

}