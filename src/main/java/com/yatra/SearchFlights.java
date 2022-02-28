package com.yatra;

import java.util.ResourceBundle;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class SearchFlights {

	
	public static void main(String[] args) throws InterruptedException {
		
//		setting the system properties
		System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
//	    fetching the data from property file
		ResourceBundle rb=ResourceBundle.getBundle("data");
		String origin = rb.getString("origin");
		String destiny=rb.getString("destiny");
		
//		entering the from value
		WebElement originPlace=HomePage.origin(driver);
		originPlace.click();
		Thread.sleep(3);
		originPlace.sendKeys(origin);
		originPlace.sendKeys(Keys.ENTER);
		
//		entering the to value
		WebElement arrivalPlace=HomePage.arrival(driver);
		Thread.sleep(3);
		arrivalPlace.clear();
		arrivalPlace.sendKeys(destiny);
		arrivalPlace.sendKeys(Keys.ENTER);
		
//		selecting the data
		WebElement dateele = HomePage.date(driver);
		Thread.sleep(3);
		dateele.click();
		
		driver.findElement(By.xpath("//div[@id='monthWrapper']//div[contains(text(),'March')]/..//td[@id='10/03/2022']")).click();
		Thread.sleep(3);
//		clicking on the search button
		WebElement searchele = HomePage.search(driver);
		searchele.click();
		 
//		verifying element present in search web page
		WebElement eleOnSearchPage = driver.findElement(By.xpath("(//div[contains(text(),'7,486')])[1]"));
	    String text = eleOnSearchPage.getText();
		
	    if(text=="7,486") {
			
			System.out.println("The web page of search fight is present ");
		}
	    
//	    closing the browser
		driver.close();
		
	}

}
